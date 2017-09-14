# Movie Monster

Movie Monster is a web application that allows users to store information about movies, such as: title, genre, description, movie poster (image), Rotten Tomato rating, and MetaCritic rating. The application can handle CRUD operations via both HTML and JSON.  

<kbd>
	<img src="https://github.com/ramon-luis/movie-monster/raw/master/demo/movie-monster-screenshot-1.png">
</kbd>
<br />
<br />
<kbd>
	<img src="https://github.com/ramon-luis/movie-monster/raw/master/demo/movie-monster-screenshot-2.png">
</kbd>
<br />
<br />
<kbd>
	<img src="https://github.com/ramon-luis/movie-monster/raw/master/demo/movie-monster-screenshot-3.png">
</kbd>
<br />
<br />
<kbd>
	<img src="https://github.com/ramon-luis/movie-monster/raw/master/demo/movie-monster-screenshot-4.png">
</kbd>

## What's Here  
* `src/main/java/moviemonster/services/` - CRUD operations  
* `src/main/java/moviemonster/domain/` - Movie and Genre object definitions  
* `src/main/java/moviemonster/repositories/` - interface to create CRUD repo for Movie objects  
* `src/main/java/moviemonster/controller/` - HTML controller and API controller (JSON requests)  
* `src/main/java/moviemonster/ProWebServiceApplication.java` - Main method and Run method (to populate application database with sample data)  
* `src/main/resources` - HTML and CSS files


## Getting Started / Installing / Deployment  

Compile the src directory and call Main.  The main method is located in:  
`src/main/java/moviemonster/ProWebServiceApplication.java`

```
$ javac src/main/java/moviemonster/ProWebServiceApplication.java
$ java `src/main/java/moviemonster/ProWebServiceApplication
```

## Built With  

* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)  
* [Maven](https://maven.apache.org/) - Dependency Management  
* [Spring Boot](https://projects.spring.io/spring-boot/) - Web Framework  
 
## Author  

* [**Ramon-Luis**](https://github.com/ramon-luis)  

## Acknowledgments  

* Thank you to Adam Gerber at the University of Chicago