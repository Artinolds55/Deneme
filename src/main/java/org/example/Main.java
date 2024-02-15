package org.example;

import org.example.service.CardService;
import org.example.service.DeliveryService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private CardService cardService;
    private DeliveryService deliveryService;

    public Main(CardService cardService, DeliveryService deliveryService) {
        this.cardService = cardService;
        this.deliveryService = deliveryService;
    }

    public void shopping(){


    }
}





//Task:
//Design a Shopping cart: Create Classes/Interfaces, think of multiple options for Payment and Deliver methods
//- Use any Design Pattern which can be suitable here