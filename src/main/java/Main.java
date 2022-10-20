public class Main {
    public static void main(String[] args) {
        int bookNum = 201;
        System.out.println("c5 - " + bookNum % 5); // C = Bт
        System.out.println("c7 - " + bookNum % 7); // char
        System.out.println("c11 - " + bookNum % 11 + "\n"); // Обчислити суму найбільших елементів кожного рядка матриці

        System.out.println("\n" + "Sum = " + MatrixManipulator.manipulate());
    }
}