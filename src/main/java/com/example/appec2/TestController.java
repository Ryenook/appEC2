package com.example.appec2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/*@ResponseBody  // 리턴값을 문자열로 나오게 하고싶을때는 사용하나 파일로 연결 시킬때는 주석*/
@RequestMapping("/web")
public class TestController {

    @GetMapping("/nice")
    public String nice(){
        return "nice";
    }

}
