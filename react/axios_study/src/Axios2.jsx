import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Axios2 = () => {
  // spring의 응답으로 가져온 사원 정보 중 사원의 이름과 사원의 급여를 화면에 출력해보세요.
  // const data = ''; //변경된 값을 화면에 반영을 못해서 state변수 사용해야 함!

  // spring에서 리턴받은 데이터를 저장하기 위해 state 변수의 초기값은 최종 데이터 자료형을 따라간다.
  const [data, setData] = useState(null); 
  //=> 초기값을 null로 줬을 경우엔 단락평가를 사용
  
  // const data1 = null;
  // console.log(data1); -> 오류

  // const data2 = {};
  // console.log(data2); -> undefined

  useEffect(() => {
    axios.get('http://localhost:8080/emps/1')
    .then(response => {
    console.log(response.data);
    setData(response.data);
    })
    .catch(error => {});
  }, []); //mount 할 때만 시행

  
  return (
    <div>
      Axios2
      {data && data.name}
    </div>
      
 
   
    
  )
}

export default Axios2

// java List자료형은 자바스크립트에서 배열로 출력
// java 참조자료형은 자바스크립트에서 객체로 출력