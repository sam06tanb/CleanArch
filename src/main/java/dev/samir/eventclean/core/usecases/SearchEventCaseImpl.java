package dev.samir.eventclean.core.usecases;

import dev.samir.eventclean.core.entities.Event;

public class SearchEventCaseImpl implements SearchEventCase {

    @Override
    public Event execute(Event event) {
        return event;
    }

}
