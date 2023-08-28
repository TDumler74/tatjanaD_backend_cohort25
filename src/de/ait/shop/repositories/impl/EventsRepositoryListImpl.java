package de.ait.shop.repositories.impl;

import de.ait.shop.models.Event;
import de.ait.shop.repositories.EventsRepository;
import java.util.ArrayList;
import java.util.List;

public class EventsRepositoryListImpl implements EventsRepository {

  private final List<Event> events = new ArrayList<>();
  private  Long generateId = 1L;
  @Override
  public Event findById(long id) {
    return null;
  }

  @Override
  public List<Event> findAll() {
    return null;
  }

  @Override
  public void save(Event event) {
    events.add(event);

    event.setId(generateId);

    generateId++;
  }

  @Override
  public void deleteById(long id) {

  }

  @Override
  public void update(Event model) {

  }

  @Override
  public Event findOneByName(String eventName) {
    return null;
  }
}
