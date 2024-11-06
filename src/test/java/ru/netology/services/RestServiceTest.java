package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/freelance.csv")
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    public void testRest(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();
        int restMonths = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, restMonths);
    }
}
