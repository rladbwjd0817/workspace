import axios from 'axios';
import React, { useState } from 'react'

const ItemDetail = () => {
  // 상세 정보 div 보임/숨기기 여부 저장하는 state 변수
  const [isShow, setIsShow] = useState(false); //안보이게 하는 값 = false
  
  // 조회한 상품 정보를 저장하는 state 변수
  const [itemNum, setItemNum] = useState('');

  // 자바에서 조회한 데이터를 저장할 변수
  // 초기값은 최종적으로 조회할 데이터의 자료형으로 주기! -> 콘솔창에 나오는 것으로 확인, 빈 값으로 주는 거임
  const [itemData, setITemData] = useState({});


  // 상품 상세 정보를 조회하는 함수
  const getItem = () => {
    axios.get(`http://localhost:8080/items/${itemNum}`)
    .then(response => {
      console.log(response.data);
      setITemData(response.data);
    })
    .catch(error => console.log(error))
  }


  return (
    <>
      <h2>상품 상세 조회</h2>
      <div>
        상품번호 
        {/* input이 하나면 name 안써도 됨! */}
        <input 
          type="text" 
          value={itemNum}
          // 함수 쓰는 이유 : 여러개 사용하려구
          onChange={e => setItemNum(e.target.value)}
        />
        <button 
          type='button'
          onClick={e => {
            setIsShow(true); //상세 정보 div 숨김, 보이기 기능을 해주는것
            getItem(); //상세정보 spring에서 조회
          }}
        >조회</button>

        {
          isShow && //단락평가로 안보이게 설정
          <div style={{
            backgroundColor : 'lightgray',
            width : '300px',
            padding : '12px'
          }}>
            <p>조회한 상품 정보입니다.</p>
            <p>상품번호 : {itemData.itemNum}</p>
            <p>상품명 : {itemData.itemName}</p>
            <p>가격 : {itemData.itemPrice}</p>
            <p>등록일 : {itemData.regDate}</p>
            <p>상품소개 : {itemData.itemIntro}</p>
          </div>
        }

      </div>
    </>
  )
}

export default ItemDetail

// 자바에서 null 값이 전달되면 빈문자('')로 받음!
// const aaa = '';
// console.log(aaa.itemNum);
// => 문자열을 객체처럼 사용해도 오류 안남!
// => undefined 로 정의됨!, 그래서 화면에 출력이 X
// 흐름
// 1. 스프링 item_num에 입력한 숫자 저장
// 2. 스프링에서 넘어온 값은 .then(response.data)로 넘어옴
// 