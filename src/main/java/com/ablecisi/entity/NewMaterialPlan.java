package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewMaterialPlan {

  private Integer id;
  private String planName;
  private String planType;
  private String projectName;
  private String purchaseOrderNumber;
  private String description;
  private Integer requireCount;
  private Integer inCount;
  private String inStatus;
  private String outStatus;
  private Integer outCount;
  private String status;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
