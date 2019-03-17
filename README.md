# shopping-cart-pusher

This web application shows you how to program a simple shopping cart in React with a Java backend, using Pusher to add realtime features. Follow the tutorial [here](https://pusher.com/tutorials/shopping-cart-java-react/).

The stack:

- Java 8
- Maven as the build manager
- Spring Boot with Spring MVC as the server-side framework
- React in the front-end

## Getting Started
1. Clone this repository and `cd` into it.

2. Replace the credentials in **com.pusher.constants.PusherConstants.java** with your own constants.

3. In index.html set the constants in lines **39,40,41 to be your own**.

4. Start the application with one of the following commands (if you're using an IDE like Eclipse, just run the class `com.pusher.ShoppingCartApplication`):

    ```
    mvn spring-boot:run
    ```
    
    Or
    
    ```
    mvn package -DskipTests
    java -jar target/shopping-cart-0.0.1-SNAPSHOT.jar 
    ```
    
5. Go to `http://localhost:8080` and start playing with the app

### Prerequisites

- [A Pusher account](https://pusher.com/)
- [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven](https://maven.apache.org/download.cgi)

## Built With

* [Pusher](https://pusher.com/) - APIs to enable devs building realtime features
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring Boot](https://projects.spring.io/spring-boot/) - To create the Spring application

## Acknowledgments

* Thanks to [Pusher](https://pusher.com/) for sponsoring this tutorial.

# License
MIT
