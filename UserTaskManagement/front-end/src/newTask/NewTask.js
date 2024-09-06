import { useState } from 'react';
import styles from './NewTask.module.css'

function NewTask(){

    const [isModalOpen, setIsModalOpen] = useState(true);

  const closeModal = () => {
    setIsModalOpen(false);
  };
    return(<>
    {isModalOpen && (<div className={styles.modal}>
        <div className={styles.cover}></div>
        <div className={styles.container}>
            <form className={styles.form}>
                <h1>Task Details</h1>
                <div className={styles.fields}>
                    <div className={styles.field}>
                        <label className={styles.formLabel}>name</label>
                        <input placeholder='set a task name' type='text' className={styles.formControl}/>
                    </div>
                    <div className={styles.field}>
                        <label className={styles.formLabel}>start date</label>
                        <input placeholder='set a task date' type='date' className={styles.formControl}/>
                    </div>
                    <div className={styles.field}>
                        <label className={styles.formLabel}>duration</label>
                        <input placeholder='set a task duration' type='text' className={styles.formControl}/>
                    </div>
                    <div className={styles.field}>
                        <label className={styles.formLabel}>description</label>
                        <textarea placeholder='set a task description' type='text' className={styles.formControl}/>
                    </div>
                </div>
                <div className={styles.buttons}>
                    <button className={`${styles.btn} ${styles.close}`} onClick={() => setIsModalOpen(false)}>close</button>
                    <button className={`${styles.btn} ${styles.add}`}>add task</button>
                </div>
            </form>
        </div>
    </div>)}</>)
}

export default NewTask;