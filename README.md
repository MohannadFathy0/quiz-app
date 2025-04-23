# 🧠 Quiz-Generator API

A microservice-based Spring Boot API designed to generate quizzes dynamically from a pool of categorized questions. Ideal for educational apps, learning platforms, and gamified assessments.

---

## 🚀 Features

- 📝 **Dynamic Quiz Generation** – Create quizzes with questions pulled from different categories or difficulty levels.
- 🗂️ **Category-Based Question Management** – Easily organize and fetch questions by topic or type.
- ⚙️ **Microservices Architecture** – Built to scale and integrate with other services (like authentication or scoring).
- 🌐 **RESTful Endpoints** – Clean and standardized API design for easy integration.

---

## 🧰 Tech Stack

- **Framework**: Java, Spring Boot
- **Database**: Postgres
- **Architecture**: Microservices (Question Service, Quiz Service)
- **API**: REST
- **Build Tool**: Maven

---

## 📦 How to Run

cd question-service
./mvnw spring-boot:run

cd ../quiz-service
./mvnw spring-boot:run
