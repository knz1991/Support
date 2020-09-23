
vous trouvez 2 folders :
 le premiér pour les algo 
 et le deuxiéme pour le mini projet .

vous trouvez la base (.sql) dans le folder ressources .
j'ai travaillé avec le mode (createDatabaseIfNotExist) et avec (@Entity) => il suffit de lancer le springboot projet , le modele sera créé . 
mais vous pouvez le faire a partir le script (.sql) 

PS : j'ai travaillé avec xampp , ma chaine de connexion sur application.properties est comme la suite :

/****
server.port = 8082
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/workflow?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=
******/

dans le folder image vous trouvez qq capture pour la manipulation de mini projet sur l'interface web .
