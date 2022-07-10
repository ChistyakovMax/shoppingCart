package service;

import model.Discountable;
import model.Food;

public class ShoppingCart implements Discountable {

    public Food[] foodList;

    public ShoppingCart(Food[] foods){
        foodList = new Food[foods.length];
        for (int i = 0; i < foods.length; i++){
            foodList[i] = foods[i];
        }
    }

    public float getSumWithoutDiscount(){
        float sum = 0.0F;
        for(Food f: foodList){
            sum += f.getPrice()*f.getAmount();
        }
        return sum;
    }

    public float getSumWithDiscount(){
        float sum = 0.0F;
        for(Food f: foodList){
            sum += (f.getPrice() - f.getDiscount())*f.getAmount();
        }
        return sum;
    }

    public float getSumVegetarianWithoutDiscount(){
        float sum = 0.0F;
        for(Food f: foodList){
            if (f.isVegetarian()) sum += f.getPrice()*f.getAmount();
        }
        return sum;
    }

    @Override //создал метод getDiscount для подсчёта скидки. Это будет работать быстрее, чем сумма() - суммаСоСкидкой() ?
    public float getDiscount() {
        float sum = 0.0F;
        for(Food f: foodList){
            sum += f.getDiscount()*f.getAmount();
        }
        return sum;
    }
}
