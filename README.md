# gestion-pedidos-clientes


Pasos:

Descargar el proyecto y tener en cuenta estos puntos:
Project: Maven
Language: Java
Java version: 21
 
Abre una terminal en la carpeta del proyecto y ejecuta:
 
mvn clean install
Luego, levanta el servidor con:
 
mvn spring-boot:run
Si todo va bien, deberías ver:
Tomcat started on port(s): 8080
Su url local para probar desde Postman:
http://localhost:8080
🔸 Endpoint:
POST /api/pedidos

🔸 Headers:
 
Content-Type: application/json
🔸 Body:
 
{
  "cliente": {
    "nombre": "Mario xxxx",
    "email": "mario@xxxx.com"
  },
  "productos": [
    { "nombre": "teclado", "cantidad": 1, "precioUnitario": 300.00 },
    { "nombre": "Cables UTP", "cantidad": 2, "precioUnitario": 15.50 }
  ]
}
🔸 Respuesta esperada:
 
{
  "nombreCliente": "Lucía xxxx",
  "emailCliente": "mario@xxxx.com",
  "total": 331.0,
  "fechaCreacion": "2025-07-10T17:20:00.000"
}
