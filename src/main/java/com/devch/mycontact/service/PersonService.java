package com.devch.mycontact.service;

import com.devch.mycontact.domain.entity.Block;
import com.devch.mycontact.domain.entity.Person;
import com.devch.mycontact.repository.BlockRepository;
import com.devch.mycontact.repository.PersonRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private BlockRepository blockRepository;

    /**
     * description: 차단 목록을 제외한 지인 목록 출력
     *
     * @return 비차단 지인 리스트 (Block is null)
     */
    public List<Person> findPersonExcludeBlocks() {

      return personRepository
          .findAll()
          .stream()
          .filter(person -> person.getBlock() == null)
          .collect(Collectors.toList());
    }


}
