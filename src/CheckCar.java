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

//    public Car findFastestCar() {
//
//        for (int i = 1; i < listCarToCheck.length; i++) {
//            if (listCarToCheck[i].getSpeed() > listCarToCheck[i].getSpeed()) {
//
//
//            }
//
//        }
//
//
//        return;
//    }


    public String outputCarInfo(Car carInfoOutput) {
        return "Brand: " + carInfoOutput.getModel() + "\n" +
                "Power: " + carInfoOutput.getPower() + "\n" +
                "Speed: " + carInfoOutput.getSpeed() + "\n" +
                "Price: " + carInfoOutput.getPrice() + "\n" +
                "Year: " + carInfoOutput.getYearOfManufacture();
    }


}
