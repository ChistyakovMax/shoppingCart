package model;

public abstract class Food implements Discountable{
    protected int amount;
    protected float price;

    protected boolean isVegetarian;

    public Food(int amount, float price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public float getPrice(){
        return this.price;
    }

    public int getAmount() {return this.amount;}

    public boolean isVegetarian(){
        return isVegetarian;
    }
}
