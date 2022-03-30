package ua.org.springpetclinic.service;

import java.util.Set;
import ua.org.springpetclinic.model.Owner;

/**
 * @author Alex
 * @link https://intvw.me
 */
public interface OwnerService {

  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Owner save (Owner owner);

  Set<Owner> findAll ();

}
