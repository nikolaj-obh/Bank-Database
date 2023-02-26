# WebBank
### Installation Procedure:
1. Clone the project to your computer.
2. Open the dump.sql file in MySQL Workbench from the sqldump folder.
3. Execute the dump file in MySQL Workbench. This will create the database, tables, procedures, views and seed the records with sample data.
4. The MySQL root account has been used for now. The password can be changed in the application.properties file in Spring Boot to match the password of your root account.
5. Launch the application.
6. To test the CRUD operations go to the following SwaggerUI url.
   http://localhost:8080/swagger-ui/index.html#/

Link for neo4j database gui: http://localhost:7474/browser/