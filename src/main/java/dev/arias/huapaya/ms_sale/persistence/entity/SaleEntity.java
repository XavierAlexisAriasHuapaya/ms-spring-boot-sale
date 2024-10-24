package dev.arias.huapaya.ms_sale.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sales")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotNull(message = "The document cannot be null")
    // @JoinColumn(name = "documentId")
    // @ManyToOne
    @Column(name = "documentId")
    private Long document;

    // @NotNull(message = "The payment condition cannot be null")
    // @JoinColumn(name = "paymentConditionId")
    // @ManyToOne
    @Column(name = "paymentConditionId")
    private Long paymentCondition;

    // @NotNull(message = "The payment status cannot be null")
    // @JoinColumn(name = "paymentStatusId")
    // @ManyToOne
    @Column(name = "paymentStatusId")
    private Long paymentStatus;

    // @NotNull(message = "The petty cash cannot be null")
    // @JoinColumn(name = "pettyCashId")
    // @ManyToOne
    @Column(name = "pettyCashId")
    private Long pettyCash;

    // @NotNull(message = "The delivery status cannot be null")
    // @JoinColumn(name = "deliveryStatusId")
    // @ManyToOne
    @Column(name = "deliveryStatusId")
    private Long deliveryStatus;

    // @NotNull(message = "The client cannot be null")
    // @JoinColumn(name = "clientId")
    // @ManyToOne
    @Column(name = "clientId")
    private Long client;

    // @NotNull(message = "The store cannot be null")
    // @JoinColumn(name = "storeId")
    // @ManyToOne
    @Column(name = "storeId")
    private Long store;

    private String serie;

    private Integer issued;

    private LocalDate operationDate;

    private LocalDate deliveryDate;

    private LocalDate expirationDate;

    private String observation;

    @NotNull(message = "Sale details cannot be null")
    @JoinColumn(name = "saleId")
    @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    private List<SaleDetailEntity> saleDetails;

    @NotNull(message = "The free amount cannot be null")
    @Min(value = 0, message = "The free amount must be greater than 0")
    @Digits(integer = 10, fraction = 2, message = "Free amount should have up to 10 digits and 2 decimals")
    private BigDecimal freeAmount;

    @NotNull(message = "The exempt amount cannot be null")
    @Min(value = 0, message = "The exempt amount must be greater than 0")
    @Digits(integer = 10, fraction = 2, message = "Exempt Amount should have up to 10 digits and 2 decimals")
    private BigDecimal exemptAmount;

    @NotNull(message = "The taxable amount cannot be null")
    @Min(value = 0, message = "The taxable amount must be greater than 0")
    @Digits(integer = 10, fraction = 2, message = "Taxable amount should have up to 10 digits and 2 decimals")
    private BigDecimal taxableAmount;

    @NotNull(message = "The tax amount cannot be null")
    @Min(value = 0, message = "The tax amount must be greater than 0")
    @Digits(integer = 10, fraction = 2, message = "Tax amount should have up to 10 digits and 2 decimals")
    private BigDecimal taxAmount;

    @NotNull(message = "The subtotal cannot be null")
    @Min(value = 0, message = "The subtotal must be greater than 0")
    @Digits(integer = 10, fraction = 2, message = "Subtotal should have up to 10 digits and 2 decimals")
    private BigDecimal subTotal;

    @NotNull(message = "The discount cannot be null")
    @Min(value = 0, message = "The discount must be greater than 0")
    @Digits(integer = 10, fraction = 2, message = "Discount should have up to 10 digits and 2 decimals")
    private BigDecimal discount;

    @NotNull(message = "The sale amount cannot be null")
    @Min(value = 0, message = "The sale amount must be greater than 0")
    @Digits(integer = 10, fraction = 2, message = "Sale amount should have up to 10 digits and 2 decimals")
    private BigDecimal saleAmount;

    @Column(updatable = false)
    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private Boolean status;

    @PrePersist
    private void prePersist() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
        this.status = true;
    }

    @PreUpdate
    private void preUpdate() {
        this.updated_at = LocalDateTime.now();
    }

}
