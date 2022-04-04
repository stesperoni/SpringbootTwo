package biz.stefanosperoni.playground.springbootapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String index() {
        return "a string in OCP";
    }
}
