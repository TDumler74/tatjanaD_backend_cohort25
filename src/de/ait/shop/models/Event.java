package de.ait.shop.models;

import java.time.LocalDate;
import java.util.Objects;

public class Event {
  private long id;
  private String eventName;
  private LocalDate eventStart;
  private LocalDate eventFinish;

  public Event(String eventName, LocalDate eventStart, LocalDate eventFinish) {
    this.eventName = eventName;
    this.eventStart = eventStart;
    this.eventFinish = eventFinish;
  }

  public Event() {

  }

  public Event(long id, String eventName, LocalDate eventStart, LocalDate eventFinish) {
    this.id = id;
    this.eventName = eventName;
    this.eventStart = eventStart;
    this.eventFinish = eventFinish;
  }

  public long getId() {
    return id;
  }

  public String getEventName() {
    return eventName;
  }

  public LocalDate getEventStart() {
    return eventStart;
  }

  public LocalDate getEventFinish() {
    return eventFinish;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public void setEventStart(LocalDate eventStart) {
    this.eventStart = eventStart;
  }

  public void setEventFinish(LocalDate eventFinish) {
    this.eventFinish = eventFinish;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Event event)) {
      return false;
    }
    return getId() == event.getId() && Objects.equals(getEventName(), event.getEventName())
        && Objects.equals(getEventStart(), event.getEventStart())
        && Objects.equals(getEventFinish(), event.getEventFinish());
  }



  @Override
  public int hashCode() {
    return Objects.hash(getId(), getEventName(), getEventStart(), getEventFinish());
  }
  @Override
  public String toString() {
    return "Event{" +
        "id=" + id +
        ", eventName='" + eventName + '\'' +
        ", eventStart=" + eventStart +
        ", eventFinish=" + eventFinish +
        '}';
  }
}
