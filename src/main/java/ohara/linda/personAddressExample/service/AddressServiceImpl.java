package ohara.linda.personAddressExample.service;

import ohara.linda.personAddressExample.controller.ResourceNotFoundException;
import ohara.linda.personAddressExample.model.Address;
import ohara.linda.personAddressExample.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Address address) {
        Optional<Address> addressDb = this.addressRepository.findById(address.getId());

        if(addressDb.isPresent()){
            Address addressUpdate = addressDb.get();
            addressUpdate.setId(address.getId());
            addressUpdate.setNumber(address.getNumber());
            addressUpdate.setStreet(address.getStreet());
            addressUpdate.setCity(address.getCity());
            addressUpdate.setState(address.getState());
            addressRepository.save(addressUpdate);
            return addressUpdate;
        }else{
            throw new ResourceNotFoundException("Record not found with id: "+ address.getId());
        }
    }

    @Override
    public Address getAddressById(long addressId) {
        Optional<Address> addressDb = this.addressRepository.findById(addressId);
        if(addressDb.isPresent()){
        return addressDb.get();
    }else{
            throw new ResourceNotFoundException("Record not found with id: "+ addressId);
        }
    }


    @Override
    public void deleteAddress(long addressId) {
        Optional<Address> addressDb = this.addressRepository.findById(addressId);
        if(addressDb.isPresent()){
            this.addressRepository.delete(addressDb.get());
        }else{
            throw new ResourceNotFoundException("Record not found with id: "+ addressId);
        }

    }
}
