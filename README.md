# Interview-Portal

A Java-based web application that allows administrators to schedule and manage interviews efficiently. This project includes features like interview creation, participant selection, start/end time validation, and the ability to edit or view upcoming interviews.

🔧 Features
Create interviews by selecting participants, start time, and end time

View all upcoming interviews in a list view

Edit existing interviews with input validation

Backend implemented using Java Servlets and JDBC

MySQL database for persistent interview records

🛠️ Technologies Used
Java (Servlets, JDBC)

HTML/CSS (Frontend UI)

MySQL (Database)

Apache Tomcat (Server)

📂 Project Structure
├── Interview.java            # Model class
├── DBUtil.java               # DB connection helper
├── InterviewServlet.java     # Handles form submission
├── schema.sql                # MySQL setup
└── index.html                # Frontend interface

⚙️ Setup Instructions
Import the SQL schema using schema.sql

Update your DB credentials in DBUtil.java

Deploy using Apache Tomcat or any Java web server

Access the app via browser (e.g., http://localhost:8080/InterviewPortal/)

