package service;

import model.Discountable;
import model.Food;

public class ShoppingCart implements Discountable {

    public Food[] foodList;

    public ShoppingCart(Food[] foods){
        foodList = new Food[foods.length];
        System.arraycopy(foods, 0, foodList, 0, foods.length); //сделал присвоение массива через arraycopy()
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
        for(Food food: foodList){ //исправил название переменной с f на food
            sum += (food.getPrice() - food.getDiscount())*food.getAmount();
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

    @Override //создал метод getDiscount для подсчёта скидки.Это будет работать быстрее, чем сумма() - суммаСоСкидкой()?
    public float getDiscount() {
        float sum = 0.0F;
        for(Food f: foodList){
            sum += f.getDiscount()*f.getAmount();
        }
        return sum;
    }
}
