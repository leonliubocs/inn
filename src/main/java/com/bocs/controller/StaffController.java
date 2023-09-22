package com.bocs.controller;

import com.bocs.mapper.StaffMapper;
import com.bocs.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffController {

    @Autowired
    private StaffMapper staffMapper;

    @RequestMapping("/staff/queryStaffList")
    public List<Staff> queryStaffList(){
        System.out.println("test");
        System.out.println(staffMapper.queryStaffList());
        return staffMapper.queryStaffList();
    }

    @GetMapping("/staff/queryStaffByUsernameAndPassword/{username}/{password}")
    public Staff queryStaffByUsernameAndPassword(@PathVariable String username , @PathVariable String password)
    {
        Staff staff = staffMapper.queryStaffByUsernameAndPassword(username, password);
        System.out.println("===== hello");
        System.out.println(staff==null?"staff is null":staff);
        return staff;
    }

}
