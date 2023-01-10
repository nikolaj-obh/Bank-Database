package dk.nikolaj.bankdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EnableNeo4jRepositories(basePackages = "dk.nikolaj.bankdatabase.datasource.neo4j.repositories")
@EnableMongoRepositories(basePackages = "dk.nikolaj.bankdatabase.datasource.mongodb.repositories")
@SpringBootApplication
public class BankDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankDatabaseApplication.class, args);
    }
}
