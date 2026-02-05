import React from 'react'

// js 파일의 변수 및 함수 import 방식1
// {} : 그 파일 중 {} 안에 있는 일부분만 가져올게~
import { age, test1 } from '../util/myMath'

// js 파일의 변수 및 함수 import 방식2
// * : 전체, as fun : fun 이 별칭
import * as fun from '../util/myMath'

// import { 구조분해할당 } from '파일경로/파일명' 
// ./ => 현재폴더, ../ => 상위 폴더로 가세요~
// 확장자 생략가능
// ../util/myMath => myMath안에 있는 모든 정보를 가지고 오는데 객체 형태로 가지고 옴!!
// {age, test1} : myMath에서 age와 test1을 가져와서 쓸게!

const Export1 = () => {
  const data1 = age
  test1();
  console.log(fun.name);
  fun.test2();

  return (
    <div>

    </div>
  )
}

export default Export1
// export default 붙어있으면 as fun 처럼 이름을 바꿔서 사용 X , 있는 그대로 사용해야 함!
