import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useLocalSearchParams } from 'expo-router'

const DetailScreen = () => {
  // 페이지 이동 시 전달되는 데이터 받기(객체로 전달받음!)
  const params = useLocalSearchParams();
  // 구조분해할당으로도 받을 수 있음!
  const {id, age} = useLocalSearchParams();


  return (
    <View>
      <Text>detail</Text>
      <Text>{params.id}</Text>
      <Text>{params.age}</Text>
      
      <Text>{id}</Text>
      <Text>{age}</Text>
    </View>
  )
}

export default DetailScreen

const styles = StyleSheet.create({})