package com.sakib.springhibernateorm.controller;
import com.sakib.springhibernateorm.model.Student;
import com.sakib.springhibernateorm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String showAllStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "student/list";
    }

    @GetMapping("/{id}")
    public String showStudentDetails(@PathVariable int id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "student/details";
    }

    @GetMapping("/{id}/edit")
    public String showUpdateForm(@PathVariable int id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "student/edit";
    }

    @PostMapping("/{id}/edit")
    public String updateStudent(@PathVariable int id, @Valid @ModelAttribute("student") Student student,
                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "student/edit";
        }

        studentService.updateStudent(student);
        return "redirect:/students/" + id;
    }

    @GetMapping("/{id}/delete")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
