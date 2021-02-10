package ohara.linda.personAddressExample.repository;

import ohara.linda.personAddressExample.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
