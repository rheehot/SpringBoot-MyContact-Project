package com.devch.mycontact.domain.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Block {

  @Id
  @GeneratedValue
  private Long Id;

  @NonNull
  private String name;

  private String reason;

  private LocalDate startDate;

  private LocalDate endDate;

}
