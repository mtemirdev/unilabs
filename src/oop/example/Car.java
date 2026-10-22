package oop.example;

/** Легковой автомобиль; расширяет {@link Auto} моделью, числом дверей и признаком полного привода. */
public class Car extends Auto {//файл Car.java
    private String model;
    private int numDoors;
    private Boolean fullTime; //полный привод
    /** Создаёт легковой автомобиль со значениями по умолчанию. */
    public Car(){
        super();// вызываем конструктор класса-родителя без параметров (см. класс Auto)
        model=""; // добавляем инициализацию новых членов
        numDoors=4;
        fullTime=false;
    }

    /** Создаёт легковой автомобиль с указанными характеристиками.
     * @param firma фирма-производитель
     * @param speed максимальная скорость
     * @param name модель
     * @param n число дверей
     * @param f признак полного привода
     */
    public Car(String firma, int speed, String name, int n, Boolean f){
        super(firma,speed); //вызываем конструктор класса-родителя с параметрами (см. класс Auto)
        model=name; // добавляем инициализацию новых членов
        numDoors=n;
        fullTime=f;
    }
    /** Устанавливает модель автомобиля.
     * @param name модель
     */
    public void setModel(String name){
        model=name;
    }
    /** Возвращает модель автомобиля.
     * @return модель автомобиля
     */
    public String getModel(){
        return model;
    }
    /** Устанавливает число дверей.
     * @param n число дверей
     */
    public void setNumDoors(int n){
        numDoors=n;
    }
    /** Возвращает число дверей.
     * @return число дверей
     */
    public int getNumDoors(){
        return numDoors;
    }
    /** Устанавливает признак полного привода.
     * @param b {@code true}, если автомобиль полноприводный
     */
    public void setFullTime(Boolean b){
        fullTime=b;
    }
    /** Возвращает признак полного привода.
     * @return {@code true}, если автомобиль полноприводный
     */
    public Boolean isFullTime(){
        return fullTime;
    }
    /** Возвращает строковое представление характеристик автомобиля.
     * @return строка с фирмой, скоростью и характеристиками автомобиля
     */
    @Override
    public String toString(){
        return getFirm()+" "+getMaxSpeed()+" "+model+" "+numDoors+" "+fullTime;
    }
}
