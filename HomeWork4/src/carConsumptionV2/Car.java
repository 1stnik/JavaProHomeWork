package carConsumptionV2;

public class Car implements CalcAddFuelInTank,CalcReserveFuelAfterDistance, CalcFuelToDistance {

    private int tankVolume;
    private double fuelReserve;
    private double fuelConsumption;

    public Car() { // не использовал, но оставил явным
    }

    public Car(int tankVolume, double fuelReserve, double fuelConsumption) {
        this.tankVolume = tankVolume;
        this.fuelReserve = fuelReserve;
        this.fuelConsumption = fuelConsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public double getFuelReserve() {
        return fuelReserve;
    }

    public void setFuelReserve(double fuelReserve) {
        this.fuelReserve = fuelReserve;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }


    @Override
    public double calcAddFuelInTank(int tankVolume, double fuelReserve) {
        return (tankVolume - fuelReserve) + fuelReserve; // добавить до полного бака
    }

    @Override
    public double calcReserveFuelAfterDistance(double fuelReserve, double fuelRequirement) {
        return fuelReserve - fuelRequirement; // остаток топлива после пробега
    }

    @Override
    public double calcFuelToDistance(double fuelConsumption, int distance) {
        return fuelConsumption * distance / 100; // расход топлива к пробегу
    }
}


