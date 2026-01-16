import React, { useState } from 'react'

const Select = () => {
  //★ select는 눈에 보이는 글자를 저장하는게 아니라, 선택한 option태그의 value값을 저장하는 거★ 
  //★ select 태그에 있는 value와 option 태그에 있는 value의 값이 같으면 option의 데이터가 화면에 출력됨!
  

  // select 태그에서 선택한 데이터를 저장하고 초기값을 설정하는 state 변수
  // 초기값은 화면에 표현한 option태그의 value 값을 지정

  const [data, setData] = useState('1');
  console.log(data);

  return (
    <>
      <select value= {data} onChange={e => {setData(e.target.value)}}>
        <option value='1'>짜장면</option>
        <option value='5' >밥버거</option>
        <option value='7' >한솥</option>
      </select>
    </>
  )
}

export default Select

// select도 value 속성 잘 이용해야 함.
// 예시 - 편의점에서 아이스크림을 살 때 계산화면에 뜨는 건 상품명이 아니라 상품코드가 들어가서 보여지는 거임
// ★ value = 눈에 보이는 데이터가 아니라 option내에 있는 코드를 저장하는 것!
// useState(); -> 매개변수 초기값 설정인데 맨 처음 초기설정하려는 데이터의 value값을 저장 
// value의 값이 data에 들어감!
// onChange + value 

// 흐름
// 1. 처음은 초기값이 출력
// 2. 밥버거를 선택하면 select의 onChange 실행 - setData실행 - e.target.value 실행
// 3. 이벤트가 일어난 태그의 value값 저장 
// 4. 
// 
// 
// 
