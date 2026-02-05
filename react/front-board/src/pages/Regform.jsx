import React, { useState } from 'react'
import styles from './Regform.module.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import { saveOne } from '../api/boardApi';

const Regform = () => {
  // 게시글 작성 시 저장 할 state 변수 생성
  const [postBoard, setPostBoard] = useState({
    title : '',
    writer : '',
    content : ''
  });

  console.log(postBoard);

  const nav = useNavigate();

  // 글 등록 spring 실행 함수
  const newBoard = () => {
    // 제목과 작성자 입력 여부를 확인
    // 제목과 작성자를 입력하지 않으면 함수 종료
    

    const response = saveOne(postBoard);
    if(postBoard.title === '' ||  postBoard.writer === ''){
      alert('제목과 작성자는 필수 입력입니다.')
    }

    
  }

  // 새로운 내용을 등록할 때 저장할 handle함수생성
  const handleNewData = (e) => {
    // 함수형 업데이트로 수정


    setPostBoard({
      ...postBoard,
      [e.target.name] : e.target.value
    })
  };

  return (
    <>
      <div className={styles.container}>
        {/* 머리글 */}
        <div className={styles.title}>
          <h1>게시글 작성</h1>
        </div>
        {/* 게시글작성 표 */}
        <div className={styles.write}>
          <table className={styles.table}>
            <tbody>
              <tr>
                <td>제목</td>
                <td>
                  <input 
                    type="text"
                    name='title'
                    value={postBoard.title}
                    placeholder='제목 입력(4 ~ 50자).'
                    onChange={e =>{handleNewData(e)}} 
                  />
                </td>
              </tr>
              <tr>
                <td>작성자</td>
                <td>
                  <input 
                    type="text"
                    name='writer'
                    value={postBoard.writer}
                    placeholder='작성자(2자~10자).' 
                    onChange={e =>{handleNewData(e)}}
                  />
                </td>
              </tr>
              <tr>
                <td>내용</td>
                <td>
                  <textarea 
                  placeholder='내용작성'
                  name='content'
                  value={postBoard.content}
                  onChange={e =>{
                    handleNewData(e)
                    
                  }}
                  ></textarea>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        {/* 글등록 버튼 */}
        <div className={styles.reg}>
          <button 
            type='button'
            onClick={e => {
              newBoard();
              
            }}
          >글등록</button>
        </div>
      </div>
    </>
   
  )
}

export default Regform