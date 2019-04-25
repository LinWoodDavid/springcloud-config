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

    /**
     * 更改github上面的文件 将version=6改为7并保存
     * 刷新配置:
     * 使用post请求访问 http://localhost:6090/actuator/refresh 请求头Content-Type为application/json
     * 再次访问http://localhost:6090/hello 显示foo=foo ,version=7
     *
     */
    @Value("${foo}")
    String foo;

    @Value("${version}")
    String version;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "foo=" + foo + " ,version=" + version;
    }
}
