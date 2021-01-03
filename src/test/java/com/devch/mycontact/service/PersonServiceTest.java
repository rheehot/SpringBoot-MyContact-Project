package com.devch.mycontact.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.devch.mycontact.domain.entity.Block;
import com.devch.mycontact.domain.entity.Person;
import com.devch.mycontact.repository.BlockRepository;
import com.devch.mycontact.repository.PersonRepository;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private BlockRepository blockRepository;

    private MockMvc mockMvc;

    @Test
    void findPersonExcludeBlock() {
      addPersonList();

      List<Person> nonBlockPersonList = personService.findPersonExcludeBlocks();
      nonBlockPersonList.forEach(System.out::println);

      assertThat(nonBlockPersonList.size()).isEqualTo(3);
      assertThat(nonBlockPersonList.get(0).getName()).isEqualTo("김판동");
   }

   private void addPersonList() {
      createPerson("김판동",21,"O");
      createPerson("이미나",17,"A");
      createPerson("나전설",15,"B");
      addBlockList("서다윤",23,"A");
   }

   private void createPerson(String name, int age, String bloodType) {
      personRepository.save( new Person(name,age,bloodType) );
   }

   private void addBlockList(String name, int age, String bloodType) {
      Person blockPerson = new Person(name,age,bloodType);
      blockPerson.setBlock(new Block(name));

      personRepository.save(blockPerson);
   }
}