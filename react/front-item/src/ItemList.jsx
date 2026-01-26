import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ItemList = () => {
  // 조회한 상품목록 저장 변수
  const [itemList, setItemList] = useState ([]);

  // 재조회를 위한 state 변수 (리렌더링 할 목적으로 만드는 변수는 객체나 배열을 줌.)
  const [cnt, setCnt] = useState({});


  // 상품 조회한 데이터 저장 함수
  // mount될 때 spring에서 상품목록을 조회 후 데이터 가져오기 - useEffect
  // get은 두번째 매개변수 줄 수 없음!
  useEffect(() => {
    axios.get('http://localhost:8080/items')
    .then(response => {
      console.log(response.data)
      setItemList(response.data)
    })
    .catch(error => console.log(error));
  }, [cnt]) 
  // useEffect 의존성 배열이 X -> 마운트될때 + 리렌더링
  // useEffect [] -> 마운트 될 때 (리렌더링 할 땐 X)
  // useEffect [변수] -> 마운트 될 때, cnt 값이 변경되어서 리렌더링 될 경우에 실행!

  // 삭제버튼 누를 시 삭제 함수
  const deleteItem = (itemNum) => {
    axios.delete(`http://localhost:8080/items/${itemNum}`) // 자바에서 삭제쿼리 실행
    .then(response => {
      // 데이터베이스기준으로 확인하는 것이 제일 좋음!!
      // 1. 방금 삭제 한 데이터를 화면의 표에서 삭제해주세요.

      // 2. 상품 목록을 다시 조회해서 표를 그리세요. -> 더 좋은 방법!
      setCnt({}); //값이 바꼈음!
    })
    .catch(error => console.log(error));
  }

  return (
    <>
      <div>
        <h2>상품 목록</h2>
        <table>
          <thead>
            <tr>
              <td>상품번호</td>
              <td>상품명</td>
              <td>가격</td>
              <td>등록일</td>
              <td>삭제</td>
            </tr>
          </thead>
          <tbody>
            {
              // 조회되는 데이터가 있니? 있으면 행 갯수만큼 tr 그려. 아니면 데이터가 없습니다 그려
              itemList.length != 0 
              ? 
              itemList.map((item, index) => {
                return(
                  <tr key={index}>
                    <td>{item.itemNum}</td>
                    <td>{item.itemName}</td>
                    <td>{item.itemPrice}원</td>
                    <td>{item.regDate}</td>
                    <td>
                      <button 
                        type='button'
                        onClick={e => {deleteItem(item.itemNum)}}
                      >삭제</button>
                    </td>
                  </tr>
                )
              })
              :
              <tr>
                <td colSpan={4}>조회된 상품이 없습니다.</td>
              </tr>
            }
          </tbody>
        </table>
      </div>
    </>
   
  )
}

export default ItemList

// 조회한 상품목록 state 변수에 저장
// mount 되면 useEffect 실행 -> .then 실행
// itemList-> mount되면 조회한 데이터 가지고 있음.
// item -> map의 첫번째 매개변수, 반복돌릴 데이터에서 하나씩 뺀 데이터를 저장할 변수
// -> 0번째 데이터, 1번째 데이터 순차적으로 들어감
// 안에 있는 자료형이 객체이므로 객체.불러올 데이터 사용
//
//
//
//
//
//
//
//