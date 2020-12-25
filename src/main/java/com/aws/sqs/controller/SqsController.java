package com.aws.sqs.controller;


import com.aws.sqs.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sqs")
public class SqsController {
    //queue name
    private static final String QUEUE = "my-queue";

    public static final Logger LOGGER = LoggerFactory.getLogger(SqsController.class);

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @PostMapping(value = "/send")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void sendMessageToSqs(@RequestBody final Message message) {
        LOGGER.info("Sending the message to the Amazon sqs.");
        queueMessagingTemplate.convertAndSend(QUEUE, message); //send to queue
        LOGGER.info("Message sent successfully to the Amazon sqs.");
    }

    // @SqsListener listens to the message from the queue.
    @SqsListener(value = QUEUE, deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void getMessageFromSqs(Message message, @Header("MessageId") String messageId) {
        LOGGER.info("Received message= {} with messageId= {}", message.toString(), messageId);
        // TODO - save to db, send SMS, Send email ...etc.
    }
}
