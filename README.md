# exploring-spring-mvc

This project is merely experimental. Its intention is to explore the capabilities of Spring MVC.

## Things that I explored

- Project Structure
- Data sharing between controllers and views
- `@RequestMapping` annotation
- `ModelAndView` object
- `if` Thymeleaf directive
- `each` Thymeleaf directive
- `@ModelAttribute` annotation
- `@RequestParam` annotation
- `@PathVariable` annotation
- Adding static content to the project
- `@Value`, `@Configuration`, `@PropertySources` and `@PropertySource` annotation
- redirect and forward

## Deploy

```cmd
cd spring-boot-web
./mvnw.cmd package
java -jar ./target/spring-boot-web-0.0.1-SNAPSHOT.jar
```
