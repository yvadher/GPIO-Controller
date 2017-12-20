# GPIO-controller

This is optional class project for Real time embeded system.

This project gives easy access to GPIO of raspberry pi. With firebase database and this library one could control GPIO of raspbery Pi running Android things OS.  

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

- Android development
- Database Knowldge (Firebase)
- Basic electronics


### Installing

A step by step series of examples that tell you have to get a development env running

Connect Raspberry pi using adb tool. More info can be found here. [adb tool](https://developer.android.com/things/hardware/raspberrypi.html)
```
adb connect Android.local
```
Set up the firebase account on google firebase. Add android app project. Set the database as following.
<img width="252" alt="database" src="https://user-images.githubusercontent.com/20786776/34227259-66702554-e581-11e7-9bb0-e8716f536b88.PNG">
Set the rules of database as following. 
<img width="247" alt="rules" src="https://user-images.githubusercontent.com/20786776/34227082-c53494d6-e580-11e7-9d0b-40a9f5e62ea7.PNG">

Build the project.
Upload the code to raspberry pi. 

## Deployment

Clone the project, follow the google android things doc [here](https://developer.android.com/things/hardware/raspberrypi.html) to upload the project to raspberry pi.

## Built With

* [Android things](https://developer.android.com/things/hardware/index.html) - Android things
* [Maven](https://maven.apache.org/) - Dependency Management
* [Real time Firebase database](https://firebase.google.com/) - Real time database





