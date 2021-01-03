package com.devch.mycontact.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.devch.mycontact.domain.entity.Block;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class BlockRepositoryTest {

  @Autowired
  private BlockRepository blockRepository;


  /**
   *  description: 차단 생성 및 검증
   */
  @Test
  void create() {
      String name = "김판동";
      blockRepository.save(createBlock(name));

      assertThat(blockRepository.findAll().get(0).getName()).isEqualTo(name);
  }


  /**
   * description: 차단 등록 메소드
   * @param name 필수 값
   * @return Block
   */
  private Block createBlock(String name) {
    return new Block(name);
  }
}