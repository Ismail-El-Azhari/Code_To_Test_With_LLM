package org.apache.fontbox.ttf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class NamingTableRockyTest {
    @Test
    @DisplayName("getName(int,int,int,int)")
    void test102GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 2;
        int platformId = 0;
        int encodingId = 3;
        int languageId = 0;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName(int,int,int,int)")
    void test97GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 2;
        int platformId = 0;
        int encodingId = 2;
        int languageId = 0;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName(int,int,int,int)")
    void test101GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 1;
        int platformId = 0;
        int encodingId = 4;
        int languageId = 0;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName(int,int,int,int)")
    void test103GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 1;
        int platformId = 0;
        int encodingId = 2;
        int languageId = 0;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName(int,int,int,int)")
    void test98GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 1;
        int platformId = 0;
        int encodingId = 0;
        int languageId = 0;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName(int,int,int,int)")
    void test100GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 1;
        int platformId = 0;
        int encodingId = 1;
        int languageId = 0;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName(int,int,int,int)")
    void test95GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 1;
        int platformId = 3;
        int encodingId = 1;
        int languageId = 1033;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = "";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName(int,int,int,int)")
    void test104GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 2;
        int platformId = 0;
        int encodingId = 4;
        int languageId = 0;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName(int,int,int,int)")
    void test96GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 1;
        int platformId = 0;
        int encodingId = 3;
        int languageId = 0;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName(int,int,int,int)")
    void test99GetName$int_int_int_int() {
        // Arrange
        NamingTable receiver = new NamingTable();
        int nameId = 2;
        int platformId = 0;
        int encodingId = 1;
        int languageId = 0;
        // Act
        String actual = receiver.getName(nameId, platformId, encodingId, languageId);
        // Assert
        String expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }
}