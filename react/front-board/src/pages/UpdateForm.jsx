import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import BoardDetail from './BoardDetail';

const UpdateForm = () => {
  // URL Parameter로 전달된 데이터 받기
  //!!!!!!!!!!!!params는 객체로 출력!!!!!!!!!!
  // 구조분해할당으로 인해 객체형태가 아닌 boardNum 데이터만 출력 -> boardNum = 37 => 37 만 출력
  const {boardNum} = useParams(); 
  console.log(boardNum); //글 번호

  // 조회한 게시글 정보를 저장할 변수
  const [boardInfo, setBoardInfo] = useState({});

  // 수정한 게시글 정보를 저장할 변수(new 내용)
  const [updateData, setUpdateData] = useState({
    title : '',
    content : ''
  });

  // 마운트 시 실행 X , boardInfo 값이 변경되어 리렌더링 될 때 실행 -> 다른 리렌더링땐 실행 X
  // boardInfo의 데이터를 updateData에 저장!
  useEffect(() => {
    // 마운트가 아닐 때만 이 useEffect를 실행할거야! => boardInfo가 빈 객체가 아니면
    // boardInfo가 빈 객체가 아닐 때만 -> 객체의 키가 0개가 아닐 때
    if(Object.keys(boardInfo).length !== 0){

      // boardInfo 객체에 저장된 title, content 값을 updateData에 저장!
      setUpdateData({
        title : boardInfo.title,
        content : boardInfo.content
      })
    }
  }, [boardInfo])

  // 입력할 때 마다 입력한 값을 저장하는 함수
  const handleUpdateData = (e) =>{
    setUpdateData({
      ...updateData,
      [e.target.name] : e.target.value
    })
  }

  // 경로설정 useNavigate
  const nav = useNavigate();

  // 마운트되면 기존 내용이 보여야 한다.
  // -> 기존 내용을 DB에서 조회한다.
  useEffect(() => {
    axios.get(`http://localhost:8080/boards/update/${boardNum}`)
    .then(response => {
      console.log(response.data);
      setBoardInfo(response.data);
    })
    .catch(error => console.log(error));
  },[])

  // updateBoard 수정함수 생성
  const updateBoard = () => {
    axios.put(`http://localhost:8080/boards/${boardNum}`, updateData) 
    //위의 params 구조분해할당으로 인해서 객체. 메서드명 형태 아님!
    // put, post는 2번째 매개변수에 객체형태로 spring에 수정하거나 등록할 데이터를 전달가능
    .then(response => {
      alert('수정 완료!!')
      // 상세페이지로 이동
      nav(`/detail/${boardNum}`)
    })
    .catch(error => console.log(error));
  }

  return (
    <div>
      <div>
        <table border={1}>
          <tbody>
            <tr>
              <td>작성일</td>
              <td>{boardInfo.createDate}</td>
              <td>작성자</td>
              <td>{boardInfo.writer}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={3}>
                {/* value와 onChange 에서는 같은 데이터를 다루어야 한다. */}
                <input 
                  type="text" 
                  value={updateData.title}
                  name='title'
                  onChange={e => handleUpdateData(e)}
                  // vlaue에서 boardInfo를 건드리면 onChange에서도 boardInfo를 건드리고,
                  // vlaue에서 hadnleUpdateData를 건드리면 onChange에서도 hadnleUpdateData를 건드려야 함.
                  // => value와 onChange 에서는 같은 데이터를 다루어야 함.!!!
                  
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={3}>
                <textarea 
                  cols={50} 
                  rows={5} 
                  name='content'
                  value={updateData.content}
                  onChange={e => handleUpdateData(e)}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button 
          type='button'
          onClick={e => {nav(-1)}}
        >뒤로가기</button>
        <button 
          type='button'
          onClick={e => {
            updateBoard()
          }}
        >수정</button>
      </div>
    </div>
  )
}

export default UpdateForm

// 흐름
// 왜 undefined가 나오냐면 처음 초기값이 빈 객체로 useEffect는 마지막에 해석되어 그림을 다 그리고 나서 실행되며 값을 스프링에서 가져와서 그때 값을 가짐.