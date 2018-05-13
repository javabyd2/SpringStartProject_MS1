package com.sda.spring.demo.controller;

import com.sda.spring.demo.model.*;
import com.sda.spring.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello world";
    }

    @RequestMapping(value = "/witaj", method = RequestMethod.GET)
    public String witaj() {
        return "Witaj";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public String json() {
        //return "[{\"name\":\"json1\",\"str\":\"str1\"},{\"name\":\"json2\",\"str\":\"str2\"}]";
        return "[{\"name\":\"json1\",\"str\":\"str1\"}]";
    }

    @RequestMapping(value = "/json2", method = RequestMethod.GET)
    public String json2() {
        return "{"
                + "\"menu\":{"
                + "\"id\":\"file\","
                + "    \"value\":\"File\","
                + "    \"popup\":{"
                + "\"menuitem\": ["
                + "{"
                + "    \"value\":\"New\", \"onclick\":\"CreateNewDoc()\""
                + "},"
                + "{"
                + "    \"value\":\"Open\", \"onclick\":\"OpenDoc()\""
                + "},"
                + "{"
                + "    \"value\":\"Close\", \"onclick\":\"CloseDoc()\""
                + "}"
                + "]"
                + "}"
                + "}"
                + "}";
    }

    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public String table() {
        String html = null;
        html = html
                .concat("<html>")
                .concat("<body>")
                .concat("<tr>")
                .concat("<td>Lp</td>")
                .concat("<td>Data</td>")
                .concat("</tr>")
                .concat("<tr>")
                .concat("<td>1</td>")
                .concat("<td>12-05-2018</td>")
                .concat("</tr>")
                .concat("<tr>")
                .concat("<td>2</td>")
                .concat("<td>13-05-2018</td>")
                .concat("</tr>")
                .concat("</body>")
                .concat("</html>");
        System.out.printf(html);
        return html;
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
    public Optional<Book> getBookId(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @RequestMapping(value = "/author/{id}", method = RequestMethod.GET)
    public Optional<Author> getAuthorId(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public Optional<Category> getCategoryId(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> showUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User addUser(
            @RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Optional<User> getUserId(@PathVariable Long id) {
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
    public Optional<Role> getRoleId(@PathVariable Long id) {
        return roleService.getRoleById(id);
    }
}
