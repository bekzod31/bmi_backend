package com.emp.employees.controllers;

import com.emp.employees.models.Post;
import com.emp.employees.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/xirurg")
    public String xirurg(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "xirurg";
    }

    @GetMapping("/add")
    public String medcreate(Model model){
        return "medcreate";
    }

    @PostMapping("/add")
    public String addMedic(@RequestParam String first_name, @RequestParam String last_name, @RequestParam String profession, @RequestParam String date_of_born, @RequestParam String region, @RequestParam String phone_number, @RequestParam String image, Model model){
        Post post = new Post(first_name, last_name, profession, date_of_born, region, phone_number, image);
        postRepository.save(post);
        return "redirect:/xirurg";
    }

    @GetMapping("/xirurg/{id}")
    public String editXirurg(@PathVariable(value = "id") long id, Model model){
        if(postRepository.existsById(id)){
            Optional<Post> post = postRepository.findById(id);
            ArrayList<Post> res = new ArrayList<>();
            post.ifPresent(res::add);
            model.addAttribute("post", res);
            return "xirurg-edit";
        }
        else {
            return "404";
        }

    }



}
