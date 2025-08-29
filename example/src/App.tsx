import { Text, View, StyleSheet, TouchableOpacity } from 'react-native';
import { exitApp } from 'react-native-killer';

export default function App() {
  return (
    <View style={styles.container}>
      <TouchableOpacity
        onPress={() => {
          exitApp();
        }}
      >
        <Text>Result: {`123456`}</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
