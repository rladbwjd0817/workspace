import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ForEach5 = () => {
  
  // 조회한 사원 목록을 저장할 변수 생성
  // 조회한 데이터를 담을 변수의 초기값은 최종적으로 저장될 데이터의 형태와 일치하면 됨.
  const [empList, setEmpList] = useState([]); //변수를 줄 때 어떤 초기값을 줄지 모르겠으면 postman 사용
  console.log(empList);


  // 바로 axios 실행하면 .then(state 변경함수) 있으면 리렌더링으로 인해서 계속 반복되어 무한루프에 걸려버림!
  // mount시점에 사원 목록표를 화면에 바로 출력(조회)
  useEffect(() => { //->그림그리고 마지막에 실행
    axios.get('http://localhost:8080/emps') //->매개변수에 url 넣어서 연결해야해
    .then(response => {
      // console.log(response.data);
      setEmpList(response.data)
    })
    .catch(error => console.log(error));
  }, [])
    
  return (
    <>
      <table>
        {/* title */}
        <thead> 
          <tr>
            <td>사번</td>
            <td>이름</td>
            <td>부서명</td>
            <td>급여</td>
            <td>직급</td>
          </tr>
        </thead>
        {/* 행 안의 내용 */}
        <tbody>
          {
            empList.map((e, i) => { //map은 배열만 사용가능!!!, 목록을 조회한다하면 거의 대부분 map 사용!
              return(
                // tr은 스프링의 List의 데이터 수만큼 반복
                // map은 중복되는 데이터가 없도록 고유한 key 값 설정
                // e는 배열 데이터
                // e를 감싸고 있는 하나의 데이터는 객체형태
                // 처음 empList는 빈 배열[]이라 tbody는 깡통이라 출력X
                // 리렌더링하고 나면 empList에 값이 저장되어 있어서 값을 화면에 출력!
                <tr key={e.empNum}>  
                  <td>{e.empNum}</td>
                  <td>{e.name}</td>
                  <td>{e.deptName}</td>
                  <td>{e.salary}</td>
                  <td>{e.rank}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </>
  )
}

export default ForEach5