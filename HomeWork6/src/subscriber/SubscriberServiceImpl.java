package subscriber;


public class SubscriberServiceImpl implements SubscriberService {

    private static final int LOCAL_TALK_TIME_LIMIT = 90;

    @Override
    public void exceedingLimitLocalCalls(Subscriber[] sbscr) {
        for (Subscriber subscriber : sbscr) {
            if (subscriber.getLocalTalkTime() > LOCAL_TALK_TIME_LIMIT) {
                System.out.println("Exceeding the limit of local calls: \nID:" + subscriber.getId() + "  " +
                        subscriber.getSurname() + " " + subscriber.getName() + " " + subscriber.getPatronymic()
                        + " (" + subscriber.getCity() + ") -"  + " " + subscriber.getPhoneNumber() +
                        "  Account Number:" + subscriber.getContractNumber()  + "  LocalTalkTime: " +
                        subscriber.getLocalTalkTime());
            }
        }
    }

    @Override
    public void intercityCallsUsers(Subscriber[] sbscr) {
        for (Subscriber subscriber : sbscr) {
            if (subscriber.getIntercityTalkTime() > 0) {
                System.out.println("Intercity Calls Users: \nID:" + subscriber.getId() + "  " +
                        subscriber.getSurname() + " " + subscriber.getName() + " " + subscriber.getPatronymic()
                        + " (" + subscriber.getCity() + ") -"  + " " + subscriber.getPhoneNumber() +
                        "  Account Number:" + subscriber.getContractNumber()  + "  Intercity talk time: " +
                        subscriber.getIntercityTalkTime());
            }

        }
    }

    @Override
    public void findSbscrByFirstLetterSurname(Subscriber[] sbscr, Character firstLetter) {
        for (Subscriber subscriber : sbscr) {
            Character surnameFirstLetter = subscriber.getSurname().toUpperCase().toCharArray()[0];
            if (surnameFirstLetter.equals(firstLetter)) {
                System.out.println("Found surnames on the letter (" + firstLetter + "):" +
                        "\nID:" + subscriber.getId() + "  " + subscriber.getSurname() + " " + subscriber.getName() +
                        " " + subscriber.getPatronymic() + " (" + subscriber.getCity() + ") -"  +
                        " " + subscriber.getPhoneNumber() + "  Account Number:" + subscriber.getContractNumber() +
                        "  Account Balance: " + subscriber.getAccountBalance());
            }
        }
    }

    @Override
    public void calcTotalTrafficConsumption(Subscriber[] sbscr, String inputCity) {
        double trafficSum = 0;
        for (Subscriber subscriber : sbscr) {
            if (subscriber.getCity().equals(inputCity)) {
                trafficSum += subscriber.getInternetTraffic();
            }
        }
        System.out.printf("Total sum of traffic in %s: %.2f GB", inputCity, trafficSum);
    }

    @Override
    public void findNegativeBalanceSubscribers(Subscriber[] sbscr) {
        int counter = 0;
        for (Subscriber subscriber : sbscr) {
            if (subscriber.getAccountBalance() < 0) {
                counter++;
                System.out.println("Subscribers with negative balance: \nID:" + subscriber.getId() + "  " +
                        subscriber.getSurname() + " " + subscriber.getName() + " " + subscriber.getPatronymic()
                        + " (" + subscriber.getCity() + ") -"  + " " + subscriber.getPhoneNumber() +
                        "  Account Number:" + subscriber.getContractNumber()  +
                        "  Account Balance: " + subscriber.getAccountBalance());

            }
        }
        System.out.println("Number of subscribers - " + counter);
    }


}
