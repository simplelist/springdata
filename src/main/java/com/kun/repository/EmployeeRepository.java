package com.kun.repository;

import com.kun.domain.Employee;
import org.springframework.data.repository.Repository;

/**
 * Created by kun on 2017/4/21.
 */
public interface EmployeeRepository extends Repository<Employee,Integer> {
    public Employee findByName(String name);
}
