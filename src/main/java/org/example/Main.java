package org.example;

/*
Реалізувати функцію, яка отримує на вхід масив цін на машини, задану ціну і кількість шукаємих цін. Функція повертає задану кількість цін із масиву цін, які знаходяться найближче до заданої ціни. Наприклад:
- масив цін на машини [1000, 1100, 2000, 1500, 1800, 1700, 1701]
- кількість шукаємих цін: 2
- задана ціна: 1700
- результат -> масив із цін [1500, 2000]
Create a method, which receives array of prices, price value and number of results, which are closest to the price value.
Example, [1000, 1100, 2000, 1500] , function(2, 1700, array[]), return 1500, 2000;
 */
public class Main {

    public static void main(String[] args) {
        int[] prices = {1701, 1000, 1100, 2000, 1500, 1700, 1702};
        int[] prices1 = function(prices, 1700, 2);
        for (int i = 0; i < prices1.length; i++) {
            System.out.print(prices1[i] + "  ");
        }
    }

    private static int[] function(int[] prices, int price, int numberOfResults) {
        int[] result = new int[numberOfResults];
        if(prices.length <= result.length){
            return prices;
        }
        for (int i = 0; i < prices.length; i++) {
           putPriceWithLessDifferenceIntoArray(result, prices[i], price);
        }
        return result;
    }

    private static void putPriceWithLessDifferenceIntoArray(int[] result, int priceOfCar, int givenPrice) {
            for (int i = 0; i < result.length; i++) {
                if(result[i] == 0){
                    result[i] = priceOfCar;
                    break;
                }
                int diffPriceOfCar = Math.abs(priceOfCar - givenPrice);
                int diffPriceFromRes = Math.abs(result[i] - givenPrice);
                if(diffPriceFromRes > diffPriceOfCar){
                        int temp = result[i];
                        result[i] = priceOfCar;
                        putPriceWithLessDifferenceIntoArray(result, temp, givenPrice);
                        i++;
                }
            }
        }

}