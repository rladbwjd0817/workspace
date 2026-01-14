//함수 선언 -> 함수 호출

function hello(){
  alert(111);

}

// hello();

//매개변수로 정수 2개 전달
function printSum(num, num2){
  console.log(num + num2);
}

printSum(10, 5);

//매개변수로 전달된 두 수의 합을 리턴
function getSum(a, b){
  return a + b;
}

console.log(getSum(5, 7));

