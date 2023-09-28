package com.bocs.controller;

import com.bocs.mapper.StaffMapper;
import com.bocs.pojo.Staff;
import io.micrometer.common.util.StringUtils;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private StaffMapper staffMapper;


    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("language") String language,
            Model model,
            HttpSession session
            ) {
        Staff staff = staffMapper.queryStaffByUsernameAndPassword(username, password);

        if(staff!=null && staff.isEnable()) {
            session.setAttribute("username",username);
            session.setAttribute("staff",staff);
            return "redirect:/main.html";
        }else {
            System.out.println(language);
            if (language.equals("zh_CN")) {
                model.addAttribute("msg", "用户名或密码错误！！");
            } else {
                model.addAttribute("msg", "username or password is wrong！！");
           }
        return "index";
        }

    }


    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index";
    }
}
