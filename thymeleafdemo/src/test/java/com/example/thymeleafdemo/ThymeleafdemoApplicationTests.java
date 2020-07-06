package com.example.thymeleafdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootTest
class ThymeleafdemoApplicationTests {

    @Autowired
    TemplateEngine templateEngine;

    @Test
    void contextLoads() {
        Context context = new Context();
        context.setVariable("username","zhangsan");
        context.setVariable("job","ceo");
        context.setVariable("salary","7777");
        String mail = templateEngine.process("mail", context);
        System.out.println(mail);
    }

}
