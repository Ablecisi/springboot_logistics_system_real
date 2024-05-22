package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarInsurance {

  private Integer id;
  private String licensePlate;
  private String insuranceCompany;
  private String commercialInsuranceNumber;
  private LocalDateTime commercialInsuranceEntryDate;
  private LocalDateTime commercialInsuranceExpirationDate;
  private String compulsoryTrafficInsurance;
  private LocalDateTime compulsoryInsuranceEntryDate;
  private LocalDateTime compulsoryInsuranceExpirationDate;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
