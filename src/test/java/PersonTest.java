import models.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
        // adnotacja
    void shouldCalculateCorrectSalary() {
        Person tomHanks = new Person("Tom", "Hanks");
        int actual = tomHanks.calculateSalary(3, 3);
        int expected = 9;

        assertThat(actual).as("Wynagrodzenie actora zostalo policzone nie prawidlowo").isGreaterThan(5);
    }

    @Test
    void shouldCalculateBonus()
    {
        Person tomCruise = new Person("Tom", "Hanks");
        int actual = tomCruise.giveBonus(3, 10);
        int expected = 20;
        assertThat(actual).as("Bonus actora zostal policzone nie prawidlowo").isEqualTo(expected);
    }
    @Test
    void shouldCalculateBonusforRatingGraterThan10()
    {
        Person tomHanks = new Person("Tom", "Hanks");
        int actual = tomHanks.giveBonus(11, 10);
        int expected = 10;
        assertThat(actual).as("Bonus actora zostal policzone nie prawidlowo").isEqualTo(expected);
    }
}