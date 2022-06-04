package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("test1")
    public String test1(Model model){
        model.addAttribute("name","lee");
        return "test1";

    }
    @GetMapping("test2")
    @ResponseBody
    public String test2(@RequestParam("name") String name, Model model){
        return "hello "  + name;

    }
}
