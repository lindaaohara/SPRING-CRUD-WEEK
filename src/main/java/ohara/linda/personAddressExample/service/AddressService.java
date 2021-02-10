package ohara.linda.personAddressExample.service;

import ohara.linda.personAddressExample.model.Address;

public interface AddressService {
    Address createAddress(Address address);
    Address updateAddress(Address address);
    Address getAddressById(long personId);
    void deleteAddress(long id);
}
