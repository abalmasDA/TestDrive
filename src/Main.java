/**
 * Створити 4 екземляри машин
 * Ford
 * Mitsubishi
 * Toyota
 * KIA
 */

public class Main {



    public static void main(String[] args) {

        Car ford = new Ford("FORD Mustang", 175, 250, 43800);
        Car mitsubishi = new Mitsubishi("MITSUBISHI Lancer", 120, 190, 17000);
        Car toyota = new Toyota("TOYOTA Camry", 145, 200, 25000);
        Car kia = new Kia("KIA Rio", 125, 185, 15000);

        CheckCar checkCar = new CheckCar();
        checkCar.addingCarToCheckList(ford);
        checkCar.addingCarToCheckList(mitsubishi);
        checkCar.addingCarToCheckList(toyota);
        checkCar.addingCarToCheckList(kia);

        System.out.println(checkCar.findFastestCar());
        System.out.println(checkCar.findMostExpensiveCar());
        System.out.println(checkCar.findMostPowerfulCar());





    }
}
