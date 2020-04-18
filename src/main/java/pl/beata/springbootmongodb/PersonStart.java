package pl.beata.springbootmongodb;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.beata.springbootmongodb.aspect.PersonCounter;
import pl.beata.springbootmongodb.service.PersonService;

@Component
public class PersonStart {

    private PersonService personService;

    public PersonStart(PersonService personService) {
        this.personService = personService;

    }


//    @EventListener(ApplicationReadyEvent.class)
//    @PersonCounter
//    public void initSave() throws IOException {
//        personService.savePerson();
//    }

    @EventListener(ApplicationReadyEvent.class)
    @PersonCounter
    public void initFindAll() {
        personService.getPersons();
    }
}
