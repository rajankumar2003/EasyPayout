import React from 'react';
import Sidebar from './Slidebar.jsx';
import MainContent from './MainContent.jsx';
import MobileLogo from './MoblieLogo.jsx';

function App() {
  return (
    <div className="container">
      <MobileLogo />
      <Sidebar />
      <MainContent />
    </div>
  );
}
export default App;
