package org.amazon.MultipleDB.controller;

import org.amazon.MultipleDB.authorDb.Author;
import org.amazon.MultipleDB.personDb.Person;
import org.amazon.MultipleDB.server.TestDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDbController {
    @Autowired
    private TestDbService testDbService;
    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person){
    return testDbService.addPerson(person);
    }
    @PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author author){
        return testDbService.addAuthor(author);
    }
}
