import React from 'react';


function Sidebar() {
  return (
    <aside className="sidebar">
      <div className="frame">
        <div className="logo">
        <img src="logo.svg" alt="EazyPayouts Logo"  />
        <p className='logo-name'>EasyPayouts</p>
      </div>
      <nav className='frame2'>
        <ul>
          <li>Loads</li>
          <li>Statements</li>
          <li>Transactions</li>
        </ul>
      </nav>
      </div>
      <div className="logout">
        <img src="box-arrow-right.svg" alt="EazyPayouts Logo"  />
        <button className="logout-button">Logout</button>
      </div>
    </aside>
  );
}
export default Sidebar;
