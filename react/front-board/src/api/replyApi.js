// 댓글 관련된 api 요청을 보내는 함수 모음집

import axios from "axios";

/**
 * 댓글 목록 조회 함수
 * @param {number} boardNum 댓글이 포함된 글 번호 
 * @returns 
 */
export const getList = async (boardNum) => {
  try{
    const response =  await axios.get(`http://localhost:8080/replies/${boardNum}`)
    return response;
  }catch(e){
    console.log('댓글 목록 조회 중 오류 발생');
    console.log(e);
  }
}

/**
 * 새로운 댓글 등록
 * @param {Object} writeReply 등록할 댓글 정보
 * @param {string} writeReply.writer 댓글 작성자
 * @param {string} writeReply.content 댓글 내용
 * @param {number} writeReply.boardNum 댓글이 달릴 게시글 번호
 * @returns 
 */
export const save = async (writeReply) => {
  try{
    await axios.post('http://localhost:8080/replies', writeReply);
    
  }catch(e) {
    console.log('댓글 등록 중 오류 발생');
    console.log(e);
  }
}

/**
 * 댓글 삭제
 * @param {number} replyNum 삭제할 댓글 번호
 * @returns 
 */
export const delReply = async (replyNum) => {
  try{
    await axios.delete(`http://localhost:8080/replies/${replyNum}`);
  }catch(e){
    console.log('댓글 삭제 중 오류 발생');
    console.log(e);
  }
}