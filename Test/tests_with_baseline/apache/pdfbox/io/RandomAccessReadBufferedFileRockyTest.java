package org.apache.pdfbox.io;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class RandomAccessReadBufferedFileRockyTest {
    @Test
    @DisplayName("read()")
    void test211Read$() throws IOException {
        // Arrange
        RandomAccessReadBufferedFile receiver = this.createRandomAccessReadBufferedFile2();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 46;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadBufferedFile createRandomAccessReadBufferedFile29() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.seek(0L);
        receiver0.seek(334306L);
        return receiver0;
    }

    @Test
    @DisplayName("read()")
    void test220Read$() throws IOException {
        // Arrange
        RandomAccessReadBufferedFile receiver = this.createRandomAccessReadBufferedFile23();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 68;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read()")
    void test212Read$() throws IOException {
        // Arrange
        RandomAccessReadBufferedFile receiver = this.createRandomAccessReadBufferedFile5();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 70;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadBufferedFile createRandomAccessReadBufferedFile20() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        return receiver0;
    }

    RandomAccessReadBufferedFile createRandomAccessReadBufferedFile5() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        return receiver0;
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test226Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadBufferedFile receiver = this.createRandomAccessReadBufferedFile26();
        byte[] b = new byte[]{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int off = 0;
        int len = 76;
        // Act
        int actual = receiver.read(b, off, len);
        // Assert
        int expected = 76;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read()")
    void test218Read$() throws IOException {
        // Arrange
        RandomAccessReadBufferedFile receiver = this.createRandomAccessReadBufferedFile17();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 53;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read()")
    void test214Read$() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        receiver0.read();
        // Arrange
        // Act
        int actual = receiver0.read();
        // Assert
        int expected = 80;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadBufferedFile createRandomAccessReadBufferedFile17() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        return receiver0;
    }

    RandomAccessReadBufferedFile createRandomAccessReadBufferedFile2() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        return receiver0;
    }

    RandomAccessReadBufferedFile createRandomAccessReadBufferedFile14() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        return receiver0;
    }

    @Test
    @DisplayName("read()")
    void test215Read$() throws IOException {
        // Arrange
        RandomAccessReadBufferedFile receiver = this.createRandomAccessReadBufferedFile11();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 49;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadBufferedFile createRandomAccessReadBufferedFile11() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        receiver0.read();
        return receiver0;
    }

    @Test
    @DisplayName("getPosition()")
    void test208GetPosition$() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        // Arrange
        // Act
        long actual = receiver0.getPosition();
        // Assert
        long expected = 1L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read()")
    void test213Read$() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        // Arrange
        // Act
        int actual = receiver0.read();
        // Assert
        int expected = 37;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadBufferedFile createRandomAccessReadBufferedFile26() throws IOException {
        Path receiver = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.seek(499L);
        receiver0.seek(499L);
        receiver0.seek(499L);
        receiver0.read();
        receiver0.seek(500L);
        receiver0.seek(500L);
        receiver0.read();
        receiver0.seek(501L);
        receiver0.seek(501L);
        return receiver0;
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test230Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadBufferedFile receiver = this.createRandomAccessReadBufferedFile29();
        byte[] b = new byte[]{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int off = 0;
        int len = 2048;
        // Act
        int actual = receiver.read(b, off, len);
        // Assert
        int expected = 1566;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read()")
    void test219Read$() throws IOException {
        // Arrange
        RandomAccessReadBufferedFile receiver = this.createRandomAccessReadBufferedFile20();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 10;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read()")
    void test217Read$() throws IOException {
        // Arrange
        RandomAccessReadBufferedFile receiver = this.createRandomAccessReadBufferedFile14();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 45;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadBufferedFile createRandomAccessReadBufferedFile23() throws IOException {
        File receiver = new File("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.isEOF();
        receiver0.read();
        receiver0.read();
        return receiver0;
    }
}