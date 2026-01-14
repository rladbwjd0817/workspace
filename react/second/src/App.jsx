// 이건 함수가 아니야!
// 보통 함수는 function 소문자로 오는데 이건 function 대문자라서 함수 아님 => jsx에서 함수가 아니라는 거임
// 함수 형태이지만 대문자로 시작 -> 컴포넌트(Component)

import Header from "./Header";
import Footer from "./Footer";

// Component의 리턴문에 html 코드가 있으면 화면에 그려줌.
function App() { //App Component
  let str = 'hi!';
  let num = 10;
  let num2 = 5;

  //return 안의 html 코드는 반드시 하나의 태그에 포함되어야 함.
  return (
    <div>
      <Header />
      {/* Header 컴포넌트에서 만든 div 내용이 화면에 그려짐 */}
      <div>
        <div>{str}</div>
        <div>{num}</div>
        <div>{num} - {num2}</div>
        {/* //하나의 중괄호 안에 연산식넣으면 연산가능 */}
        <div>{num - num2}</div> 
      </div>
      {/* 태그 열자마자 바로 닫으려고 하면 < /> 이 형태로 작성 */}
      <Footer />
      <input type="text" />
      <br />
    </div>
  )

}

// Header Component
// function Header(){
//   return(
//     <div>!header!</div>
//   )
// }



export default App
