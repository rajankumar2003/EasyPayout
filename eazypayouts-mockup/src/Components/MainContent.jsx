import React, { useState, useEffect } from 'react';
import AccountDataTable from './AccountDataTable';

export default function MainContent() {
  const [companies, setCompanies] = useState([]);
  const [accounts, setAccounts] = useState([]);
  const [selectedCompany, setSelectedCompany] = useState('');
  const [selectedAccount, setSelectedAccount] = useState('');
  const [accountData, setAccountData] = useState(null);
  const [accountData1, setAccountData1] = useState(null);

  
  useEffect(() => {
    fetch('http://localhost:8080/api/companies')
      .then(res => res.json())
      .then(setCompanies);
  }, []);

  
  useEffect(() => {
    if (selectedCompany) {
      fetch(`http://localhost:8080/api/accounts?companyId=${selectedCompany}`)
        .then(res => res.json())
        .then(setAccounts);
      setSelectedAccount('');
      setAccountData(null);
      setAccountData1(null);
    }
  }, [selectedCompany]);

 
  useEffect(() => {
    if (selectedAccount) {
      fetch(`http://localhost:8080/api/account-data?accountId=${selectedAccount}`)
        .then(res => res.json())
        .then(setAccountData);
      fetch(`http://localhost:8080/api/account-data1?accountId=${selectedAccount}`)
        .then(res => res.json())
        .then(setAccountData1);
    }
  }, [selectedAccount]);

 
  const activeData = accountData || accountData1;

  return (
    <div className="main-content">
      
      <div className="dropdown-row">
        <select onChange={e => setSelectedCompany(e.target.value)} value={selectedCompany}>
          <option value="">Select Company</option>
          {companies.map(c => (
            <option key={c.id} value={c.id}>{c.name}</option>
          ))}
        </select>
        <select
          onChange={e => setSelectedAccount(e.target.value)}
          value={selectedAccount}
          disabled={!selectedCompany}
        >
          <option value="">Select Account</option>
          {accounts.map(a => (
            <option key={a.id} value={a.id}>{a.name}</option>
          ))}
        </select>
      </div>

      {activeData && (
        <div className="balance-card">
          {/* If your SVG is in public folder */}
          <img src="/Account-Balance-logo.svg" alt=""  />
          <div className="balance">
            <div>Available Balance</div>
            <div className="balance-amt">₹ {activeData.balance.toLocaleString()}</div>
          </div>
        </div>
      )}

      {/* {activeData && (
        <div className="new-card">
          <div>Latest loads are displayed here</div>
        </div>
      )} */}

      {activeData && <AccountDataTable transactions={activeData.transactions} />}
    </div>
  );
}
