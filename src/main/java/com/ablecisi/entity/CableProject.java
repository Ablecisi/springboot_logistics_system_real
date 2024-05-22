package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CableProject {

  private Integer id;
  private Integer projectId;
  private String projectName;
  private String cableName;
  private String voltageLevel;
  private String cableSection;
  private Integer expectedLength;
  private LocalDateTime extractDate;
  private String inStatus;
  private Integer inCount;
  private String outStatus;
  private Integer outCount;
  private String orderStatus;
  private String planStatus;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
