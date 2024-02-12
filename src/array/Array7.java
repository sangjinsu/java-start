package array;

import java.util.Scanner;

public class Array7 {

    public static void main(String[] args) {
        // 1. add product
        // 2. list products
        // 3. exit


        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[100];
        int[] productPrices = new int[100];
        int productCount = 0;


        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. List products");
            System.out.println("3. Exit");
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            if (number == 1) {
                System.out.print("Enter product name: ");
                String productName = scanner.nextLine();
                System.out.print("Enter product price: ");
                int productPrice = scanner.nextInt();
                scanner.nextLine();

                productNames[productCount] = productName;
                productPrices[productCount] = productPrice;
                productCount++;
            } else if (number == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " - " + productPrices[i]);
                }
            } else if (number == 3) {
                scanner.close();
                break;
            }
        }


    }
}
