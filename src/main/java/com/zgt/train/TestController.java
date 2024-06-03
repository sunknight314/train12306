package com.zgt.train;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Tian'
 * @Description TODO
 * @Date 2024-05-31 21:34
 * @Version 1.0
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello1111 ";
    }
}
