import React, { useState } from 'react'
import Title from './Title'
import Display from './Display'
import Controller from './Controller'

const Test6 = () => {
  // 현재 카운트가 저장 될 state변수
  const [cnt, setCnt] = useState(0);

  console.log('Test6 컴포넌트가 실행됩니다.')

  return (
    <>
      <Title />
      <Display cnt={cnt} />
      <Controller 
        setCnt={setCnt}
        cnt={cnt} 
      />

    </>
   
  )
}

export default Test6

// state변경함수가 실행되면 state 변수가 선언된 컴포넌트가 리렌더링됨!

// state 변경함수가 실행되는 컴포넌트에서 자식컴포넌트가 있으면 해당 자식 컴포넌트도 다 다시 리렌더링함!

