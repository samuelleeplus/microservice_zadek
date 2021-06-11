package com.samuelleeplus.Controller;


import com.samuelleeplus.Entity.Owner;
import com.samuelleeplus.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    // create, find, update, delete
    @Autowired
    OwnerService ownerService ;

    @PostMapping("/registerOwner")
    public Owner createOwner(@RequestBody Owner owner){
        return ownerService.registerOwner(owner);
    }

    @GetMapping("/findOwner/{id}")
    public Owner findOwnerById(@PathVariable Long id){
        return ownerService.findOwnerById(id);
    }

    @PostMapping("/updateOwner")
    public Owner updateOwner(@RequestBody Owner owner){
    return ownerService.updateOwner(owner);
    }

    @DeleteMapping("/deleteOwner")
    public String deleteOwner(@RequestBody Owner owner){
        return ownerService.deleteOwner(owner);
    }

    @DeleteMapping("/deleteOwner/{id}")
    public String deleteOwnerById(@PathVariable Long id){
        return ownerService.deleteOwnerById(id);

    }

    //todo respond to questions & reviews



}
