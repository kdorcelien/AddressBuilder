package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Full Name: ");
        String name = input.nextLine();

// BILLING ADDRESS
        System.out.println("Please enter your current Billing street: ");
        String billingStreet = input.nextLine();

        System.out.println("Please enter your current Billing city: ");
        String billingCity = input.nextLine();

        System.out.println("Please enter your current Billing State: ");
        String billingState = input.nextLine();

        System.out.println("Please enter your current Billing zip: ");
        String billingZip = input.nextLine();

// SHIPPING ADDRESS
        System.out.println("Please enter your current Shipping street: ");
        String shippingStreet = input.nextLine();

        System.out.println("Please enter your current Shipping city: ");
        String shippingCity = input.nextLine();

        System.out.println("Please enter your current Shipping State: ");
        String shippingState = input.nextLine();

        System.out.println("Please enter your current Shipping zip: ");
        String shippingZip = input.nextLine();

        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(", ");
        billingAddress.append(billingState).append(" ");
        billingAddress.append(billingZip);

        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity).append(", ");
        shippingAddress.append(shippingState).append(" ");
        shippingAddress.append(shippingZip);

        System.out.println(name + "\n" + "Billing Address:" + "\n" + billingAddress + "\n" + "Shipping Address:" + "\n" + shippingAddress );


    }
}
