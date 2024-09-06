import { useState } from 'react';
import styles from './ListTasks.module.css'
import NewTask from '../newTask/NewTask';

function ListTasks(){

    const [activeButton, setActiveButton] = useState('Today');
    const [isModalOpen, setIsModalOpen] = useState(false);

    const openModal = () => {
        setIsModalOpen(true);
    };
    const handleButtonClick = (buttonName) => {
        setActiveButton(buttonName);
    };

    return (
    <div className={styles.listTasks}>
        <div className={styles.container}>
            <div className={styles.actions}>
                <button
                className={`${styles.btn} ${activeButton === 'Today' ? styles.active : ''}`}
                onClick={() => handleButtonClick('Today')}
            >
                Today
            </button>
            <button
                className={`${styles.btn} ${activeButton === 'Pending' ? styles.active : ''}`}
                onClick={() => handleButtonClick('Pending')}
            >
                Pending
            </button>
            <button
                className={`${styles.btn} ${activeButton === 'Overdue' ? styles.active : ''}`}
                onClick={() => handleButtonClick('Overdue')}
            >
                Overdue
            </button>
            </div>
            <div className={styles.tasks}>
                <div className={styles.tasksAction}>
                    <h2>tasks</h2>
                    <button className={`${styles.btn} ${styles.newTask}`} onClick={openModal}><span>+</span> add task</button>
                </div>
                <div className={styles.tasksContainer}>
                    <div className={styles.task}>
                        <input type='checkbox' />
                        <h3>task name</h3>
                        <h3>27/10/2024</h3>
                        <div className={styles.taskActions}>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        {isModalOpen && <NewTask/>}
    </div>)
}

export default ListTasks;