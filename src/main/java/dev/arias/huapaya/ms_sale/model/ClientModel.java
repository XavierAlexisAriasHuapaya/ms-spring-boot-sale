package dev.arias.huapaya.ms_sale.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel {

    private Long id;

    private MasterDetailModel TypePerson;

    private String identityNumber;

    private MasterDetailModel Gender;

    private String firstName;

    private String lastName;

    private LocalDate birthOrAnniversary;

    private String address;

    private String email;

    private String occupation;

    private String observation;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private Boolean status;

}
