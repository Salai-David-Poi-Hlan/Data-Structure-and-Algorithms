package DSA;

public class Shop {
    private int shirtAmount;
    private double shirtPrice;
    private int bagAmount;
    private double bagPrice;
    private int shoesAmount;
    private double shoesPrice;

    public Shop(){
        shirtAmount=0;
        shirtPrice=150.0;
        bagAmount=0;
        bagPrice=990.0;
        shoesAmount=0;
        shoesPrice=1690.0;
    }
    public void addShirt(){
        shirtAmount++;
    }
    public void addBag(){
        bagAmount++;
    }
    public void addShoe(){
        shoesAmount++;
    }

    public void viewCart(){
        System.out.println("----Cart Summary----");
        System.out.println("Shirt: "+shirtAmount);
        System.out.println("Bag: "+bagAmount);
        System.out.println("Shoe: "+shoesAmount);
        System.out.println("Total price = "+(shirtAmount*shirtPrice+bagAmount*bagPrice+shoesAmount*shoesPrice)+" baht.");
        System.out.println("---------------------");
    }
}
