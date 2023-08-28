package de.ait.shop.controllers;

import de.ait.shop.models.Event;
import de.ait.shop.services.EventsRegistrationService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RegistrationController {

  private static final String DATE_FORMATTER = "dd.MM.yyyy";
  private final Scanner scanner;
  private final EventsRegistrationService registrationService;
  public RegistrationController(Scanner scanner, EventsRegistrationService registrationService){
    this.scanner=scanner;
    this.registrationService=registrationService;

  }
  public void register() throws IllegalAccessException {
    System.out.println("Введите название события");
    String eventName = scanner.nextLine();

  System.out.println("Задайте дату начала");
  try{
    int day= Integer.parseInt(scanner.nextLine());
    int month = Integer.parseInt(scanner.nextLine());
    int year = Integer.parseInt(scanner.nextLine());
    LocalDate eventStart = LocalDate.of(day,month,year);
    System.out.println(eventStart);
  }catch (NumberFormatException e){
    System.out.println(e+"invalid");
  }


   //LocalDate eventStart = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
   //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
   //System.out.println(eventStart.format(dtf));

   //System.out.println("Задайте дату завершения");
   //LocalDate eventFinish = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
   //System.out.println(eventFinish.format(dtf));


   //Event event = registrationService.register(eventName,eventStart,eventFinish);
   //System.out.println(event);
  }

}
