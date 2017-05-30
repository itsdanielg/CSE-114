// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 7, Problem 1

import java.util.ArrayList;

public class DessertCafe {

    public static void main(String[] args) {
        ArrayList<Dessert> desserts = new ArrayList<Dessert>();
        desserts.add(new Cake("Red Velvet Cake", 3));
        desserts.add(new Cake("Chocolate Cake", 4));
        desserts.add(new CookiePack("Oreo Cookies", 30, 1));
        desserts.add(new CookiePack("Peanut Butter Cookies", 15, 3));
        desserts.add(new IceCream("Dulce de Leche Ice Cream", 10));
        desserts.add(new IceCream("Butter Pecan Ice Cream", 12));
        desserts.add(new Sundae("Chocolate Sundae", 5, 3));
        desserts.add(new Sundae("Vanilla Sundae", 4, 6));
        for (int i = 0; i<desserts.size(); i++) {
            System.out.println(desserts.get(i).toString());
        }
    }

}

abstract class Dessert {

    protected String name;
    protected int cost;

    public abstract String getName();
    public abstract int getCost();

}

class Cake extends Dessert {

    private int layers;

    public Cake(String name, int layers) {
        this.name = name;
        this.layers = layers;
        this.cost = 15 + 2*layers;
    }

    public String toString() {
        return (name + ", $" + Integer.toString(cost));
    }

    public boolean equals(Object dessert) {
        if (dessert instanceof Dessert) {
            if (name == ((Dessert)dessert).name && cost == ((Dessert)dessert).cost)
                return true;
            else
                return false;
        }
        else return false;

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

}

class CookiePack extends Dessert {

    private int cookies;
    private int pricePerCookie;

    public CookiePack(String name, int cookies, int pricePerCookie) {
        this.name = name;
        this.cost = cookies*pricePerCookie;
        this.cookies = cookies;
        this.pricePerCookie = pricePerCookie;
    }

    public String toString() {
        return (name + ", $" + Integer.toString(cost));
    }

    public boolean equals(Object dessert) {
        if (dessert instanceof Dessert) {
            if (name == ((Dessert)dessert).name && cost == ((Dessert)dessert).cost)
                return true;
            else
                return false;
        }
        else return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

}

class IceCream extends Dessert {

    public IceCream(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String toString() {
        return (name + ", $" + Integer.toString(cost));
    }

    public boolean equals(Object dessert) {
        if (dessert instanceof Dessert) {
            if (name == ((Dessert)dessert).name && cost == ((Dessert)dessert).cost)
                return true;
            else
                return false;
        }
        else return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}

class Sundae extends IceCream {

    private int toppingCost;

    public Sundae(String name, int cost, int toppingCost) {
        super(name, cost);
        this.toppingCost = toppingCost;
        this.cost = cost + toppingCost;
    }

    public String toString() {
        return (name + ", $" + Integer.toString(cost));
    }

    public boolean equals(Object dessert) {
        if (dessert instanceof Dessert) {
            if (name == ((Dessert)dessert).name && cost == ((Dessert)dessert).cost)
                return true;
            else
                return false;
        }
        else return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

}
