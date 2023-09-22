package com.bocs.dao;

//import com.bocs.pojo.Department;
//import com.bocs.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
//    private static Map<Integer, Employee> employees =null;
//
//    @Autowired
//    private DepartmentDao  departmentDao;
//
//    static {
//        employees= new HashMap<Integer, Employee>();
//        employees.put(212, new Employee(212, "leon","9234@qq.com", 1, new Department(101,"Hr"), new Date()));
//        employees.put(213, new Employee(213, "leon3","9234@qq.com", 1, new Department(101,"Hr"), new Date()));
//        employees.put(214, new Employee(214, "leon4","9234@qq.com", 1, new Department(101,"Hr"), new Date()));
//    }
//
//    private static Integer initId=215;
//    public void add(Employee employee){
//        if(employee.getId()==null){
//            employee.setId(initId++);
//        }
//
//
//        employee.setDepartment( departmentDao.getDepartment( employee.getDepartment().getId()));
//        employees.put(employee.getId(), employee);
//    }
//
//    public Collection<Employee> getAll(){
//        return employees.values();
//    }
//
//    public Employee getEmployee(Integer id){
//        return employees.get(id);
//    }
//
//
//    public void delete(Integer id){
//        employees.remove(id);
//    }
}


