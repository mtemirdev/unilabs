package example;

public class Auto {
    private String firm;
    private int maxSpeed;
    private String registrationNumber;
    public void setFirm(String firma){
        firm=firma;
    }
    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm(){
        return firm;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber=registrationNumber;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public Auto(){
        firm="Без названия";
        maxSpeed=0;
        registrationNumber="";
    }
    public Auto(String firma, int speed){
        firm=firma;
        maxSpeed=speed;
        registrationNumber="";
    }
    public Auto(String firma, int speed, String registrationNumber){
        this(firma,speed);
        this.registrationNumber=registrationNumber;
    }
}
