package dev.arias.huapaya.ms_sale.service.interfaces;

import java.util.List;
import java.util.Optional;

import dev.arias.huapaya.ms_sale.persistence.entity.SaleEntity;

public interface SaleService {

    public SaleEntity save(SaleEntity entity);

    public Optional<SaleEntity> findById(Long id);

    public List<SaleEntity> findAll();
    
}
