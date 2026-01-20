import React, { useEffect, useState } from 'react'

const Test = () => {
  const [cnt1, setCnt1] = useState(0);
  const [cnt2, setCnt2] = useState(0);


  // mount 시점에 실행
  // useEffect hook 안의 코드는 그림을 다 그린 후(return문까지) 마지막에 실행
  // => useEffect 잠깐 보류하고 마지막에 출력
  // useEffect의 수가 여러 개 일 경우 차례로 실행
  // useEffect의 매개변수에 의존성 배열이 없으면 리렌더링 시점에도 실행!
  
  useEffect(() => {
    console.log('useEffect1');
  });
  
  // mount 시점에 실행
  // useEffect hook 안의 코드는 그림을 다 그린 후(return문까지) 마지막에 실행
  // => useEffect 잠깐 보류하고 마지막에 출력
  // useEffect의 매개변수에 의존성 배열이 빈 배열이면 리렌더링 시점에 실행 X
  useEffect(() => {
    console.log('useEffect2');
  }, []);

  
  // mount 시점에 실행
  // useEffect의 매개변수에 의존성 배열에 변수가 있다면 해당 변수의 값이 변경되어 리렌더링 될 때는 실행!
  useEffect(() => {
    console.log('useEffect3');
  }, [cnt1]);


  useEffect(() => {
    console.log('useEffect4');
  }, [cnt1, cnt2]);


  console.log(2); //useEffect 실행하지 않아도 mount 됨

  return (
    <div>
      TEST 컴포넌트 <br />
      <button type='button' onClick={e => setCnt1(cnt1 + 1)}>cnt1 값 변경</button>
      <button type='button' onClick={e => setCnt2(cnt2 + 1)}>cnt2 값 변경</button>
    </div>
  )
}

export default Test

// mount : 새로고침했을 때의 상태, 최초의 화면이 그려질 때
// 리렌더링 : state 변경함수를 실행해서 state 변수가 선언된 컴포넌트가 리렌더링됨
// update : 
// unmount :

// use~~ : 이 시리즈는 hook 
// useEffect : 특정 생애주기 시점(mount, update, unmount)에 기능을 수행하는 코드를 작성하는 것
// 문법 : useEffect(실행함수, 의존성 배열); -> 매개변수 2개사용/ 1개 사용해도 오류 안남
// useEffect를 for문과 사용하면 이용자가 보기에 자연스럽고 좀 더 빠른 것처럼 보여짐
// useEffect는 의존성 배열에 따라 실행시점이 달라짐 