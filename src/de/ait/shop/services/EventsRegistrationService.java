package de.ait.shop.services;

import de.ait.shop.models.Event;
import de.ait.shop.repositories.EventsRepository;
import java.time.LocalDate;

public class EventsRegistrationService {
  private final EventsRepository eventsRepository;



  public EventsRegistrationService(EventsRepository eventsRepository) {
    this.eventsRepository = eventsRepository;
  }

  public Event register(String eventName, LocalDate eventStart,LocalDate eventFinish)
      throws IllegalAccessException {
    if(eventName == null || eventName.equals("")|| eventName.equals(" ")){
      throw new IllegalAccessException("Окно не может быть пустым");
    }
    if(eventStart == null  ){
      throw new IllegalAccessException("Окно не может быть пустым");
    }
    if(eventFinish == null  ){
      throw new IllegalAccessException("Окно не может быть пустым");
    }
    Event event= new Event(eventName,eventStart,eventFinish);
    eventsRepository.save(event);
    return event;
  }
}
