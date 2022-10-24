public class Car {
    String brend;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car (String brend){
        this.brend = brend;
           }
           void avto () {
               System.out.println(brend + " " + model + "," + productionYear + " год выпуска, сборка в " + productionCountry
                       + ", " + color + " цвет кузова, объем двигателя — " + engineVolume + " л.");

           }

}
