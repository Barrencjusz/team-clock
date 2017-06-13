package com.performgroup.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author piotr.larysz
 */
@Data
@Document
public class Team {

  @Id
  private String id;
}
