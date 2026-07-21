# Exercise 9 — Spring Boot Library Management

## Run
```bash
mvn spring-boot:run
```

## Test endpoints (once running on port 8080)
```bash
# Get all books
curl http://localhost:8080/api/books

# Add a book
curl -X POST http://localhost:8080/api/books \
  -H "Content-Type: application/json" \
  -d '{"title":"Effective Java","author":"Joshua Bloch"}'

# Get a book by id
curl http://localhost:8080/api/books/1

# Update a book
curl -X PUT http://localhost:8080/api/books/1 \
  -H "Content-Type: application/json" \
  -d '{"title":"Effective Java 3rd Ed","author":"Joshua Bloch"}'

# Delete a book
curl -X DELETE http://localhost:8080/api/books/1
```

H2 console: http://localhost:8080/h2-console (JDBC URL: `jdbc:h2:mem:librarydb`)
