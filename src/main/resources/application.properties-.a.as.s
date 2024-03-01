spring.output.ansi.enabled = ALWAYS

#Database config
#Conex�o com a base dados
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#Depois da conex�o feita, ele criar� a base de dados nguenany caso n�o exista
spring.datasource.url=jdbc:mysql://localhost:3306/nguenany?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
#Tudo que for alterado a n�vel de cogido, ser� rapidamente actualizado na base de dados
spring.jpa.hibernate.ddl-auto=update
#mostrar tudo que est� acontecendo a n�vel da base de dados pelo prompt
spring.jpa.show-sql=true
