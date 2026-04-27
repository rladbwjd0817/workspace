import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useRouter } from 'expo-router'
import { SafeAreaView } from 'react-native-safe-area-context';

const MoreScreen = () => {
  const route = useRouter();

  return (
    <SafeAreaView>
      <View>
        <Pressable onPress={e => route.push('/profile')}>
          <Text>profile/index.jsx</Text>
        </Pressable>
  
        <Pressable onPress={e => route.push('/profile/second')}>
          <Text>profile/second.jsx</Text>
        </Pressable>
      </View>
    </SafeAreaView>
  )
}

export default MoreScreen

const styles = StyleSheet.create({})