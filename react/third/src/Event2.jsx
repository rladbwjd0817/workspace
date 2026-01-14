import React from 'react'

const Event2 = () => {
  let title = 'hello react~';

  //구조분해할당 : 배열 , 객체에 저장된 다수의 데이터 각각을 편하게 사용하는 방법

  // 구조분해할당 사용 X
  const arr = [1, 3.3, 'hello'];
  const a = arr[0];
  const b = arr[1];
  const c = arr[2];

  // 구조분해할당 : 구조를 분해해서 각 값을 할당함.
  const arr1 = [1, 3.3, 'hello'];
  const [a1, b1, c1] = arr1; //구조분해할당
  //변수 앞에 있는 []는 배열이 아니라 구조분해할당임.
  console.log(a1); // => 1이 출력

  const arr2 = [1, 3.3, 'hello'];
  const [a2, b2] = arr2; //a2 = 1, b2 = 3.3, 'hello'는 저장할 변수가 없어서 저장이 되지 않고 출력도 X, 구조분해할당에 변수 숫자가 달라도 됨!

  const [a3, b3, c3, d3] = arr2;
  console.log(d3); // => undefined 출력

  // 자바스크립트에서는 함수도 하나의 자료형으로 취급! 그래서 변수에 저장가능함!
  //=> 함수표현식이 대표적인 예 , 화살표함수도 가능
  const array = [
    5, 
    '배부르당',
    () => {
      console.log('함수실행');
    }
  ];

  const [aa, bb, cc] = array;
  cc(); //함수실행 출력



  return (
    <>
    <div>Event2</div>
    <h3>{title}</h3>
    <button type='button' onClick={() => {
      // title 변수의 값을 변경
      title = 'hello java';
      console.log(title);
    }}>제목변경</button>
    
    </>
  )
}

export default Event2