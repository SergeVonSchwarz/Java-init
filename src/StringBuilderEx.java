public class StringBuilderEx {
    public static void main(String[] args) {
        String x = "hello";
        System.out.println(x.toUpperCase());

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}
