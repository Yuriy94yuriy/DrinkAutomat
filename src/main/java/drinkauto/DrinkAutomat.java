package drinkauto;

import java.util.Arrays;
import java.util.Scanner;

public class DrinkAutomat {
    public static int calculatedPrice = 0;
    public static Scanner scr = new Scanner(System.in);

    public static int number;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome! You have below drinks for select: " +
                    "\n1.TEA." +
                    "\n2.COFFEE" +
                    "\n3.LEMONADE" +
                    "\n4.MOHITO" +
                    "\n5.MINERAL WATER" +
                    "\n6.COCACOLA" +
                    "\nPlease insert your drink: ");
            chooseTheDrinks();
            System.out.println("Do you want make more order?");
            totalPriceCalculation();
            while (true) {
                String answer = scr.nextLine();
                if (answer.equals("YES")) {
                    break;
                } else if (answer.equals("NO")) {
                    System.out.println("Thanks for order!");
                    System.out.println("Your total price is: ");
                    return;

                }
            }
        }
    }

    public static void chooseTheDrinks() {
        String choice = scr.nextLine();
        System.out.println("Select quantity: ");
        number = scr.nextInt();
        choice = choice.toUpperCase();
        Drinks.DrinksMachine drinksChoice = Drinks.DrinksMachine.valueOf(choice);
        switch (drinksChoice) {
            case TEA:
                System.out.println("Tea selected!");
                calculatedPrice = number * Drinks.DrinksMachine.TEA.getPrice();
                System.out.println("Price: " + calculatedPrice);
                break;
            case COFFEE:
                System.out.println("Coffee selected!");
                calculatedPrice = number * Drinks.DrinksMachine.COFFEE.getPrice();
                System.out.println("Price: " + calculatedPrice);
                break;
            case LEMONADE:
                System.out.println("Lemonade selected!");
                calculatedPrice = number * Drinks.DrinksMachine.LEMONADE.getPrice();
                System.out.println("Price: " + calculatedPrice);
                break;
            case MOHITO:
                System.out.println("Mohito selected!");
                calculatedPrice = number * Drinks.DrinksMachine.MOHITO.getPrice();
                System.out.println("Price: " + calculatedPrice);
                break;
            case COCACOLA:
                System.out.println("Coca-cola selected!");
                calculatedPrice = number * Drinks.DrinksMachine.COCACOLA.getPrice();
                System.out.println("Price: " + calculatedPrice);
                break;
            case MINERALWATER:
                System.out.println("Mineral Water selected!");
                calculatedPrice = number * Drinks.DrinksMachine.MINERALWATER.getPrice();
                System.out.println("Price: " + calculatedPrice);
                break;
            default:
                System.out.println("Wrong");
        }
    }

    public static void totalPriceCalculation() {
        int totalResult = 0;
        totalResult =


    }
}





      //  String value = Integer.toString(number);
     //   Drinks.DrinksMachine totalPrice = Drinks.DrinksMachine.valueOf(value);
     //   switch(totalPrice){
    //        case COCACOLA:
    //            totalPrice =






//Інструменти для використання:
//1) enum (напої)
//2) константи (ціни)
//3) static (загальна вартість)
//4) switch (вибір напою)
//Завдання:
//#1 зробіть enum DrinksMachine, який вміє робити КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ;
//#2 Зробіть клас Drinks, де константами задайте ціну напою;
//#3 Зробіть підрахунок кількості виготовлених напоїв та загальної суми, яку повинен заплатити клієнт;
//#4 Зробіть спосіб приготування кожного напою;
//#5 Зробіть switch-case оператор, який буде робити напій (викликаючи відповідний метод) в залежності від вибору клієнта;
//#6 Додайте можливість вибору напою для користувача і залежно від вибору робіть йому напій;
//#7 Користувач повинен мати можливість замовити кілька напоїв
//#8 І насамкінець клієнт має побачити, скільки грошей він повинен заплатити;
//Приклад перетворення рядка в enum:
//
//String drinksChoice = "tea";
//drinksChoice.toUpperCase();
//Drinks drinks = Drinks.valueOf(drinksChoice);