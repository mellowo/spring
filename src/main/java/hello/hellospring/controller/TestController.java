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

    @GetMapping("animal")
    @ResponseBody
    public Animal animalTest(@RequestParam("name") String name, Model model){

        Animal animal = new Animal();
        animal.setName(name);
        animal.setAge("1");
        return animal;
    }


    class Animal{
        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
