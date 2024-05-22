package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission {

  private Integer id;
  private String name;
  private String tips;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
