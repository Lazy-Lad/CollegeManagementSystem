package io.CollegeManagementSystem.springbootstarter.controller;

import io.CollegeManagementSystem.springbootstarter.model.PushNotificationRequest;
import io.CollegeManagementSystem.springbootstarter.model.PushNotificationResponse;
import io.CollegeManagementSystem.springbootstarter.service.FCMService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class FCMController {

    private FCMService pushNotificationService;
    public FCMController(FCMService pushNotificationService) {
        this.pushNotificationService = pushNotificationService;
    }


    @PostMapping("/notification/token")
    public ResponseEntity sendTokenNotification(@RequestBody PushNotificationRequest request) throws ExecutionException, InterruptedException {
        pushNotificationService.sendNotificationWithToken(request);
        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
    }

    @PostMapping("/notification/topic")
    public ResponseEntity sendNotification(@RequestBody PushNotificationRequest request) throws ExecutionException, InterruptedException {
        pushNotificationService.sendMessageWithTopic(request);
        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
    }
}
