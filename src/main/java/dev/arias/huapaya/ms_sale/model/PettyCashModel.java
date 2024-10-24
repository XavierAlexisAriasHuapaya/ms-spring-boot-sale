package dev.arias.huapaya.ms_sale.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PettyCashModel {

    private Long id;

    private BankBoxModel bankBox;

    private String openingObservation;

    private String closingObservation;

    private LocalDate openingDate;

    private LocalDate closingDate;

    private BigDecimal openingAmount;

    private BigDecimal cashClosing;

    private BigDecimal otherClosing;

    private Boolean openPettyCash;

    private BigDecimal exchangeRate;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private Boolean status;

}
