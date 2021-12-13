import React from "react";
import Student from "./student";

function Home() {
  return (
    <div className="homeStyle">
      <div className="homeTableStyle">
        <Student name="Pragya" marks="91" mobile="+91 123452340" />
        <Student name="Shivji" marks="92" mobile="+91 1234567890" />
        <Student name="Radhe" marks="92" mobile="+91 654789123" />
      </div>
      <div className="homeFormStyle">
          <div style={{border:'1px solid blue', minHeight:'700px'}}>
            <h1>Name: <input type="text"/></h1>
            <h2>Email</h2>
            <h3>Enrollment Number</h3>
            <h3>Mobile:<input type="text"/></h3>
            <h4>Marks:<input type="text"/></h4>
            <h1>Name: <input type="text"/></h1>
            <h2>Email</h2>
            <h3>Enrollment Number</h3>
            <h3>Mobile:<input type="text"/></h3>
            <h4>Marks:<input type="text"/></h4>
        </div>
        <div style={{minHeight:'100px', margin:'10px'}}>
            <input style={{margin:'5px', padding:'3px',fontSize:'25px', backgroundColor:'red', borderRadius:'8px'}} type="submit" value="Reset"/>
            <input style={{margin:'5px', padding:'3px',fontSize:'25px', backgroundColor:'green', borderRadius:'8px'}} type="submit" value="Save"/>
        </div>
      </div>
    </div>
  );
}

export default Home;
