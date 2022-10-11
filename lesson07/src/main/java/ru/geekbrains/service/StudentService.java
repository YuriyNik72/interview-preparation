package ru.geekbrains.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.dto.StudentDto;
import ru.geekbrains.entity.Student;
import ru.geekbrains.repositories.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<StudentDto> getStudents() {
        return studentsMapper(repo.findAll());
    }

    public void saveStudent(StudentDto studentDto) {
        repo.save(studentMapper(studentDto));
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }

    private List<StudentDto> studentsMapper(List<Student> students) {
        return students.stream().map(this::studentMapper).collect(Collectors.toList());
    }

    private StudentDto studentMapper(Student student) {
        return new StudentDto(student.getId(), student.getAge(), student.getName());
    }

    private Student studentMapper(StudentDto student) {
        return new Student(student.getId(), student.getAge(), student.getName());
    }
}
