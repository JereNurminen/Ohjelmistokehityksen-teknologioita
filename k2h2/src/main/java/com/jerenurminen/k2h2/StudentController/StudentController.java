package com.jerenurminen.k2h2.StudentController;

import com.jerenurminen.k2h2.com.jerenurminen.k2h2.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController
{
    @RequestMapping(value= "/")
    public String index(Model model) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Matti","Meikäläinen","matti.meikalainen@suomi24.fi"));
        studentList.add(new Student("Pekka","Puoskari","pekka.puoskari@mehilainen.fi"));
        studentList.add(new Student("Juha","Sipilä","juha.sipila@kepu.fi"));
        model.addAttribute("students", studentList);
        return "index";
    }

}
