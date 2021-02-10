package ohara.linda.personAddressExample.repository;

import ohara.linda.personAddressExample.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
