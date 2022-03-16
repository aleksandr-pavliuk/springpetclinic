package ua.org.springpetclinic.model;

import java.time.LocalDate;

/**
 * @author Alex
 * @link http://healthfood.net.ua
 */
public class Pet {

  private PetType petType;
  private Owner owner;
  private LocalDate birthDay;

  public PetType getPetType() {
    return petType;
  }

  public void setPetType(PetType petType) {
    this.petType = petType;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public LocalDate getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(LocalDate birthDay) {
    this.birthDay = birthDay;
  }
}
