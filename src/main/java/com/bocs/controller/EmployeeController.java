package com.bocs.controller;

import com.bocs.dao.DepartmentDao;
import com.bocs.dao.EmployeeDao;
//import com.bocs.pojo.Department;
//import com.bocs.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

//    @Autowired
//    EmployeeDao employeeDao;
//
//    @Autowired
//    DepartmentDao departmentDao;
//
//    @RequestMapping("/emps")
//    public String list(Model model){
//        Collection<Employee> emps = employeeDao.getAll();
//        model.addAttribute("emps", emps);
//        System.out.println(emps);
//        return "employee/employee-list";
//    }
//
//    @GetMapping("/emp")
//    public String toAddNewEmployee(Model model){
//        Collection<Department> departments = departmentDao.getDepartments();
//        model.addAttribute("departments", departments);
//        return "employee/add";
//    }
//
//    @PostMapping("/emp")
//    public String addNewEmployee(Employee employee){
//        System.out.println("save ==> "+ employee);
//        employeeDao.add(employee);
//        return "redirect:/emps";
//    }
//
//    @GetMapping("/emp/{id}")
//    public String toUpdateEmp(@PathVariable("id") Integer id, Model model){
//        Employee employee = employeeDao.getEmployee(id);
//        model.addAttribute("emp", employee);
//        Collection<Department> departments = departmentDao.getDepartments();
//        model.addAttribute("departments", departments);
//
//        return "employee/update";
//    }
//
//
//    @PostMapping("/updateEmp")
//    public String updateEmp(Employee employee){
//        employeeDao.add(employee);
//        return "redirect:/emps";
//
//    }
//
//    @GetMapping("/delEmp/{id}")
//    public String delEmp(@PathVariable("id") Integer id) {
//        employeeDao.delete(id);
//        return "redirect:/emps";
//    }

}
