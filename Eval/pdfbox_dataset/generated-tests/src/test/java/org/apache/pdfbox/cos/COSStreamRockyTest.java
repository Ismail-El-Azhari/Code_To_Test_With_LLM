package org.apache.pdfbox.cos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import org.apache.pdfbox.io.RandomAccess;
import org.apache.pdfbox.io.RandomAccessInputStream;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.io.RandomAccessReadView;
import org.apache.pdfbox.io.RandomAccessReadWriteBuffer;
import org.apache.pdfbox.io.RandomAccessStreamCache;
import org.apache.pdfbox.io.RandomAccessStreamCacheImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class COSStreamRockyTest {
    COSStream createCOSStream() throws IOException {
        RandomAccessStreamCache receiver = new RandomAccessStreamCacheImpl();
        Path receiver0 = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver1 = new RandomAccessReadBufferedFile(receiver0);
        // Recreated from trace
        RandomAccessReadView receiver2 = new RandomAccessReadView(receiver1, 499L, 78L);
        // Recreated from trace
        COSStream receiver3 = new COSStream(receiver, receiver2);
        receiver3.setKey(null);
        receiver3.createView();
        return receiver3;
    }

    COSStream createCOSStream2() throws IOException {
        RandomAccessStreamCache receiver = new RandomAccessStreamCacheImpl();
        Path receiver0 = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver1 = new RandomAccessReadBufferedFile(receiver0);
        // Recreated from trace
        RandomAccessReadView receiver2 = new RandomAccessReadView(receiver1, 499L, 78L);
        // Recreated from trace
        COSStream receiver3 = new COSStream(receiver, receiver2);
        receiver3.setKey(null);
        return receiver3;
    }

    @Test
    @DisplayName("createView()")
    void test166CreateView$() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream2();
        // Act
        RandomAccessRead actual = receiver.createView();
        // Recreated from trace
        RandomAccess expected = new RandomAccessReadWriteBuffer(312);
        expected.write(new byte[]{ 2, 0, 0, -106, 47 });
        expected.seek(0L);
        // Assert
        RandomAccessRead expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    InputStream createInputStream() throws IOException {
        Path expected = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile expected0 = new RandomAccessReadBufferedFile(expected);
        expected0.seek(499L);
        // Recreated from trace
        RandomAccessReadView expected1 = new RandomAccessReadView(expected0, 499L, 78L);
        expected1.seek(0L);
        // Recreated from trace
        return new RandomAccessInputStream(expected1);
    }
}