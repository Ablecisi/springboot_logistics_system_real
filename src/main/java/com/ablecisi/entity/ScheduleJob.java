package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleJob {

  private Integer id;
  private String jobName;
  private String jobStatus;
  private String ronExpression;
  private String params;
  private String remark;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
