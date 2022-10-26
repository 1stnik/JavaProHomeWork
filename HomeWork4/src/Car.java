import java.util.Scanner;

// Arguments fo Car: 90 53 20 39.99
// Distance:
// Total Odesa - Kyiv -481km
// Odesa - Krive Ozero - 179km
// Krive Ozero - Jashkiv - 153km
// Jashkiv - Kyiv 149km


public class Car {

    static int tankVolume;
    static double fuelReserve;
    static double fuelConsumption;
    static double fuelCost;
    static int distance;
    static double fuelRequirement;
    static int nextPointDistance;


    public static void main(String[] args) {

        tankVolume = Integer.valueOf(args[0]); // volume of tank
        fuelReserve = Integer.valueOf(args[1]); // fuel reserve on start (l)
        fuelConsumption = Integer.valueOf(args[2]); // fuel consumption (l/100km)
        fuelCost = Double.valueOf(args[3]); // fuel price (#00.00)

        System.out.println("Tank volume: " + tankVolume + "L" + "\nFuel reserve: " + fuelReserve + "L" +
                "\nFuel consumption: " + fuelConsumption + "L/100km");
        // -----------------------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total distance (km): "); // distance from Kyiv to Odesa - 481km
        distance = scanner.nextInt();
        fuelRequirement = Math.ceil(calcFuelToDistance(fuelConsumption, distance));
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
        fuelRequirement = Math.ceil(calcFuelToDistance(fuelConsumption, nextPointDistance));
        System.out.println("Need fuel for next point (" + nextPointDistance + ")km: " +
                fuelRequirement + "L");
        System.out.println("Fuel reserve in the tank: " + fuelReserve + "L");
        fuelReserve = needToAddFuel(fuelReserve, fuelRequirement);
        System.out.println(" . . . . . . . ");
        // -----------------------------------------------------------------------------------------
        System.out.println("Now you are in Krive Ozero");
        System.out.println("Enter distance from current to next point (km): "); // from Krive Ozero to Jashkiv
        nextPointDistance = scanner.nextInt(); // 153 km
        int distanceB = nextPointDistance;
        fuelRequirement = Math.ceil(calcFuelToDistance(fuelConsumption, nextPointDistance));
        System.out.println("Need fuel for next point (" + nextPointDistance + ")km: " +
                fuelRequirement + "L");
        System.out.println("Fuel reserve in the tank: " + fuelReserve + "L");
        fuelReserve = needToAddFuel(fuelReserve, fuelRequirement);
        System.out.println(" . . . . . . . ");
        // -----------------------------------------------------------------------------------------

        System.out.println("Now you are in Jashkiv");
        System.out.println("Enter distance from current to the end point (km): "); //from Krive Ozero to Jashkiv
        nextPointDistance = scanner.nextInt(); // 149 km
        int distanceC = nextPointDistance;
        fuelRequirement = Math.ceil(calcFuelToDistance(fuelConsumption, nextPointDistance));
        System.out.println("Need fuel for next point (" + nextPointDistance + ")km: " +
                fuelRequirement + "L");
        System.out.println("Fuel reserve in the tank: " + fuelReserve + "L");
        fuelReserve = needToAddFuel(fuelReserve, fuelRequirement);
        System.out.println(" . . . . . . . ");

        if (distance >= distanceA + distanceB + distanceC) {
            System.out.println("Congrats! You are in Kyiv!");
            scanner.close();
        }

        System.out.println("Fuel reserve in the end of trip: " + fuelReserve + "L");
    }

    public static double calcFuelToDistance(double fuelConsumption, int distance) {
        return fuelConsumption * distance / 100; // расход топлива к пробегу
    }

    public static double needToAddFuel(double fuelReserve, double fuelRequirement) {
        double tempFuelReserve = 0;
        if (fuelRequirement > fuelReserve) {
            System.out.println("You can't go. Add fuel!\nFilling up the tank full...");
            tempFuelReserve = calcAddFuelInTank(tankVolume, fuelReserve);
            System.out.println("Fuel reserve now is: " + tempFuelReserve + "L. Go!");
            tempFuelReserve = calcReserveFuelAfterDistance(calcAddFuelInTank(tankVolume, fuelReserve), fuelRequirement);

        } else if (fuelRequirement <= fuelReserve) {
            System.out.println("Reserve of fuel enough to next point! Go!");
            tempFuelReserve = calcReserveFuelAfterDistance(fuelReserve, fuelRequirement);
        }
        return tempFuelReserve;
    }

    public static double calcAddFuelInTank(int tankVolume, double fuelReserve) {
        return (tankVolume - fuelReserve) + fuelReserve; // добавить до полного бака
    }

    public static double calcReserveFuelAfterDistance(double fuelReserve, double fuelRequirement) {
        return fuelReserve - fuelRequirement; // остаток топлива после пробега
    }
}
