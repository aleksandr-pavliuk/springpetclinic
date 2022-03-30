package ua.org.springpetclinic.service;

import java.util.Set;
import ua.org.springpetclinic.model.Vet;

/**
 * @author Alex
 * @link https://intvw.me
 */
public interface VetService {

  Vet findById(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();

}
