import React from 'react'
import { useParams } from 'react-router-dom'

const First = () => {
  // URL Parameter로 전달되는 데이터 받기
  // useParams();
  // 실행하면 객체로 나옴!
  
  // 객체는 배열과 동일하게 데이터를 여러개 받을 수 있음. -> useParams, props와 동일
  // const param = useParams();

  // 구조분해할당 : 
  const {age} = useParams();

  return (
    <>
      <div>First 컴포넌트입니다.</div>
      <p>/first url을 입력하면 컴포넌트가 보입니다.</p>
      <p>{age}</p>
    </>
   
  )
}

export default First