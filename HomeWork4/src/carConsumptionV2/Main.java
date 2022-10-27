package carConsumptionV2;

// Arguments fo carConsumptionV2.Car: 90 53 20 39.99
// Distance:
// Total Odesa - Kyiv -481km
// Odesa - Krive Ozero - 179km
// Krive Ozero - Jashkiv - 153km
// Jashkiv - Kyiv 149km

import java.util.Scanner;

public class Main {

    public static double fuelCost;
    public static int distance;
    public static double fuelRequirement;
    public static int nextPointDistance;
    public static Scanner scanner;
    public static Car car;

    public static void main(String[] args) {

        fuelCost = Double.valueOf(args[0]); // fuel price (#00.00)
        inputValues();

    }

    public static void inputValues() {

        car = new Car(90, 53, 20);

        System.out.println("Tank volume: " + car.getTankVolume() + "L" + "\nFuel reserve: " + car.getFuelReserve() + "L" +
                "\nFuel consumption: " + car.getFuelConsumption() + "L/100km");
        // -----------------------------------------------------------------------------------------

        scanner = new Scanner(System.in);
        System.out.println("Enter the total distance (km): "); // distance from Kyiv to Odesa - 481km
        distance = scanner.nextInt();
        fuelRequirement = Math.ceil(car.calcFuelToDistance(car.getFuelConsumption(), distance));
        System.out.println("Need fuel for trip (" + distance + "km): " +
                fuelRequirement + "L");
        System.out.println("Current fuel cost per litre: " + fuelCost + " uah");
        System.out.printf("Cost of trip: %.2f uah\n",
                fuelRequirement * fuelCost);
        System.out.println("----------------------------------------------------");
        // -----------------------------------------------------------------------------------------

        System.out.println("Enter distance from start to the next point (km): "); // from Odesa to Krive Ozero
        nextPointDistance = scanner.nextInt(); // 179 km
        int distanceA = nextPointDistance;
        fuelRequirement = Math.ceil(car.calcFuelToDistance(car.getFuelConsumption(), nextPointDistance));
        System.out.println("Need fuel for next point (" + nextPointDistance + ")km: " +
                fuelRequirement + "L");
        System.out.println("Fuel reserve in the tank: " + car.getFuelReserve() + "L");
        car.setFuelReserve(needToAddFuel(car.getFuelReserve(), fuelRequirement));
        System.out.println(" . . . . . . . ");
        // -----------------------------------------------------------------------------------------
        System.out.println("Now you are in Krive Ozero");
        System.out.println("Enter distance from current to next point (km): "); // from Krive Ozero to Jashkiv
        nextPointDistance = scanner.nextInt(); // 153 km
        int distanceB = nextPointDistance;
        fuelRequirement = Math.ceil(car.calcFuelToDistance(car.getFuelConsumption(), nextPointDistance));
        System.out.println("Need fuel for next point (" + nextPointDistance + ")km: " +
                fuelRequirement + "L");
        System.out.println("Fuel reserve in the tank: " + car.getFuelReserve() + "L");
        car.setFuelReserve(needToAddFuel(car.getFuelReserve(), fuelRequirement));
        System.out.println(" . . . . . . . ");
        // -----------------------------------------------------------------------------------------

        System.out.println("Now you are in Jashkiv");
        System.out.println("Enter distance from current to the end point (km): "); //from Krive Ozero to Jashkiv
        nextPointDistance = scanner.nextInt(); // 149 km
        int distanceC = nextPointDistance;
        fuelRequirement = Math.ceil(car.calcFuelToDistance(car.getFuelConsumption(), nextPointDistance));
        System.out.println("Need fuel for next point (" + nextPointDistance + ")km: " +
                fuelRequirement + "L");
        System.out.println("Fuel reserve in the tank: " + car.getFuelReserve() + "L");
        car.setFuelReserve(needToAddFuel(car.getFuelReserve(), fuelRequirement));
        System.out.println(" . . . . . . . ");

        if (distance >= distanceA + distanceB + distanceC) {
            System.out.println("Congrats! You are in Kyiv!");
            scanner.close();
        }

        System.out.println("Fuel reserve in the end of trip: " + car.getFuelReserve() + "L");
    }


    public static double needToAddFuel(double fuelReserve, double fuelRequirement) {
        double tempFuelReserve = 0;
        if (fuelRequirement > fuelReserve) {
            System.out.println("You can't go. Add fuel!\nFilling up the tank full...");
            tempFuelReserve = car.calcAddFuelInTank(car.getTankVolume(), fuelReserve);
            System.out.println("Fuel reserve now is: " + tempFuelReserve + "L. Go!");
            tempFuelReserve = car.calcReserveFuelAfterDistance(car.calcAddFuelInTank(car.getTankVolume(), car.getFuelReserve()), fuelRequirement);

        } else if (fuelRequirement <= fuelReserve) {
            System.out.println("Reserve of fuel enough to next point! Go!");
            tempFuelReserve = car.calcReserveFuelAfterDistance(car.getFuelReserve(), fuelRequirement);
        }
        return tempFuelReserve;
    }

}
