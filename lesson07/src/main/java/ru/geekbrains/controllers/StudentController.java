package ru.geekbrains.controllers;


import org.springframework.web.bind.annotation.*;
import ru.geekbrains.dto.StudentDto;
import ru.geekbrains.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void addStudent(@RequestBody StudentDto studentDto){
        studentService.saveStudent(studentDto);
    }

    @DeleteMapping
    public void deleteStudent(@RequestParam Long id){
        studentService.deleteStudent(id);
    }

    @PutMapping
    public void updateStudent(@RequestBody StudentDto studentDto){
        studentService.saveStudent(studentDto);
    }
}
