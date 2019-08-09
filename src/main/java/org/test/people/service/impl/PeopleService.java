package org.test.people.service.impl;

import org.springframework.stereotype.Service;
import org.test.people.mapper.PeopleMapper;
import org.test.people.service.IPeopleService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author panjie
 * @Description:org.test.people.service
 * @date 2019/7/23 18:01 
 */


@Service
public class PeopleService implements IPeopleService {

    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public List<Map> selectList(){
        return peopleMapper.selectList();
    }
}
