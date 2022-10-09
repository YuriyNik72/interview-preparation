package ru.geekbrains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.geekbrains.entity.Student;
import ru.geekbrains.repositories.PageRepository;
import ru.geekbrains.repositories.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {


    private StudentRepository studentRepository;
    private PageRepository pageRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Autowired
    public void setPageRepository(PageRepository pageRepository){
        this.pageRepository=pageRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public List<Student> getMinStudent(int min) {
        return studentRepository.findAllByAgeLessThanOderByAge(min);
    }

    public List<Student> getMaxStudent(int max) {
        return studentRepository.findAllByAgeGreaterThanOrderByAge(max);
    }

    public List<Student> getStudentByPage(int pageNum) {
        Page<Student> pr= pageRepository.findAll(PageRequest.of(pageNum,5));
        return pr.stream().collect(Collectors.toList());
    }

    public List<Student> getMinAndMaxAge(int min, int max) {
        return studentRepository.findAllByAgeBetweenOrderByAge(min,max);
    }
}
