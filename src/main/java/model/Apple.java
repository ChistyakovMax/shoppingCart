package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{

    private final String colour;

    public Apple(int amount, float price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public float getDiscount() {
        float discount = Discount.noDiscount;
        if (this.colour == Colour.red) {
            discount = Discount.partDiscount;
        }
        return discount*this.price;
    }
}
