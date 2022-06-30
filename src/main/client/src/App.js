import React, {useEffect, useState} from 'react';
import axios from 'axios';
import './App.css';
import './nav.css';
import './mainpage.css';
import imagemain from './components/images/mainlogo2.png';

function App() {
  const [hello, setHello] = useState('')

  useEffect(() => {
    axios.get('/api/hello') // get data from backend
        .then(response => setHello(response.data))
        .catch(error => console.log(error))
  }, []);

  return (
      <div>
        <section>
          <img className="cloud"/>
        {hello}

        <div className="subtitle">LET'S GO HIGH-!</div>
        <nav id="menubar">
        <ul>
          <li><a href="#">HIKING FOOTPRINT</a></li>
          <li><a href="#">HIKING DIARY</a></li>
          <li><a href="#">LOGIN</a></li>
          <li><a href="#">SIGN UP</a></li>
          </ul>
        </nav>
        <div className="title"><img className="mainlogo" src={imagemain}/></div>
        <br/>
        <button className="recommendation">RECOMMENDATION FOR YOU!<br/>
        CLICK ME!</button>
        </section>
    </div>
  );
}

export default App;