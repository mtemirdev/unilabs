package oop.test;

import oop.example.Car;
import oop.example.GarageCar;
import oop.example.Truck;

public class TestGarage {
    public static void main(String[] args) {
        GarageCar myGarage=new GarageCar(); //создаем новый гараж
        Car myCar1=new Car("Ford", 200,"Mustang",2,false);
        myCar1.setRegistrationNumber("01 KG 123 ABC");
        myGarage.addCar(myCar1); // добавляем ее в гараж
        myGarage.addCar(new Car("LADA", 140, "Kalina", 4, false));
        Truck myTruck=new Truck("Dove",160,"DTS",700,true);
        myGarage.addCar(myTruck);
        myGarage.printGarage();
        if (myGarage.findCar(myCar1)) {
            System.out.println("Проверка поиска: автомобиль найден");
        }
        else {
            System.out.println("Проверка поиска: автомобиль не найден");
        }

        System.out.println("Госномер автомобиля: " + myCar1.getRegistrationNumber());

        if (myGarage.removeCar(myCar1)) {
            System.out.println("Проверка удаления: автомобиль удален");
        }
        else {
            System.out.println("Проверка удаления: автомобиль не найден");
        }
        if (!myGarage.findCar(myCar1)) {
            System.out.println("Проверка после удаления: автомобиля нет в гараже");
        }
        else {
            System.out.println("Проверка после удаления: автомобиль все еще в гараже");
        }
        myGarage.printGarage();
    }
}
