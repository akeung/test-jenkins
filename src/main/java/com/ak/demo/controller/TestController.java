/*
 * FileName: TestController
 * Author:   Akeung
 * Date:     2020/8/21
 */
package com.ak.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Akeung
 * 2020/8/21
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World 666";
    }
}
