public class ArraysTwoString {
    public static void main(String [] args) {
        String [] strings = new String[3];

        strings[0] = "God";
        strings[1] = "damn";
        strings[2] = "it";

        // foreach, no index in Java foreach
        for (String item: strings) {
            System.out.println("Item: " + item);
        }
    }
}
