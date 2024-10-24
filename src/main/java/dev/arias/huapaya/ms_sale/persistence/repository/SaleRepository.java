package dev.arias.huapaya.ms_sale.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.arias.huapaya.ms_sale.persistence.entity.SaleEntity;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Long> {

}
