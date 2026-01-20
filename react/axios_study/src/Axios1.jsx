import axios from 'axios'
import React from 'react'

const Axios1 = () => {

  // 요청 URL로 spring 서버로 요청
  axios.get('http://localhost:8080/emps')
  // 통신 성공 시 실행 영역
  .then((response) => { //매개변수 : 응답 성공에 대한 모든 정보를 가진 객체
    console.log('통신 성공');
    console.log(response);
    console.log(response.data);
  })
  // 통신 실패 시 실행 영역
  .catch((error) => { //매개변수 : 응답 실패에 대한 모든 정보를 가진 객체
    console.log('통신 실패');
  });

  return (
    <div>Axios 1</div>
  )
}

export default Axios1

// axios.get(url, [설정내용]).then(통신 성공 후 실행 내용).catch(실행 실패 시 실행 내용);
// [설정내용] - 생략가능
// 
// 1. get 까지만 실행
// 2. spring에서 메서드 실행
// 3. spring에서 메서드 실행에 문제 없으면 then 실행 / 문제 있으면 catch 실행 => 둘 중에 하나만 실행

// 오류 중 CORS(Cross-Origin Resource Sharing)
// : 서로 다른 프로그램은 서로 접근을 허용하지 않음(서로 다른 사이트는 데이터 공유가 안됨)
// => spring에서 설정해주면 가능함. 
