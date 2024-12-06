package com.senac.TalesEmissorMicroservico.services;

import com.senac.TalesEmissorMicroservico.entities.MensagemZap;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZapService {

    @Autowired
	private RabbitTemplate rabbitTemplate;

    public MensagemZap pedirZap(MensagemZap zap) {
        rabbitTemplate.convertAndSend("zap", zap);
        return zap;
    }
	
}