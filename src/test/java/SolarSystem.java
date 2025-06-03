public class SolarSystem {

    public static void main(String[] args) {

        BasicStructure bb = new BasicStructure();

        bb.Planets = "2";
        bb.Moon = "1";
        bb.Stars = "10";
        bb.Sun = "1";

        System.out.println("solar system is ready");


        FeatureSun sun = new FeatureSun();

        sun.Color = "Yellow";
        sun.temperature = "5500K";
        sun.Radius = "695,700 km";



        Planet1 planet1 = new Planet1();

        planet1.color = "Blue";
        planet1.size = "Medium";

        Planet2 planet2 = new Planet2();

        planet2.name = "FlipFlop";
        planet2.color = "Blue";
        planet2.size = "12,742 km";

    }

}
