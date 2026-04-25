package org.apache.pdfbox.filter;
import java.io.IOException;
import java.nio.file.Path;
import org.apache.pdfbox.io.RandomAccessInputStream;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.io.RandomAccessReadView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class FlateFilterDecoderStreamRockyTest {
    @Test
    @DisplayName("read(byte[],int,int)")
    void test747Read$byte___int_int() throws IOException {
        // Arrange
        FlateFilterDecoderStream receiver = this.createFlateFilterDecoderStream();
        byte[] data = new byte[]{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int offset = 0;
        int length = 8192;
        // Act
        int actual = receiver.read(data, offset, length);
        // Assert
        int expected = 570;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    FlateFilterDecoderStream createFlateFilterDecoderStream() throws IOException {
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
        // Recreated from trace
        return new FlateFilterDecoderStream(receiver2);
    }
}