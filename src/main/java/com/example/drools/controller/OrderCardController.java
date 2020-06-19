package com.example.drools.controller;

import com.example.drools.model.Card;
import lombok.AllArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
@AllArgsConstructor
public class OrderCardController {
    private final KieSession session;

    @PostMapping
    public Card orderNow(@RequestBody Card request) {
        session.insert(request);
        session.fireAllRules();
        return request;
    }
}
