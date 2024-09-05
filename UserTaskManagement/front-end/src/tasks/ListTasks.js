import { useState } from 'react';
import styles from './ListTasks.module.css'

function ListTasks(){

    const [activeButton, setActiveButton] = useState('Today');

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
            <div className={styles.taks}>
                <div className={styles.tasksAction}>
                    <h2>tasks</h2>
                </div>
            </div>
        </div>
    </div>)
}

export default ListTasks;