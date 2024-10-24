package dev.arias.huapaya.ms_sale.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreModel {

    private Long id;

    private MasterDetailModel currency;

    private String name;

    private String address;

    private String phone;

    private String logo;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private Boolean status;

}
