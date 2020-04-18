package pl.beata.springbootmongodb.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.beata.springbootmongodb.model.PersonMySQL;
import pl.beata.springbootmongodb.repository.PersonMySqlRepository;
import pl.beata.springbootmongodb.configuration.PersonResource;

import java.io.IOException;
import java.util.List;

@Profile("mysql")
@Service
public class PersonMySqlService implements PersonService {

    private PersonMySqlRepository repository;
    private PersonResource personResource;

    public PersonMySqlService(PersonMySqlRepository repository, PersonResource personResource) {
        this.repository = repository;
        this.personResource = personResource;
    }


    public void savePerson() throws IOException {
        repository.saveAll(personResource.getPersonMySQL());
    }

    public List<PersonMySQL> getPersons() {
        return repository.findAll();
    }

}
