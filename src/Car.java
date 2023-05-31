/**
 * Створити клас - якась невідома машина
 * Клас має поля
 * model - назва машини
 * power - від 0.0 до 200.0
 * speed - від 0 до 320
 * price - від 0.0 до 50000.0
 * yearOfManufacture - для всіх один рік 1967
 */

public abstract class Car {
    private String model;
    private double power;
    private int speed;
    private double price;
    private final int yearOfManufacture = 1967;


    public Car(String model, double power, int speed, double price) {
        this.model = model;
        this.power = checkValuePower(power);
        this.speed = checkValueSpeed(speed);
        this.price = checkValuePrice(price);
    }

    private double checkValuePower(double powerToCheck) {
        double checkValue = 0;
        if (powerToCheck > 200) {
            checkValue = 200;
            return checkValue;
        } else if (powerToCheck < 0) {
            checkValue = 0;
            return checkValue;
        }
        return powerToCheck;
    }

    private int checkValueSpeed(int speedToCheck) {
        int checkValue = 0;
        if (speedToCheck > 320) {
            checkValue = 320;
            return checkValue;
        } else if (speedToCheck < 0) {
            checkValue = 0;
            return checkValue;
        }
        return speedToCheck;
    }

    private double checkValuePrice(double priceToCheck) {
        double checkValue = 0;
        if (priceToCheck > 50000) {
            checkValue = 50000;
            return checkValue;
        } else if (priceToCheck < 0) {
            checkValue = 0;
            return checkValue;
        }
        return priceToCheck;
    }


    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }



}
