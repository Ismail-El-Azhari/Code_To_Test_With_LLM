package org.apache.pdfbox.pdmodel.interactive.annotation;
import java.io.IOException;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSStream;
import org.apache.pdfbox.io.RandomAccessStreamCache;
import org.apache.pdfbox.io.RandomAccessStreamCacheImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class PDAppearanceEntryRockyTest {
    @Test
    @DisplayName("getAppearanceStream()")
    void test1164GetAppearanceStream$() {
        RandomAccessStreamCache entry = new RandomAccessStreamCacheImpl();
        COSDictionary entry0 = new COSStream(entry);
        // Arrange
        PDAppearanceEntry receiver = new PDAppearanceEntry(entry0);
        // Act
        PDAppearanceStream actual = receiver.getAppearanceStream();
        RandomAccessStreamCache expected = new RandomAccessStreamCacheImpl();
        // Recreated from trace
        COSStream expected0 = new COSStream(expected);
        // Assert
        PDAppearanceStream expected1 = new PDAppearanceStream(expected0);
        AssertJEqualityHelper.collectStatistics(actual, expected1);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected1);
    }

    @Test
    @DisplayName("getAppearanceStream()")
    void test1166GetAppearanceStream$() throws IOException {
        RandomAccessStreamCache entry = new RandomAccessStreamCacheImpl();
        // Recreated from trace
        COSStream entry0 = new COSStream(entry);
        entry0.createOutputStream(null);
        // Arrange
        PDAppearanceEntry receiver = new PDAppearanceEntry(entry0);
        // Act
        PDAppearanceStream actual = receiver.getAppearanceStream();
        RandomAccessStreamCache expected = new RandomAccessStreamCacheImpl();
        // Recreated from trace
        COSStream expected0 = new COSStream(expected);
        expected0.createOutputStream(null);
        // Assert
        PDAppearanceStream expected1 = new PDAppearanceStream(expected0);
        AssertJEqualityHelper.collectStatistics(actual, expected1);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected1);
    }
}