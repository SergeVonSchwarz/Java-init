public class Static {
    public static void main(String[] args) {
        StaticHuman.desc = "Static value";
        StaticHuman.showStatic();

        StaticHuman h1 = new StaticHuman("Sergio", 35);
        StaticHuman h2 = new StaticHuman("Jhon", 28);
        StaticHuman h3 = new StaticHuman("Doe", 37);
        h1.showInfo();

        StaticHuman.desc = "New static value";
        StaticHuman.showStatic();

        h1.getAllFields();

        /* Static inner example */
        System.out.println("Static inner: " + Math.round(Math.pow(2, 4)));
    }
}