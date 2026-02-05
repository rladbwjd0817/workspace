import axios from 'axios'
import React from 'react'

// Axios의 또 다른 사용방법

// axios를 비동기에서 동기방식으로 실행 동작을 변경할 수 있음
// => await, async 키워드를 사용하면 가능
// await : axios 명령어 앞에 붙임 (기다려!)
// async : axios 코드가 포함된 함수의 정의문 앞에 붙임 
// ex) const getData = '() => {}' : ''가 함수
//     => const getData = async () => {}
// 이 방식을 쓰면 await 가 붙은 axios는 동기적으로 실행
// async가 붙어버린 함수 자체는 비동기가 되어버림

const Axios3 =  () => {
  const getData = async () => {

    // 방법2 : 비동기 방식 -> 동기 방식 으로 바꿔서 사용하기 위한 방법
    // response = result가 같음
    // 요청을 보내고 나서 기다리지 않고 조회를 하러 가는 순간 저장을 해서 undefined가 됨
    // 밑의 방법을 쓰면 catch()를 대체해서 사용할 수 있어서 try{} catch(){} 문 사용  

    // await : 기다려!(비동기 -> 동기로 사용할 수 있음)
    // 
    try{
      const result = await axios.get('url'); //post(), delete(), put()가능
      console.log(result.data)
      console.log(2);
    } catch(e){
      console.log(e);
    }
  }

  // abc 함수 실행결과 : 1 -> 3 -> 2 순으로 출력
  const abc = () => {
    console.log(1);
    getData();
    console.log(3);
  }

  return (
    <div>

    </div>
  )
}

export default Axios3