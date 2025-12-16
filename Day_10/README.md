# Day 10 – Optional & Method References (Java 8)

This day focuses on two important Java 8 features that help write clean,
null-safe, and readable code.

---

## 🔹 Optional in Java

`Optional` is a container object used to avoid `NullPointerException`.

### Why Optional?
- Avoids null checks
- Improves code readability
- Makes APIs safer

### Common Methods
- `isPresent()`
- `get()`
- `orElse()`
- `ifPresent()`

### Example
```java
Optional<String> opt = Optional.ofNullable(value);
opt.ifPresent(v -> System.out.println(v));
