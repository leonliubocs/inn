package com.bocs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    private int staffId;
    private String lastName;
    private String firstName;
    private String department;
    private String username;
    private String password;



}
