
# Microservice

## Etapas

Gerar pacote do Microservice.

```
./mvnw clean package
```

Executar pacote java localmente.

```
java -jar target/microservice-1.0.0.jar
```

Gerar imagem Docker.

```
./mvnw spring-boot:build-image -Dmodule.image.name=microservice:1.0.0
```

Executar imagem Docker.

```
docker run --rm -p 8080:8080 microservice:1.0.0
```

## Links

- https://start.spring.io/
