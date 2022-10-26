public class Car {
    public String brend;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    public Car (){
        this.brend = "default";
        this.model = "default";
        this.engineVolume = 1.5;
        this.color = "белый";
        this.productionYear = 2000;
        this.productionCountry = "default";

           }
           void avto () {
               System.out.println(brend + " " + model + "," + productionYear + " год выпуска, сборка в " + productionCountry
                       + ", " + color + " цвет кузова, объем двигателя — " + engineVolume + " л.");

           }

}
