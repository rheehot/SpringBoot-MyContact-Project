package com.devch.mycontact.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.devch.mycontact.domain.entity.Person;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonRepositoryTest {

  @Autowired
  private PersonRepository personRepository;

  @Test
  void crudTest(){
    Person person = new Person();
    person.setId(1L);
    person.setName("Test01");
    person.setAddress("Test Address");
    person.setBloodType("O");
    person.setAge(24);
    person.setBirthday(LocalDate.of(1994,3,21));
    person.setHobby("Reading");

    personRepository.save(person);

    List<Person> personList = personRepository.findAll();

    assertThat(personList.size()).isEqualTo(1);
    assertThat(personList.get(0).getName()).isEqualTo("Test01");
    assertThat(personList.get(0).getBloodType()).isEqualTo("O");
    assertThat(personList.get(0).getAge()).isEqualTo(24);
  }

  @Test
  void hashCodeAndEquals() {
    Person person = new Person("martin", 10, "A");
    Person person2 = new Person("martin", 10, "A");

    System.out.println(person.equals(person2));
    System.out.println(person.hashCode());
    System.out.println(person2.hashCode());

    Map<Person, Integer> map = new HashMap<>();
    map.put(person, person.getAge());

    System.out.println(map);
    System.out.println(map.get(person2));
  }
}