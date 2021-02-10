package ohara.linda.personAddressExample.service;

import ohara.linda.personAddressExample.model.Person;

import java.util.List;

public interface PersonService {
    Person createPerson(Person person);
    Person updatePerson(Person person);
    List<Person> getAllPeople();
    Person getPersonById(long personId);
    void deletePerson(long id);

}
