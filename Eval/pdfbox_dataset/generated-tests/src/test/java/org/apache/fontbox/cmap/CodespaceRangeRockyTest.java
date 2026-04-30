package org.apache.fontbox.cmap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class CodespaceRangeRockyTest {
    @Test
    @DisplayName("isFullMatch(byte[],int)")
    void test1224IsFullMatch$byte___int() {
        // Arrange
        CodespaceRange receiver = new CodespaceRange(new byte[]{ 0, 0 }, new byte[]{ -1, -1 });
        byte[] code = new byte[]{ 0, 74 };
        int codeLen = 2;
        // Act
        boolean actual = receiver.isFullMatch(code, codeLen);
        // Assert
        boolean expected = true;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isFullMatch(byte[],int)")
    void test1228IsFullMatch$byte___int() {
        // Arrange
        CodespaceRange receiver = new CodespaceRange(new byte[]{ 0, 0 }, new byte[]{ -1, -1 });
        byte[] code = new byte[]{ 0, 4 };
        int codeLen = 2;
        // Act
        boolean actual = receiver.isFullMatch(code, codeLen);
        // Assert
        boolean expected = true;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isFullMatch(byte[],int)")
    void test1225IsFullMatch$byte___int() {
        // Arrange
        CodespaceRange receiver = new CodespaceRange(new byte[]{ 0, 0 }, new byte[]{ -1, -1 });
        byte[] code = new byte[]{ 0, 85 };
        int codeLen = 2;
        // Act
        boolean actual = receiver.isFullMatch(code, codeLen);
        // Assert
        boolean expected = true;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isFullMatch(byte[],int)")
    void test1229IsFullMatch$byte___int() {
        // Arrange
        CodespaceRange receiver = new CodespaceRange(new byte[]{ 0, 0 }, new byte[]{ -1, -1 });
        byte[] code = new byte[]{ 0, 51 };
        int codeLen = 2;
        // Act
        boolean actual = receiver.isFullMatch(code, codeLen);
        // Assert
        boolean expected = true;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isFullMatch(byte[],int)")
    void test1227IsFullMatch$byte___int() {
        // Arrange
        CodespaceRange receiver = new CodespaceRange(new byte[]{ 0, 0 }, new byte[]{ -1, -1 });
        byte[] code = new byte[]{ 0, 116 };
        int codeLen = 2;
        // Act
        boolean actual = receiver.isFullMatch(code, codeLen);
        // Assert
        boolean expected = true;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isFullMatch(byte[],int)")
    void test1231IsFullMatch$byte___int() {
        // Arrange
        CodespaceRange receiver = new CodespaceRange(new byte[]{ 0, 0 }, new byte[]{ -1, -1 });
        byte[] code = new byte[]{ 0, 34 };
        int codeLen = 2;
        // Act
        boolean actual = receiver.isFullMatch(code, codeLen);
        // Assert
        boolean expected = true;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isFullMatch(byte[],int)")
    void test1226IsFullMatch$byte___int() {
        // Arrange
        CodespaceRange receiver = new CodespaceRange(new byte[]{ 0, 0 }, new byte[]{ -1, -1 });
        byte[] code = new byte[]{ 0, 3 };
        int codeLen = 2;
        // Act
        boolean actual = receiver.isFullMatch(code, codeLen);
        // Assert
        boolean expected = true;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }
}