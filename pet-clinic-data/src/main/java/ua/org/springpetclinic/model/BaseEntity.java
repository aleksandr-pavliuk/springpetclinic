package ua.org.springpetclinic.model;

import java.io.Serializable;

/**
 * @author Alex
 * @link https://intvw.me
 */
public class BaseEntity implements Serializable {

  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
