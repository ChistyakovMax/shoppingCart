package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food{

    private final String colour; //исправил название, запомню про статические константы :)

    public Apple(int amount, float price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public float getDiscount() {
        float discount = Discount.NO_DISCOUNT;
        if (Objects.equals(this.colour, Colour.RED)) { //сделал сравнение через equals

            discount = Discount.PART_DISCOUNT/100.00F;
        }
        return discount*this.price;
    }
}
