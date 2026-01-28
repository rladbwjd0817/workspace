import React from 'react'
import styles from './Regform.module.css'

const Regform = () => {
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
            <tr>
              <td>제목</td>
              <td>
                <input 
                  type="text"
                  placeholder='제목 입력(4 ~ 50자).' 
                />
              </td>
            </tr>
            <tr>
              <td>작성자</td>
              <td>
                <input 
                  type="text"
                  placeholder='작성자(2자~10자).' 
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td>
                <textarea placeholder='내용작성'></textarea>
              </td>
            </tr>
          </table>
        </div>
        {/* 글등록 버튼 */}
        <div className={styles.reg}>
          <button type='button'>글등록</button>
        </div>
      </div>
    </>
   
  )
}

export default Regform