package dev.arias.huapaya.ms_sale.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankBoxModel {

    private Long id;

    private StoreModel store;

    private String name;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private Boolean status;

}
