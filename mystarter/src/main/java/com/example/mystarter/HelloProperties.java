package com.example.mystarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hx1999
 * @Date 2020/7/1
 */
@Data
@Component
@ConfigurationProperties(prefix = "boy")
public class HelloProperties {

    private static final String DEAFULT_NAME="zhangsan";
    private static final String DEAFULT_MSG="hello ";

    private String name=DEAFULT_NAME;
    private String msg=DEAFULT_MSG;
}
