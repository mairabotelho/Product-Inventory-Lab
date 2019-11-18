package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;  // (1)

    private static List<Sneaker> inventory = new ArrayList<>();  // (2)


    public static Sneaker create(String name, String brand, String sport, double size, int quantity, float price) {

        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);

        inventory.add(createdSneaker);

        return createdSneaker;
    }

    public Sneaker findSneaker(int id) {
        return inventory.get(id);
    }

    //read all
    public Sneaker[] findAll() {
        return inventory.toArray(new Sneaker[0]);
    }

    //delete
    public boolean delete(int id) {
        return inventory.remove(findSneaker(id));
    }



}
