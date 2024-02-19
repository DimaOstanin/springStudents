package IL.example.springStudents.controller;

import IL.example.springStudents.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    @ResponseBody
    public List<Student> findAllStudent(){
        return List.of(
                Student.builder().firstName("Yosi").email("yosi@gmail.com").age(24).build(),
                Student.builder().firstName("David").email("david@gmail.com").age(34).build(),
                Student.builder().firstName("Doston").email("doston@gmail.com").age(44).build()
        );
    }
}
