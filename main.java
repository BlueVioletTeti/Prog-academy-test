// Task
// Задача:
// - користувач вводить курс Bitcoin до доллара
// - користувач вводить суму доларів, що хоче поміняти на Bitcoin
// - програма повертає кількість Bitcoin, що можна купити на вказану суму.

// Приклад:

// What is Bitcoin price today?
// 21000
// How much $ do you have?
// 1000
// You can buy 0.0476190 BTC

public class progTest {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is Bitcoin price today?");
        double price = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How much $ do you have?");
        double budget = scanner2.nextDouble();

        double buy = budget/price;
        System.out.println("You can buy "+buy+" BTC");

    }
}
