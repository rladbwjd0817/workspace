import axios from 'axios'
import React, { useEffect, useState } from 'react'
import BoardList from '../pages/BoardList';
import { useParams } from 'react-router-dom';
import { delReply, getList, save } from '../api/replyApi';

const ReplyInfo = ({boardNum}) => {
  // console.log(props); -> 객체로 출력 , {boardNum : 3} => boardNum - key, 3 - value
  // {boardNum} - 구조분해할당 : 구조를 분해해서 각각 할당


  // 댓글 목록 조회데이터를 저장할 변수 생성
  // 목록 조회 -> 여러 데이터를 조회하는 거니 배열!!!!!!!!!
  const [replyList, setReplyList] = useState([]);

  // 마운트 시 댓글 목록 조회
  useEffect(() => {getReplyList()}, [])

  // 댓글 목록 조회 함수
  const getReplyList = async () => {
    const response = await getList(boardNum);
    setReplyList(response.data);
  }

  // Spring으로 전달할 데이터를 저장하는 변수 생성
  const [writeReply, setWriteReply] = useState({
    content : '',
    writer : '',
    boardNum : boardNum
    // 앞의 boardNum은 key값으로 변수 아님!
    // 뒤의 boardNum은 글번호 데이터
  });

  // 값 입력시 실행 함수
  const handleReply = (e) => {
    setWriteReply({
      ...writeReply,
      [e.target.name] : e.target.value
    })
  }

 
  // 댓글 등록 API 호출
  const regReply = async () => {

    // 작성자랑 내용이 다 기입되었을 때 실행되기
    // 작성자 혹은 댓글 내용이 입력되지 않았으면
    if(writeReply.writer === '' || writeReply.content === ''){
      alert('작성자 및 내용은 필수 입력입니다.')
      return; //빈 return은 조건이 만족하지 않으면 바로 함수 종료
    }

    // 댓글 등록
    await save(writeReply);
    getReplyList();
    // input태그 초기화
    setWriteReply({
      ...writeReply,
      content : '',
      writer : ''
    });

  }


  // 삭제버튼 눌렀을 때 실행 할 함수
  const deleteData = async (replyNum) => {
    const result = confirm('삭제하실?');

    if(result){
      // 댓글 삭제
      await delReply(replyNum);
      // 댓글 목록 조회
      getReplyList();
    }
  }

  return (
    <div style={{marginTop : '20px'}}>
      <div style={{
        display : 'flex',
        gap : '10px',
      }}>
        {/* 댓글 작성 영역 */}
        <input
          style={{ width : '20%' }}
          placeholder='작성자'
          name='writer'
          // value는 화면에 나오는 데이터
          value={writeReply.writer} 
          onChange={e => {handleReply(e)}}
          type="text" 
        />
        <input 
          style={{ width : '70%' }} 
          placeholder='댓글 내용 작성'
          name='content'
          value={writeReply.content}
          onChange={e => {handleReply(e)}}
          type="text" 
        />
        <button 
          style={{ width : '10%' }} 
          type='button'
          onClick={e => regReply()}
        >댓글 등록</button>
      </div>    
      <div  style={{ marginTop : '16px' }} >
        {
          replyList.map((reply, i) => {
            return(
              <div key={i}>
                <div>
                  <div style={{display : 'flex', gap : '8px', alignItems : 'center'}}>
                    <img
                      style={{
                      ackground: '1px solid lightgray', 
                      borderRadius : '50%',
                      width : '40px',
                      }} 
                      src="/face-01.jpg"
                    />
                    <div>
                      <p>{reply.writer}</p>
                      <p style={{color : 'gray'}}>{reply.regDate}</p>
                    </div>
                  </div>
                </div>
                <div style={{display : 'flex', justifyContent : 'space-between'}}>
                  <p>{reply.content}</p>
                  <button 
                    type='button'
                    onClick={e => {deleteData(reply.replyNum)}}
                  >삭제</button>
                </div>
              </div>
            )
          })
        }
     
      </div>
    </div>    
  )
}

export default ReplyInfo