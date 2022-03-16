package ua.org.springpetclinic.model;

/**
 * @author Alex
 * @link http://healthfood.net.ua
 */
public class Person {

  private String firstName;
  private String lastName;

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
