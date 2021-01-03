package com.devch.mycontact.domain.entity;


import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Person {

  @Id
  @GeneratedValue
  private Long Id;

  @NonNull
  private String name;

  @NonNull
  private int age;

  @NonNull
  private String bloodType;

  private String hobby;

  private String address;

  private LocalDate birthday;

  private String job;

  private String phoneNumber;

  private boolean deleted;

  @OneToOne(cascade = CascadeType.PERSIST)
  @ToString.Exclude
  private Block block;

}
