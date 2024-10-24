package dev.arias.huapaya.ms_sale.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MasterDetailModel {

    private Long id;

    private String description;

    private String value;

    private Boolean status;

}
