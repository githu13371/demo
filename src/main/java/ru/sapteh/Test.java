package ru.sapteh;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sapteh.dao.Dao;
import ru.sapteh.model.Group;
import ru.sapteh.model.Student;
import ru.sapteh.service.GroupDaoImpl;
import ru.sapteh.service.StudentDaoImpl;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        GroupDaoImpl groupDao = new GroupDaoImpl(factory);
        StudentDaoImpl studentDao = new StudentDaoImpl(factory);
    }
}