package pobiRacingCar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {
    @Test
    void doCreateCarName() {
        assertThat(new CarName("pobi")).isEqualTo(new CarName("pobi"));
    }

    @Test
    void invalidCarName() {
        assertThatThrownBy(() -> new CarName(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new CarName("")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new CarName("    ")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new CarName("helloworld")).isInstanceOf(IllegalArgumentException.class);

    }
}