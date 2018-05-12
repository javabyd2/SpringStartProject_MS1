package com.sda.spring.demo.controller;

import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }

    @RequestMapping(value = "/witaj", method = RequestMethod.GET)
    public String witaj(){
        return "Witaj";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public String json(){
        //return "[{\"name\":\"json1\",\"str\":\"str1\"},{\"name\":\"json2\",\"str\":\"str2\"}]";
        return "[{\"name\":\"json1\",\"str\":\"str1\"}]";
    }

    @RequestMapping(value = "/json2", method = RequestMethod.GET)
    public String json2() {
        return "{"
            +"\"menu\":{"
            +"\"id\":\"file\","
            +    "    \"value\":\"File\","
            +    "    \"popup\":{"
            +    "\"menuitem\": ["
            +    "{"
            +    "    \"value\":\"New\", \"onclick\":\"CreateNewDoc()\""
            +    "},"
            +    "{"
            +    "    \"value\":\"Open\", \"onclick\":\"OpenDoc()\""
            +    "},"
            +    "{"
            +    "    \"value\":\"Close\", \"onclick\":\"CloseDoc()\""
            +    "}"
     +"]"
      +      "}"
       + "}"
        +"}";
    }

    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public String table(){
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

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> showBooks(){
        return bookRepository.findAll();
    }
}
