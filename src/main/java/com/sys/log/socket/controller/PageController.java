package com.sys.log.socket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: GIF
 * @createDate: 2019/12/4 15:02
 * @version: 1.0
 */
@Controller
public class PageController {
    @GetMapping("/{url}")
    public String toPage(@PathVariable("url")  String url){
        return url;
    }
}
