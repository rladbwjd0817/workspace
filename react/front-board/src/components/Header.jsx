import React from 'react'
import styles from'./Header.module.css'

const Header = () => {
  return (
    <div className={styles.container}>
      <ul className={styles.menu}>
        <li>LOGIN</li>
        <li>JOIN</li>
      </ul>
    </div>
  )
}

export default Header

// styles는 객체처럼 css 데이터를 가져옴.