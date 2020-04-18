package pl.beata.springbootmongodb.configuration;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import pl.beata.springbootmongodb.model.PersonMongo;
import pl.beata.springbootmongodb.model.PersonMySQL;

import java.io.IOException;
import java.util.List;

@Configuration
public class PersonResource {

    @Value(value = "classpath:data/mock_data.csv")
    private Resource personResource;

    public List<PersonMongo> getPersonMongo() throws IOException {
        MappingIterator<PersonMongo> personIterator =  new CsvMapper()
                .readerWithTypedSchemaFor(PersonMongo.class)
                .readValues(personResource.getInputStream());

        return personIterator.readAll();
    }

    public List<PersonMySQL> getPersonMySQL() throws IOException {
        MappingIterator<PersonMySQL> personIterator = new CsvMapper()
                .readerWithTypedSchemaFor(PersonMySQL.class)
                .readValues(personResource.getInputStream());
        return personIterator.readAll();
    }



}
