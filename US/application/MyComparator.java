package application;

import java.util.Comparator;

import entities.Product252;

public class MyComparator implements Comparator<Product252> {

    @Override
    public int compare(Product252 p1, Product252 p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}