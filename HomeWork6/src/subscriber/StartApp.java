package subscriber;

import java.util.Scanner;

public class StartApp {

    public static Scanner scanner;

    public static void main(String[] args) {


        SubscriberInit subscriberInit = new SubscriberInit();
        Subscriber[] subscribers = (Subscriber[])subscriberInit.initSubscribersInfo();

        SubscriberService subscriberService = new SubscriberService();
        subscriberService.exceedingLimitLocalCalls(subscribers);

        System.out.println("-----------------------------------------------\n");
        subscriberService.intercityCallsUsers(subscribers);

        System.out.println("-----------------------------------------------\n");
        subscriberService.findSbscrByFirstLetterSurname(subscribers, inputFirstLetter());

        System.out.println("-----------------------------------------------\n");
        subscriberService.calcTotalTrafficConsumption(subscribers, inputCity());

        System.out.println("\n-----------------------------------------------\n");
        subscriberService.findNegativeBalanceSubscribers(subscribers);
    }

    public static Character inputFirstLetter() {
        scanner = new Scanner(System.in);
        System.out.println("Enter first letter of surname to search: ");
        String inputSurname = scanner.nextLine().trim();
        return inputSurname.toUpperCase().toCharArray()[0];
    }

    public static String inputCity() {
        System.out.println("""
                Enter the number of city to see total traffic consumption:
                1 - Kyiv
                2 - Kharkiv
                3 - Dnipro
                4 - Odesa
                5 - Lviv
                ->
                """);
        String inputCity = scanner.nextLine().trim();
        scanner.close();
        switch (inputCity) {
            case "1" -> inputCity = "Kyiv";
            case "2" -> inputCity = "Kharkiv";
            case "3" -> inputCity = "Dnipro";
            case "4" -> inputCity = "Odesa";
            case "5" -> inputCity = "Lviv";
            default -> System.out.println("Incorrect input. Restart program please!");
        }
        return inputCity;
    }
}
