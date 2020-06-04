package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/greeting")
@Slf4j
public class GreetingRestController {
    private final SendMessageService sendMessageService;

    @PostMapping("/")
    public void sendToRabbitMq(@RequestParam String mymessage) {
        sendMessageService.sendSomething(mymessage);
        log.info("Message has been sent! to rabitmq " + mymessage);
    }
}
