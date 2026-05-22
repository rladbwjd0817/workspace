package com.green.jpa_study.service;

import com.green.jpa_study.dto.MemberRequest;
import com.green.jpa_study.dto.MemberResponse;
import com.green.jpa_study.entity.Member;
import com.green.jpa_study.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
  private final MemberRepository memberRepository;

  // 회원 목록 조회
  public List<MemberResponse> findAll(){
    // return타입 : List<Member>
//    List<Member> list =  memberRepository.findAll();
//
//    // List<Member> -> List<MemberResponse>로 변형
//    List<MemberResponse> resultList = new ArrayList<>();
//
//    for(Member m : list){
//      MemberResponse mr = MemberResponse.convertToMemberResponse(m);
//      resultList.add(mr);
//    }
//
//    return resultList;

    return memberRepository.findAll().stream()
            .map(e -> MemberResponse.convertToMemberResponse(e))
            .toList();
  }

  // 게시글 삽입 :
  @Transactional
  public MemberResponse create(MemberRequest memberRequest){
    Member m = new Member();
    m.setMemEmail(memberRequest.getMemEmail());
    m.setMemAge(memberRequest.getMemAge());
    m.setMemName(memberRequest.getMemName());

    Member result = memberRepository.save(m); //매개변수로 Entity가 들어와야 함.
    return MemberResponse.convertToMemberResponse(result);

  }

  // 게시글 상세 보기
  public MemberResponse findById(Long memNum){
    Member m = memberRepository.findById(memNum).get();
    return MemberResponse.convertToMemberResponse(m);
  }

  // 게시글 수정
  @Transactional
  public MemberResponse update(Long memNum, MemberRequest memberRequest){
    // 수정하려는 회원 정보 조회
    Member m = memberRepository.findById(memNum).get();

    // Entity의 값을 변경하면 테이블의 값을 변경하는 것과 같기 때문에 자동으로 update 쿼리가 실행됨.
    m.setMemName(memberRequest.getMemName());
    m.setMemAge(memberRequest.getMemAge());

    return MemberResponse.convertToMemberResponse(m);
  }

  public List<MemberResponse> findByMemNameAndMemAge(MemberRequest memberRequest){
    List<Member> ml = memberRepository.findByMemNameAndMemAge(memberRequest.getMemName(), memberRequest.getMemAge());

    List<MemberResponse> resultList = new ArrayList<>();

    for(Member m : ml){
      MemberResponse mp = MemberResponse.convertToMemberResponse(m);
      resultList.add(mp);
    }

    return resultList;
  }

}
