import React from 'react';

export default function AccountDataTable({ transactions }) {
  return (
    <div className="transactions-table-wrapper">
      <table className="transactions-table">
        <thead>
          <tr>
            <th>Date</th>
            <th>Credit</th>
            <th>A/c Balance</th>
            <th>UTR/RRN</th>
            <th>A/c No /UPI</th>
          </tr>
        </thead>
        <tbody>
          {transactions.map((tx, idx) => (
            <tr key={idx}>
              <td>{tx.date}</td>
              <td className='credit'>₹ {tx.credit.toLocaleString()}</td>
              <td>₹ {tx.acBalance.toLocaleString()}</td>
              <td>{tx.utr}</td>
              <td>{tx.upi}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}
