package dk.nikolaj.webbanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EnableNeo4jRepositories(basePackages = "dk.nikolaj.webbanking.datasource.neo4j.repositories")
@EnableMongoRepositories(basePackages = "dk.nikolaj.webbanking.datasource.mongodb.repositories")
@SpringBootApplication
public class WebBankingApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebBankingApplication.class, args);
    }
}
