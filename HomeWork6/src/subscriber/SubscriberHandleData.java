package subscriber;

public interface SubscriberHandleData {

    void exceedingLimitLocalCalls(Subscriber[] sbscr); // a) Exceeding Limit Local Calls

    void intercityCallsUsers(Subscriber[] sbscr); // b) Intercity Calls Users

    void findSbscrByFirstLetterSurname(Subscriber[] sbscr, Character firstLetter);
    // c) Find Subscriber by Surname First Letter

    void calcTotalTrafficConsumption(Subscriber[] sbscr, String inputCity); // d) Calculate Total Traffic Consumption

    void findNegativeBalanceSubscribers(Subscriber[] sbscr); // e) Number of subscribers with negative balance
}
