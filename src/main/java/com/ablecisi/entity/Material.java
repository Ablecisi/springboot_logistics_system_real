package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {

  private Integer id;
  private String materialNumber;
  private String materialName;
  private String materialEasyName;
  private String materialUnit;
  private double materialPrice;
  private String materialTips;
  private Integer storageId;

}
