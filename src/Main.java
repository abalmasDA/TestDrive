/**
 * Створити 4 екземляри машин
 * Ford
 * Mitsubishi
 * Toyota
 * KIA
 */

public class Main {



    public static void main(String[] args) {

        Car ford = new Car("FORD Mustang", 250, 330, 75000);
        Car mitsubishi = new Car("MITSUBISHI Lancer", 150, 270, 45000);
        Car toyota = new Car("TOYOTA Camry", 150, 220, 45000);
        Car kia = new Car("KIA Rio", 150, 200, 45000);

        CheckCar checkCar = new CheckCar();
        checkCar.addingCarToCheckList(ford);
        checkCar.addingCarToCheckList(mitsubishi);
        checkCar.addingCarToCheckList(toyota);
        checkCar.addingCarToCheckList(kia);




    }
}
