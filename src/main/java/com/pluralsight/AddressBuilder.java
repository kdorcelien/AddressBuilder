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
        billingAddress.append(billingStreet);
        billingAddress.append(billingCity);
        billingAddress.append(billingState);
        billingAddress.append(billingZip);

        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shippingStreet);
        shippingAddress.append(shippingCity);
        shippingAddress.append(shippingState);
        shippingAddress.append(shippingZip);

        System.out.println(name + "\n" + billingAddress + "\n" + shippingAddress );

    }
}
