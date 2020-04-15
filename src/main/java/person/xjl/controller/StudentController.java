package person.xjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Student")
public class StudentController {
        //请求映射,当用户发送student/list.do的请求是,将会执行list方法
        @RequestMapping("list.do")
        public String list(){
            //转向到WEB-INF/views/listStudent.jsp
            return "listStudent";
        }
    @RequestMapping("add.do")
    public String add(){
        //转向到WEB-INF/views/listStudent.jsp
        return "addStudent";
    }
}
