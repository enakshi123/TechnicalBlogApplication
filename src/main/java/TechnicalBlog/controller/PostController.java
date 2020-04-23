package TechnicalBlog.controller;

import TechnicalBlog.model.Post;
import TechnicalBlog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PostController   {
    //service class ka use krke data ko fetch kia h
    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public String getUserPost(Model model){
        List<Post>posts=postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "posts";
    }


























































































}
