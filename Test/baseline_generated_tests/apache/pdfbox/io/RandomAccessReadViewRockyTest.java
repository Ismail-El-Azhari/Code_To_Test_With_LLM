package org.apache.pdfbox.io;
import java.io.IOException;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class RandomAccessReadViewRockyTest {
    @Test
    @DisplayName("isEOF()")
    void test523IsEOF$() throws IOException {
        // Arrange
        RandomAccessReadView receiver = this.createRandomAccessReadView1();
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read()")
    void test545Read$() throws IOException {
        // Arrange
        RandomAccessReadView receiver = this.createRandomAccessReadView1();
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 120;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessReadView createRandomAccessReadView1() throws IOException {
        Path randomAccessRead = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessRead randomAccessRead0 = new RandomAccessReadBufferedFile(randomAccessRead);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead0, 499L, 78L, false);
        receiver.seek(0L);
        return receiver;
    }

    @Test
    @DisplayName("getPosition()")
    void test520GetPosition$() throws IOException {
        RandomAccessRead randomAccessRead = this.createRandomAccessRead();
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead, 499L, 78L, false);
        receiver.seek(2L);
        // Arrange
        // Act
        long actual = receiver.getPosition();
        // Assert
        long expected = 2L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessRead createRandomAccessRead4() throws IOException {
        Path randomAccessRead = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessRead randomAccessRead0 = new RandomAccessReadBufferedFile(randomAccessRead);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.read();
        randomAccessRead0.seek(500L);
        randomAccessRead0.seek(500L);
        randomAccessRead0.read();
        return randomAccessRead0;
    }

    RandomAccessReadView createRandomAccessReadView11() throws IOException {
        Path randomAccessRead = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessRead randomAccessRead0 = new RandomAccessReadBufferedFile(randomAccessRead);
        randomAccessRead0.seek(499L);
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead0, 499L, 78L, false);
        receiver.seek(0L);
        return receiver;
    }

    @Test
    @DisplayName("seek(long)")
    void test570Seek$long() throws IOException {
        RandomAccessRead randomAccessRead = this.createRandomAccessRead6();
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead, 499L, 78L, false);
        receiver.seek(1L);
        // Arrange
        RandomAccessReadView receiver0 = receiver;
        long newOffset = 1L;
        // Act
        receiver0.seek(newOffset);
        RandomAccessRead randomAccessRead0 = this.createRandomAccessRead2();
        RandomAccessReadView receiver1 = new RandomAccessReadView(randomAccessRead0, 499L, 78L, false);
        receiver1.seek(1L);
        // Assert
        RandomAccessReadView receiverPost = receiver1;
        AssertJEqualityHelper.collectStatistics(receiver0, receiverPost);
        assertThat(receiver0).usingRecursiveComparison(nanAwareComparison()).isEqualTo(receiverPost);
    }

    RandomAccessRead createRandomAccessRead1() throws IOException {
        Path randomAccessRead = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessRead randomAccessRead0 = new RandomAccessReadBufferedFile(randomAccessRead);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.read();
        randomAccessRead0.seek(500L);
        randomAccessRead0.seek(500L);
        randomAccessRead0.read();
        randomAccessRead0.seek(501L);
        return randomAccessRead0;
    }

    @Test
    @DisplayName("read()")
    void test546Read$() throws IOException {
        RandomAccessRead randomAccessRead = this.createRandomAccessRead2();
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead, 499L, 78L, false);
        receiver.seek(1L);
        // Arrange
        // Act
        int actual = receiver.read();
        // Assert
        int expected = 156;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("seek(long)")
    void test569Seek$long() throws IOException {
        Path randomAccessRead = Path.of("CodeMonkey.pdf");
        RandomAccessRead randomAccessRead0 = new RandomAccessReadBufferedFile(randomAccessRead);
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead0, 499L, 78L, false);
        receiver.seek(0L);
        // Arrange
        RandomAccessReadView receiver0 = receiver;
        long newOffset = 0L;
        // Act
        receiver0.seek(newOffset);
        // Assert
        RandomAccessReadView receiverPost = this.createRandomAccessReadView11();
        AssertJEqualityHelper.collectStatistics(receiver0, receiverPost);
        assertThat(receiver0).usingRecursiveComparison(nanAwareComparison()).isEqualTo(receiverPost);
    }

    @Test
    @DisplayName("seek(long)")
    void test561Seek$long() throws IOException {
        RandomAccessRead randomAccessRead = this.createRandomAccessRead4();
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead, 499L, 78L, false);
        receiver.seek(2L);
        // Arrange
        RandomAccessReadView receiver0 = receiver;
        long newOffset = 2L;
        // Act
        receiver0.seek(newOffset);
        RandomAccessRead randomAccessRead0 = this.createRandomAccessRead1();
        RandomAccessReadView receiver1 = new RandomAccessReadView(randomAccessRead0, 499L, 78L, false);
        receiver1.seek(2L);
        // Assert
        RandomAccessReadView receiverPost = receiver1;
        AssertJEqualityHelper.collectStatistics(receiver0, receiverPost);
        assertThat(receiver0).usingRecursiveComparison(nanAwareComparison()).isEqualTo(receiverPost);
    }

    RandomAccessRead createRandomAccessRead6() throws IOException {
        Path randomAccessRead = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessRead randomAccessRead0 = new RandomAccessReadBufferedFile(randomAccessRead);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.read();
        return randomAccessRead0;
    }

    @Test
    @DisplayName("isEOF()")
    void test524IsEOF$() throws IOException {
        RandomAccessRead randomAccessRead = this.createRandomAccessRead1();
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead, 499L, 78L, false);
        receiver.seek(2L);
        // Arrange
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessRead createRandomAccessRead() throws IOException {
        Path randomAccessRead = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessRead randomAccessRead0 = new RandomAccessReadBufferedFile(randomAccessRead);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.read();
        randomAccessRead0.seek(500L);
        randomAccessRead0.seek(500L);
        randomAccessRead0.read();
        randomAccessRead0.seek(501L);
        randomAccessRead0.seek(501L);
        return randomAccessRead0;
    }

    @Test
    @DisplayName("length()")
    void test536Length$() throws IOException {
        Path randomAccessRead = Path.of("CodeMonkey.pdf");
        RandomAccessRead randomAccessRead0 = new RandomAccessReadBufferedFile(randomAccessRead);
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead0, 499L, 78L, false);
        receiver.seek(0L);
        // Arrange
        // Act
        long actual = receiver.length();
        // Assert
        long expected = 78L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("read(byte[],int,int)")
    void test553Read$byte___int_int() throws IOException {
        RandomAccessRead randomAccessRead = this.createRandomAccessRead1();
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead, 499L, 78L, false);
        receiver.seek(2L);
        // Arrange
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

    @Test
    @DisplayName("isEOF()")
    void test527IsEOF$() throws IOException {
        RandomAccessRead randomAccessRead = this.createRandomAccessRead2();
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead, 499L, 78L, false);
        receiver.seek(1L);
        // Arrange
        // Act
        boolean actual = receiver.isEOF();
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("seek(long)")
    void test565Seek$long() throws IOException {
        // Arrange
        RandomAccessReadView receiver = this.createRandomAccessReadView11();
        long newOffset = 0L;
        // Act
        receiver.seek(newOffset);
        // Assert
        RandomAccessReadView receiverPost = this.createRandomAccessReadView1();
        AssertJEqualityHelper.collectStatistics(receiver, receiverPost);
        assertThat(receiver).usingRecursiveComparison(nanAwareComparison()).isEqualTo(receiverPost);
    }

    @Test
    @DisplayName("length()")
    void test535Length$() throws IOException {
        RandomAccessRead randomAccessRead = this.createRandomAccessRead();
        RandomAccessReadView receiver = new RandomAccessReadView(randomAccessRead, 499L, 78L, false);
        receiver.seek(2L);
        // Arrange
        // Act
        long actual = receiver.length();
        // Assert
        long expected = 78L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    RandomAccessRead createRandomAccessRead2() throws IOException {
        Path randomAccessRead = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessRead randomAccessRead0 = new RandomAccessReadBufferedFile(randomAccessRead);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.seek(499L);
        randomAccessRead0.read();
        randomAccessRead0.seek(500L);
        return randomAccessRead0;
    }
}