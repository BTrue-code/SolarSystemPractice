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

    }

}
