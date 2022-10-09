package ru.geekbrains.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.entity.Student;

import java.util.List;

@Repository
public interface PageRepository extends PagingAndSortingRepository<Student, Long> {
    List<Student> findAll();
}
