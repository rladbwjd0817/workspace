
// 게시판 테이블과 관련된 api 요청을 보내는 함수 모음집!

import axios from "axios";

/**
 * 게시글 목록 조회 api 요청 함수
 * @param {Object} searchData 검색데이터
 * @param {string} searchData.searchKeyword 검색키워드(제목, 작성자)
 * @param {string} searchData.searchValue 검색내용
 * @returns {Promise} 게시글 목록 데이터 리턴
 */ 
export const getList = async (searchData) => {
  try{
    const response = await axios.get('http://localhost:8080/boards', {params: searchData});
    return response;
  }catch(e){
    console.log('게시글 목록 조회 실행 중 오류')
    console.log(e);
  }
}

// @param : 매개변수에 어떤 데이터가 있는지 설명
// {*} : 자료형
// searchData : 변수명
// @returns : 리턴되는 데이터가 뭔지 설명

export const saveOne = async (postBoard) => {
  try{
    const response  =  await axios.post('http://localhost:8080/boards', postBoard)

    return response;

  }catch(e){
    console.log('게시글 등록 중 오류 발생')
    console.log(e);
  }
}


/**
 * 게시글 삭제 함수
 * @param {number} boardNum 삭제할 게시글 번호
 * @returns 
 */
export const delBoard = async (boardNum) => {
  try{
    const response = await axios.delete(`http://localhost:8080/boards/${boardNum}`)
    return response;
  }catch(e){
    console.log('게시글 삭제 중 오류 발생');
    console.log(e);
  }
}

