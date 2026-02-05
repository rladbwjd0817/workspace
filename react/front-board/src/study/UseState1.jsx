import React, { useState } from 'react'

// state 변경함수 코드가 해석되면 state 변경함수 실행은 나머지 코드 할 거 다하고 일괄적으로 처리함.
// state 변경함수가 여러개 실행되어도 한번만 리렌더링!!

// state 변경함수 사용법은 두 가지가 존재!
// 1. setCnt(cnt 변수에 저장할 값);
//  => setCnt(7) : cnt 값을 7로 변경

// 2. 함수형 업데이트 : setCnt((이전 cnt 값) => {return cnt 변수에 저장할 값})
//  => setCnt((prev) => {return 7}) 
//  => setCnt(prev => 7)
// prev : 이전 데이터
// 기존 state변수에 return되는 데이터의 값으로 변경
// 매개변수로 들어온 값이 동시에 전달할 때 값을 동시에 증가 가능해지기에 사용

// 화살표함수에서 실행문이 한 줄 이지만 return문일 때는 {} 생략 X
// But, {}와 retrun 키워드를 함께 생략가능 함!


const UseState1 = () => {
  const [cnt, setCnt] = useState(0);

  const [cnt2, setCnt2] = useState(0);


  return (
    <div>
      <h3>CNT = {cnt}</h3>
      <h3>CNT2 = {cnt2}</h3>
      <button 
        type='button'
        onClick={e => {
          console.log(cnt);
          setCnt(cnt + 1);
          console.log(cnt);
          setCnt(cnt + 1);
          console.log(cnt);
        }}
      >클릭</button>
      {/* 위의 데이터는 cnt가 1로 바뀌는 현상 */}
      
      <button 
        type='button'
        onClick={(prev) => {
          console.log(cnt2)
          setCnt2(prev => prev + 1)
          console.log(cnt2)
          setCnt2(prev => prev + 1)
          console.log(cnt2)
        }}
      >클릭2</button>
      {/* prev가 이전 데이터를 강제로 가져온 것 이기에 위의 prev에 1이 저장되고 밑의 prev에 1에 1을 더 저장되어 cnt에 2가 저장됨. 결국 cnt2에는 2가 저장됨*/}
    </div>
  )
}

export default UseState1