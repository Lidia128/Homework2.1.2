public class Main {
    public static void main(String[] args) {

        Car lada = new Car ();

        lada.model = "Granda";
        lada.engineVolume = 1.7;
        lada.color = "желтый";
        lada.productionYear = 2015;
        lada.productionCountry = "России";
        lada.avto();

        Car audi = new Car();
        audi.brend = "Audi";

        audi.engineVolume = 3.0;
        audi.color = "черный";
        audi.productionYear = 2020;
        audi.productionCountry = "Германии";
        audi.avto();

        Car bmw = new Car();
        bmw.brend = "BMW";
        bmw.model = "Z8";

        bmw.color = "черный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германии";
             bmw.avto();

        Car kia = new Car();
        kia.brend = "Kia";
        kia.model = "portaSge 4-го поколения";
        kia.engineVolume = 2.4;

        kia.productionYear = 2018;
        kia.productionCountry = "Южной Корее";
        kia.avto();

        Car hyundai = new Car();
        hyundai.brend = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";

        hyundai.avto();



    }
}