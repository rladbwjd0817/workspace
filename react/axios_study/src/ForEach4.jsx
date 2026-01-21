import React from 'react'

const ForEach4 = () => {
  const stuList = [
    {
      stuNum : 1,
      name : 'kim',
      score : 80
    }, 
    {
      stuNum : 2,
      name : 'lee',
      score : 90
    }, 
    {
      stuNum : 3,
      name : 'park',
      score : 100
    }
  ];

  return (
    <>
      <table>
        <thead>
          <tr>
            <td>학번</td> 
            <td>이름</td>
            <td>점수</td>
          </tr>
        </thead>
        <tbody>
          { 
            stuList.map((e, i) => { //e - 배열데이터, i - index
              return(
                // key값은 고유한 값으로 설정해야 하기에 i를 사용할 수도 있지만 
                // 학번도 고유한 값이기에 학번을 사용하는게 훨씬 좋음!!!!!!!!!!!
                <tr key={e.stuNum}> 
                  {/* tr(행)이 반복 */}
                  {/* 학번, 이름, 점수를 반복해서 출력 - 배열의 크기만큼 반복
                  대신, 키 값을 각각 다르게 줘서 컴퓨터가 알아볼 수 있게 해주기 */}
                  <td>{e.stuNum}</td> 
                  <td>{e.name}</td>
                  <td>{e.score}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </>
  )
}

export default ForEach4