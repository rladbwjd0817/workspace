// 기본 함수 선언 문법
function hello(){
  console.log('hello~');
}

// 함수 표현식으로 사용
//자료형 변수명 = function (){};
const hello2 = function (a, b){
  console.log('hello!');
}

hello(); //->함수 호출

//화살표 함수
const hello3 = () => {
  console.log('hello');
} //()앞에 function이 사라지고 => 화살표가 생김

// 함수를 변수처럼 사용!

function intro1(){
  console.log('반가워');
  console.log('또 만나!');
}

//함수 표현식 
const intro2 = function (){
  console.log('hello');
}

// 화살표 함수 : 더 간결하게 쓰기 위해서 나옴
const intro3 = () => {
  console.log('안녕!');
}

function printNum1(num){
  console.log(num);
}

//함수표현식
const printNum2 = function(num){
  console.log(num);
}

//화살표함수
const printNum3 = (num) => {
  console.log(num);
}

//화살표함수
//만약 매개변수가 하나라면 소괄호 생략 가능!
//만약 함수 안의 실행내용이 한 줄이라면 중괄호 생략가능
//만약 실행내용이 한 줄이고 그 한 줄이 return문이라면 중괄호 생략과 함께 return키워드도 생략해야 함!
const printNum4 = num => {
  console.log(num);
}

const printNum5 = num => console.log(num);

//기본함수
function printSum1(a, b){
  console.log(a + b);
}
//함수표현식
const printSum2 = function (a, b){
  console.log(a + b);
}
//화살표함수
//함수면서 매개변수 2개가 들어오고 매개변수로
const printSum3 = (a, b) => {
  console.log(a + b);
}
const printSum4 = (a, b) => console.log(a + b);
printSum4(1, 2);

//기본함수
function getDouble(num){
  return num * 2;
}

//함수표현식
const getDouble2 = function(num){
 return num * 2;
}

//화살표함수
const getDouble3 = (num) => {
 return num * 2;
}
getDouble3();

const getDouble4 = num => num * 2;
getDouble4(4);
console.log(getDouble(4));

