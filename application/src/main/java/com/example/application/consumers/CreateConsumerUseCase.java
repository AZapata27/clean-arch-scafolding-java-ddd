package com.example.application.consumers;

import com.example.domain.customers.Consumer;
import com.example.domain.customers.ConsumerRepository;
import com.example.domain.customers.Contact;
import com.example.domain.customers.Preferences;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateConsumerUseCase {

    private final ContactsGateway contactsGateway;
    private final PreferencesGateway preferencesGateway;
    private final ConsumerPublisher consumerPublisher;
    private final ConsumerRepository consumerRepository;

    public Consumer create(CreateConsumerRequest createConsumerRequest) {

        Consumer consumer = new Consumer(
                createConsumerRequest.name(),
                createConsumerRequest.phone(),
                createConsumerRequest.street(),
                createConsumerRequest.city());

        consumerRepository.save(consumer);

        Contact contact = consumer.getContact();

        ContactRequest contactRequest = new ContactRequest(contact.phone(), contact.consumerId());

        contactsGateway.create(contactRequest);

        Preferences preferences = consumer.getPreferences();

        PreferencesRequest preferencesRequest = new PreferencesRequest(preferences.consumerId(), preferences.consumerType());

        preferencesGateway.create(preferencesRequest);

        consumerPublisher.publish(consumer.getDomainEvents());

        return consumer;

    }

}
