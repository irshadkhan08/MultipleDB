package org.amazon.MultipleDB.server;


import org.amazon.MultipleDB.authorDb.Author;
import org.amazon.MultipleDB.authorDb.AuthorRepository;
import org.amazon.MultipleDB.personDb.Person;
import org.amazon.MultipleDB.personDb.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDbService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private AuthorRepository authorRepository;
    public Person addPerson(Person person){
        return personRepository.save(person);
    }
    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }
}
