# SpringBoot-Debezium-Kafka

> This is Spring Boot, Debezium, Kafka, Postgresql>

<img src="https://github.com/ElifRana/SpringBoot-Debezium-Kafka/blob/master/debezium_kafka.png"/>
     
## Prerequisites

* Debezium
* PostgreSql

## Installation

```sh
docker-compose up -d
.\connectionCommand.sh
```
Ve proje çalıştırılır.

## Used Technologies

* Spring Boot 2.6.2
* Spring Boot Jpa
* PostgreSql
* Lombok
* Kafka
* OpenApi

http://localhost:9000/
adresine gidilir ve cdc ismindeki yere girilir.

<img src="https://github.com/ElifRana/SpringBoot-Debezium-Kafka/blob/master/Kafdrop.png"/> 

http://localhost:5050/login?next=%2F
 
Bu adrese gidilerek giriş yapılır ve database bağlanır.

<img src="https://github.com/ElifRana/SpringBoot-Debezium-Kafka/blob/master/db.png"/>

Swagger'dan bir istek alınır ve kafdrop'tan takip edip edemediğimize bakılır. 

<img src="https://github.com/ElifRana/SpringBoot-Debezium-Kafka/blob/master/kafdropTest.png"/>

Eğer ki güncelleme işlemi yağtığımızda önceki değerini null görmek isteiyorsak pgAdmin de bir QueryTool oluşturup ilgili komutu giriyoruz.

<img src="https://github.com/ElifRana/SpringBoot-Debezium-Kafka/blob/master/pgadmin.png"/>

