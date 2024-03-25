import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        checkNormal(1,2,0);
        checkNormal(1,2,3);
        checkDiscount(1,2,4);
        checkFullReduction(1,2,4);
        }

    public static void checkNormal(int appleWeight,int strawberryWeight,int mangoWeight){
        Apple apple = new Apple();
        Strawberry strawberry = new Strawberry();
        Mango mango = new Mango();
        double totalPrice  = appleWeight * apple.getPrice() + mangoWeight * mango.getPrice()+strawberryWeight*strawberry.getPrice();
        System.out.println(totalPrice);
    }


    public static void checkDiscount(int appleWeight,int strawberryWeight,int mangoWeight){
        Apple apple = new Apple();
        Strawberry strawberry = new Strawberry();
        Mango mango = new Mango();
        double totalPrice  = appleWeight* apple.getPrice() + strawberryWeight * strawberry.getPrice()*0.8+mangoWeight*mango.getPrice();
        System.out.println(totalPrice);
    }

    public static void checkFullReduction(int appleWeight,int strawberryWeight,int mangoWeight){
        Apple apple = new Apple();
        Strawberry strawberry = new Strawberry();
        Mango mango = new Mango();
        double totalPrice  = appleWeight * apple.getPrice() + strawberryWeight * strawberry.getPrice()*0.8+mangoWeight*mango.getPrice();
        double discountPrice = (int)(totalPrice / 100) * 10;
        BigDecimal bg = new BigDecimal(totalPrice-discountPrice);
        double finalPrice = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(finalPrice);
    }
    
}