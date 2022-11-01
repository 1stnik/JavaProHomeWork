package subscriber;

public interface SubscriberService {

    /** a) Exceeding Limit Local Calls */
    void exceedingLimitLocalCalls(Subscriber[] sbscr); // a) Exceeding Limit Local Calls

    /** b) Intercity Calls Users */
    void intercityCallsUsers(Subscriber[] sbscr); // b) Intercity Calls Users

    /** c) Find Subscriber by Surname First Letter */
    void findSbscrByFirstLetterSurname(Subscriber[] sbscr, Character firstLetter);
    // c) Find Subscriber by Surname First Letter

    /** d) Calculate Total Traffic Consumption */
    void calcTotalTrafficConsumption(Subscriber[] sbscr, String inputCity); // d) Calculate Total Traffic Consumption

    /** e) Number of subscribers with negative balance */
    void findNegativeBalanceSubscribers(Subscriber[] sbscr); // e) Number of subscribers with negative balance
}
