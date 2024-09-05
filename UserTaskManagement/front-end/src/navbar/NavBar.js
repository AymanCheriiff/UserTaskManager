import styles from './NavBar.module.css'

function NavBar(){
    return(
        <div className={styles.nav}>
            <div className={styles.logo}>
                <h4>task management application</h4>
            </div>
        </div>
    )
}

export default NavBar;