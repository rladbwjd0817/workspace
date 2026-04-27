import { Tabs } from 'expo-router';
import React from 'react';
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';


export default function TabLayout() {

  return (
    <Tabs
      screenOptions={{
        headerShown: false
      }}>
      <Tabs.Screen
        name="(home)"
        options={{
          title: 'Home',
          tabBarIcon : () => <FontAwesome5 name="home" size={24} color="black" />
        }}
      />
      <Tabs.Screen
        name="profile"
        options={{
          title: 'profile',
          tabBarIcon : () => <FontAwesome5 name="user-alt" size={24} color="black" />
        }}
      />
    </Tabs>
  );
}
