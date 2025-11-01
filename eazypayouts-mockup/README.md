# EazyPayouts

A modern, responsive payout management system built with React and Spring Boot. Designed for simple company, account, and transaction management—demo-ready and easy to extend!

---

## Features

- Responsive UI for desktop, tablet, and mobile
- Sidebar navigation (hidden on mobile, logo shown on mobile top bar)
- Company and account selection dropdowns
- View account balance and latest loads
- Horizontally scrollable transactions table on small screens
- Mock backend using Spring Boot REST APIs

---

## Tech Stack

- **Frontend:** React (functional components, Hooks)
- **Styling:** CSS (media queries, mobile-first)
- **Backend:** Spring Boot (Java, REST)

---

## Project Structure

eazypayouts/
├─ backend/
│ └─ src/main/java/... (Spring Boot backend)
├─ frontend/
│ ├─ src/
│ │ ├─ App.jsx
│ │ ├─ MainContent.jsx
│ │ ├─ Sidebar.jsx
│ │ ├─ MobileLogo.jsx
│ │ ├─ AccountDataTable.jsx
│ │ └─ App.css
│ └─ public/
│ └─ logo.svg


---

## Setup & Run Instructions

### Prerequisites

- **Node.js** and npm (https://nodejs.org/)
- **Java JDK 17+** (https://adoptium.net/)
- **Maven** (`mvn` command)

---

### 1. Backend Setup (Spring Boot)

1. Go to the backend directory:
    ```
    cd backend
    ```
2. Install dependencies and start the backend server:
    ```
    mvn spring-boot:run
    ```
3. The backend will start at [**http://localhost:8080**](http://localhost:8080)
    - Main API endpoints:
      - `/api/companies`
      - `/api/accounts?companyId=...`
      - `/api/account-data?accountId=...`

---

### 2. Frontend Setup (React)

1. Open a new terminal window/tab and go to the frontend directory:
    ```
    cd frontend
    ```
2. Install dependencies:
    ```
    npm install
    ```
3. Start the React development server:
    ```
    npm start
    ```
4. The frontend runs at [**http://localhost:3000**](http://localhost:3000)

---

### 3. Using the App

- Open [http://localhost:3000](http://localhost:3000) in your browser.
- Use the dropdowns to select a company and account. Account data and transactions will update dynamically.
- Try resizing your browser or open on mobile—the layout adapts responsively and shows the logo on mobile.

---

## Screenshots

_Add screenshots of desktop, tablet, and mobile layouts here if desired._

---

## Customization

- To add or edit companies and accounts, update the backend controller's mock data.
- For production or real use, connect backend to a real database and secure APIs.

---

## License

Demo/project for educational use.

---

**Enjoy using and extending EazyPayouts!**
