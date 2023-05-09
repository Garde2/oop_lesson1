import Products.Product;
import Products.Tea;
import Products.Yogurt;
import Products.Milk;

public class Main {

    public static void main(String[] args) {

        Product item = new Product("Lemonade", 88);
        item.setCost(100);
        System.out.println( item.toString());

        VendingMachine vendingMachine = new VendingMachine(300);

        vendingMachine.addProduct(new Yogurt("Danone", 300,  "cold", 500))

                      .addProduct(new Product("cheese", 300))
                      .addProduct(new Product("water", 10))
                      .addProduct(new Product("wine", 330))                
                      .addProduct(new Milk("CoconutMilk", 300, "cold", 300));
        vendingMachine.addProduct(new Milk("CowMilk", 350, "hot", 500));
        vendingMachine.addProduct(new Tea("HotLemonTea", 200, "hot", 500));
        vendingMachine .addProduct(new Tea("ColdLemonTea", 200, "cold", 300 ));

        for (int i = 0; i < vendingMachine.getList().size(); i++) {

            System.out.println(vendingMachine.getList().get(i));
        }

        Product found = vendingMachine.findProduct("CowMilk");

        System.out.println(found);

        System.out.println("Покупаем товар");

        Product sold = vendingMachine.sellProduct(found);

        System.out.println(sold);        

        System.out.println("В автомате столько денег:");

        System.out.println(vendingMachine.getAmount());

        System.out.println("---------------------");

        for (int i = 0; i < vendingMachine.getList().size(); i++) {

            System.out.println(vendingMachine.getList().get(i));
        }

        System.out.println("Покупаем товар");

        Product perfume = vendingMachine.sellProduct(vendingMachine.findProduct("Si"));

        System.out.println(perfume);

        System.out.println("Осталось товаров: ");

        for (int i = 0; i < vendingMachine.getList().size(); i++) {

            System.out.println(vendingMachine.getList().get(i));
        }

        System.out.println("Денег в автомате: ");

        System.out.println(vendingMachine.getAmount());

        try {

            Product perf = vendingMachine.sellProduct(vendingMachine.findProduct("Si"));
            System.out.println(perf);

        } catch (RuntimeException e) {

            System.out.println(e.getMessage());
        }
    }
}