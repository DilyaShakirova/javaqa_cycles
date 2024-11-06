package ru.netology.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        int moneyForRest;
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses;
                moneyForRest = money / 3 * 2;
                money = money - moneyForRest;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}