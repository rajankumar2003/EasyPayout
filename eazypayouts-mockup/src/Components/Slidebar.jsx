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
          <li className='loads'> <img src="box-arrow-in-down.svg" alt="EazyPayouts Logo"  />Loads</li>
          <li className='statement'><img src="jornal-text.svg" alt="EazyPayouts Logo"  />Statements</li>
          <li className='transaction'><img src="arrow-down-up.svg" alt="EazyPayouts Logo"  />Transactions</li>
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
