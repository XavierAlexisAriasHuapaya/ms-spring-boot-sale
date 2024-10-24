package dev.arias.huapaya.ms_sale.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sales_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDetailEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotNull(message = "The product cannot be null")
    // @JoinColumn(name = "productId")
    // @ManyToOne
    @Column(name = "productId")
    private Long product;

    // @NotNull(message = "The type of affectation cannot be null")
    // @JoinColumn(name = "typeAffectationId")
    // @ManyToOne
    @Column(name = "typeAffectationId")
    private Long typeAffectation;

    @NotNull(message = "The quantity cannot be null")
    @Min(value = 1, message = "The quantity must be greater than 1")
    private Long quantity;

    @NotNull(message = "The sale price cannot be null")
    @Min(value = 0, message = "The sale price must be greatear than 0")
    @Digits(integer = 10, fraction = 2, message = "The sale price should have up to 10 digits and 2 decimals")
    private BigDecimal salePrice;

    @NotNull(message = "The discount cannot be null")
    @Min(value = 0, message = "The discount must be greatear than 0")
    @Digits(integer = 10, fraction = 2, message = "The discount should have up to 10 digits and 2 decimals")
    private BigDecimal discount;

    @NotNull(message = "The total amount cannot be null")
    @Min(value = 0, message = "The total amount must be greatear than 0")
    @Digits(integer = 10, fraction = 2, message = "The total amount should have up to 10 digits and 2 decimals")
    private BigDecimal totalAmount;

    @NotNull(message = "The procentage discount cannot be null")
    private Boolean procentageDiscount;

}
