const cal = () => {
  // 1. 두 input 태그에 입력한 값을 읽어오기
  // -> input 태그의 value 속성값을 읽어오기
  // 1) 첫번째 input 태그에 접근
  const num1_tag = document.querySelector('#num1')
  // 2) 접근한 태그의 value 값 읽어오기
  console.log(num1_tag.value);

  const num1 = num1_tag.value
  const num2 = document.querySelector('#num2').value;

  // 2. 가져온 값을 더하기
  const result = Number(num1) + Number(num2);

  // 3. 더한 값을 결과 input태그에 넣어주기(value)
  const result_tag = document.querySelector('#result');
  result_tag.value = result;
}

const addRow = () => {
  // tbody 태그에 접근
  const tbody_tag = document.querySelector('#table > tbody')
  // console.log(tbody_tag);

  const str = `
    <tr>
      <td>1</td>
      <td>2</td>
      <td>3</td>
    </tr>
  `;
  tbody_tag.insertAdjacentHTML('beforeend', str)
}