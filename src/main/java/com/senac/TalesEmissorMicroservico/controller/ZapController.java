package com.senac.TalesEmissorMicroservico.controller;

import com.senac.TalesEmissorMicroservico.entities.MensagemZap;
import com.senac.TalesEmissorMicroservico.services.ZapService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZapController {

    ZapService zapService;

    public ZapController(ZapService zapService) {
        this.zapService = zapService;
    }
    @PostMapping(value = "zap")
    public ResponseEntity<MensagemZap> pedirZap(@RequestBody MensagemZap zap) {
        MensagemZap tempZap = zapService.pedirZap(zap);
        return ResponseEntity.ok(tempZap);
    }
}