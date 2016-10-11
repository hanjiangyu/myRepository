package com.souyidai.hanjiangyu.draft.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hanjiangyu on 2016/10/11.
 */

@Controller
@RequestMapping(value="/health")
public class HealthCheckController {
    private static final Logger LOG = LoggerFactory.getLogger(HealthCheckController.class);

    @RequestMapping(value = "/check.jhtml")
    public String check() {
        return "index";
    }
}
