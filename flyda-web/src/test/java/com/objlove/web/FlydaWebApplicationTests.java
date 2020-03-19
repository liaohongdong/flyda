package com.objlove.web;

import com.objlove.util.JsonMapper;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlydaWebApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {
        //这里相当于redis对String类型的set操作
//        redisTemplate.opsForValue().set("test", "helloworld");
        //这里相当于redis对String类型的get操作
//        String test = (String) redisTemplate.opsForValue().getAndSet("test", "liaohongdong");
//        System.out.println(test);
//        redisTemplate.delete("test");
        Goods goods = new Goods();
        goods.setName("liao");
        goods.setType("1");
        goods.setAddress("深圳");
        System.out.println(goods);
        redisTemplate.opsForValue().set("haha", goods);

    }

    @Test
    public void testGet() {
        Goods haha = (Goods) redisTemplate.opsForValue().get("haha");
        System.out.println(haha.getAddress());
        System.out.println(haha.getName());
        System.out.println(haha.getType());
        System.out.println("-------------------4");
        String s = JsonMapper.objToString(haha);
        System.out.println("-------------------3");
        System.out.println(s);
        System.out.println("-------------------2");
        String str = (String) redisTemplate.opsForValue().get("toString");
        if (str == null) {
            redisTemplate.opsForValue().set("toString", s);
            System.out.println("重新设置");
            String str1 = (String) redisTemplate.opsForValue().get("toString");
            Goods goods = JsonMapper.stringToObj(str1, new TypeReference<Goods>() {
            });
            System.out.println("-------------------11");
            System.out.println(goods.getAddress());
            System.out.println(goods.getName());
            System.out.println(goods.getType());
        } else {
            Goods goods = JsonMapper.stringToObj(str, new TypeReference<Goods>() {
            });
            System.out.println("-------------------12");
            System.out.println(goods.getAddress());
            System.out.println(goods.getName());
            System.out.println(goods.getType());
        }


    }

}
