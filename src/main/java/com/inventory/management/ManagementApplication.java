package com.inventory.management;


import com.inventory.management.Repository.BrandEsRepoImpl;
import com.inventory.management.Repository.BrandMongoRepoImpl;
import com.inventory.management.Repository.BrandRepo;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}
	@Autowired
	private MongoTemplate mongoTemplate;
//	@Autowired
//	private EsConfig esConfig;]
	@Autowired
	RestHighLevelClient restHighLevelClient;


	@Bean
	public BrandRepo createBrandRepo() {
		String brandDbType = System.getenv("brand_db_type");
		if("MONGO".equals(brandDbType)) {
			return new BrandMongoRepoImpl(mongoTemplate);
		}
		return new BrandEsRepoImpl(restHighLevelClient);
	}

	public class EsConfig extends AbstractElasticsearchConfiguration {
		@Bean
		@Override
		public RestHighLevelClient elasticsearchClient() {
			final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
					.connectedTo("localhost:9200")
					.build();

			return RestClients.create(clientConfiguration)
					.rest();

		}

}
