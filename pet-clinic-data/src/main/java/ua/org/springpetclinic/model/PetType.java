package ua.org.springpetclinic.model;

/**
 * @author Alex
 * @link http://healthfood.net.ua
 */
public class PetType extends BaseEntity{

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
