package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{

    private final String COLOUR; //сделал переменную константой, т.к. мы её не должны менять, по идее + сама среда разработки подсказала мне сделать так

    public Apple(int amount, float price, String COLOUR) {
        super(amount, price, true);
        this.COLOUR = COLOUR;
    }

    @Override
    public float getDiscount() {
        float discount = Discount.NO_DISCOUNT;
        if (this.COLOUR == Colour.RED) {
            discount = Discount.PART_DISCOUNT;
        }
        return discount*this.price;
    }
}
