import {Link} from 'react-router-dom'

function Nav() {
 

  return (
    <>
      <header>
        <nav>
          <Link to="/" >HOME</Link>
          <Link to="/login" >LOGIN</Link>
        </nav>
      </header>
    </>
  )
}

export default Nav

