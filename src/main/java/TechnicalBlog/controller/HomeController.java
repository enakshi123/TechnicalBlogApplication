package TechnicalBlog.controller;

import TechnicalBlog.dao.PostDAO;
import TechnicalBlog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.*;

//@Controller
//public class HomeController {
//    @RequestMapping("/posts")
//    public String getAllPosts(Model model){ // to send all data to index page we need to keep it in a container as arraylist obj
//        //model is used model class ka rf var predefined model class ,to data send from control to view(control to html page)
//        List<Post> list=new ArrayList<>();
//        Post p1=new Post();
//        p1.setId(1);
//        p1.setTitle("java");
//        p1.setBody("Java is a programming language");
//        p1.setDate(new Date());
//
//
//        Post p2=new Post();
//        p2.setId(2);
//        p2.setTitle("python");
//        p2.setBody("python is a  good programming language");
//        p2.setDate(new Date());
//
//        Post p3=new Post();
//        p3.setId(3);
//        p3.setTitle("html");
//        p3.setBody("html is a programming language");
//        p3.setDate(new Date());
//
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//
//        model.addAttribute("posts",list);
//
//
//        return "index";
//    }
//}
@Controller
public class HomeController {

    //    @Autowired
//    private PostService postService;
    @Autowired
    private PostDAO postDAO;

    @RequestMapping("/posts")
    public String getAllPosts(Model model)
    {
        ArrayList<Post> posts=postDAO.getAllPosts();
        model.addAttribute("posts",posts);
        return "index";
    }
}
