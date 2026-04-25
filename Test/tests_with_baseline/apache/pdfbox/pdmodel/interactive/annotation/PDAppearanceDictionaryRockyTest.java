package org.apache.pdfbox.pdmodel.interactive.annotation;
import java.io.IOException;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSStream;
import org.apache.pdfbox.io.RandomAccessStreamCache;
import org.apache.pdfbox.io.RandomAccessStreamCacheImpl;
import org.apache.pdfbox.pdmodel.common.COSObjectable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class PDAppearanceDictionaryRockyTest {
    @Test
    @DisplayName("getNormalAppearance()")
    void test903GetNormalAppearance$() throws IOException {
        COSDictionary dictionary = this.createCOSDictionary0();
        // Arrange
        PDAppearanceDictionary receiver = new PDAppearanceDictionary(dictionary);
        // Act
        PDAppearanceEntry actual = receiver.getNormalAppearance();
        RandomAccessStreamCache entry = new RandomAccessStreamCacheImpl();
        // Recreated from trace
        COSStream entry0 = new COSStream(entry);
        entry0.createOutputStream(null);
        // Assert
        PDAppearanceEntry expected = new PDAppearanceEntry(entry0);
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSDictionary createCOSDictionary0() {
        // Recreated from trace
        COSDictionary dictionary = new COSDictionary();
        // Recreated from trace
        COSName key = COSName.getPDFName("N");
        // Recreated from trace
        COSDictionary value = new COSDictionary();
        dictionary.setItem(key, value);
        RandomAccessStreamCache entry = new RandomAccessStreamCacheImpl();
        COSDictionary entry0 = new COSStream(entry);
        COSObjectable value0 = new PDAppearanceEntry(entry0);
        dictionary.setItem(key, value0);
        return dictionary;
    }

    @Test
    @DisplayName("getNormalAppearance()")
    void test905GetNormalAppearance$() {
        // Recreated from trace
        COSDictionary dictionary = new COSDictionary();
        // Recreated from trace
        COSName key = COSName.getPDFName("N");
        // Recreated from trace
        COSDictionary value = new COSDictionary();
        dictionary.setItem(key, value);
        // Arrange
        PDAppearanceDictionary receiver = new PDAppearanceDictionary(dictionary);
        // Act
        PDAppearanceEntry actual = receiver.getNormalAppearance();
        COSDictionary entry = new COSDictionary();
        // Assert
        PDAppearanceEntry expected = new PDAppearanceEntry(entry);
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }
}