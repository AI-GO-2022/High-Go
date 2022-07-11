import React, {useEffect, useState} from 'react';
import axios from 'axios';
import './App.css';
import './components/nav.css';
import './components/mainpage.css';
import imagemain from './components/images/mainlogo2.png';
import imagemain2 from './components/images/cloud.png';
import imagemain3 from './components/images/onecloud.png';

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
        <img className="onecloud" src={imagemain3}/>
        <div className="title"><img className="mainlogo" src={imagemain}/>
        </div>
        <div className="des">
          안녕하세요! HIGH-GO를 찾아주신 여러분!<br/>
          &nbsp;&nbsp;HIGH-GO는 초심자부터 전문가까지 숙련도에 따른 등산코스와 <br/>
          주변 맛집 및 관광지에 대한 정보를 제공합니다. 
          <br/>또한, 내가 정상에 오른 산의 발자취를 기록하고 
          <br/>카카오 친구들과 공유하며 산행의 즐거움을 나눌 수 있습니다.        
          <br/>모두 산 정상을 향해 GO-HIGH!
        </div>
        <br/>
        <button className="recommendation">RECOMMENDATION FOR YOU!<br/>
        CLICK ME!</button>
        <img className="cloud" src={imagemain2}/>
        </section>
        
    </div>
  );
}

export default App;