package dev.samir.eventclean.core.usecases;

import dev.samir.eventclean.core.entities.Event;

public interface eventCreateCase {

    public Event execute(Event event);

}
