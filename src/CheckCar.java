public class CheckCar {
    private Car[] listCarToCheck = new Car[0];

    public void addingCarToCheckList(Car carToAdd) {
        Car[] resultAddCar = new Car[listCarToCheck.length + 1];
        for (int i = 0; i < listCarToCheck.length; i++) {
            resultAddCar[i] = listCarToCheck[i];
        }
        resultAddCar[resultAddCar.length - 1] = carToAdd;
        listCarToCheck = resultAddCar;
    }

    public String findFastestCar() {
        int maxSpeed = listCarToCheck[0].getSpeed();
        int counterIndex = 0;
        for (int i = 0; i < listCarToCheck.length; i++) {
            if (listCarToCheck[i].getSpeed() > maxSpeed) {
                maxSpeed = listCarToCheck[i].getSpeed();
                counterIndex = i;
            }
        }
        return outputCarInfo(listCarToCheck[counterIndex]);
    }

    public String findMostExpensiveCar() {
        double maxPrice = listCarToCheck[0].getPrice();
        int counterIndex = 0;
        for (int i = 0; i < listCarToCheck.length; i++) {
            if (listCarToCheck[i].getPrice() > maxPrice) {
                maxPrice = listCarToCheck[i].getPrice();
                counterIndex = i;
            }
        }
        return outputCarInfo(listCarToCheck[counterIndex]);
    }

    public String findMostPowerfulCar() {
        double maxPower = listCarToCheck[0].getPower();
        int counterIndex = 0;
        for (int i = 0; i < listCarToCheck.length; i++) {
            if (listCarToCheck[i].getPower() > maxPower) {
                maxPower = listCarToCheck[i].getPower();
                counterIndex = i;
            }
        }
        return outputCarInfo(listCarToCheck[counterIndex]);
    }

    public String outputCarInfo(Car carInfoOutput) {
        return "Brand: " + carInfoOutput.getModel() + "\n" +
                "Power: " + (int) carInfoOutput.getPower() + "\n" +
                "Speed: " + carInfoOutput.getSpeed() + "\n" +
                "Price:" + String.format("%.2f", carInfoOutput.getPrice()).replace(',', '.') + "\n" +
                "Year: " + carInfoOutput.getYearOfManufacture();
    }


}
