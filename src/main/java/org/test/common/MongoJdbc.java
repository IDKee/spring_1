package org.test.common;

import com.mongodb.MongoClient;
import com.mongodb.client.*;
import org.bson.Document;

/**
 * @author panjie
 * @Description:org.test.common
 * @date 2019/8/2 18:02
 */

public class MongoJdbc{

    public static void main(String[] args) {
        MongoCollection<Document> person = getDataBase().getCollection("person");
        /*Document document = new Document("banana", "香蕉").append("apple", "苹果").append("pear", "梨");
        person.insertOne(document);*/
        FindIterable<Document> documents = person.find();
        MongoCursor<Document> mongoCursor = documents.iterator();
        while (mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }
    }


    //连接mongodb服务获取数据库
    public static MongoDatabase getDataBase(){
        MongoDatabase mongoDatabase = null;
        try{
            // 连接到 mongodb 服务
            MongoClient mongoClient = new MongoClient( "129.28.173.225" , 27017 );
            // 连接到数据库
            mongoDatabase = mongoClient.getDatabase("test");
            System.out.println("Connect to database successfully");

        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }

        return mongoDatabase;
    }
}
