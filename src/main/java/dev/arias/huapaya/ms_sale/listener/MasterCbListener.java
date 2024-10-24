package dev.arias.huapaya.ms_sale.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.arias.huapaya.ms_sale.persistence.entity.SaleEntity;
import dev.arias.huapaya.ms_sale.service.interfaces.SaleService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Component
public class MasterCbListener {

    private final SaleService masterService;

    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "consumerStream", groupId = "circuitbreaker")
    public void insertMsgEvent(String saleEvent) throws JsonMappingException, JsonProcessingException {
        var sale = this.objectMapper.readValue(saleEvent, SaleEntity.class);
        log.info("Entro Sale Kafka");
        this.masterService.save(sale);

    }


}
