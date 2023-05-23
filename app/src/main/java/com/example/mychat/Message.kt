package com.example.mychat

class Message {
    var message: String? = null
    var senderId: String? = null

    constructor(){

    }
    // model of the message
    constructor(message:String,senderId:String?){
        this.message = message
        this.senderId = senderId
    }
}