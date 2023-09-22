package com.bocs.mapper;

import com.bocs.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaffMapper {
    List<Staff> queryStaffList();
    Staff queryStaffByUsernameAndPassword(String username, String password);

}
