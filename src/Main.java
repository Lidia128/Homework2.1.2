public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada Granta");
        lada.brend = "Lada";
        lada.model = "Granda";
        lada.engineVolume = 1.7;
        lada.color = "желтого";
        lada.productionYear = 2015;
        lada.productionCountry = "России";
        lada.avto();

        Car audi = new Car("Audi A8 50 L TDI quattro");
        audi.brend = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "черный";
        audi.productionYear = 2020;
        audi.productionCountry = "Германии";
        audi.avto();

        Car bmw = new Car("BMW Z8");
        bmw.brend = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "черный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германии";
        bmw.avto();

        Car kia = new Car("Kia Sportage");
        kia.brend = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.productionYear = 2018;
        kia.productionCountry = "Южной Корее";
        kia.avto();

        Car hyundai = new Car("Hyundai Avante");
        hyundai.brend = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южной Корее";
        hyundai.avto();



    }
}