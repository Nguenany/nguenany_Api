spring.output.ansi.enabled = ALWAYS

#Database config
#Conexão com a base dados
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#Depois da conexão feita, ele criará a base de dados nguenany caso não exista
spring.datasource.url=jdbc:mysql://localhost:3306/nguenany?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
#Tudo que for alterado a nível de cogido, será rapidamente actualizado na base de dados
spring.jpa.hibernate.ddl-auto=update
#mostrar tudo que está acontecendo a nível da base de dados pelo prompt
spring.jpa.show-sql=true
