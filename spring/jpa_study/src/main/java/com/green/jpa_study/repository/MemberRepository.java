package com.green.jpa_study.repository;


// Mybatis의 Mapper Interface 역할
// DB 조작 기능을 위해서는 JpaRepository 인터페이스를 상속받는다.
// JpaRepository<Entity명, PK 자료형>
// JpaRepository 인터페이스만 상속받으면, 어떠한 코드를 작성하지 않아도 이미 CRUD는 완성
import com.green.jpa_study.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
  // CRUD findAll() : 전체 조회
  // findById() : 상세 조회
  // count() : 데이터 갯수 조회
  // save() : 데이터 저장 + 업데이트 / insert 쿼리 진행
  // delete(pk) : 데이터 삭제

  // 기본이 아닌 쿼리문을 실행하려면 메서드를 추가 선언
  // 메서드 명에 따라 쿼리문이 자동 생성

  // 1. 이름을 조건으로 회원 조회
  // 쿼리는 무조건 Entity 타입으로 리턴받음
  List<Member> findByMemName(String memName);

  // 2. 나이를 조건으로 회원조회
  List<Member> findByMemAge(Integer memAge);

  // 3. 이름과 나이를 조건으로 회원조회
  List<Member> findByMemNameAndMemAge(String memName, Integer memAGe);

  // 4.크기비교 조건 WHERE MEM_AGE >= ?
  // 크다 : GreaterThan
  // 작다 : LessThan
  List<Member> findByMemAgeGreaterThanEqual();

  // 5. WHERE NAME = ? AND AGE >= ?
  List<Member> findByMemNameANDMemAgeGreaterThanEqual(String memName, Integer memAGe);

  // 6. WHERE MAM_NAME LIKE '%???%' => Containing
  List<Member> findByMemNameContaining(String memName);

  // 7. ORDER BY CREATE_AT DESC
  List<Member> findAllOrderByCreateAtDesc();

  // 8. WHERE MEM_EMAIL LIKE '%???%' ORDER BY MEM_EMAIL ASC
  List<Member> findByMemEmailContainingOrderByMemName(String memEmail);

  // 9.
  List<Member> countByMemAgeLessThanEqual(Integer memAee);

  // 10.
  // Query 어노테이션
  @Query(value =  "SELECT * FROM JPA_MEMBER WHWRE MEM_AGE >= :memAge", nativeQuery = true)
  List<Member> select1(@Param("memAge") Integer memAge);
}
