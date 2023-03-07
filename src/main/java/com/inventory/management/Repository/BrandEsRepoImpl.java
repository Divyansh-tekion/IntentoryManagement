package com.inventory.management.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inventory.management.Entity.BrandEntity;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.xcontent.XContentType;

import java.io.IOException;

public class BrandEsRepoImpl implements BrandRepo {
    private final RestHighLevelClient restHighLevelClient;

    public BrandEsRepoImpl(RestHighLevelClient restHighLevelClient) {
        this.restHighLevelClient = restHighLevelClient;
    }

    @Override
    public BrandEntity findById(String id) {

        GetRequest getRequest = new GetRequest();
        getRequest.id(id);
        getRequest.index("brand");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(restHighLevelClient.get(getRequest, RequestOptions.DEFAULT).getSourceAsString(), BrandEntity.class);
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public BrandEntity addBrand(BrandEntity newBrand) {
        IndexRequest request = new IndexRequest("brand");
        request.id(newBrand.getId());
        String jsonString = "{" +
                "\"name\":\"" + newBrand.getName() + "\"," +
                "\"type\":\"" + newBrand.getType() + "\"" +
                "}";
        request.source(jsonString, XContentType.JSON);
        try {
            final IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
            return response.status() == RestStatus.CREATED ? newBrand : null;
        } catch (IOException e) {
            System.out.println(e);
            throw new RuntimeException();
        }
    }

    @Override
    public void deleteById(String id) {
        DeleteRequest request = new DeleteRequest(
                "brand",
                id);
        try {
            restHighLevelClient.delete(request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
