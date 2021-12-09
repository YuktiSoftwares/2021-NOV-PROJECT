import React from 'react';
import Student from './student';

function Home() {
    return (
        <div className="homeStyle">
            <p>This is home section</p>
            <h2>Welcome</h2>
            <Student name="Pragya" marks="91" mobile="+91 123452340"/> 
            <Student name ="Shivji" marks="92" mobile="+91 1234567890"/>
        </div>
    )
}

export default Home
