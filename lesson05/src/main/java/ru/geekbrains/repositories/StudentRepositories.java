package ru.geekbrains.repositories;


import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.geekbrains.config.HibernateUtils;
import ru.geekbrains.entity.Student;
import java.util.List;


public class StudentRepositories  {

    public Student findById(long id) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, id);
        transaction.commit();
        return student;
    }

    public List<Student> findAll() {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<Student> student = session.createQuery("select s from Student s", Student.class).list();
        transaction.commit();
        return student;
    }

    public boolean deleteById(long id) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        int res = session.createQuery("delete Student where id = :id")
                .setParameter("id", id)
                .executeUpdate();
        transaction.commit();
        return res > 0;
    }

    public void saveOrUpdate(Student student){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(student);
        transaction.commit();
    }

}
