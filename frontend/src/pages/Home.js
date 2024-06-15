import React from "react";


import { Link } from "react-router-dom";
import "../App.css"

const Home = () => {
  return (
    <div className="container text-center">
      <h1 className="mt-5 fs-1">
        <span className="text-warning">Get Hired</span> or Hire people for free!
      </h1>
      
      <div className="container mt-5">
        <div className="row pt-5">
        <div className="col-6">
          <button className="btn btn-primary text-decoration-none ">
            <Link to="/employer/dashboard" className="text-decoration-none text-light fs-4">
              Hire talent
            </Link>
            </button>
            </div>
            <div className="col-6">
            <button className="btn btn-secondary text-decoration-none ">
            <Link to="/employee/feed" className="text-decoration-none text-light fs-4">
              Get Job Now
            </Link>
            </button>
            </div>
        </div>
      </div>
    </div>
  );
};

export default Home;
