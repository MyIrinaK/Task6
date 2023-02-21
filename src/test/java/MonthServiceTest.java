import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthServiceTest {
    @Test
    void shouldCalculateForMonth() {
        MonthService service = new MonthService();
        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        long expected = 3;
        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateForMonthSecond() {
        MonthService service = new MonthService();
        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60000;
        int threshold = 150_000;
        long expected = 2;
        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}
