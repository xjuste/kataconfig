package com.toutjuste.kataconfig;

import com.toutjuste.kataconfig.model.KataConfigResponse;
import com.toutjuste.kataconfig.service.KataConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KataConfigController {
    private KataConfigService kataConfigService;

    @Autowired
    public KataConfigController(KataConfigService kataConfigService) {
        this.kataConfigService = kataConfigService;
    }

    @GetMapping(value = "/api/endpoint1")
    @ResponseBody
    public ResponseEntity getData() {
        List<KataConfigResponse> response = kataConfigService.getData();
        if (!response.isEmpty()) {
            return ResponseEntity.ok().body(response);
        }
        return ResponseEntity.badRequest().build();
    }

}
