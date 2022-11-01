package subscriber;

public class SubscriberInit {

    public Object[] initSubscribersInfo() {

        Subscriber[] sbscr = new Subscriber[10];
        sbscr[0] = new Subscriber(100000101, "Melnik", "Ivan", "Ivanovich", "Lviv", "(099)1230099",
                "001230099", 174.01, 87, 34, 16.4);
        sbscr[1] = new Subscriber(100000102, "Shevchenko", "Petro", "Petrovich", "Kyiv", "(099)1230088",
                "001230088", -13.52, 46, 0, 8.9);
        sbscr[2] = new Subscriber(100000103, "Kovalenko", "Sofia", "Petrivna", "Kyiv", "(099)1230077",
                "001230077", 311.12, 245, 56, 6.6);
        sbscr[3] = new Subscriber(100000104, "Bondar", "Larisa", "Maksimivna", "Odesa", "(099)1230066",
                "001230066", 244.76, 119, 122, 18.9);
        sbscr[4] = new Subscriber(100000105, "Boyko", "Roman", "Ivanovich", "Dnipro", "(099)1230055",
                "001230055", 35.94, 64, 0, 1.4);
        sbscr[5] = new Subscriber(100000106, "Tkachenko", "Bogdan", "Oleksandrovich", "Kharkiv", "(099)1230044",
                "001230044", -72.67, 98, 25, 8.8);
        sbscr[6] = new Subscriber(100000107, "Kravchenko", "Hanna", "Dmitrivna", "Kyiv", "(099)1230077",
                "001230077", 100.18, 75, 99, 0.1);
        sbscr[7] = new Subscriber(100000108, "Kovalchuk", "Artem", "Maksimovich", "Odesa", "(099)1230066",
                "001230066", 94.90, 54, 76, 10.5);
        sbscr[8] = new Subscriber(100000109, "Oliynik", "Oleksandr", "Ivanovich", "Dnipro", "(099)1230055",
                "001230055", -63.03, 23, 0, 13.3);
        sbscr[9] = new Subscriber(100000110, "Savchenko", "Nazar", "Oleksandrovich", "Kharkiv", "(099)1230044",
                "001230044", 206.19, 103, 87, 14.7);
        return sbscr;
    }
}