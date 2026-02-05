import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import ReplyInfo from '../components/ReplyInfo';
import { delBoard } from '../api/boardApi';

const BoardDetail = () => {
  // url parameter 데이터 받기
  const params = useParams();
  console.log(params); //{boardNum: '37'} 으로 출력

  // 게시글 1개를 조회 할 데이터 저장할 변수
  const [boardInfo, setboardInfo] = useState({});

  // 목록가기 누르면 목록페이지로 돌아가기
  const nav = useNavigate();
  
  // 조회 할 데이터 spring에게 요청 할 함수
  // 마운트 시점에 상세정보를 조회, 화면에 출력!!
  useEffect(() => {
    axios.get(`http://localhost:8080/boards/get/${params.boardNum}`)
    .then(response => {
      console.log(response.data);
      setboardInfo(response.data);
    })
    .catch(error => console.log(error));
  }, [])

  // 삭제버튼 클릭 시 spring에게 삭제 실행을 요청 할 함수
  const deleteOneData = async () => {
    // 삭제버튼 누르면 한번 더 확인하는 기능 -> confirm();
    // 확인, 취소 버튼은 리턴해주는 데이터가 다름!
    // 확인 -> true, 취소 -> false
    const result = confirm('진짜 삭제하시겠습니까?') 
  
    // 확인 눌렀을 경우
    if(result){
      const response =  await delBoard(params.boardNum);
      if(response.data === 1){
        alert('삭제되었습니다.')
      } 
      else{
        alert('예기치 못한 오류가 발생했습니다.')
      }
    }
  }

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
        <button 
          type='button'
          onClick={e => {nav(`/update/${params.boardNum}`)}}          
        >수정</button>
        <button 
          type='button'
          onClick={e => {
            deleteOneData()
            nav('/')
          }}
        >삭제</button>
      </div>

      {/* 글 번호를 ReplyInfo에 전달 */}
      <ReplyInfo boardNum={params.boardNum}/>





    </div>
  )
}

export default BoardDetail