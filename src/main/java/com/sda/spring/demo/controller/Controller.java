package com.sda.spring.demo.controller;

import com.sda.spring.demo.dto.UserDTO;
import com.sda.spring.demo.dto.UserPropDTO;
import com.sda.spring.demo.model.*;
import com.sda.spring.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private AuthorService authorService;
    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PublisherService publisherService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello world";
    }

    @RequestMapping(value = "/witaj", method = RequestMethod.GET)
    public String witaj() {
        return "Witaj";
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Author> showAuthors() {
        return authorService.getAuthors();
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> showBooks() {
        return bookService.getBooks();
    }

    @RequestMapping(value = "/categories")
    public List<Category> showCategories() {
        return categoryService.getCategories();
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public Book addBook(
            @RequestBody Book book) {
        return bookService.save(book);
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public Category addCategory(
            @RequestBody Category category) {
        return categoryService.save(category);
    }

    @RequestMapping(value = "/author", method = RequestMethod.POST)
    public Author addAuthor(
            @RequestBody Author author) {
        return authorService.save(author);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public ResponseEntity<Book> getBookId(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookService.getBookById(id));
    }

    @RequestMapping(value = "/author/{id}", method = RequestMethod.GET)
    public ResponseEntity<Author> getAuthorId(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authorService.getAuthorById(id));
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public ResponseEntity<Category> getCategoryId(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(categoryService.getCategoryById(id));
    }
/*
    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public Optional<Category> getCategoryId(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }
*/

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> showUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/userprops", method = RequestMethod.GET)
    public List<UserPropDTO> showUserProps() {
        return userService.getUserProps();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User addUser(
            @RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public UserDTO getUserId(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<Role> showRoles() {
        return roleService.getRoles();
    }

    @RequestMapping(value = "/role", method = RequestMethod.POST)
    public Role addRole(
            @RequestBody Role role) {
        return roleService.save(role);
    }

    @RequestMapping(value = "/role/{id}", method = RequestMethod.GET)
    public ResponseEntity<Role> getRoleId(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(roleService.getRoleById(id));
    }



    @RequestMapping(value = "/publishers", method = RequestMethod.GET)
    public List<Publisher> showPublishers() {
        return publisherService.getPublishers();
    }

    @RequestMapping(value = "/publisher", method = RequestMethod.POST)
    public Publisher addPublisher(
            @RequestBody Publisher publisher) {
        return publisherService.save(publisher);
    }

    @RequestMapping(value = "/publisher/{id}", method = RequestMethod.GET)
    public ResponseEntity<Publisher> getPublisherId(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(publisherService.getPublisherById(id));
    }

}
