import styles from './NavBar.module.css'

function NavBar(){
    return(
        <div className={styles.nav}>
            <div className={styles.container}>
                <h1>task management app</h1>
            </div>
        </div>
    )
}

export default NavBar;