import axios from 'axios'
import React, { useEffect, useState } from 'react'
import BoardList from '../pages/BoardList';

const ReplyInfo = ({boardNum}) => {
  // console.log(props); -> 객체로 출력 , {boardNum : 3} => boardNum - key, 3 - value
  // {boardNum} - 구조분해할당 : 구조를 분해해서 각각 할당


  // 댓글 목록 조회데이터를 저장할 변수 생성
  // 목록 조회 -> 여러 데이터를 조회하는 거니 배열!!!!!!!!!
  const [replyList, setReplyList] = useState([]);

  // 마운트 시 댓글 목록 조회
  useEffect(() => {
    axios.get(`http://localhost:8080/replies/${boardNum}`)
    .then(response => {
      console.log(response.data)
      setReplyList(response.data)
    })
    .catch(error => console.log(error));
  }, [])


  return (
    <div style={{marginTop : '20px'}}>
      <div style={{
        display : 'flex',
        gap : '10px',
      }}>
        {/* 댓글 작성 영역 */}
        <input
          style={{ width : '20%' }} 
          type="text" 
        />
        <input 
           style={{ width : '70%' }} 
          type="text" 
        />
        <button 
          style={{ width : '10%' }} 
          type='button'
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
                  <button type='button'>삭제</button>
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