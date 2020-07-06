package com.example.quartzdemo;

import lombok.Getter;
import lombok.Setter;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author hx1999
 * @Date 2020/7/1
 */
@Setter
@Getter
@Component
public class MyJob2 extends QuartzJobBean {

    UserService userService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("MyJob2>>>"+new Date());
        userService.sayHello();
    }
}
