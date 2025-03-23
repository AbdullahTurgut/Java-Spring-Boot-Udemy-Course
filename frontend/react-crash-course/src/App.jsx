import React from "react";
import "bootstrap/dist/css/bootstrap.min.css"
import { Product } from "./component/Product";

function App() {
  return <div className="container text-primary">
    Hello to our React Crash Course
    <Product />
  </div>;
}

export default App;
