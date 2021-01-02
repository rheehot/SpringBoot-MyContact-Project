# Project: 지인 관리  API 개발

## 📱 MYCONTACT !!


- 기본 Person 객체를 통한 CRUD, JPA 연관 설정, RESTful 한 설계에 집중한 Server API 입니다.

### 📌 Description

- 서버 개발자로 성장하기 위한 학습 프로젝트
- RESTful 한 API 개발
- TDD 기반의 로직 개발
- 애자일 소프트웨어 개발 방법론을 따름

### 📚 Tech Stack

- Spring Boot
- junit 5
- H2
- Gradle
- JPA
- Java 8 ( Lamda, Stream, Fileter)

### 프로젝트 주요 관심사 💡💡

- 가독성이 떨어지는 코드에 대한 리펙토링
- Layer 간 역할 분리를 위한 리펙토링
- 단위 테스트를 통한 Layer간 철저한 분리

### 코드 컨벤션 🧾

- Google Code Convention 준수

<br>

## Agile 1 - Cycle  🏄‍♂️

### JPA

- Entity 생성
- @OneToOne Relation
    - CascadeType
    - FetchType
    - Optional, orphanRemoval
- QueryMethod
- @Embedded
- @Valid
- @Query
- @Where (for soft-delete)
- Data.sql

### SpringMvc

- @GetMapping
- @PostMapping
- @PutMapping
- @PatchMapping
- @DeleteMapping
- @PathVariable
- @RequestBody
- Lombok
    - @Getter
    - @Setter
    - @ToString
    - @Constructor
    - @EqualsAndHashCode
    - @Data
- SpringTest

### Java8

- Stream
- Fileter
- Map
<br>

## Agile 2- Cycle  🏄‍♂️

### SpringMvc

- CustomJsonSerializer
- SpringTest
    - MockMvc Test
    - Matcher
    - Junit5

### MockTest

- Mockito
- CustomArgumentMatcher

### Exception Handling

- CustomException
- ExceptionalHandler
- GlobalExceptionHandler
- Parameter Validator
    - @NotEmpty
    - @NotBlank
    - @Valid

### Paging

- Pageable
- Page
