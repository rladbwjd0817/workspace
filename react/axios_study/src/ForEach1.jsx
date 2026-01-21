import React from 'react'

const ForEach1 = () => {
  // 자바스크립트의 다양한 반복 문법
  const arr = [1,3,5,7,9];

  // 일반 for문
  for(let i = 0; i < arr.length; i++){
    console.log(arr[i])
  }

  // for-each문
  for(const e of arr){
    console.log(e);
  }

  // foreach 함수 -> 함수 호출해서 사용(배열.함수호출) 
  // => 반복 실행 후 리턴 데이터가 없음! aka.일반 for문,for-each문과 같음
  // 첫 번째 매개변수 : 하나씩 뺀 데이터의 이름
  // 두 번째 매개변수 : index
  // 자바스크립트에서 많이 사용함!
  const a = arr.forEach((e, i) => {
    // 반복할 내용 적는 칸
    console.log(`e = ${e}, i = ${i}`);
    return 5;
  });
  console.log(a); //=> undefined 출력 : 변수 a에 저장된 값이 없다

  // map 함수 -> 반복 실행 결과를 리턴
  const b = arr.map((e, i) => {
    console.log(`e = ${e}, i = ${i}`);
    return e;
  })
  console.log(b) 
  // return 5; [5,5,5,5,5] => 배열로 출력
  // return e; [1,3,5,7,9] => e의 값을 리턴해서 출력
  // return문 안에서 for문 사용하지 못하니 map함수를 대신 사용할 수 있음!
  // map함수 안에 html 태그 사용가능
  // ★ foreach 함수와 map함수 차이 : 반복 실행 결과를 리턴 하냐 안하냐 차이★

  return (
    <>
      <div>dd</div>
    </>
  )
}

export default ForEach1