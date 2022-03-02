# SIMPLE BANKING WEB APP USING SPRINGBOOT-PROJECT ( only implemented the APIs )
 a simple web application that allows uesrs to create accuond and transfer money among users and stores all the information in persitance database SQL so that we can look 
 over transaction afterwards.
 
##implemented API list:

#		USER API


get all the user : [ GET ] http://localhost:8080/user 

add new uesr     : [ POST ] http://localhost:8080/user

delete all user  : [ DELETE ] http://localhost:8080/user

find the user    : [ GET ] http://localhost:8080/user/{id}

delete the user  : [ DELETE ] http://localhost:8080/user/{id}

update the user  : [ PUT ] http://localhost:8080/user  
{ body is requested here }




#	TRANSACTION API


get all the Transaction          : [ GET ] http://localhost:8080/transaction

delete all the transaction       : [ DELETE ] http://localhost:8080/transaction

find the particular transaction  : [ GET ] http://localhost:8080/transaction/{id}

find all the transaction of USER : [ GET ] http://localhost:8080/{id}/transaction

transfer money from acc          : [ POST ] http://localhost:8080/transaction

{
   TRANSFER OBJECT IS REQUIRED 
}
 
