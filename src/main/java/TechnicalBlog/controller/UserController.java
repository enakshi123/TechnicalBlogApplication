package TechnicalBlog.controller;

import TechnicalBlog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import TechnicalBlog.dao.PostDAO;
import TechnicalBlog.model.User;
import TechnicalBlog.service.UserService;

@Controller
public class UserController {

    @RequestMapping("users/login")  //when get request by default
    public String login() {
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String registration() {
        return "users/registration";
    }

    @RequestMapping(value = "users/login", method= RequestMethod.POST)
    public String loginUser(User user) {
//        boolean name=user.getUsername().equals("abc");
//        boolean pwd=user.getPassword().equals("123");
//        boolean check=false;
        UserService u=new UserService();
        boolean flag=u.isValidUser(user);
        if(flag)
        {
            return "redirect:/posts";
        }
        else {
            return "users/login";
        }
    }


}

