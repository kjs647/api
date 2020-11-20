package com.test.api.demoapi.events;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventsTest {

    @Test
    public void builder(){
        Event event = Event.builder().build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean(){
        String name = "Event";
        String desp = "Spring";

        Event event = new Event();
        event.setName(name);
        event.setDescription(desp);

        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(desp);
    }

}