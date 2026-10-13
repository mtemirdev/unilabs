package example;

/**
 * Базовый класс автомобиля с данными о производителе, максимальной скорости
 * и регистрационном номере. Используется как родитель для конкретных типов
 * автомобилей.
 */
public class Auto {
    private String firm;
    private int maxSpeed;
    private String registrationNumber;
    /** Устанавливает фирму-производителя.
     * @param firma название фирмы
     */
    public void setFirm(String firma){
        firm=firma;
    }
    /** Устанавливает максимальную скорость.
     * @param speed максимальная скорость
     */
    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }
    /** Возвращает максимальную скорость.
     * @return максимальная скорость
     */
    public int getMaxSpeed(){
        return maxSpeed;
    }
    /** Возвращает фирму-производителя.
     * @return название фирмы
     */
    public String getFirm(){
        return firm;
    }
    /** Устанавливает регистрационный номер.
     * @param registrationNumber регистрационный номер
     */
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber=registrationNumber;
    }
    /** Возвращает регистрационный номер.
     * @return регистрационный номер
     */
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    /** Создаёт автомобиль с фирмой «Без названия», нулевой скоростью и пустым номером. */
    public Auto(){
        firm="Без названия";
        maxSpeed=0;
        registrationNumber="";
    }
    /** Создаёт автомобиль с указанными фирмой и максимальной скоростью.
     * @param firma название фирмы
     * @param speed максимальная скорость
     */
    public Auto(String firma, int speed){
        firm=firma;
        maxSpeed=speed;
        registrationNumber="";
    }
    /** Создаёт автомобиль с фирмой, максимальной скоростью и регистрационным номером.
     * @param firma название фирмы
     * @param speed максимальная скорость
     * @param registrationNumber регистрационный номер
     */
    public Auto(String firma, int speed, String registrationNumber){
        this(firma,speed);
        this.registrationNumber=registrationNumber;
    }
}
