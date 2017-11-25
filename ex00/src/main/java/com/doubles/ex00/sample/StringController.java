package com.doubles.ex00.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StringController {

    private static final Logger logger = LoggerFactory.getLogger(StringController.class);

    @RequestMapping("doC")
    public String doC(@ModelAttribute("msg") String msg) {
        logger.info("doC called....");
        logger.info("msg = " + msg);
        return "result";
    }

}