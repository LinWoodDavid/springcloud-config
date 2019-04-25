package com.david.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * =================================
 * Created by David on 2019/4/25.
 * mail:    17610897521@163.com
 * 描述:
 */

@RestController
@RefreshScope   //动态刷新
public class HelloController {

    @Value("${foo}")
    String foo;

    @Value("${version}")
    String version;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "foo=" + foo + " ,version=" + version;
    }
}
