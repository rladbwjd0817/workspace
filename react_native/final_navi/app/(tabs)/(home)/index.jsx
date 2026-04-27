import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import { useRouter } from 'expo-router';

const HomeScreen = () => {
  //페이지 이동
  const route = useRouter();

  return (
    <SafeAreaView>
      <View>
        <Text>index</Text>

        {/* route.push() : 페이지 쌓기 */}
        <Pressable onPress={e => route.push('/more') }> 
          <Text>more.jsx</Text>
        </Pressable>
      </View>
    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})