package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dictionary {

  private Integer id;
  private String dictionaryNumber;
  private String dictionaryType;
  private String dictionaryValue;
  private String dictionaryStatus;

}
