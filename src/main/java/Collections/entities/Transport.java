package Collections.entities;

import Collections.interfaces.FuelType;

public abstract class Transport {
    private int countPassenger;
    private double weightInKilograms;
    private int maxSpeed;
    private FuelType fuelType;

    public Transport(int countPassenger, double weightInKilograms, int maxSpeed, FuelType fuelType) {


        this.countPassenger = countPassenger;
        this.weightInKilograms = weightInKilograms;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public double getWeightInKilograms() {
        return weightInKilograms;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void move(int distance);
    public abstract void stop();
}
