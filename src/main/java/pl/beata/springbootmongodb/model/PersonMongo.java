package pl.beata.springbootmongodb.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import pl.beata.springbootmongodb.enums.GenderType;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Document(collection = "persons")
@Data
@NoArgsConstructor
@JsonPropertyOrder({"id", "firstName", "lastName", "email", "gender", "addressIP"})
public class PersonMongo {

    @Id
    private String id;
    @Field(name = "first_name")
    private String firstName;
    @Field(name = "last_name")
    private String lastName;
    private String email;
    private GenderType gender;
    @Field(name = "address_ip")
    private String addressIP;
    private LocalDateTime created = LocalDateTime.now();

}
