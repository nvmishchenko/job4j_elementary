package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(150);
        System.out.println("150 rubles are " + dollar + " dollar.");
        float inE = 140;
        float expectedE = 2;
        float outE = Converter.rubleToEuro(inE);
        boolean passedE = expectedE == outE;
        System.out.println("140 rubles are 2. Test result : " + passedE);
        float inD = 150;
        float expectedD = 2.5f;
        float outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("150 rubles are 2.5 Test result : " + passedD);
    }
}
