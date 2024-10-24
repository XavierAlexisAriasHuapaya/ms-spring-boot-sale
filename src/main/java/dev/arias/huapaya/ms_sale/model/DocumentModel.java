package dev.arias.huapaya.ms_sale.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentModel {

    private Long id;

    private String name;

    private String abbreviation;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private Boolean status;

}
