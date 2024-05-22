package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SparePartsPlan {

  private Integer id;
  private String planName;
  private String planType;
  private Integer assetId;
  private Integer projectId;
  private String projectName;
  private String sparePartsDescription;
  private Integer typeId;
  private LocalDateTime planStartDate;
  private LocalDateTime planEndDate;
  private String inStatus;
  private String outStatus;
  private String orderStatus;
  private String planStatus;
  private String planTips;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
