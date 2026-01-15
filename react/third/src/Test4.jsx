import React, { useState } from 'react'
import './Test4.css'

const Test4 = () => {
  // 기본 내용 정리
  // const arr1 = [1,2,3];
  // const arr2 = [1,2,3];
  // const arr3 = arr1;
  // arr1 === arr2 같냐? => 달라 : 참조하는 주소값이 다름!

  // 스프레드(spread) 연산자 : ...배열
  // -> 배열, 객체에 저장된 데이터 각각을 흩뿌린다...?
  // const array1 = [4, 5];
  // const array2 = [1, 2, array1]; //데이터의 갯수 : 3개 [1, 2, [4, 5]]
  // const array3 = [1, 2, ...array1] //...array1 = 스프레드 연산자
  // 배열은 포장 통째로 주는 것
  // 스프레드는 포장 뜯어서 내용물만 주는 것 -> 배열 안 데이터 각각의 수를 셈

  // ----------------------------------------------------------------------//

  const [arr, setArr] = useState([0, 0, 0]);

  // div 클릭 시 실행하는 함수
  const changeNum = (index) => {
     const copyArr = [...arr];
     copyArr[index] = copyArr[index] + 1; //arr 박스 벗기고 arr 데이터만 가져갈래 : 0, 0, 0 => 그런데 다른 포장지 [] 덮을래! 
     setArr(copyArr);
  }

  return (
    <div className='test4_container'>
      <div onClick={() => changeNum(0)}>{arr[0]}</div>

      <div onClick={() => changeNum(1)}>{arr[1]}</div>

      <div onClick={() => changeNum(2)}>{arr[2]}</div>
      
    </div>
  )
}

export default Test4

// 자바스크립트에서 배열, 객체, 함수 -> 참조자료형
// arr => [0, 0, 0]이라는 데이터의 주소 값을 가짐
// copyArr = [...arr] => arr의 배열을 벗기고 새로운 배열을 만든 후 copyArr에는 새로운 배열의 주소값을 가짐
// setArr(copyArr); => 원래 가지고 있던 매개변수 값인 arr = copyArr의 값으로 저장하겠다.
// copyArr의 주소값이 104라고 한다면 arr의 값도 104를 가지고 배열[1, 0, 0]의 데이터를 참조
// 새로운 값을 참조하니 화면에도 출력됨

// 같이 반복하는 코드 : 함수로 간결하게 표현
