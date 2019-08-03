import React, { Component } from 'react'
import './App.css';

class App extends Component {

    constructor(props) {
        super(props)
        this.state = {
            message: null,
            firstN: "",
            lastN: ""
        };
        this.handleSubmit = this.handleSubmit.bind(this)
        this.handleFirstName = this.handleFirstName.bind(this)
        this.handleLastName = this.handleLastName.bind(this)
    }

//FUNCTIONS
    //get response from the back end
    componentDidMount() {
        // Make a GET-request to our backend
        fetch('/api/test')
        // Map the result to a JSON-object
            .then(response => response.json())
            // Put the message in the state
            .then(response => {
                this.setState({ message: response.message })
            })
    }

//event handlers
    handleFirstName(e) {
        this.setState({firstN: e.target.value})
    }

    handleLastName(e) {
        this.setState({lastN: e.target.value})
    }

    handleSubmit(e) {
        e.preventDefault()
        //alert("This name was submitted: " + this.state.firstN + ' ' + this.state.lastN)
        console.log("User Full Name: " + this.state.firstN + ' ' + this.state.lastN)
    }



//RENDERING
    render() {
        return (
            <div className="App">
                <p>Message from backend: {this.state.message}</p>
                <form onSubmit={this.handleSubmit} >
                    Enter First Name:<br/>
                    <input id ="FirstName" type="text" onChange={this.handleFirstName}/><br/>
                    Enter Last Name:<br/>
                    <input id="LastName" type="text" onChange={this.handleLastName}/><br/>
                    <button type="submit">Submit</button>
                </form>
            </div>
        )
    }
}


export default App;
