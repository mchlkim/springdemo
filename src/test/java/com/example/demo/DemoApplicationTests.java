package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("TEST Running");

        var objectMapper = new ObjectMapper();

        // Object -> Text

        // ObjectMapper는 get method를 활용
        var user = new User("gukim", 25, "010");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // Text -> Object

        // Object Mapper는 default 생성자를 필요로 한다.
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);

    }
}
