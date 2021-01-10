# XIB ASSESSMENT

#### Clone the code from github

git clone https://github.com/MbuyiNdlovu/xibassessment.git

### Locate the code on your local and navigate into xibassessment with cd ... command

### Access your terminal, log into mysql database system and create database "xibassessment"

mysql -u root -pmbuyi (password should correspond with application.properties password) or vice versa
create database xibassessment

### Get Maven Dependencies and Run The Project - The application will automatically create tables on its own using (spring.jpa.hibernate.ddl-auto=update
) as specified on application.properties file and as per models in package com.xib.xibassessment.model

mvn clean install

mvn spring-boot:run

hit "http://localhost:8080/com/xib/xibassessment/" to see if the backend is up 

### Use Postman/SoapUI to post to the backend, for createteam and createagent


### Create Team

Method: POST

Endpoint: http://localhost:8080

Resource: /com/xib/xibassessment/operations/createteam/

Request: {"teamname":"team xib", "agentid":1,"managerid": 1 }

Headers:
 Accept: application/json
 Content-Type: application/json
 Access-Control-Allow-Origin: *


### Create Agent

Method: POST

Endpoint: http://localhost:8080

Resource: /com/xib/xibassessment/operations/createagent/

Request: {"agentname":"xib agent name", "agentsurname":"xib agent surname", "managerid": 1, "teamid":1}

Headers:
 Accept: application/json
 Content-Type: application/json
 Access-Control-Allow-Origin: *
 
### Get Teams
http://localhost:8080/com/xib/xibassessment/operations/teams

### Get Team
http://localhost:8080/com/xib/xibassessment/operations/team/1

### Get Agents
http://localhost:8080/com/xib/xibassessment/operations/agents

### Get Agent
http://localhost:8080/com/xib/xibassessment/operations/agent/1

### Create Manager

Method: POST

Endpoint: http://localhost:8080

Resource: /com/xib/xibassessment/operations/createmanager/

Request: {"managername":"xib manager name", "managersurname":"xib manager surname"}

Headers:
 Accept: application/json
 Content-Type: application/json
 Access-Control-Allow-Origin: *
 
 ### EmptyTeams
 
 http://localhost:8080/com/xib/xibassessment/operations/getemptyteams