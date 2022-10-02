package ru.geekbrains.entity;

import javax.persistence.*;


    @Entity
    @Table(name = "Student")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private long id;

        @Column(name = "name")
        private String name;

        @Column(name = "mark")
        private int mark;

    public Student (){}
        public Student(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

        @Override
        public String toString(){
            return "Student{"+ "id= " + id + ",name=" + name + "/" + ", mark=" + mark+"}";
        }
}
