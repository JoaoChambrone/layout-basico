import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import "../styles/home.scss"

function Home() {
  const [usuarioLogado, setUsuarioLogado] = useState(null);
  const navigate = useNavigate();

  useEffect(() => {
    const usuario = JSON.parse(sessionStorage.getItem('usuarioLogado'));
    setUsuarioLogado(usuario);
  }, []); 

  const handleLogout = () => {
    sessionStorage.removeItem('usuarioLogado');
    navigate('/login'); 
  }

  return (
    <>
      <h1>HOME</h1>
      {usuarioLogado && (
        <div className='usuarionome'>
          <p> Usuário: {usuarioLogado.usuario}</p>
          <button onClick={handleLogout}>LOGOUT</button>
        </div>
      )}
      <main>
        <section>
          <div>
            <img className = "img1 "src="src/assets/Bob-Enponja-e-Patrick-Como-Humanos-GEEKNESS-Capa.webp" alt="erro" />
          </div>
          <div className="divp1">
            <div className='titulo'>
                <h1>LOREM<br /> IPSUM</h1>
            </div>
            <div className='texto1'> 
                <h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa aspernatur quaerat perferendis ut incidunt doloribus minus maiores, earum commodi, magni reprehenderit fugiat quis fuga. Ullam veritatis consequuntur vel voluptate sint.</h3>
                
            </div>
            
          </div>
          <div className='divp2'>
            LOREM IPSUM
          </div>
        </section>
        <aside>
          <div className="divas">
            <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Recusandae labore, aspernatur numquam repudiandae quam aut praesentium id pariatur rerum modi nobis tempore? Laudantium maiores ad suscipit rem eius dolore rerum!</p>
          </div>
          <div className="divas2">
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus quo quod earum doloribus eligendi est dolore, voluptatem officia voluptas dignissimos commodi non necessitatibus vel dolor distinctio sequi nostrum. Laudantium, quo!</p>
          </div>
          <div className="divas3">
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ipsa consectetur ut, sed iure in facilis ad repellat voluptas accusamus, rem laboriosam, a dolores? Ipsa sint nam veritatis reprehenderit architecto soluta.</p>
          </div>
        </aside>
      </main>
      <h1 className='titulo2'>LOREM IPSUM</h1>
      <section className='cards'>
          <div className='card1'>
              <h1>LOREM IPSUM</h1>
              <h3>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Nostrum ipsum soluta maxime veritatis natus quo pariatur quia. Nesciunt, laboriosam! Dicta eum aspernatur porro dolore exercitationem ab a? Ratione, qui doloremque.</h3>
          </div>
          <div className='card1'>
              <h1>LOREM IPSUM</h1>
              <h3>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam eos commodi ratione! Incidunt nemo iusto aut quidem provident, placeat deserunt ut accusamus cum tenetur quisquam recusandae autem sint, natus porro!</h3>
          </div>
          <div className='card1'>
              <h1>LOREM IPSUM</h1>
              <h3>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Officia repudiandae, facere dolorem assumenda dolor illum blanditiis nam consectetur quis accusamus numquam beatae veniam nisi distinctio quas error cum porro nobis?</h3>
          </div>
      </section>

    </>
  );
}

export default Home;
