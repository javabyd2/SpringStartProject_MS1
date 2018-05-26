package com.sda.spring.demo.controller;

import com.sda.spring.demo.service.AuthorService;
import com.sda.spring.demo.service.BookService;
import com.sda.spring.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @Autowired
    private AuthorService authorService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private BookService bookService;

    @GetMapping(value = "/index")
    public ModelAndView index(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping(value = "/web/authors")
    public ModelAndView authors(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("authorsList", authorService.getAuthors());
        modelAndView.setViewName("authors");
        return modelAndView;
    }

    @GetMapping(value = "/web/roles")
    public ModelAndView roles(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("rolesList", roleService.getRoles());
        modelAndView.setViewName("roles");
        return modelAndView;
    }

    @GetMapping(value = "/web/books")
    public ModelAndView books(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("booksList", bookService.getBooks());
        modelAndView.setViewName("books");
        return modelAndView;
    }
}
