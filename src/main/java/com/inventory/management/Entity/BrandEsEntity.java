package com.inventory.management.Entity;

import com.inventory.management.Enum.BrandTypeEnum;
import com.inventory.management.Helper.Indices;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(indexName = Indices.BRAND_INDEX)
@Setting(settingPath = "static/es-settings.json")
public class BrandEsEntity {

    @Id
    @Field(type = FieldType.Keyword)
    private String id;
    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Auto)
    private BrandTypeEnum type;

}
