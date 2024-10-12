package DSA;
import java.util.*;

public class MainShop {
    public static void main(String[] args) {
        Shop shop=new Shop();
        while (true) {
            int menu;
            System.out.println("===Shopping===");
            System.out.println("1. Shirt 150 baht");
            System.out.println("2. Bag 990 baht");
            System.out.println("3. Shoes 1690 baht");
            System.out.println("4. View Cart");
            System.out.println("5. Exit");
            System.out.println("=====================");
            Scanner keyboard=new Scanner(System.in);
            System.out.print("Choose 1-5 : ");
            menu=keyboard.nextInt();
            if(menu==4){
                shop.viewCart();
            }
            else if(menu==1){
                shop.addShirt();
            }
            else if(menu==2){
                shop.addBag();
            }
            else if(menu==3){
                shop.addShoe();
            }else{
                System.exit(0);
            }

        }
    }
}
