package com.fqx.handler;

import com.fqx.po.Student;
import com.fqx.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FQX
 * @create 04-12-11:53
 */
@Controller
public class TestHandler {
    @Resource
    private StudentService ss;

    @RequestMapping("/findall")
    public String findall(Model model){
        List<Student> all = ss.findAll();
        model.addAttribute("list",all);
        return "FINDALL";
    }
}
