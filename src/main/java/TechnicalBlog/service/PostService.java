package TechnicalBlog.service;

import TechnicalBlog.model.Post;
import TechnicalBlog.respository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

@Service
public class PostService {
//    public ArrayList<Post> getAllPosts() {
//
//
//        ArrayList<Post> list = new ArrayList<>();
//        Post p1 = new Post();
//        p1.setId(1);
//        p1.setTitle("java");
//        p1.setBody("Java is a programming language");
//        p1.setDate(new Date());
//
//
//        Post p2 = new Post();
//        p2.setId(2);
//        p2.setTitle("python");
//        p2.setBody("python is a  good programming language");
//        p2.setDate(new Date());
//
//        Post p3 = new Post();
//        p3.setId(3);
//        p3.setTitle("html");
//        p3.setBody("html is a programming language");
//        p3.setDate(new Date());
//
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//        return list;
    @Autowired
    private PostRepository repository;
    public List<Post> getAllPosts(){
        return repository.getAllPosts();

    }
    public Post getOnePost(){
        return repository.getLatestPost();
    }
}
