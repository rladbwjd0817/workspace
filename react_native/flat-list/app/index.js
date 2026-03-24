import { Keyboard, StyleSheet, Text, TextInput, TouchableWithoutFeedback, View } from 'react-native'
import React, { useState } from 'react'
import CartList from '../components/CartList'
import { SafeAreaView } from 'react-native-safe-area-context'
import { dummy_data } from '../data/dummy'



const HomeScreen = () => {
  // 새롭게 입력한 장바구니 데이터를 저장할 state 변수생성
  const [newItem, setNewItem] = useState('');

  // 장바구니 데이터 저장할 state 변수 - newItem에서 입력한 데이터를 추가하기 위해서 가져옴
  const [cartList, setCartList] = useState(dummy_data);

  // 장바구니 목록 추가
  const addCart = () => {
    // 추가 할 id
    // Math.max([1,2,3]) => 3
    // 배열의 데이터 수 만큼 반복하면서 return되는 데이터를 배열로 반환
    const idList = cartList.map(item => item.id)

    // 추가할 데이터
    const newData = {
      // 장바구니 목록에 데이터 유무에 따라 코드 진행
      id : cartList.length === 0 ? 1 : Math.max(idList) + 1,
      item : newItem
    }

    // 추가할 데이터를 cartList에 저장
    setCartList([...cartList, newData]);

    // TextInput 초기화
    setNewItem('')
  }
  
  return (
    // 화면 빈 곳 터치 시 키보드 숨김 기능 추가
    //  -> <TouchableWithoutFeedback onPress = keyboard.dismiss>
    // ios -> accessible={false} 속성이 있어야 아이폰에서도 정상동작함.
    <TouchableWithoutFeedback 
      onPress={Keyboard.dismiss} 
      accessible={false}
    > 
      <SafeAreaView style={styles.container}>
        <TextInput 
          style={styles.input} 
          value={newItem}
          onChangeText={text => {setNewItem(text)}}
          // 휴대폰에서 확인, ok, 선택 버튼 터치했을 때 실행하는 기능
          // 입력한 데이터를 cartList에 추가
          onSubmitEditing={() => addCart()}
        />
        <CartList cartList={cartList}/>
      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}

export default HomeScreen

const styles = StyleSheet.create({
  container : {
    flex : 1
  },
  input : {
    borderWidth : 1,
    marginVertical : 30,
    // width : '10%'
  }
})