package com.example.appec2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/web")
public class TestController {

    @GetMapping("/nice")
    public String hi(){
        return "nice";
    }

}
