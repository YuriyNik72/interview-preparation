package ru.geekbrains;

import ru.geekbrains.config.HibernateUtils;
import ru.geekbrains.entity.Student;
import ru.geekbrains.repositories.StudentRepositories;

import java.util.stream.Stream;


public class Lesson05Application {

    public static void main(String[] args) {

        StudentRepositories studentRepository = new StudentRepositories();
        Stream.of(
                new Student("Petr", 100),
                new Student("Vladimir", 50),
                new Student("Aleksei1", 60),
                new Student("Aleksei2", 70),
                new Student("Aleksei3", 90),
                new Student("Aleksei4", 40),
                new Student("Aleksei5", 35),
                new Student("Aleksei6", 45),
                new Student("Aleksei7", 55),
                new Student("Aleksei8", 65),
                new Student("Aleksei9", 76),
                new Student("Aleksei10", 85),
                new Student("Aleksei11", 95),
                new Student("Aleksei12", 20),
                new Student("Aleksei", 80)
        ).forEach(studentRepository::saveOrUpdate);
        System.out.println("All: " + studentRepository.findAll());
        Student byId = studentRepository.findById(2);
        System.out.printf("Student with id %d: %s\n", 2, byId);
        boolean deletedSuccessfully = studentRepository.deleteById(3);
        System.out.printf("Delete by id %d: %s\n", 3, deletedSuccessfully);
        System.out.println("All: " + studentRepository.findAll());
        HibernateUtils.closeSessionFactory();
    }

}
