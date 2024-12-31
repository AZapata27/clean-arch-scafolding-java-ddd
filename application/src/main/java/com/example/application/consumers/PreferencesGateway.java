package com.example.application.consumers;

import java.util.List;

public interface PreferencesGateway {

    PreferencesResponse create(PreferencesRequest preferencesRequest);

    List<Object> getConsumerPreferenceByConsumerId(String consumerId);
}
