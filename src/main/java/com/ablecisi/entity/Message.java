package com.ablecisi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

  private Integer id;
  private String messageTitle;
  private String messageContent;
  private String messageType;
  private String messageStatus;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;


}
