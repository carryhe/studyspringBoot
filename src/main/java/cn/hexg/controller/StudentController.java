package cn.hexg.controller;

import cn.hexg.Service.StudentService;
import cn.hexg.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("get/{id}")
    public Student queryStudentByStudentId(@PathVariable("id")Integer id){
        return studentService.queryStudentByStudentId(id);
    }
}
