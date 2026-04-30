package org.apache.fontbox.cmap;
import java.io.IOException;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.io.RandomAccessReadWriteBuffer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class CMapParserRockyTest {
    @Test
    @DisplayName("parse(org.apache.pdfbox.io.RandomAccessRead)")
    void test34Parse$RandomAccessRead() throws IOException {
        // Arrange
        CMapParser receiver = new CMapParser();
        // Recreated from trace
        RandomAccessRead randomAccessRead = new RandomAccessReadWriteBuffer(2280);
        randomAccessRead.seek(0L);
        // Act
        CMap actual = receiver.parse(randomAccessRead);
        // Recreated from trace
        CMap expected = new CMap();
        expected.setName("Adobe-Identity-UCS");
        expected.setType(2);
        // Assert
        CMap expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("parse(org.apache.pdfbox.io.RandomAccessRead)")
    void test39Parse$RandomAccessRead() throws IOException {
        // Arrange
        CMapParser receiver = new CMapParser();
        // Recreated from trace
        RandomAccessRead randomAccessRead = new RandomAccessReadWriteBuffer(1932);
        randomAccessRead.seek(0L);
        // Act
        CMap actual = receiver.parse(randomAccessRead);
        // Recreated from trace
        CMap expected = new CMap();
        expected.setName("Adobe-Identity-UCS");
        expected.setType(2);
        // Assert
        CMap expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("parse(org.apache.pdfbox.io.RandomAccessRead)")
    void test38Parse$RandomAccessRead() throws IOException {
        // Arrange
        CMapParser receiver = new CMapParser();
        // Recreated from trace
        RandomAccessRead randomAccessRead = new RandomAccessReadWriteBuffer(1476);
        randomAccessRead.seek(0L);
        // Act
        CMap actual = receiver.parse(randomAccessRead);
        // Recreated from trace
        CMap expected = new CMap();
        expected.setName("Adobe-Identity-UCS");
        expected.setType(2);
        // Assert
        CMap expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("parse(org.apache.pdfbox.io.RandomAccessRead)")
    void test37Parse$RandomAccessRead() throws IOException {
        // Arrange
        CMapParser receiver = new CMapParser();
        // Recreated from trace
        RandomAccessRead randomAccessRead = new RandomAccessReadWriteBuffer(1080);
        randomAccessRead.seek(0L);
        // Act
        CMap actual = receiver.parse(randomAccessRead);
        // Recreated from trace
        CMap expected = new CMap();
        expected.setName("Adobe-Identity-UCS");
        expected.setType(2);
        // Assert
        CMap expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("parse(org.apache.pdfbox.io.RandomAccessRead)")
    void test33Parse$RandomAccessRead() throws IOException {
        // Arrange
        CMapParser receiver = new CMapParser();
        // Recreated from trace
        RandomAccessRead randomAccessRead = new RandomAccessReadWriteBuffer(904);
        randomAccessRead.seek(0L);
        // Act
        CMap actual = receiver.parse(randomAccessRead);
        // Recreated from trace
        CMap expected = new CMap();
        expected.setName("Adobe-Identity-UCS");
        expected.setType(2);
        // Assert
        CMap expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("parse(org.apache.pdfbox.io.RandomAccessRead)")
    void test31Parse$RandomAccessRead() throws IOException {
        // Arrange
        CMapParser receiver = new CMapParser();
        // Recreated from trace
        RandomAccessRead randomAccessRead = new RandomAccessReadWriteBuffer(1024);
        randomAccessRead.seek(0L);
        // Act
        CMap actual = receiver.parse(randomAccessRead);
        // Recreated from trace
        CMap expected = new CMap();
        expected.setName("Adobe-Identity-UCS");
        expected.setType(2);
        // Assert
        CMap expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("parse(org.apache.pdfbox.io.RandomAccessRead)")
    void test35Parse$RandomAccessRead() throws IOException {
        // Arrange
        CMapParser receiver = new CMapParser();
        // Recreated from trace
        RandomAccessRead randomAccessRead = new RandomAccessReadWriteBuffer(1084);
        randomAccessRead.seek(0L);
        // Act
        CMap actual = receiver.parse(randomAccessRead);
        // Recreated from trace
        CMap expected = new CMap();
        expected.setName("Adobe-Identity-UCS");
        expected.setType(2);
        // Assert
        CMap expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("parse(org.apache.pdfbox.io.RandomAccessRead)")
    void test32Parse$RandomAccessRead() throws IOException {
        // Arrange
        CMapParser receiver = new CMapParser();
        // Recreated from trace
        RandomAccessRead randomAccessRead = new RandomAccessReadWriteBuffer(968);
        randomAccessRead.seek(0L);
        // Act
        CMap actual = receiver.parse(randomAccessRead);
        // Recreated from trace
        CMap expected = new CMap();
        expected.setName("Adobe-Identity-UCS");
        expected.setType(2);
        // Assert
        CMap expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }
}