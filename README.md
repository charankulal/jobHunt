# JobHunt Application

## Overview

JobHunt is a simple and comprehensive job search and recruitment application developed using Spring, React, and MongoDB. This platform allows users to either seek job opportunities or hire talent for free.

## Features

- **Job Seekers:**
  - Search for jobs
- **Employers:**
  - Post and manage job listings

## Technologies Used

- **Backend:** Spring Boot
- **Frontend:** React
- **Database:** MongoDB

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Node.js and npm
- MongoDB

### Installation

1. **Clone the repository:**

    ```sh
    git clone https://github.com/charankulal/jobhunt.git
    cd jobhunt
    ```

2. **Backend Setup:**
    - Navigate to the backend directory:

      ```sh
      cd jobhunt
      ```

    - Build the Spring Boot application:
  
      ```sh
      ./mvnw clean install
      ```

    - Run the application:
  
      ```sh
      ./mvnw spring-boot:run
      ```

3. **Frontend Setup:**
    - Navigate to the frontend directory:

      ```sh
      cd frontend
      ```

    - Install dependencies:
  
      ```sh
      npm install
      ```

    - Start the React application:
  
      ```sh
      npm start
      ```

4. **MongoDB Setup:**
    - Make sure MongoDB is running on your local machine or configure the application to connect to a remote MongoDB instance.

### Running the Application

- Open your browser and navigate to `http://localhost:3000` for the frontend.
- The backend API will be running at `http://localhost:8080`.

## Contributing

We welcome contributions to improve JobHunt! Here’s how you can help:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.

## Contact

For questions or feedback, please contact us at [charan.kulal.02@gmail.com](mailto:charan.kulal.02@gmail.com).

---

Thank you for using JobHunt! We hope you find the perfect job or candidate.
