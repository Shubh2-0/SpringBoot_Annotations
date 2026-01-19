<div align="center">

# 🏷️ Spring Boot Annotations

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/SpringBoot_Annotations?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/SpringBoot_Annotations/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/SpringBoot_Annotations?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/SpringBoot_Annotations/network/members)

### Essential Spring Boot Annotations

*Quick reference for REST, DI, and data annotations*

</div>

---

## 🎯 About

Concise showcase of **essential Spring Boot annotations**. Configure REST endpoints, dependency injection, and data handling effectively.

## 📚 Key Annotations

| Category | Annotations |
|----------|-------------|
| **Core** | @SpringBootApplication, @Component, @Bean |
| **REST** | @RestController, @GetMapping, @PostMapping |
| **DI** | @Autowired, @Qualifier, @Value |
| **Data** | @Entity, @Repository, @Transactional |
| **Config** | @Configuration, @PropertySource |

## 💻 Examples

```java
@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/users")
    public List<User> getAll() {
        return userService.findAll();
    }
    
    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return userService.save(user);
    }
}
```

## 🛠️ Technologies

Spring Boot | REST API | JPA | Maven

## 📬 Contact

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)

---

**Keywords:** Spring-Boot Annotations REST-API Autowired Component Controller Repository

