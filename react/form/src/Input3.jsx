import React, { useState } from 'react'

const Input3 = () => {



// phone.key; -> 이거 안됨!
// phone.변수 사용 불가!
// 객체에 있는 키 값 접근하는 방법


// 우리가 편하게 접근할 때는 .찍고 변경가능
// 변수처럼 키 값을 받을때 고정적인 값
// 
// ///////////////////////////////////////////////////////////
const [data, setData] = useState({id : '', pw : '', name : ''});
console.log({data});

// data 변수 변경 함수
  const handleData = (e) => {
      setData({
        ...data,
        [e.target.name] : e.target.value
      })
  }; 

  return (
    <>
      아이디
      <input 
        type="text"
        name='id' 
        value={data.id} 
        onChange={e => handleData(e)}
      />
      <br />

      비밀번호
      <input 
        type="password" 
        name='pw'
        value={data.pw} 
        onChange={e => handleData(e)}
      />
      <br />
      
      이름
      <input 
        type="text"
        name='name' 
        value={data.name} 
        onChange={e => handleData(e)}
      />
    </>
  )
}

export default Input3

// 같은 코드는 함수로 만들어 줘야해!!!
