package com.example.domain.customers;

import com.example.domain.shared.AggregateRoot;
import com.example.domain.shared.Event;

import java.util.*;

@AggregateRoot
public class Consumer {

    private String id;
    private String name;
    private String phone;
    private String street;
    private String city;

    private final List<Event> domainEvents;

    public Consumer(String name, String phone, String street, String city) {
        this.name = name;
        this.phone = phone;
        this.street = street;
        this.city = city;
        this.domainEvents = new ArrayList<>();

        this.id = String.valueOf(UUID.randomUUID());

        ConsumerCreatedEvent consumerCreatedEvent = new ConsumerCreatedEvent(this);


        domainEvents.add(consumerCreatedEvent);

    }

    public List<Event> getDomainEvents() {
        return domainEvents;
    }

    public Contact getContact() {
        return new Contact(this.phone,this.id);
    }

    public Preferences getPreferences() {

        String consumerType = "";

        if(this.city.equals("Bogota")){
            consumerType = "metropolitan";
        } else if( this.city.equals("Tebaida") ){
            consumerType = "rural";
        }

        return new Preferences(this.id, consumerType);
    }
}
