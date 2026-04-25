package org.apache.pdfbox.io;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class RandomAccessReadBufferRockyTest {
    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer47() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        return receiver;
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1347Read$byte___int_int() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        // Arrange
        byte[] b = new byte[]{ 0, 0, 0, 0, 0 };
        int offset = 0;
        int length = 5;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 5;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isEOF()")
    void test1315IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer11();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer29() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 29, 109, 0 }, 5, 0);
        return receiver;
    }

    @Test
    @DisplayName("isEOF()")
    void test1319IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer23();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1351Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer8();
        byte[] b = new byte[]{ 1, 0, 4, -75, 0 };
        int offset = 0;
        int length = 5;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 5;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1348Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer11();
        byte[] b = new byte[]{ 1, 0, 0, -40, 0 };
        int offset = 0;
        int length = 5;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 5;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer26() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 5, 0);
        return receiver;
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 29, 109, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 29, 109, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 71, 43, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 71, 43, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 72, -27, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 72, -27, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, 16, 102, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, 16, 102, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, 72, -52, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, 72, -52, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, 118, -51, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, 118, -51, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, 120, 36, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, 120, 36, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -84, 27, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -84, 27, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -82, -98, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -82, -98, 0 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 0 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 0 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 1 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 1 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 2 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 2 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 3 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 3 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 4 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 4 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 5 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 5 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 6 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 6 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 7 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 7 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 8 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 8 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 9 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 9 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 10 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 10 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 11 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 11 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 12 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 12 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 13 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 13 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 14 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 14 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 15 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 15 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 16 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 16 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 17 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 17 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 18 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 18 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 19 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 19 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 20 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 20 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 21 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 21 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 22 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 22 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 23 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 23 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 24 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 24 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 25 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 25 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 26 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 26 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 27 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 27 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 28 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 28 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 29 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 29 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 30 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 30 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 31 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 31 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 32 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 32 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 33 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 33 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 34 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 34 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 35 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 35 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 36 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 36 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 37 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 37 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 38 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 38 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 39 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 39 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 40 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 40 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 41 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 41 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 42 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 42 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 43 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 43 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 44 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 44 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 45 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 45 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 46 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 46 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 47 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 47 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 48 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 48 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 49 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 49 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 50 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 50 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 51 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 51 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 52 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 52 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 53 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 53 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 54 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 54 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 55 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 55 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 56 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 56 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 57 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 57 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 58 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 58 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 59 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 59 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 60 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 60 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 61 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 61 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 62 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 62 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 63 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 63 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 64 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 64 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 65 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 65 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 66 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 66 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 67 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 67 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 68 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 68 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 69 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 69 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 70 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 70 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 71 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 71 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 72 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 72 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 73 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 73 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 74 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 74 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 75 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 75 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 76 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 76 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 77 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 77 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 78 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 78 }, 0, 5);
        return receiver;
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1346Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer35();
        byte[] b = new byte[]{ 1, 0, 0, 15, 0 };
        int offset = 0;
        int length = 5;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 5;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer8() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        return receiver;
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer11() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        return receiver;
    }

    @Test
    @DisplayName("isEOF()")
    void test1322IsEOF$() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        // Arrange
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getPosition()")
    void test1305GetPosition$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer();
        // Act
        long actual = receiver.getPosition();
        // Assert
        long expected = 475L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("length()")
    void test1330Length$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer();
        // Act
        long actual = receiver.length();
        // Assert
        long expected = 475L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1349Read$byte___int_int() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        // Arrange
        byte[] b = new byte[]{ 1, 0, 0, 15, 0 };
        int offset = 5;
        int length = 0;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 0;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer50() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        return receiver;
    }

    @Test
    @DisplayName("length()")
    void test1332Length$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer2();
        // Act
        long actual = receiver.length();
        // Assert
        long expected = 475L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer2() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 29, 109, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 29, 109, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 71, 43, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 71, 43, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 72, -27, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 72, -27, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, 16, 102, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, 16, 102, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, 72, -52, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, 72, -52, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, 118, -51, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, 118, -51, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, 120, 36, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, 120, 36, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -84, 27, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -84, 27, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -82, -98, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -82, -98, 0 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 0 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 0 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 1 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 1 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 2 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 2 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 3 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 3 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 4 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 4 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 5 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 5 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 6 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 6 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 7 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 7 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 8 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 8 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 9 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 9 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 10 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 10 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 11 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 11 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 12 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 12 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 13 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 13 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 14 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 14 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 15 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 15 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 16 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 16 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 17 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 17 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 18 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 18 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 19 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 19 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 20 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 20 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 21 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 21 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 22 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 22 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 23 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 23 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 24 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 24 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 25 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 25 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 26 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 26 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 27 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 27 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 28 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 28 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 29 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 29 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 30 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 30 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 31 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 31 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 32 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 32 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 33 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 33 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 34 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 34 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 35 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 35 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 36 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 36 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 37 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 37 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 38 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 38 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 39 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 39 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 40 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 40 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 41 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 41 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 42 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 42 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 43 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 43 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 44 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 44 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 45 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 45 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, -106, 46 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, -106, 46 }, 0, 5);
        return receiver;
    }

    @Test
    @DisplayName("isEOF()")
    void test1316IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer14();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isEOF()")
    void test1320IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer26();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1344Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer38();
        byte[] b = new byte[]{ 1, 0, 6, 91, 0 };
        int offset = 5;
        int length = 0;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 0;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1345Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer26();
        byte[] b = new byte[]{ 1, 0, 4, -7, 0 };
        int offset = 0;
        int length = 5;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 5;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1353Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer50();
        byte[] b = new byte[]{ 1, 0, 4, -7, 0 };
        int offset = 5;
        int length = 0;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 0;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isEOF()")
    void test1321IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer29();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isEOF()")
    void test1314IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer8();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1352Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer47();
        byte[] b = new byte[]{ 1, 0, 0, -40, 0 };
        int offset = 5;
        int length = 0;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 0;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer44() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        return receiver;
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer5() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(820);
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 5, 0);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -67, 82, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -67, 82, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -66, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -66, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -57, 53, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -57, 53, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -56, -88, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -56, -88, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -17, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -17, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 1, -15, 42, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 1, -15, 42, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, 8, 65, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, 8, 65, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, 9, -89, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, 9, -89, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, 37, 31, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, 37, 31, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, 38, 111, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, 38, 111, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, 67, 6, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, 67, 6, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, 68, 107, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, 68, 107, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, -128, -111, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, -128, -111, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, -105, -56, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, -105, -56, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, -103, 45, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, -103, 45, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, -73, 92, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, -73, 92, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, -72, -88, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, -72, -88, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, -49, 27, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, -49, 27, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, -48, 84, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, -48, 84, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, -23, 109, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, -23, 109, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 2, -22, -52, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 2, -22, -52, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, 3, -118, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, 3, -118, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, 4, -39, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, 4, -39, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, 40, -10, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, 40, -10, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, 42, 107, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, 42, 107, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, 67, -98, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, 67, -98, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, 68, -60, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, 68, -60, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, 95, -17, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, 95, -17, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, 97, 70, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, 97, 70, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, -123, -31, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, -123, -31, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, -121, 64, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, -121, 64, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, -89, -5, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, -89, -5, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, -87, 69, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, -87, 69, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, -57, -19, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, -57, -19, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, -55, 6, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, -55, 6, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, -26, -61, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, -26, -61, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 3, -24, 37, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 3, -24, 37, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 9, -16, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 9, -16, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 11, 77, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 11, 77, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 33, -6, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 33, -6, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 35, 32, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 35, 32, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 62, 3, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 62, 3, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 63, 64, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 63, 64, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 88, 65, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 88, 65, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 89, -61, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 89, -61, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 113, -89, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 113, -89, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 123, 65, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 123, 65, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, 124, 107, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, 124, 107, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, -88, 127, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, -88, 127, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, -86, -86, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, -86, -86, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, -56, 76, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, -56, 76, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, -55, -93, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, -55, -93, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, -8, -1, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, -8, -1, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 4, -6, 57, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 4, -6, 57, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 5, 19, -113, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 5, 19, -113, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 5, 20, -41, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 5, 20, -41, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 5, 29, -91, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 5, 29, -91, 0 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 0 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 0 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 1 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 1 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 2 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 2 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 3 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 3 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 4 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 4 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 5 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 5 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 6 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 6 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 7 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 7 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 8 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 8 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 9 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 9 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 10 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 10 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 11 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 11 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 12 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 12 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 13 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 13 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 14 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 14 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 15 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 15 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 16 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 16 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 17 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 17 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 18 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 18 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 19 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 19 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 20 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 20 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 21 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 21 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 22 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 22 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 23 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 23 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 24 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 24 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 25 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 25 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 26 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 26 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 27 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 27 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 28 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 28 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 29 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 29 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 30 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 30 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 31 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 31 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 32 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 32 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 33 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 33 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 34 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 34 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 35 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 35 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 36 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 36 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 37 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 37 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 38 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 38 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 39 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 39 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 40 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 40 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 41 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 41 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 42 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 42 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 43 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 43 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 44 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 44 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 45 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 45 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 46 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 46 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 47 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 47 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 48 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 48 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 49 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 49 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 50 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 50 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 51 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 51 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 52 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 52 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 53 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 53 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 54 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 54 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 55 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 55 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 56 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 56 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 57 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 57 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 58 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 58 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 59 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 59 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 60 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 60 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 61 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 61 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 62 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 62 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 63 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 63 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 64 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 64 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 65 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 65 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 66 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 66 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 67 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 67 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 68 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 68 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 69 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 69 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 70 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 70 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 71 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 71 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 72 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 72 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 73 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 73 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 74 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 74 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 75 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 75 }, 0, 5);
        receiver.read(new byte[]{ 2, 0, 0, 56, 76 }, 5, 0);
        receiver.read(new byte[]{ 2, 0, 0, 56, 76 }, 0, 5);
        return receiver;
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer20() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 5, 0);
        return receiver;
    }

    @Test
    @DisplayName("isEOF()")
    void test1318IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer20();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer38() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 0, 5);
        return receiver;
    }

    @Test
    @DisplayName("getPosition()")
    void test1308GetPosition$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer2();
        // Act
        long actual = receiver.getPosition();
        // Assert
        long expected = 312L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getPosition()")
    void test1313GetPosition$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer5();
        // Act
        long actual = receiver.getPosition();
        // Assert
        long expected = 680L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("length()")
    void test1331Length$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer5();
        // Act
        long actual = receiver.length();
        // Assert
        long expected = 680L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("isEOF()")
    void test1323IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer35();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer14() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 29, 109, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 29, 109, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 71, 43, 0 }, 5, 0);
        return receiver;
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer17() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 29, 109, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 29, 109, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 71, 43, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 71, 43, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 72, -27, 0 }, 5, 0);
        return receiver;
    }

    @Test
    @DisplayName("isEOF()")
    void test1317IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer17();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer23() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 0, -40, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -75, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 4, -7, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 5, 0);
        receiver.read(new byte[]{ 1, 0, 6, 91, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 8, 56, 0 }, 5, 0);
        return receiver;
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1350Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessReadWriteBuffer receiver = this.createRandomAccessReadWriteBuffer44();
        byte[] b = new byte[]{ 1, 0, 4, -75, 0 };
        int offset = 5;
        int length = 0;
        // Act
        int actual = receiver.read(b, offset, length);
        // Assert
        int expected = 0;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadWriteBuffer createRandomAccessReadWriteBuffer35() throws IOException {
        // Recreated from trace
        RandomAccessReadWriteBuffer receiver = new RandomAccessReadWriteBuffer(312);
        receiver.write(new byte[]{ 2, 0, 0, -106, 47 });
        receiver.seek(0L);
        receiver.read(new byte[]{ 0, 0, 0, 0, 0 }, 0, 5);
        receiver.read(new byte[]{ 1, 0, 0, 15, 0 }, 5, 0);
        return receiver;
    }
}