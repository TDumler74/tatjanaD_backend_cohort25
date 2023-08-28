package de.ait.shop.repositories;

import de.ait.shop.models.Event;

public interface EventsRepository extends CrudRepository<Event>{
  Event findOneByName(String eventName);



}
