package com.souyidai.hanjiangyu.draft.controller;

import com.souyidai.hanjiangyu.draft.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanjiangyu on 2016/10/11.
 */

@Controller
@RequestMapping(value="/health")
public class HealthCheckController {
    private static final Logger LOG = LoggerFactory.getLogger(HealthCheckController.class);

    @RequestMapping(value = "/check.jhtml")
    public String check() {
        return "ex";
    }

    @RequestMapping(value = "/data.jhtml", method = { RequestMethod.POST })
    @ResponseBody
    public Person data() {
        Person p1 = new Person();
        p1.setName("拉塞尔");
        return p1;
    }
}
