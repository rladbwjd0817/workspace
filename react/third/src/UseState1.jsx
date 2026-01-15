import React, { useState } from 'react'

const UseState1 = () => {
  
  //[5, f] 배열로 출력
  // useState : 2칸짜리 배열, 0번째 자리엔 내가 입력한 매개변수가 들어가고 1번째 자리엔 함수가 들어옴.
  // f : function 함수가 배열에 들어가있음.

  // useState : 2개의 데이터를 갖는 배열
  // 0번째 요소에는 매개변수로 전달한 데이터
  // 1번째 요소에는 함수가 들어있음
  // 1번째 함수 : 변수의 값을 변경하는 기능을 제공하는 함수 

  //★ 결론 ★
  // 데이터의 값 변경이 화면에 반영되려면 해당 데이터는 반드시 useState로 선언해야 함!!!!!!
  // useState를 사용해 만들어진 변수(title)를 'state변수' 라고 부름.
  // useState를 사용해 만들어진 함수(setTitle)를 'state 변경 함수'라고 함.
  // state 변경함수가 실행되면 컴포넌트를 리렌더링한다.
  // 리렌더링 : 컴포넌트의 처음부터 끝까지 다시 실행
  // state변수는 리렌더링 되더라도 초기화 되지 않는다!
  const [title, setTitle] = useState('hello~');
  console.log(5);

  return (
    <>
    <div>UseState1</div>
    <h2>{title}</h2>

    <button type='button' onClick={() => {
      setTitle(10); //a변수의 값을 10으로 변경하는 코드, 호출
    }}>클릭</button>
    </>
  )
}

export default UseState1
// 클릭을 누르면 다시 처음부터 해석함.
// <흐름>
// 1. 처음부터 끝까지 실행
// 2. return안 그림 화면에 그림
// 3. 버튼을 누르면 title에 10이 저장
// 4. 리렌더링해서 다시 컴포넌트의 처음부터 다시 실행
// 5. useState 컴포넌트는 무시함!
// 6. console.log(); 실행
// 7. button 실행 -> setTitle(); 호출해서 출력