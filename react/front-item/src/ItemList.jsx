import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ItemList = () => {
  // 조회한 상품목록 저장 변수
  const [itemList, setItemList] = useState ([]);

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
  }, [])

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
            </tr>
          </thead>
          <tbody>
            {
              // 조회되는 데이터가 있니? 있으면 행 갯수만큼 tr 그려. 아니면 데이터가 없습니다 그려
              itemList.length != 0 
              ? 
              itemList.map((e, index) => {
                return(
                  <tr key={index}>
                    <td>{e.itemNum}</td>
                    <td>{e.itemName}</td>
                    <td>{e.itemPrice}원</td>
                    <td>{e.regDate}</td>
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