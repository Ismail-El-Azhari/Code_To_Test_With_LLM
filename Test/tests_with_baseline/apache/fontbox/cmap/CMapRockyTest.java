package org.apache.fontbox.cmap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class CMapRockyTest {
    @Test
    @DisplayName("toCID(int,int)")
    void test955ToCID$int_int() {
        // Arrange
        CMap receiver = this.createCMap();
        int code = 4;
        int length = 2;
        // Act
        int actual = receiver.toCID(code, length);
        // Assert
        int expected = 4;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    CMap createCMap() {
        // Recreated from trace
        CMap receiver = new CMap();
        receiver.setRegistry("Adobe");
        receiver.setOrdering("Identity");
        receiver.setSupplement(0);
        receiver.setName("Identity-H");
        receiver.setVersion("10.003");
        receiver.setType(1);
        receiver.setWMode(0);
        return receiver;
    }

    @Test
    @DisplayName("toCID(int,int)")
    void test953ToCID$int_int() {
        // Arrange
        CMap receiver = this.createCMap();
        int code = 3;
        int length = 2;
        // Act
        int actual = receiver.toCID(code, length);
        // Assert
        int expected = 3;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("toCID(int)")
    void test943ToCID$int() {
        // Arrange
        CMap receiver = this.createCMap();
        int code = 3;
        // Act
        int actual = receiver.toCID(code);
        // Assert
        int expected = 3;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("toCID(int)")
    void test946ToCID$int() {
        // Arrange
        CMap receiver = this.createCMap();
        int code = 4;
        // Act
        int actual = receiver.toCID(code);
        // Assert
        int expected = 4;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }
}