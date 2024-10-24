package dev.arias.huapaya.ms_sale.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

    private Long id;

    private MasterDetailModel unitOfMeasure;

    private MasterDetailModel category;

    private MasterDetailModel model;

    private MasterDetailModel brand;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private BigDecimal purchasePrice;

    private Integer minimumStock;

    private String image;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private Boolean status;

}
