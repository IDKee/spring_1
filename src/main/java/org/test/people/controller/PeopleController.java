package org.test.people.controller;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.test.people.service.IPeopleService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author panjie
 * @Description:org.test.people.controller
 * @date 2019/7/23 17:58
 */
@Controller
public class PeopleController {

    @Resource
    private IPeopleService peopleService;
    @Resource
    private MongoTemplate mongoTemplate;

    private static final Logger logger = LoggerFactory.getLogger(PeopleController.class);

    @RequestMapping("/")
    public String list(HttpServletRequest request){
        logger.info("panjie{}", 25);
        List<Map> list = peopleService.selectList();
        System.out.println(list.size());
        MongoCollection<Document> person = mongoTemplate.getCollection("person");
        FindIterable<Document> documents = person.find();
        MongoCursor<Document> mongoCursor = documents.iterator();
        while (mongoCursor.hasNext()){
            Document document = mongoCursor.next();
            System.out.println(document);
            list.add(document);
        }
        request.setAttribute("list", list);
        return "list";
    }
}
