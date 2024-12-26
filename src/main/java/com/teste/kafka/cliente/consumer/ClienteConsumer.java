package com.teste.kafka.cliente.consumer;

import com.teste.kafka.Cliente;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClienteConsumer {

    private static final Logger log = LoggerFactory.getLogger(ClienteConsumer.class);

    @KafkaListener(topics = "testecliente",
            groupId = "group-id")
    public void consume(Cliente data){

        log.info("Cliente: {}", data.toString());

    }

}
