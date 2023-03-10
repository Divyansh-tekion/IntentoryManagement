//package com.inventory.management.Config;
//
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.RestClients;
//import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.inventory.management.Repository")
//@ComponentScan(basePackages = "com.inventory.management")
//public class EsConfig extends AbstractElasticsearchConfiguration {
//        @Bean
//        @Override
//        public RestHighLevelClient elasticsearchClient() {
//            final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                    .connectedTo("localhost:9200")
//                    .build();
//
//            return RestClients.create(clientConfiguration)
//                    .rest();
//
//    }
//}
