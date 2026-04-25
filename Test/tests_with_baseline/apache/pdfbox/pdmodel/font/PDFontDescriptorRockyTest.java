package org.apache.pdfbox.pdmodel.font;
import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class PDFontDescriptorRockyTest {
    PDFontDescriptor createPDFontDescriptor() {
        COSDictionary dic = this.createCOSDictionary();
        PDFontDescriptor receiver = new PDFontDescriptor(dic);
        receiver.setCapHeight(Float.NEGATIVE_INFINITY);
        receiver.setFlags(-1);
        receiver.setXHeight(Float.NEGATIVE_INFINITY);
        return receiver;
    }

    PDFontDescriptor createPDFontDescriptor17() {
        COSDictionary dic = this.createCOSDictionary7();
        PDFontDescriptor receiver = new PDFontDescriptor(dic);
        receiver.setCapHeight(Float.NEGATIVE_INFINITY);
        receiver.setFlags(-1);
        receiver.setXHeight(Float.NEGATIVE_INFINITY);
        return receiver;
    }

    @Test
    @DisplayName("setFontFamily(java.lang.String)")
    void test347SetFontFamily$String() {
        // Arrange
        PDFontDescriptor receiver = this.createPDFontDescriptor17();
        String fontFamily = "Helvetica";
        // Act
        receiver.setFontFamily(fontFamily);
        // Assert
        PDFontDescriptor receiverPost = this.createPDFontDescriptor();
        AssertJEqualityHelper.collectStatistics(receiver, receiverPost);
        assertThat(receiver).usingRecursiveComparison(nanAwareComparison()).isEqualTo(receiverPost);
    }

    COSDictionary createCOSDictionary8() {
        // Recreated from trace
        COSDictionary dic = new COSDictionary();
        // Recreated from trace
        COSName key = COSName.getPDFName("Type");
        // Recreated from trace
        COSName value = COSName.getPDFName("FontDescriptor");
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        dic.setItem(key, value);
        return dic;
    }

    COSDictionary createCOSDictionary5() {
        // Recreated from trace
        COSDictionary dic = new COSDictionary();
        // Recreated from trace
        COSName key = COSName.getPDFName("Type");
        // Recreated from trace
        COSName value = COSName.getPDFName("FontDescriptor");
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        dic.setItem(key, value);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("FontName");
        // Recreated from trace
        COSName value0 = COSName.getPDFName("Helvetica");
        dic.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("FontFamily");
        COSBase value1 = new COSString(new byte[]{ 72, 101, 108, 118, 101, 116, 105, 99, 97 }, false);
        dic.setItem(key1, value1);
        // Recreated from trace
        COSName key2 = COSName.getPDFName("Flags");
        dic.setInt(key2, 32);
        dic.setInt(key2, 32);
        return dic;
    }

    PDFontDescriptor createPDFontDescriptor19() {
        COSDictionary dic = this.createCOSDictionary8();
        PDFontDescriptor receiver = new PDFontDescriptor(dic);
        receiver.setCapHeight(Float.NEGATIVE_INFINITY);
        receiver.setFlags(-1);
        receiver.setXHeight(Float.NEGATIVE_INFINITY);
        return receiver;
    }

    @Test
    @DisplayName("setFontName(java.lang.String)")
    void test348SetFontName$String() {
        // Arrange
        PDFontDescriptor receiver = this.createPDFontDescriptor19();
        String fontName = "Helvetica";
        // Act
        receiver.setFontName(fontName);
        // Assert
        PDFontDescriptor receiverPost = this.createPDFontDescriptor17();
        AssertJEqualityHelper.collectStatistics(receiver, receiverPost);
        assertThat(receiver).usingRecursiveComparison(nanAwareComparison()).isEqualTo(receiverPost);
    }

    PDFontDescriptor createPDFontDescriptor11() {
        COSDictionary dic = this.createCOSDictionary5();
        PDFontDescriptor receiverPost = new PDFontDescriptor(dic);
        receiverPost.setCapHeight(Float.NEGATIVE_INFINITY);
        receiverPost.setFlags(32);
        receiverPost.setXHeight(Float.NEGATIVE_INFINITY);
        return receiverPost;
    }

    PDFontDescriptor createPDFontDescriptor13() {
        COSDictionary dic = this.createCOSDictionary();
        PDFontDescriptor receiver = new PDFontDescriptor(dic);
        receiver.setCapHeight(Float.NEGATIVE_INFINITY);
        receiver.setFlags(0);
        receiver.setXHeight(Float.NEGATIVE_INFINITY);
        return receiver;
    }

    COSDictionary createCOSDictionary() {
        // Recreated from trace
        COSDictionary dic = new COSDictionary();
        // Recreated from trace
        COSName key = COSName.getPDFName("Type");
        // Recreated from trace
        COSName value = COSName.getPDFName("FontDescriptor");
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        dic.setItem(key, value);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("FontName");
        // Recreated from trace
        COSName value0 = COSName.getPDFName("Helvetica");
        dic.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("FontFamily");
        COSBase value1 = new COSString(new byte[]{ 72, 101, 108, 118, 101, 116, 105, 99, 97 }, false);
        dic.setItem(key1, value1);
        return dic;
    }

    @Test
    @DisplayName("getFlags()")
    void test332GetFlags$() {
        // Arrange
        PDFontDescriptor receiver = this.createPDFontDescriptor();
        // Act
        int actual = receiver.getFlags();
        // Assert
        int expected = 0;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("setFlags(int)")
    void test344SetFlags$int() {
        // Arrange
        PDFontDescriptor receiver = this.createPDFontDescriptor1();
        int flags = 32;
        // Act
        receiver.setFlags(flags);
        // Assert
        PDFontDescriptor receiverPost = this.createPDFontDescriptor11();
        AssertJEqualityHelper.collectStatistics(receiver, receiverPost);
        assertThat(receiver).usingRecursiveComparison(nanAwareComparison()).isEqualTo(receiverPost);
    }

    COSDictionary createCOSDictionary7() {
        // Recreated from trace
        COSDictionary dic = new COSDictionary();
        // Recreated from trace
        COSName key = COSName.getPDFName("Type");
        // Recreated from trace
        COSName value = COSName.getPDFName("FontDescriptor");
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        dic.setItem(key, value);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("FontName");
        // Recreated from trace
        COSName value0 = COSName.getPDFName("Helvetica");
        dic.setItem(key0, value0);
        return dic;
    }

    PDFontDescriptor createPDFontDescriptor1() {
        COSDictionary dic = this.createCOSDictionary0();
        PDFontDescriptor receiver = new PDFontDescriptor(dic);
        receiver.setCapHeight(Float.NEGATIVE_INFINITY);
        receiver.setFlags(32);
        receiver.setXHeight(Float.NEGATIVE_INFINITY);
        return receiver;
    }

    @Test
    @DisplayName("setFlags(int)")
    void test345SetFlags$int() {
        // Arrange
        PDFontDescriptor receiver = this.createPDFontDescriptor13();
        int flags = 32;
        // Act
        receiver.setFlags(flags);
        // Assert
        PDFontDescriptor receiverPost = this.createPDFontDescriptor1();
        AssertJEqualityHelper.collectStatistics(receiver, receiverPost);
        assertThat(receiver).usingRecursiveComparison(nanAwareComparison()).isEqualTo(receiverPost);
    }

    @Test
    @DisplayName("getFlags()")
    void test333GetFlags$() {
        // Arrange
        PDFontDescriptor receiver = this.createPDFontDescriptor1();
        // Act
        int actual = receiver.getFlags();
        // Assert
        int expected = 32;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    COSDictionary createCOSDictionary0() {
        // Recreated from trace
        COSDictionary dic = new COSDictionary();
        // Recreated from trace
        COSName key = COSName.getPDFName("Type");
        // Recreated from trace
        COSName value = COSName.getPDFName("FontDescriptor");
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        dic.setItem(key, value);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("FontName");
        // Recreated from trace
        COSName value0 = COSName.getPDFName("Helvetica");
        dic.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("FontFamily");
        COSBase value1 = new COSString(new byte[]{ 72, 101, 108, 118, 101, 116, 105, 99, 97 }, false);
        dic.setItem(key1, value1);
        // Recreated from trace
        COSName key2 = COSName.getPDFName("Flags");
        dic.setInt(key2, 32);
        return dic;
    }
}