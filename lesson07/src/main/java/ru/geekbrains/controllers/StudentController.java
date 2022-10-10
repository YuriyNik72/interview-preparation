package ru.geekbrains.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentController {

    private StudentService service;

    @Autowired
    public void setStudent(StudentService service){
        this.service= service;
    }

    //  Показать весь список студентов
    @GetMapping("/list")
    public String showStudent(Model uiModel) {
        uiModel.addAttribute("student", service.getStudent());
        return "students";
    }

    @GetMapping(path = "/minAge")
    public String showMinAge(Model uiModel, @RequestParam("min") int min) {
        uiModel.addAttribute("student",service.getMinStudent(min));
        return "students";
    }

    @GetMapping(path = "/maxAge")
    public String showMaxAge(Model uiModel, @RequestParam("max") int max){
        uiModel.addAttribute("student", service.getMaxStudent(max));
        return "students";
    }

    @GetMapping(path = "/minMaxAge")
    public String showMinAndMaxAge(Model uiModel, @RequestParam("min") int min, @RequestParam("max") int max) {
        uiModel.addAttribute("student", service.getMinAndMaxAge(min,max));
        return "students";
    }

    @GetMapping(path = "/page")
    public String showStudent(Model uiModel, @RequestParam("pageNum") int pageNum){
        uiModel.addAttribute("student", service.getStudentByPage(pageNum-1));
        return "students";
    }
}
