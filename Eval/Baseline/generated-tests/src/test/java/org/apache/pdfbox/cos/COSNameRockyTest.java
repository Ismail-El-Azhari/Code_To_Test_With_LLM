package org.apache.pdfbox.cos;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class COSNameRockyTest {
    @Test
    @DisplayName("getName()")
    void test1131GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("Columns");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "Columns";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName()")
    void test1126GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("Type");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "Type";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName()")
    void test1128GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("DecodeParms");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "DecodeParms";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName()")
    void test1127GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("Filter");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "Filter";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName()")
    void test1130GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("Index");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "Index";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName()")
    void test1124GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("W");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "W";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName()")
    void test1122GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("Info");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "Info";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName()")
    void test1129GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("Predictor");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "Predictor";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName()")
    void test1125GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("Length");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "Length";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getName()")
    void test1123GetName$() {
        // Arrange
        COSName receiver = COSName.getPDFName("Root");
        // Act
        String actual = receiver.getName();
        // Assert
        String expected = "Root";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }
}