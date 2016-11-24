package ltd.miku.esl.controller;

import ltd.miku.esl.model.Student;
import ltd.miku.esl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by piguanghua on 2016/11/24.
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/save")
    public void save(@RequestBody String id)
    {
        Student student = new Student();
        student.setAge(10);
        student.setName("我在清华上学");
        student.setId(id);
        studentService.saveStudent(student);
    }

    @RequestMapping("/search")
    public void search(){
        studentService.searchStudentByName("清华");
    }
}
