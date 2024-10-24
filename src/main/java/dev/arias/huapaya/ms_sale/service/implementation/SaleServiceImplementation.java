package dev.arias.huapaya.ms_sale.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.arias.huapaya.ms_sale.persistence.entity.SaleEntity;
import dev.arias.huapaya.ms_sale.persistence.repository.SaleRepository;
import dev.arias.huapaya.ms_sale.service.interfaces.SaleService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SaleServiceImplementation implements SaleService {

    private final SaleRepository saleRepository;

    @Override
    public SaleEntity save(SaleEntity entity) {
        return this.saleRepository.save(entity);
    }

    @Override
    public Optional<SaleEntity> findById(Long id) {
        return this.saleRepository.findById(id);
    }

    @Override
    public List<SaleEntity> findAll() {
        return this.saleRepository.findAll();
    }

}
