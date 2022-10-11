package ru.geekbrains.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private int age;
    private String name;

    public StudentDto(Long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

}
