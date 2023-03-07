package com.inventory.management.Config;

import com.mongodb.ClientSessionOptions;
import com.mongodb.client.*;
import com.mongodb.connection.ClusterDescription;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@Configuration
@EnableMongoRepositories(basePackages = "com.inventory.management")
public class MongoDbConfig {
    public @Bean MongoClient mongo() throws Exception {
        return new MongoClient() {
            @Override
            public MongoDatabase getDatabase(String databaseName) {
                return null;
            }

            @Override
            public ClientSession startSession() {
                return null;
            }

            @Override
            public ClientSession startSession(ClientSessionOptions options) {
                return null;
            }

            @Override
            public void close() {

            }

            @Override
            public MongoIterable<String> listDatabaseNames() {
                return null;
            }

            @Override
            public MongoIterable<String> listDatabaseNames(ClientSession clientSession) {
                return null;
            }

            @Override
            public ListDatabasesIterable<Document> listDatabases() {
                return null;
            }

            @Override
            public ListDatabasesIterable<Document> listDatabases(ClientSession clientSession) {
                return null;
            }

            @Override
            public <TResult> ListDatabasesIterable<TResult> listDatabases(Class<TResult> tResultClass) {
                return null;
            }

            @Override
            public <TResult> ListDatabasesIterable<TResult> listDatabases(ClientSession clientSession, Class<TResult> tResultClass) {
                return null;
            }

            @Override
            public ChangeStreamIterable<Document> watch() {
                return null;
            }

            @Override
            public <TResult> ChangeStreamIterable<TResult> watch(Class<TResult> tResultClass) {
                return null;
            }

            @Override
            public ChangeStreamIterable<Document> watch(List<? extends Bson> pipeline) {
                return null;
            }

            @Override
            public <TResult> ChangeStreamIterable<TResult> watch(List<? extends Bson> pipeline, Class<TResult> tResultClass) {
                return null;
            }

            @Override
            public ChangeStreamIterable<Document> watch(ClientSession clientSession) {
                return null;
            }

            @Override
            public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, Class<TResult> tResultClass) {
                return null;
            }

            @Override
            public ChangeStreamIterable<Document> watch(ClientSession clientSession, List<? extends Bson> pipeline) {
                return null;
            }

            @Override
            public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, List<? extends Bson> pipeline, Class<TResult> tResultClass) {
                return null;
            }

            @Override
            public ClusterDescription getClusterDescription() {
                return null;
            }
        };
    }

    public @Bean MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "mydatabase");
    }
}
