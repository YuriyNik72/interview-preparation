package ru.geekbrains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAll();


    List<Student> findAllByAgeLessThanOderByAge(int min);


    List<Student> findAllByAgeGreaterThanOrderByAge(int max);


    List<Student> findAllByAgeBetweenOrderByAge(int min, int max);
}