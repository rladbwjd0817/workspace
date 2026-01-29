import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const BoardDetail = () => {
  // url parameter 데이터 받기
  const params = useParams();
  console.log(params);

  // 게시글 1개를 조회 할 데이터 저장할 변수
  const [boardInfo, setboardInfo] = useState({});

  // 목록가기 누르면 목록페이지로 돌아가기
  const nav = useNavigate();
  
  // 조회 할 데이터 spring에게 요청 할 함수
  // 마운트 시점에 상세정보를 조회, 화면에 출력!!
  useEffect(() => {
    axios.get(`http://localhost:8080/boards/${params.boardNum}`)
    .then(response => {
      console.log(response.data);
      setboardInfo(response.data);
    })
    .catch(error => console.log(error));
  }, [])

  return (
    <div>
      <div>
        <h1>게시글 상세 정보 페이지</h1>
      </div>
      <div>
        <table>
          <tbody>
            <tr>
              <td>작성일</td>
              <td>{boardInfo.createDate}</td>
              <td>작성자</td>
              <td>{boardInfo.writer}</td>
              <td>조회수</td>
              <td>{boardInfo.readCnt}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={5}>{boardInfo.title}</td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={5}>{boardInfo.content}</td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button 
          type='button'
          onClick={e => {nav(-1)}}
        >목록가기</button>
        <button 
          type='button'
          onClick={e => {nav('/')}}
        >목록가기2</button>
        <button type='button'>수정</button>
        <button type='button'>삭제</button>
      </div>
    </div>
  )
}

export default BoardDetail