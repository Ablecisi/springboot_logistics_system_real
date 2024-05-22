package com.ablecisi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

  private Integer id;
  private String licensePlate;
  private String name;
  private String classes;
  private Integer loadWight;
  private String engineNumber;
  private String status;
  private String tips;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
