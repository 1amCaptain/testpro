package person.xjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Teacher")
public class TeacherController {
    @RequestMapping("list.do")
    public String list(){
        return "listStudent";
    }
}
