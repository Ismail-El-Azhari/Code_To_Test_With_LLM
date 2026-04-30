package org.apache.pdfbox.pdmodel.graphics.form;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSStream;
import org.apache.pdfbox.io.RandomAccessStreamCache;
import org.apache.pdfbox.io.RandomAccessStreamCacheImpl;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class PDFormXObjectRockyTest {
    @Test
    @DisplayName("getResources()")
    void test924GetResources$() throws IOException {
        RandomAccessStreamCache receiver = new RandomAccessStreamCacheImpl();
        // Recreated from trace
        COSStream receiver0 = new COSStream(receiver);
        receiver0.createOutputStream(null);
        // Arrange
        PDAppearanceStream receiver1 = new PDAppearanceStream(receiver0);
        // Act
        PDResources actual = receiver1.getResources();
        COSDictionary resources = new COSDictionary();
        Map<COSName, SoftReference<PDFont>> directFontCache = new HashMap<>(Map.ofEntries());
        // Assert
        PDResources expected = new PDResources(resources, null, directFontCache);
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getResources()")
    void test923GetResources$() {
        RandomAccessStreamCache receiver = new RandomAccessStreamCacheImpl();
        // Recreated from trace
        COSStream receiver0 = new COSStream(receiver);
        // Arrange
        PDAppearanceStream receiver1 = new PDAppearanceStream(receiver0);
        // Act
        PDResources actual = receiver1.getResources();
        // Assert
        PDResources expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }
}