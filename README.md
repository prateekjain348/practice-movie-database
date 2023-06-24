# curd-spring-boot-jpa-mysql

# CRUD Example of Spring-Boot-REST-JPA-MySQL (movie-management)

### Swagger Related Entries

```
  http://localhost:8080/v2/api-docs
  http://localhost:8080/swagger-ui.html
```

### 1. You can clone it from github by running following command

```
  $ git clone https://github.com/prateekjain348/practice-movie-database.git
```

### 2. Import project into eclipse

```
  File -> Import -> Maven -> Existing Maven Projects -> Browse Project from cloned location
```

### 3. Right click on project in eclipse and then Maven -> Update Projects

### 4. Import src/main/java/resources/movie.sql into MySQL database

### 5. Update database credential and other configuration into application.properties available in src/main/java/resources

```

spring.datasource.url=jdbc:mysql://localhost:3306/movie
spring.datasource.username=root
spring.datasource.password=
spring.datasource.tomcat.max-wait=20000
spring.datasource.tomcat.max-active=50
spring.datasource.tomcat.max-idle=20
spring.datasource.tomcat.min-idle=15

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect
spring.jpa.properties.hibernate.id.new_generator_mappings = false
spring.jpa.properties.hibernate.format_sql = true

logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE


```

### 6. Right click on Application.java file and run as Java Application

## Once Sprint Boot Application will be started successfully then we

can call following Endpoints by using POSTMAN

### 7. To get list of movies call following endpoint with GET Request

```
  http://localhost:8080/movieservice/movies
```

### 8.To Create New Movie use following url with POST Request

```
  http://localhost:8080/movieservice/movie
```

### set content type as in header as `application/json`

### set request body as raw with JSON payload

```
  {
    "name": "C++",
    "author": "Nitesh",
    "publication": "Rajput Publication",
    "category": "Computer Programming",
    "pages": 1500,
    "price": 240
  }

```

### 9.To get a particular movie, use following url with `GET` request type in postman

```
  http://localhost:8080/movieservice/movie/<id>
```

### 10.To update Movie in database, use following url with `PUT` request type in postman

```
	http://localhost:8080/movieservice/movie/<id>
```

### set content type as in header as `application/json`

### set request body as raw with JSON payload

```
 {
    "name": "C++",
    "author": "Nitesh",
    "publication": "Rajput Publication",
    "category": "Computer Programming",
    "pages": 1500,
    "price": 240
  }
```

### 11.To delete a particular Movie from database, use following url with `DELETE` request type in postman

```
  http://localhost:8080/movieservice/movie/<id>
```

### Note - Replace <id> with actual id 
