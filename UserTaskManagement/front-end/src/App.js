import './App.css';
import NavBar from './navbar/NavBar';
import ListTasks from './tasks/ListTasks';
import NewTask from './newTask/NewTask';
import { useState } from 'react';

function App() {
  const [isModalOpen, setIsModalOpen] = useState(false);

  const openModal = () => {
    setIsModalOpen(true);
  };
  return (
    <div className="App">
      <NavBar></NavBar>
      <ListTasks></ListTasks>
      {isModalOpen && <NewTask/>}
    </div>
  );
}

export default App;
