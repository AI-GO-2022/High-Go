

import React, {useEffect, useState} from 'react';
import axios from 'axios';
import './mainpage.css';
function App() {
  const [hello, setHello] = useState('')

  useEffect(() => {
    axios.get('/api/hello') // get data from backend
        .then(response => setHello(response.data))
        .catch(error => console.log(error))
  }, []);
 
  return (
      <div>
        백엔드에서 가져온 데이터입니다 : {hello}
        <section>
          <img className="bird" src="https://i.imgur.com/UoNlFlC.png"/>
        </section>
      </div>
  );
  
}

export default App;