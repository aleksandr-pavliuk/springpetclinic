package ua.org.springpetclinic.service;

import java.util.Set;
import ua.org.springpetclinic.model.Pet;

/**
 * @author Alex
 * @link https://intvw.me
 */
public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();


}
