package pl.beata.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.beata.springbootmongodb.model.PersonMongo;

@Repository
public interface PersonMongoRepository extends MongoRepository<PersonMongo, String> {
}
