package pl.beata.springbootmongodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.beata.springbootmongodb.model.PersonMySQL;

@Repository
public interface PersonMySqlRepository extends JpaRepository<PersonMySQL, Long> {
}
