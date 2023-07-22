package haekyu006.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/test")
    @ResponseBody
    public String index() {
        return "안녕하세요";
    }
}
