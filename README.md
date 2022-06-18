![shipsadmin by @phricardorj](https://i.imgur.com/RXTBxum.png "shipsadmin")

🚢 API for ship administration and logistics in Java

![Version](https://img.shields.io/badge/Version-1.0-green "Version")
![Stars](https://img.shields.io/github/stars/phricardorj/shipsadmin?style=social "Stars")
![Contributors](https://img.shields.io/github/contributors/phricardorj/shipsadmin?color=#00fd13 "Contributors")

## ⚙️ Technologies

- [Java](https://www.java.com/)
- [Micronaut](https://micronaut.io/)
- [Gradle](https://gradle.org/)
- [Lombok](https://projectlombok.org/)

## 🗺️ API Documentation

### Customer

1. (POST) `/api/client` - CREATE / Register a new Customer
```json
{  
  "name": "Pedro Ricardo",
  "document": "12329278383",
  "country": "Brazil"
}
```

### Container

1. (GET) `/container` - GET Container by {containerId}
2. (POST) `/container` - CREATE / Register a new Container
```json
{  
    "identifier": "60410725BR",
    "category": "Import",
    "from": "Brazil",
    "to": "China"
}
```
3. (PUT) `/container` - EDIT specific container by its {containerId}
4. (DELETE) `/container` - DELETE specific container by its {containerId}
