package ru.geekbrains.entity;


import lombok.*;
import javax.persistence.*;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public Student(Long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}