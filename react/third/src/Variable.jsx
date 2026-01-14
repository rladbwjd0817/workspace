
import React from 'react'

// jsx에서는 변수를 html로 표현할 수 있음!
const Variable = () => {
  const num = 10;
  const name = 'kim';
  const menu = ['덮밥', ' 분식', ' 밥버거', ' 한솥', 1]
  const flag = true;
  const data = null;

  // undefined : 정의되지 않음 - 변수가 선언만 하고 초기값이 없는 경우, 변수 선언이 되지 않았을때
  // null != undefined
  const data2 = undefined;

  // 객체 전체 출력하려고 하면 오류남
  const person = {
    name : 'kim',
    age : 32
  };

  return (
    <>
      <div className='' >{menu[0]}</div>
      <div>{'★ 오늘의 메뉴 : ' + menu}</div>
      <div>{name}</div>
      <div>flag = {flag}</div>
      <div>data = {null}</div>
      <div>data2 = {undefined}</div>
      <div>{person.name}</div>
      {/* <div>{person}</div> */}
    </>
  )
}

export default Variable

// export : 내보내기 , export 없으면 다른 파일에서 import 불가
// inport : 가져오기
// jsx에서는 빈 태그 가능! -> 감싸는 용도로 사용
// ★ boolean, null, undefined 값은 출력 안됨!(오류는 아님) ★
// 위에서 아래로 해석 및 출력

// dom = tag
// javascript 문법을 html에 적용시 문자나 숫자와 같은 하나의 값으로 평가되는 코드만 가능(if, for 안됨)


