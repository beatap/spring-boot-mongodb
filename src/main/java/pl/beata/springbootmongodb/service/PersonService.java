package pl.beata.springbootmongodb.service;

import java.io.IOException;
import java.util.List;

public interface PersonService<T> {

    void savePerson() throws IOException;
    List<T> getPersons();
}
