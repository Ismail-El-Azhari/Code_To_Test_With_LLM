package org.apache.pdfbox.io;
import java.io.IOException;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class RandomAccessInputStreamRockyTest {
    RandomAccessInputStream createRandomAccessInputStream5() throws IOException {
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
        // Recreated from trace
        RandomAccessReadView receiver1 = new RandomAccessReadView(receiver0, 499L, 78L);
        receiver1.seek(0L);
        receiver1.seek(0L);
        receiver1.read();
        receiver1.seek(1L);
        receiver1.read();
        // Recreated from trace
        RandomAccessInputStream receiver2 = new RandomAccessInputStream(receiver1);
        receiver2.read();
        receiver2.read();
        return receiver2;
    }

    RandomAccessInputStream createRandomAccessInputStream2() throws IOException {
        Path receiver = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.seek(499L);
        // Recreated from trace
        RandomAccessReadView receiver1 = new RandomAccessReadView(receiver0, 499L, 78L);
        receiver1.seek(0L);
        // Recreated from trace
        return new RandomAccessInputStream(receiver1);
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test1062Read$byte___int_int() throws IOException {
        // Arrange
        RandomAccessInputStream receiver = this.createRandomAccessInputStream5();
        byte[] b = new byte[]{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int off = 0;
        int len = 2048;
        // Act
        int actual = receiver.read(b, off, len);
        // Assert
        int expected = 76;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessInputStream createRandomAccessInputStream() throws IOException {
        Path receiver = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver0 = new RandomAccessReadBufferedFile(receiver);
        receiver0.seek(499L);
        receiver0.seek(499L);
        receiver0.seek(499L);
        receiver0.read();
        // Recreated from trace
        RandomAccessReadView receiver1 = new RandomAccessReadView(receiver0, 499L, 78L);
        receiver1.seek(0L);
        receiver1.seek(0L);
        receiver1.read();
        // Recreated from trace
        RandomAccessInputStream receiver2 = new RandomAccessInputStream(receiver1);
        receiver2.read();
        return receiver2;
    }

    @Test
    @DisplayName("read()")
    void test1051Read$() throws IOException {
        // Arrange
        RandomAccessInputStream receiver = this.createRandomAccessInputStream();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 156;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read()")
    void test1056Read$() throws IOException {
        // Arrange
        RandomAccessInputStream receiver = this.createRandomAccessInputStream2();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 120;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }
}