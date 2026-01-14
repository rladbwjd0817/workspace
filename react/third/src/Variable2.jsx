
import React from 'react'

const Variable2 = () => {
  //javascript == : 값만 비교, 자료형은 비교하지 않음.
  // === : 값과 자료형 모두 비교
  // !== : 같지 않다
  //<ex>
  // 10 == '10' -> true
  // 10 === '10' -> false

  const num = 4;

  //num이 짝수면 1을 출력, 홀수면 2를 출력
  let result = num % 2 === 0 ? 1 : 2;
  

  return (
  <>
    <div>배고프당</div>
    <div>{result}</div>
    <div>{num % 2 === 0 ? 1 : 2}</div>
    <div></div>
  </>
  )
}

export default Variable2

// react 안에서는 if, for 문 안돼
// return문 위 자바스크립트 영역에선 if, for 가능하니 거기서 변수하나 주고 if, for 실행하면 돼
// 삼항연산자는 return문 안에 바로 쓸 수 있음
// jsx 안에 html에 그 안에서 자바스크립트 코드를 사용하고 싶을 때 {} 사용

