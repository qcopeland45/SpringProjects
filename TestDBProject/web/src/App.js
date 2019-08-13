import React, { Component } from 'react'
import './App.css';

class App extends Component {

    constructor(props) {
        super(props)
        this.state = {
            message: "",
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
        // Make a GET-request to our backend and map result to json object
        fetch('/api/test')
            .then(response => response.json())
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
