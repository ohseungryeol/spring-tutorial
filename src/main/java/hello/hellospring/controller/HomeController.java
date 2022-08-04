package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")  //도메인 들어가자마자 나오는 페이지 "/"로 표현
    public String home(){
        return "home";
    }
}
