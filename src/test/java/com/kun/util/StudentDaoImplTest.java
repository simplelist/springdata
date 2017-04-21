package com.kun.util;

import com.kun.dao.StudentDao;
import com.kun.dao.StudentDaoImpl;
import com.kun.domain.Student;
import org.junit.Test;

import java.util.List;

/**
 * Created by kun on 2017/4/21.
 */
public class StudentDaoImplTest {
    @Test
    public void test() {
        StudentDao studentDao=new StudentDaoImpl();
        List<Student> query = studentDao.query();
        for (Student student : query) {
            System.out.println(student);
        }
    }

    @Test
    public void testSave() {
        StudentDao studentDao=new StudentDaoImpl();
        Student student=new Student();
        student.setAge(40);
        student.setName("黄忠");
        studentDao.save(student);
    }
}
