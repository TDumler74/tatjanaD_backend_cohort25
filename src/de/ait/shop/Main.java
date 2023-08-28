package de.ait.shop;

import de.ait.shop.controllers.RegistrationController;
import de.ait.shop.repositories.EventsRepository;
import de.ait.shop.repositories.impl.EventsRepositoryListImpl;
import de.ait.shop.services.EventsRegistrationService;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IllegalAccessException {
    Scanner scanner = new Scanner(System.in);

    EventsRepository eventsRepository = new EventsRepositoryListImpl();
    EventsRegistrationService registrationService = new EventsRegistrationService(eventsRepository);
    RegistrationController registrationController = new RegistrationController(scanner,registrationService);


    String command = scanner.nextLine();

    if(command.equals("/register")){
      registrationController.register();
    }
  }

}
