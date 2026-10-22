package oop.example;

import java.util.ArrayList;

/** Хранилище автомобилей: позволяет добавлять, удалять и искать объекты {@link Auto}. */
public class GarageCar {
    private ArrayList<Auto> masCar=new ArrayList<Auto>();
    /** Добавляет автомобиль в гараж.
     * @param m автомобиль для добавления
     */
    public void addCar(Auto m){
        masCar.add(m);
    }
    /** Удаляет автомобиль; возвращает {@code true}, если он был в гараже.
     * @param m автомобиль для удаления
     * @return {@code true}, если автомобиль был найден и удалён
     */
    public boolean removeCar(Auto m){
        return masCar.remove(m);
    }
    /** Создаёт пустой гараж. */
    public GarageCar (){
    }
    /** Проверяет, содержится ли автомобиль в гараже.
     * @param m автомобиль для поиска
     * @return {@code true}, если автомобиль содержится в гараже
     */
    public Boolean findCar(Auto m){
        return masCar.contains(m);
    }
    /** Создаёт гараж на основе переданного списка автомобилей.
     * @param n список автомобилей
     */
    public GarageCar(ArrayList< Auto> n){
        masCar=n;
    }
    /** Выводит в консоль список автомобилей гаража. */
    public void printGarage() {
        System.out.println("В гараже: ");
        for (Auto a:masCar){ //
            System.out.println("\t"+a.toString());
        }
    }
}
