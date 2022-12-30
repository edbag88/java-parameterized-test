import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class Programm {
    @RunWith(Parameterized.class)
    public class CheckIsAdultTest {

        private final int age;
        private final boolean result;

        public CheckIsAdultTest(int age, boolean result) {
            this.age = age;
            this.result = result;
        }

        @Parameterized.Parameters // Пометь метод аннотацией для параметров
        public static Object[][] getTextData() {
            return new Object[][] {
                    { 17, false},
                    { 18, true},
                    { 20, true},
                    { 21, true},// Заполни массив тестовыми данными и ожидаемым результатом
            };
        }

        @Test
        public void checkIsAdultWhenAgeThenResult() {
            Program program = new Program();
            boolean isAdult = program.checkIsAdult(age);
            assertEquals("Текст ошибки", result, isAdult);
        }
    }
}
