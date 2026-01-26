package com.green.item.mapper;

import com.green.item.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //객체생성 + xml 파일에서 만든 쿼리문을 실행시키는 인터페이스라는 것을 지정
public interface ItemMapper {

//  상품 등록 쿼리 실행 메서드
  void postItem(ItemDTO itemDTO);

//  상품 목록 조회 쿼리 실행 메서드
  List<ItemDTO> selectItem(); //매개변수는 쿼리에서 빠진거 채워주는 거임!

//  상품 상세 조회 쿼리 실행 메서드
  ItemDTO selectOneItem(int itemNum);

//  입력한 상품 번호를 가진 상품의 상품명과 가격 수정 쿼리 실행 메서드
  void updateItem(ItemDTO itemDTO);

//  상품 삭제 쿼리 실행 메서드
  void deleteItem(int itemNum);


}
