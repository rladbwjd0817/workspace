import React from 'react'

const 구조분해할당 = () => {
  // 구조분해할당 : 배열과 객체에서 사용가능한 문법
  // 배열, 객체에 저장된 데이터를 편하게 사용하기 위한 문법

  const arr1 = [1,3,5];
  // 배열 -> []
  // 배열은 순번이 있어서 차례로 가능
  const [a1, b1, c1] = arr1; //console.log(al); => 1 출력
  const [a2, b2] = arr1; //a2 = 1, b2 = 3;
  const [a3, b3, c3, d3] = arr1;
  // a3 = 1, b3 = 3, c3 = 5, d3 = undefined

  const test1 = ([a, b]) => {
    // const test1 = ([a, b]) => 구조분해할당
    // console.log(arr) // => [1,2,3] 출력
    // [a, b] => a, b 변수임
    console.log(a); //1
    console.log(b); //2
  }
  test1([1,2,3]);
  //////////////////////////////////////////
  // 객체 구조분해할당 -> { }
  // 객체는 순번이 없기에 차례로 들어갈 수 X
  // 그래서 key값과 동일하게 사용!

  // 객체를 구조분해할당할 때는 변수명을 반드시 key값과 동일하게 지정!
  const student = {
    name : 'kim',
    age : 20,
    score : 80
  }

  // const name = student.name;
  // console.log(name) //'kim' 출력
  
  // const {name, age, score} = student;
  // const{age, score, name} = student;
  // 순서와 상관없음! => key 값과 동일한 변수 찾아서 값을 넣기 때문에
  // const{name, age} = student;
  const {name, age, score, addr} = student;
  // addr = undefined 
  // 없는 키는 undefined 나옴!!

  // 구조분해할당 미사용 함수
  const test2 = (stu) => { //stu = testObject
    console.log(stu.name);
    console.log(stu.age);
  }

  // 구조분해할당 사용 함수 -> props 할 때 사용
  // 객체명.변수명 이렇게 사용하지 않고 그냥 변수명으로 사용가능!
  const test3 = ({name, age}) => { 
    //{name, age} = testObject 
    console.log(name) //'111' 출력
    console.log(age) // 30 출력
  }

  const testObject = {
    name : '111',
    age : 30
  }

  test2(testObject);
  test3(testObject);


  
  return (
    <>
      <div>구조분해할당</div>
    </>
  )
}

export default 구조분해할당