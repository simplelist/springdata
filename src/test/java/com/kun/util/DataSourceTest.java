package com.kun.util;

import com.kun.dao.StudentDao;
import com.kun.domain.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by kun on 2017/4/21.
 */
public class DataSourceTest {

    private ApplicationContext ctx=null;
    private StudentDao studentDao=null;

    @Before
    public void before() {
        ctx=new ClassPathXmlApplicationContext("beans.xml");
        studentDao= (StudentDao) ctx.getBean("studentDao");
    }
    @Test
    public void test() {
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        Assert.assertNotNull(dataSource);
    }


    @Test
    public void testTemplate() {
        JdbcTemplate template = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        Assert.assertNotNull(template);
    }

    @Test
    public void testQuery() {
        List<Student> query = studentDao.query();
        for (Student student : query) {
            System.out.println(student);
        }
    }


    @Test
    public void testSave() {
        studentDao.save(new Student("马超",20));
    }
    @After
    public void after() {
        ctx=null;
    }
}
