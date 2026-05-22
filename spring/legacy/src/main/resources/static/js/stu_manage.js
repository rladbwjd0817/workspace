const getStuList = () => {
  const select_tag = document.querySelector('#classSelector')
  const classNum = select_tag.value;

  // '/stu/main/${classNum}' -> URL 파라미터

  // stu/main?classNum=${classNum} -> 쿼리 스트링방식, ? 앞까지가 url임

  location.href = `/stu/main?classNum=${classNum}`
}

const asyncGetList = () =>{
  // 그려진 점수 그림을 지우기
  document.querySelector('#score-div').innerHTML = ''

  const select_tag = document.querySelector('#classSelector')
  const classNum = select_tag.value;

  axios.get(`/stu/list?classNum=${classNum}`) 
  .then(response => {
    console.log(response.data)

    // 조회한 데이터 다시 그림 그리기
    // 1. 그림을 다시 그릴 태그를 선택
    const tbody_tag = document.querySelector('#list_table > tbody')

    // 2. 기존 tbody 안의 모든 태그를 지우기
    tbody_tag.innerHTML = '';

    // 3. 새롭게 그릴 그림을 문자열로 만든다.
    let str = ``;
    
    // 조회한 데이터를 반복
    for(let i = 0 ; i < response.data.length; i++){
      str += `
        <tr>
          <td>${response.data.length - i}</td>
          <td>${response.data[i].stuNum}</td>
          <td>
            <div  
              onclick="getScoreInfo(${response.data[i].stuNum})"
              style="cursor: pointer;"
            >
              ${response.data[i].stuName}
            </div>
          </td>
          <td>${response.data[i].stuYear}</td>
          <td>${response.data[i].classNum}</td>
          <td>${response.data[i].classDTO.className}</td>
        </tr>
      `;
    }

    // response.data.forEach((stu, i) => {
    //   str += `
    //     <tr>
    //       <td>${response.data.length - i}</td>
    //       <td>${stu.stuNum}</td>
    //       <td>${stu.stuName}</td>
    //       <td>${stu.stuYear}</td>
    //       <td>${stu.classNum}</td>
    //       <td>${stu.classDTO.className}</td>
    //     </tr>
    //   `;
    // })

    // 4. 새롭게 만든 그림을 tbody에 넣기
    tbody_tag.insertAdjacentHTML("afterbegin", str);
  })
  .catch(e => console.log(e))
}

// 수정 버튼 클릭 시 수정 실행 함수
const saveScore = (stuNum) => {
  const data = {
    korScore : Number(document.querySelector('#korScore').value),
    engScore : Number(document.querySelector('#engScore').value), 
    mathScore : Number(document.querySelector('#mathScore').value),
    stuNum : stuNum
  }

  axios.post('/stu/update', data)
  .then(response => {
    console.log(response.data)
    alert('수정 완료오!!^0^!!')
  })
  .catch(e => console.log(e))
}

const drawScore = (scoreInfo) => {
  // 점수를 그릴 태그를 선택
  const score_div = document.querySelector('#score-div')

  // 선택한 태그 안의 모든 내용을 삭제
  score_div.innerHTML = ''

  // 선택한 태그에 그릴 그림을 문자열로 생성
  const str = `
    <table class="score-table">
      <thead>
        <tr>
          <td>학생명</td>
          <td>국어점수</td>
          <td>영어점수</td>
          <td>수학점수</td>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>${scoreInfo.stuDTO.stuName}</td>
          <td>
            <input 
              type="text" 
              value="${scoreInfo.korScore}"
              id="korScore"
            >
          </td>
          <td>
            <input 
              type="text" 
              value="${scoreInfo.engScore}"
              id="engScore"
            >
          </td>
          <td>
            <input 
              type="text" 
              value="${scoreInfo.mathScore}"
              id="mathScore"
            >
          </td>
        </tr>
      </tbody>
    </table>
    <div class="btn-div">
      <button type="button" onclick="saveScore(${scoreInfo.stuNum})">수정</button>
    </div>
  `;
  // 생성한 문자열 그림을 태그에 넣기
  score_div.insertAdjacentHTML("afterbegin", str)
}

// 학생 이름 클릭 시 점수 조회
const getScoreInfo = (stuNum) => {
  // 점수 정보를 조회
  axios.get(`/stu/score?stuNum=${stuNum}`)
  .then(response => {
    console.log(response.data);
    const scoreInfo = drawScore(response.data);
  })
  .catch(e => console.log(e));
}

// input 태그 데이터 저장
const handleScore = () => {

}

