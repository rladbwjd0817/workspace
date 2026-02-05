import axios from 'axios'
import React from 'react'

// axios는 비동기 방식으로 동작
// 비동기 방식 : 코드 실행 시 결과를 기다리지 않고 다음 코드를 실행하며 산발적으로 실행

const Axios1 = () => {

  const getData = () => {
    console.log(1);
    let num;


    // 3번 게시글의 댓글 목록 조회
    axios.get('http://localhost:8080/replies/3')
    .then(response => {
      console.log(2);
      num = 5;
    })
    .catch(error => console.log(error));

    console.log(3);
    console.log(num); //undefined 출력
  }

  return (
    <div>
      <button 
        type='button'
        onClick={e => getData()}
      >데이터 조회</button>
    </div>
  )
}

export default Axios1