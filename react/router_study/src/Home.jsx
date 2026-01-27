import React from 'react'
import { useNavigate } from 'react-router-dom'

const Home = () => {
  // useNavigate hook은 실행결과 함수를 리턴함!
  // useNavigate 결과를 전달하는 변수는 함수처럼 사용하면 됨.
  const nav = useNavigate(); //nav();
  // 함수 호출 후 매개변수자리에 path와 같은 값을 넣음!
  // 그러면 그 값과 같은 link를 가진 페이지로 이동

  return (
    <>
      <h2>메인페이지</h2>
      <p>본 컴포넌트는 메인페이지로 프로젝트 시작과 동시에 보입니다.</p>
      <button 
        type='button'
        onClick={e => {nav('/first')}}
      >클릭하면 first페이지로 이동</button>
    </>
   
  )
}

export default Home
// nav(-1) : 이전페이지
// nav(+1) : 다음페이지
// url이 '/first' -> 정적
// url이 '/{num}' -> 변수 값에 따라 url이 바뀌는 건 동적