package drinkauto;

public class Drinks{

    public enum DrinksMachine {
        TEA("Чай", DrinksPrice.PRICE_TEA),
        COFFEE("Coffee", DrinksPrice.PRICE_COFFEE),
        LEMONADE("Limonade", DrinksPrice.PRICE_LEMONADE),
        MOHITO("Mohito", DrinksPrice.PRICE_MOHITO),
        MINERALWATER("Mineral Water", DrinksPrice.PRICE_MINERALWATER),
        COCACOLA("Coca-cola", DrinksPrice.PRICE_COCACOLA);

        private String name;
        private int price;

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        DrinksMachine(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static class DrinksPrice {
        public final static int PRICE_TEA = 4;
        public final static int PRICE_COFFEE = 5;
        public final static int PRICE_LEMONADE = 6;
        public final static int PRICE_MOHITO = 7;
        public final static int PRICE_MINERALWATER = 7;
        public final static int PRICE_COCACOLA = 8;

    }
}
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
