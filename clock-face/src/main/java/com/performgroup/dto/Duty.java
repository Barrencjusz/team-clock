package com.performgroup.dto;

import lombok.Data;

/**
 * @author piotr.larysz
 */
@Data
public class Duty {

  private String name;

  private Person person;

  @Data
  public static class Person {

    private String firstName;

    private String lastName;
  }
}
