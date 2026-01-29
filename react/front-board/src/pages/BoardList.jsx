import React, { useEffect, useState } from 'react'
import styles from './BoardList.module.css'
import { useNavigate } from 'react-router-dom'
import axios from 'axios';

// 목표 : 컴포넌트가 마운트 될 때 게시글 목록을 spring에서 조회한 후 화면에 띄워준다!
// 1. 마운트 시 게시글 목록 조회
// 2. 게시글 목록 조회 axios 작성
const BoardList = () => {

  // 버튼을 눌렀을 때 실행 할 nav 함수생성
  const nav = useNavigate();

  // 게시글 목록 조회한 목록 데이터를 저장할 변수
  // 초기값은 최종적으로 저장할 데이터의 자료형 넣어주기
  const [boardList, setBoardList] = useState([]);

  // 마운트 시(리렌더링땐 X) 게시글 목록 조회
  useEffect(() => {
    axios.get('http://localhost:8080/boards')
    .then(response => {
      console.log(response.data);
      setBoardList(response.data);
    })
    .catch(error => console.log(error));
  }, [])

  return (
    <div className={styles.container}>

      {/* 검색 */}
      <div className={styles.search}>
        <select>
          <option value="">제목</option>
          <option value="">작성자</option>
        </select>
        <input type="text" />
        <button type='button'>검색</button>
      </div>

      {/* 게시글 표 */}
      <div className={styles.list_div}>
        <table className={styles.list_table}>
          {/* colgroup - 테이블의 각 컬럼 너비 값 지정 */}
          <colgroup>
            <col width='10%'/>
            <col width='20%'/>
            <col width='20%'/>
            <col width='20%'/>
            <col width='10%'/>
          </colgroup>

          {/* 제목 */}
          <thead >
            <tr>
              <td>NO</td>
              <td>작성자</td>
              <td>제목</td>
              <td>작성일</td>
              <td>조회수</td>
            </tr>
          </thead>

          {/* 표 본문내용 */}
          <tbody>
            {
              boardList.map((board, index) => {
                return(
                  <tr key={board.boardNum}>
                    <td>{boardList.length - index}</td>
                    <td>{board.writer}</td>
                    <td>
                      <span onClick={e => nav(`/detail/${board.boardNum}`)}>
                        {board.title}
                      </span>
                    </td>
                    <td>{board.createDate}</td>
                    <td>{board.readCnt}</td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>

      {/* 버튼 */}
      <div className={styles.btn_div}>
        <button 
          type='button'
          onClick={e => {nav('/reg')}}
        >글쓰기</button>
      </div>
    </div>
  )
}

export default BoardList