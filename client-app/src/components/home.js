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
        <Student name="Pragya" marks="91" mobile="+91 123452340" />
        <Student name="Shivji" marks="92" mobile="+91 1234567890" />
        <Student name="Radhe" marks="92" mobile="+91 654789123" />
      </div>
    </div>
  );
}

export default Home;
