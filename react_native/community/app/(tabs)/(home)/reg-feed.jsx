import { Keyboard, KeyboardAvoidingView, StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import axios from 'axios';
import CustomInput from '../../../components/common/CustomInput';

// 피드 등록 화면
const RegFeedScreen = () => {

  return (
    // 빈 공간 터치하면 터치 먹힘
    <TouchableWithoutFeedback onPress={() => Keyboard.dismiss()}>
      <KeyboardAvoidingView 
        style={styles.container}
        behavior='padding'
      >
        <CustomInput  label='아이디' isPw={true} />
        <CustomInput />
        <CustomInput />
      </KeyboardAvoidingView>
     
    </TouchableWithoutFeedback>
  )
}

export default RegFeedScreen

const styles = StyleSheet.create({
  container : {
    flex : 1,
    justifyContent : 'flex-end',
    backgroundColor : 'white',
    paddingHorizontal: 30,
    gap : 12
  }
})

// react-native는 스크롤 기능 제공하지 않음
// flatList 컴포넌트를 사용하면 알아서 스크롤을 만들어줌
// view 중에 스크롤을 만들어주는 view가 있음 -> scrollView
