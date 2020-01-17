package com.objlove.generator;

import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import org.springframework.stereotype.Component;

@Component
public class CustomIdGenerator implements IKeyGenerator {
    @Override
    public String executeSql(String incrementerName) {
        System.out.println(incrementerName);
        return incrementerName;
    }
}
