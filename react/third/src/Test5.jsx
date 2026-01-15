import React, { useState } from 'react'

const Test5 = () => {
  // const [name, setName] = useState('김자바');
  // const [age, setAge] = useState(20);
  // const [addr, setAddr] = useState('울산시');
  //////////////////////////////////////////////////////////////////
 
  const [man, setMan] = useState({name : '김자바', age : 20, addr : '울산시'})

  // 객체의 스프레드 연산자
  const student = {
    stuNum : 1,
    name : 'kk',
    score : 80
  };

  // student 객체의 name키를 'lee'로 변경
  const result1 = {
    ...student,
    name : 'lee'
  }; 
  // 중복된 키는 마지막에 온 데이터가 덮어씀! => name : kim -> lee 가 됨!


  return (
    <>
      {/* <div>이름 : {name}</div>
      <button type='button' onClick={() => setName('홍길동')}>
        이름을 홍길동으로 변경
      </button>

      <div>나이 : {age}</div>
      <button type='button' onClick={() => setAge(30)}>
        나이를 30으로 변경
      </button>

      <div>주소 : {addr}</div>
      <button type='button' onClick={() => setAddr('서울시')}>
        주소를 서울시로 변경
      </button> */}

      {/* //////////////////////////////////////////// */}
      <h2>이름 : {man.name}</h2>
      <h2>나이 : {man.age}</h2>
      <h2>주소 : {man.addr}</h2>

      <button type='button' onClick={() => setMan({...man, name : '홍길동'})}>이름을 홍길동으로 변경</button>

      <button type='button' onClick={() => setMan({...man, age : 30})}>나이를 30으로 변경</button>

      <button type='button' onClick={() => setMan({...man, addr : '서울시'})}>주소를 서울시로 변경</button>

      



    </>
  )
}

export default Test5