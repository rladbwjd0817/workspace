import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';
import SimpleLineIcons from '@expo/vector-icons/SimpleLineIcons';

// (tabs) 폴더 내의 파일들을 tab 네비로 이동할 수 있도록 설정하는 파일
const TabLayout = () => {
  return (
    // Tabs props에서 tab 디자인 가능
    <Tabs screenOptions={{headerShown : false}}> 
      {/* <Tabs.Screen /> 하나가  하나의 탭을 의미*/}
      
      {/* // Tabs.Screen의 props에서 tab 디자인 가능 */}
      <Tabs.Screen 
        name='index' // 탭에 연결될 파일이름
        options={{
          title : 'Home', // 탭의 이름
          tabBarIcon : () => <FontAwesome5 name="home" size={24} color="black" />
        }}
      />

      <Tabs.Screen 
        name='my-page'
        options={{
          title : 'My Page',
          tabBarIcon : () => <FontAwesome6 name="user-large" size={24} color="black" />
        }}
      />

      <Tabs.Screen 
        name='settings'
        options={{
          title : 'Settings',
          tabBarIcon : () => <SimpleLineIcons name="settings" size={24} color="black" />
        }}
      />
    </Tabs>
  )
}

export default TabLayout

const styles = StyleSheet.create({})