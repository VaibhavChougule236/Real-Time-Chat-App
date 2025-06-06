# 🗨️ Real-Time Chat Room Application

This is a real-time chat room application built using **Java**, **Spring Boot**, **WebSocket**, and **STOMP (Simple Text Oriented Messaging Protocol)**. It allows multiple users to join a public chat room and communicate with each other instantly. The application uses WebSocket for full-duplex communication and provides a responsive frontend interface to simulate live chat experience.

---

## 🚀 Features

- 🔄 Real-time bi-directional communication using WebSocket
- 📡 Message broadcasting with STOMP over WebSocket
- 👥 Multi-user public chat room
- ⏱️ Instant message delivery without page refresh
- 📱 Responsive chat UI using HTML/CSS/JavaScript

---

## 🛠️ Tech Stack
### Backend:
- Java 17+
- Spring Boot
- Spring WebSocket
- STOMP Protocol
- SockJS (fallback support)

### Frontend:
- HTML5, CSS3, JavaScript
- Bootstrap (for styling)
- SockJS client & STOMP.js

---

Open your browser and navigate to:
📍 http://localhost:5656/chat

📸 Screenshots
![image](https://github.com/user-attachments/assets/2653b71d-1163-4d90-bdb3-bde457af63f0)
![image](https://github.com/user-attachments/assets/1c12131e-ecbc-45ca-bcd1-8c81035cf7ba)


🧠 How It Works

WebSocket is configured in Spring Boot to enable real-time messaging.

STOMP is used on top of WebSocket to define a messaging protocol.

Clients subscribe to a common topic (e.g., /topic/public) to receive messages.

When a user sends a message, it's published to the topic and broadcast to all subscribers.

🔐 Optional Features You Can Add
Authentication (JWT / Spring Security)

Private chat rooms or direct messages

Message persistence with database (JPA / MongoDB)

Active user list with presence tracking

🧑‍💻 Author
Vaibhav Annaso Chougule
📧 vaibhavchougule236@gmail.com

