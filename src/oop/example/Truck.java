package oop.example;

import java.util.Scanner;
/** Грузовой автомобиль; расширяет {@link Auto} моделью, мощностью и наличием прицепа. */
public class Truck extends Auto {
    private String model;
    private int power;
    private Boolean trailer; //c прицепом или без
    /** Создаёт грузовик со значениями по умолчанию. */
    public Truck(){
        super();
        model="";
        power=0;
        trailer=false;
    }
    /** Создаёт грузовик с указанными характеристиками.
     * @param firma фирма-производитель
     * @param speed максимальная скорость
     * @param name модель грузовика
     * @param n мощность
     * @param f {@code true}, если у грузовика есть прицеп
     */
    public Truck(String firma, int speed, String name, int n, Boolean f){
        super(firma,speed);
        model=name;
        power=n;
        trailer=f;
    }
    /** Устанавливает модель грузовика.
     * @param name модель грузовика
     */
    public void setModel(String name){
        model=name;
    }
    /** Возвращает модель грузовика.
     * @return модель грузовика
     */
    public String getModel(){
        return model;
    }
    /** Устанавливает мощность грузовика.
     * @param n мощность грузовика
     */
    public void setPower(int n){
        power=n;
    }
    /** Возвращает мощность грузовика.
     * @return мощность грузовика
     */
    public int getPower(){
        return power;
    }
    /** Устанавливает признак наличия прицепа.
     * @param b {@code true}, если прицеп есть
     */
    public void setTrailer(Boolean b){
        trailer=b;
    }
    /** Возвращает признак наличия прицепа.
     * @return {@code true}, если прицеп есть
     */
    public Boolean isTrailer(){
        return trailer;
    }
    /** Запрашивает у пользователя в консоли и сохраняет характеристики грузовика. */
    public void setAllInfo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фирму-производитель грузового авто: ");
        String nazv=in.next(); //метод next() позволяет вводить строки, но без пробелов
        setFirm(nazv);
        System.out.print("Введите максимальную скорость грузового авто: ");
        int s=in.nextInt();
        setMaxSpeed(s);
        System.out.print("Введите модель грузового авто: ");
        model=in.next();
        System.out.print("Введите мощность грузового авто: ");
        power=in.nextInt();
        System.out.print("Введите признак прицепа грузового авто (true/false): ");
        trailer=in.nextBoolean();
        System.out.println();
    }
    /** Возвращает многострочное текстовое представление характеристик грузовика.
     * @return текст с характеристиками грузовика
     */
    @Override
    public String toString(){
        return "\n\tГрузовик"+"\n\t"+"Фирма: "+getFirm()+"\n\t"+"Максимальная скорость: "
                +getMaxSpeed()+ "\n\t"+"Модель: "+model+"\n\t"+"Мощность: "+power+"\n\t"+"Признак прицепа: "
                +trailer+"\n";
    }
}
