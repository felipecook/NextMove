# NEXTMOVE

## Purpose

This applications provides a convenient method for users to practice the two mathematical problems: the Knights Tour and the N-Queens problem.

## Current State

This application is still in the Alpha phase of testing and is not currently playable by users. 
* It is not able to play the current two game modes but it does display the boards.
* It allows users to login using their google accounts to verify.
* It gives a description of both games and their intended use.

### What will your app be called?

This application will be called Next Move.

### Why did you choose to develop this particular app, and why is this (at least potentially) a useful or interesting app?

This app was developed because of my love for mathematics and chess. I wanted to develop an application that would use both of these elements in it, and would also be enjoyable to try out for someone else who may have similar interests. This app will be interesting to users who enjoy playing chess or who enjoy having a math challenge and who have not played my game before. 

### Required Android API version, and Emulator Used:

I have set the required API level to be at 21, which enables features that allowed the development of the application to be streamlined. I used the Android Nexus 5X API 24 as the emulator. I am unaware at the current moment of any other hardware/software restrictions. 

### External Services Used:

The external services currently implemented by my application are Google_Sign_In. 

For more details on current classes and methods, see [Javadoc](docs/api/). 

### Numbered List for Application Improvements:

1. Finishing the GUI for both the Knights Tale and N-Queens problem.
2. Allowing the user's profile to be saved into the nav drawer and displayed (photo, etc.)
3. Creating a more complete high_score view

### Functional Stretch Goals:

1. Updating the number of games that are available on this application would improve user experience and also increase the amount of time that a user might spend on an application. 
2. Allowing users to share information between friends, for example, if you are a user with 


### What's the current state of the app?

This application is currently buildable and functional but it is missing its main two features which are the two game modes, Knights Tour and the N-Queens Problem. The application does have a working login page which utilizes Google Sign-In.

### What's the basic functionality of the app?

This application will be made up of three different chess problems. The user will attempt to complete each problem, upon successful completion of a problem the user will receive a high score. Upon subsequent completions the user will be able to see what their previous high score was and if they beat it. The basic high score will be based on the time the user takes to complete the selected problem. The user will also have the ability to customize the high score so that instead of just being based on time of completion, it will also be based, in regards to the Knight's Tour on the number of moves they were able to make with the Knight, or in the case of the nQueens problem how many queens they were able to place on the chess board. 


## Design Documentation 

### Who would find this app useful or fun, and when would they use it?

**User Story 1**
Avid chess player:: This player is looking to use my application in order to challenge their mathematical reasoning. There will be three different problems on the application using a chess board and certain variations of chess pieces. 
The Avid Chess Player will open the application, enter their personal information (name) which will enable them to see previous high scores (a score based on the time they used to solve the problem). This high score count will enable the Avid Chess Player to continually see improvement in the game. 
Upon completion of the game, the Avid Chess Player will hopefully continue finding additional mathematical chess problems to solve outside of this application. 

**User Story 2**
The n00b:: The n00b player is unsure of the complexities of chess, this app will enable this users to see different scenarios to better their chess game. While this may not directly improve their ability to play chess, it will improve their ability to logically think about the different pieces and their functions. 

The story in terms of interaction with the application is similar to the story of the Avid Chess Player in terms of how the n00b will open the application and enter their personal identifying information (name) and then begin playing whichever of the three challenges they would like to start. 

For the n00b the high score feature (which tells the customer how fast they solved the problem) will be essential to them bettering their understanding of the game because a faster time means they better recognize the functions of certain chess pieces. 

### Data Model

[WireFrame](docs/WireFrame_Next_Move.pdf)

[DDL](docs/ddl.md)



### Could this app be useful on its own, with no connection to the internet?

Absolutely, in fact, this application, in it's current stage, does not require an internet connection. 

### What sort of data would this app use or share if it had a connection to the internet?

High score information would be the information shared if it did have connection. You would be able to connect to other friends and see what their high scores are in comparison to yours. 

## License
Copyright 2019 Felipe Cook & Deep Dive Coding

Licensed under the Apache License, Version 2.0 (the “License”); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an “AS IS” BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.


## Building the App

Clone the Git Repository located at: 

https://github.com/felipecook/NextMove

Import the Project into IntelliJ and Run!


### If this app will consume external data, investigate and list possible internet-based sources for this data.
