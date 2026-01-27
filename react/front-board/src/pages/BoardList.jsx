import React from 'react'
import styles from './BoardList.module.css'

const BoardList = () => {
  return (
    <div className={styles.container}>
      {/* 검색 */}
      <div className={styles.search}>
        <select name="">
          <option value="">제목</option>
          <option value="">작성자</option>
        </select>
        <input type="text" />
        <button type='button'>검색</button>
      </div>
      {/* 게시글 표 */}
      <div className={styles.table}>
        <table>
          {/* 제목 */}
          <thead >
            <tr>
              <td>NO</td>
              <td>카테고리</td>
              <td>제목</td>
              <td>작성일</td>
              <td>조회수</td>
            </tr>
          </thead>
          {/* 표 본문내용 */}
          <tbody>
            <tr>
              <td>공지</td>
              <td>교육서비스 양성교육</td>
              <td>2026학년도 신입생 모집</td>
              <td>2026.01.26</td>
              <td>70</td>
            </tr>
          </tbody>
        </table>
      </div>
      {/* 버튼 */}
      <div>
        <button 
          type='button'
          onClick={e => {}}
        >글쓰기</button>
      </div>
    </div>
  )
}

export default BoardList