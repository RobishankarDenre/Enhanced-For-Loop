package module_9;

public class EnhancedForLoop {
    public static void main(String[] args) {

        String colors[] = {"Blue", "Black", "Red", "Yellow", "White"};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
//        .....................
        for (String color : colors) {
            System.out.println(color);
        }

    }
}
