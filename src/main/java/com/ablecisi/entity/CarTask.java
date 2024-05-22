package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarTask {

  private Integer id;
  private String licensePlate;
  private String taskName;
  private String taskType;
  private LocalDateTime taskStartDate;
  private LocalDateTime taskEndDate;
  private String taskStatus;
  private String taskTips;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
