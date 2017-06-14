package com.performgroup.dto;

import java.util.List;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author piotr.larysz
 */
@Data
public class Team {

  @Id
  private String id;

  private List<Person> people;

  @Data
  static class Person {

    private String firstName;

    private String lastName;

    private List<String> duties;
  }
}
