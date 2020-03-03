package com.rohit.stockTracker.StockTracker;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.rohit.stockTracker"})

public class StockTrakerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StockTrakerApplication.class, args);
	}
	public MongoClient getMongodbClient(){
		return new MongoClient("localhost", 27017);
	}
	@Override
	public void run(String... args) throws Exception {
		MongoClient mongoClient = getMongodbClient();
		final MongoDatabase mongoClientDatabase = mongoClient.getDatabase("mydb");
		final MongoCollection <Document> collection = mongoClientDatabase.getCollection("mycol");
		final long countDocuments = collection.countDocuments();
		System.out.println("countDocuments:: "+countDocuments);

	}
}
