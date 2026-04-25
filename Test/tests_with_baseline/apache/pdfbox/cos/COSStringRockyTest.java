package org.apache.pdfbox.cos;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class COSStringRockyTest {
    @Test
    @DisplayName("getString()")
    void test1285GetString$() {
        COSString receiver = new COSString(new byte[]{ 73, 100, 101, 110, 116, 105, 116, 121 }, false);
        receiver.setDirect(true);
        // Arrange
        // Act
        String actual = receiver.getString();
        // Assert
        String expected = "Identity";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getString()")
    void test1286GetString$() {
        COSString receiver = new COSString(new byte[]{ 65, 100, 111, 98, 101 }, false);
        receiver.setDirect(true);
        // Arrange
        // Act
        String actual = receiver.getString();
        // Assert
        String expected = "Adobe";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }
}