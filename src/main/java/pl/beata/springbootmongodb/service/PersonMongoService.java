package pl.beata.springbootmongodb.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.beata.springbootmongodb.model.PersonMongo;
import pl.beata.springbootmongodb.repository.PersonMongoRepository;
import pl.beata.springbootmongodb.configuration.PersonResource;

import java.io.IOException;
import java.util.List;

@Profile("mongo")
@Service
public class PersonMongoService implements PersonService {

    private PersonMongoRepository repository;
    private PersonResource personResource;

    public PersonMongoService(PersonMongoRepository repository, PersonResource personResource) {
        this.repository = repository;
        this.personResource = personResource;
    }


    public void savePerson() throws IOException {
        repository.saveAll(personResource.getPersonMongo());
    }

    public List<PersonMongo> getPersons() {
        return repository.findAll();
    }
}
