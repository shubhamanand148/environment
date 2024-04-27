package profiler.environment.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    @GetMapping("home")
    public String home() {
        return "In Environment project's Home";
    }    
}
