public class App {
    public static void main(String[] args) throws Exception {
        SmartDevice sw = new SmartWatch("Apple", "iOS", 2022, "Oled", 540.45, "A-45", "Roja");

        SmartDevice sp = new SmartPhone("Samsung", "Android", 2021, "Q-OLed", 245.45, "Leica", "Leica");

        System.out.println(sw);
        System.out.println(sp);
    }
}
