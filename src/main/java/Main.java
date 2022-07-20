import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food meat = new Meat(5,100.00F);
        Food redApple = new Apple(10,50.00F, Colour.RED);
        Food greenApple = new Apple(8,60.00F,Colour.GREEN);

        Food[] foods = new Food[3];
        foods[0] = meat;
        foods[1] = redApple;
        foods[2] = greenApple;

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма всех товаров без скидки: "+
                String.format("%.2f",shoppingCart.getSumWithoutDiscount()) + "\n");

        //выводится именно скидка, а не конечная стоимость со скидкой
        System.out.println("Сумма скидки для всей корзины: " + String.format("%.2f",shoppingCart.getDiscount()) + "\n");

        /* из формулировки не очень понял - может, в ТЗ это имелось в виду?
        стоимость всех товаров в корзине со скидкой
        System.out.println("Сумма скидки для всей корзины: " +
        String.format("%.2f",shoppingCart.getSumWithDiscount()) + "\n");
         */

        System.out.println("Сумма всех вегетарианских продуктов без скидки: " +
                String.format("%.2f",shoppingCart.getSumVegetarianWithoutDiscount()) + "\n");
        System.out.println(1000 / 100 % 7 * 2);

    }
}
