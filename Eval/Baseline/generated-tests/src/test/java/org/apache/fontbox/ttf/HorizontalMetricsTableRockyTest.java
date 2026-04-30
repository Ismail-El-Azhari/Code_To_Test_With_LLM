package org.apache.fontbox.ttf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class HorizontalMetricsTableRockyTest {
    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1011GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 51;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 54;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1014GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 74;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 44;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1016GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 185;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 46;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1013GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 164;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 56;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1017GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 671;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 96;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1018GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 34;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 59;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1015GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 4;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 17;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1019GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 170;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 39;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1012GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 85;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 37;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLeftSideBearing(int)")
    void test1020GetLeftSideBearing$int() {
        // Arrange
        HorizontalMetricsTable receiver = new HorizontalMetricsTable();
        int gid = 116;
        // Act
        int actual = receiver.getLeftSideBearing(gid);
        // Assert
        int expected = 54;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }
}