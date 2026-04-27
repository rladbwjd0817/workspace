import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'

const TabLayout = () => {
  return (
    <Tabs screenOptions={{headerShown : false}}>
      <Tabs.Screen 
        //탭 터치를 열릴 파일명(폴더명 입력 시 해당 폴더 안의 index 파일 실행됨)
        name='(home)' // (home)/index.jsx
        options={{
          title : '홈' // tab 이름
        }}
      />
      <Tabs.Screen 
        name='profile' // (home)/index.jsx
        options={{
          title : '프로필' // tab 이름
        }}
      />
      <Tabs.Screen 
        name='setting' // (home)/index.jsx
        options={{
          title : '설정', // tab 이름
          //href : null  // tab이 사라짐
        }}
      />
    </Tabs>
  )
}

export default TabLayout

const styles = StyleSheet.create({})