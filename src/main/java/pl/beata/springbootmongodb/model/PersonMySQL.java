package pl.beata.springbootmongodb.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.beata.springbootmongodb.enums.GenderType;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@Data
@NoArgsConstructor
@JsonPropertyOrder({"id", "firstName", "lastName", "email", "gender", "addressIP"})
public class PersonMySQL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private GenderType gender;
    @Column(name = "address_ip")
    private String addressIP;
}
