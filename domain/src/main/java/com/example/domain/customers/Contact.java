package com.example.domain.customers;

import com.example.domain.shared.ValueObject;

@ValueObject
public record Contact(String phone, String consumerId) {
}
