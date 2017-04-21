package com.kun.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kun on 2017/4/21.
 */
public class EmployeeRepositoryTest {


    private ApplicationContext ctx=null;
    private EmployeeRepository employeeRepository=null;

    @Before
    public void before() {
        ctx=new ClassPathXmlApplicationContext("beans-new.xml");
        employeeRepository=ctx.getBean(EmployeeRepository.class);
    }


    @Test
    public void testTemplate() {
    }

    @Test
    public void testQuery() {
        System.out.println(employeeRepository.findByName("张辽"));

    }


    @Test
    public void testCreateTable() {

    }
    @Test
    public void testSave() {
    }
    @After
    public void after() {
        ctx=null;
    }
}
