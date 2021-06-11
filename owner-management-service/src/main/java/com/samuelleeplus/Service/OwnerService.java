package com.samuelleeplus.Service;

import com.samuelleeplus.Entity.Owner;
import com.samuelleeplus.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository ownerRepository ;


    public Owner registerOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Owner findOwnerById(Long id) {
        return ownerRepository.findByOwnerId(id);
    }

    public Owner updateOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public String deleteOwner(Owner owner) {
        ownerRepository.delete(owner);
        return "Sorry to see you go!";
    }

    public String deleteOwnerById(Long id) {
        ownerRepository.deleteById(id);
        return "Successfully deleted. Sorry to see you go!";
    }
}
