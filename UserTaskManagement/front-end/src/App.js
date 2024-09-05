import logo from './logo.svg';
import './App.css';
import NavBar from './navbar/NavBar';
import ListTasks from './tasks/ListTasks';

function App() {
  return (
    <div className="App">
      <NavBar></NavBar>
      <ListTasks></ListTasks>
    </div>
  );
}

export default App;
