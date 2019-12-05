package com.sys.log.controller;

import com.sys.log.common.annotation.SysLog;
import com.sys.log.domain.SysLogEntity;
import com.sys.log.service.ILogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("log")
public class LogsController {

    @Autowired
    ILogsService logsService;

    @SysLog("public static void main")
    @GetMapping("/testsdf")
    public String test(@RequestParam("str") String str) {
        System.out.println(str + "============================");
        return "res";
    }
    @SysLog("展示所有日志,测试")
    @GetMapping("/show/all")
    public List<SysLogEntity> getall(){
        return logsService.showAll();
    }

}
