package com.green.jpa_study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "JPA_MEMBER")
@Setter
@Getter
@NoArgsConstructor // 기본 생성자 생성 (jpa 사용시 기본 생성자 사용 필수)
public class Member {
  @Id // PK컬럼임을 인지

  // 데이터베이스 종류에 따라 PK 자동생성 전략이 달라짐
  // GenerationType.IDENTITY -> MySQL, MariaDB
  // GenerationType.AUTO -> jpa에게 디비에 따라 알아서 만들라는 명령어
  // GenerationType.SEQUENCE -> Oracle
  // GenerationType.TABLE -> PK 생성 전용 테이블을 활용하겠다
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long memNum;

  @Column(name = "MEM_EMAIL", nullable = false, length = 50, unique = true)
  private String memEmail;

  // 기본적으로 변수명을 카멜케이스 기법으로 작성하면 알아서 컬럼명 해석
  @Column(nullable = false, length = 50)
  private String memName;

  @Column()
  private Integer memAge;

  // db에서 default 제약조건 사용 시 해당 컬럼을 insert/update 쿼리에서 제외
  @Column(insertable = false, updatable = false)
  private LocalDateTime createAt;
}
