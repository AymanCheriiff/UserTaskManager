import './App.css';
import NavBar from './navbar/NavBar';
import ListTasks from './tasks/ListTasks';
import NewTask from './newTask/NewTask';
import { useState } from 'react';

function App() {
  return (
    <div className="App">
      <NavBar></NavBar>
      <ListTasks></ListTasks>
    </div>
  );
}

export default App;
