package org.apache.pdfbox.cos;
import java.io.IOException;
import java.nio.file.Path;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.io.RandomAccessReadView;
import org.apache.pdfbox.io.RandomAccessStreamCache;
import org.apache.pdfbox.io.RandomAccessStreamCacheImpl;
import org.apache.pdfbox.pdmodel.common.COSObjectable;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class COSDictionaryRockyTest {
    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName)")
    void test834GetDictionaryObject$COSName() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream();
        COSName key = COSName.getPDFName("Filter");
        // Act
        COSBase actual = receiver.getDictionaryObject(key);
        // Recreated from trace
        COSBase expected = COSName.getPDFName("FlateDecode");
        expected.setDirect(true);
        expected.setDirect(true);
        // Assert
        COSBase expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("getInt(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName,int)")
    void test868GetInt$COSName_COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary1();
        COSName firstKey = COSName.getPDFName("Colors");
        COSName secondKey = null;
        int defaultValue = 1;
        // Act
        int actual = receiver.getInt(firstKey, secondKey, defaultValue);
        // Assert
        int expected = 1;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName)")
    void test842GetDictionaryObject$COSName_COSName() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName firstKey = COSName.getPDFName("Colors");
        COSName secondKey = null;
        // Act
        COSBase actual = receiver.getDictionaryObject(firstKey, secondKey);
        // Assert
        COSBase expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName)")
    void test841GetDictionaryObject$COSName_COSName() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName firstKey = COSName.getPDFName("BitsPerComponent");
        COSName secondKey = null;
        // Act
        COSBase actual = receiver.getDictionaryObject(firstKey, secondKey);
        // Assert
        COSBase expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test850GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary5();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 16;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getInt(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName,int)")
    void test866GetInt$COSName_COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName firstKey = COSName.getPDFName("Columns");
        COSName secondKey = null;
        int defaultValue = 1;
        // Act
        int actual = receiver.getInt(firstKey, secondKey, defaultValue);
        // Assert
        int expected = 5;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName)")
    void test843GetDictionaryObject$COSName_COSName() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream();
        COSName firstKey = COSName.getPDFName("DP");
        COSName secondKey = COSName.getPDFName("DecodeParms");
        // Act
        COSBase actual = receiver.getDictionaryObject(firstKey, secondKey);
        // Assert
        COSBase expected = this.createCOSBase2();
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSDictionary createCOSDictionary14() throws IOException {
        // Recreated from trace
        COSDictionary receiver = new COSDictionary();
        receiver.setDirect(true);
        // Recreated from trace
        COSName key = COSName.getPDFName("A");
        // Recreated from trace
        COSDictionary value = new COSDictionary();
        value.setDirect(true);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("S");
        // Recreated from trace
        COSName value0 = COSName.getPDFName("URI");
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("Type");
        byte[] value1 = new byte[]{ 65, 99, 116, 105, 111, 110 };
        // Recreated from trace
        COSName value2 = COSName.getPDFName(value1);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value.setItem(key1, value2);
        byte bytes = (byte) 116;
        byte bytes0 = (byte) 114;
        COSBase value3 = new COSString(new byte[]{ 104, bytes0, 116, 112, 58, 47, 47, 119, 119, 119, 46, 116, 119, 105, 116, 116, 101, bytes0, 46, 99, 111, 109, 47, 99, 111 }, false);
        value3.setDirect(true);
        value.setItem(value0, value3);
        value.setDirect(true);
        receiver.setItem(key, value);
        // Recreated from trace
        COSName key2 = COSName.getPDFName("Border");
        // Recreated from trace
        COSArray value4 = new COSArray();
        // Recreated from trace
        COSInteger object = COSInteger.get(0L);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        value4.add(object);
        value4.add(object);
        value4.add(object);
        value4.setDirect(true);
        receiver.setItem(key2, value4);
        // Recreated from trace
        COSName key3 = COSName.getPDFName("F");
        // Recreated from trace
        COSInteger value5 = (COSInteger) COSInteger.get("4");
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        receiver.setItem(key3, value5);
        // Recreated from trace
        COSName key4 = COSName.getPDFName("Rect");
        // Recreated from trace
        COSArray value6 = new COSArray();
        // Recreated from trace
        COSFloat object0 = (COSFloat) COSFloat.get("164.25");
        value6.add(object0);
        // Recreated from trace
        COSFloat object1 = (COSFloat) COSFloat.get("438.75");
        value6.add(object1);
        // Recreated from trace
        COSInteger object2 = (COSInteger) COSInteger.get("207");
        value6.add(object2);
        // Recreated from trace
        COSInteger object3 = (COSInteger) COSInteger.get("453");
        value6.add(object3);
        value6.setDirect(true);
        receiver.setItem(key4, value6);
        // Recreated from trace
        COSName key5 = COSName.getPDFName("Subtype");
        // Recreated from trace
        COSName value7 = COSName.getPDFName("Link");
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        receiver.setItem(key5, value7);
        // Recreated from trace
        COSName value8 = COSName.getPDFName("Annot");
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        receiver.setItem(key1, value8);
        receiver.setDirect(false);
        receiver.setDirect(false);
        // Recreated from trace
        COSObjectKey key6 = new COSObjectKey(157L, 0, 6);
        receiver.setKey(key6);
        return receiver;
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test852GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary11();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 2;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test855GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary14();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 32;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    COSBase createCOSBase2() throws IOException {
        // Recreated from trace
        COSDictionary expected = new COSDictionary();
        expected.setDirect(true);
        // Recreated from trace
        COSName key = COSName.getPDFName("Columns");
        // Recreated from trace
        COSInteger value = (COSInteger) COSInteger.get("5");
        value.setDirect(true);
        value.setDirect(true);
        expected.setItem(key, value);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("Predictor");
        // Recreated from trace
        COSInteger value0 = (COSInteger) COSInteger.get("12");
        value0.setDirect(true);
        value0.setDirect(true);
        expected.setItem(key0, value0);
        expected.setDirect(true);
        return expected;
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
        receiver3.createView();
        return receiver3;
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test859GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary8();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 2;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test853GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary14();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 1;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getInt(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName,int)")
    void test861GetInt$COSName_COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName firstKey = COSName.getPDFName("Predictor");
        COSName secondKey = null;
        int defaultValue = -1;
        // Act
        int actual = receiver.getInt(firstKey, secondKey, defaultValue);
        // Assert
        int expected = 12;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    COSDictionary createCOSDictionary17() throws IOException {
        // Recreated from trace
        COSDictionary receiver = new COSDictionary();
        receiver.setDirect(true);
        // Recreated from trace
        COSName key = COSName.getPDFName("A");
        // Recreated from trace
        COSDictionary value = new COSDictionary();
        value.setDirect(true);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("S");
        // Recreated from trace
        COSName value0 = COSName.getPDFName("URI");
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("Type");
        byte[] value1 = new byte[]{ 65, 99, 116, 105, 111, 110 };
        // Recreated from trace
        COSName value2 = COSName.getPDFName(value1);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value.setItem(key1, value2);
        byte bytes = (byte) 116;
        byte bytes0 = (byte) 110;
        COSBase value3 = new COSString(new byte[]{ 104, bytes0, 116, 112, 58, 47, 47, 119, 119, 119, 46, 99, 111, 100, 101, 109, 111, bytes0, 107, 101, 121, 46, 99, 111, 109 }, false);
        value3.setDirect(true);
        value.setItem(value0, value3);
        value.setDirect(true);
        receiver.setItem(key, value);
        // Recreated from trace
        COSName key2 = COSName.getPDFName("Border");
        // Recreated from trace
        COSArray value4 = new COSArray();
        // Recreated from trace
        COSInteger object = COSInteger.get(0L);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        value4.add(object);
        value4.add(object);
        value4.add(object);
        value4.setDirect(true);
        receiver.setItem(key2, value4);
        // Recreated from trace
        COSName key3 = COSName.getPDFName("F");
        // Recreated from trace
        COSInteger value5 = (COSInteger) COSInteger.get("4");
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        receiver.setItem(key3, value5);
        // Recreated from trace
        COSName key4 = COSName.getPDFName("Rect");
        // Recreated from trace
        COSArray value6 = new COSArray();
        // Recreated from trace
        COSFloat object0 = (COSFloat) COSFloat.get("443.25");
        value6.add(object0);
        // Recreated from trace
        COSFloat object1 = (COSFloat) COSFloat.get("454.5");
        value6.add(object1);
        // Recreated from trace
        COSFloat object2 = (COSFloat) COSFloat.get("470.25");
        value6.add(object2);
        // Recreated from trace
        COSFloat object3 = (COSFloat) COSFloat.get("468.75");
        value6.add(object3);
        value6.setDirect(true);
        receiver.setItem(key4, value6);
        // Recreated from trace
        COSName key5 = COSName.getPDFName("Subtype");
        // Recreated from trace
        COSName value7 = COSName.getPDFName("Link");
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        receiver.setItem(key5, value7);
        // Recreated from trace
        COSName value8 = COSName.getPDFName("Annot");
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        receiver.setItem(key1, value8);
        receiver.setDirect(false);
        receiver.setDirect(false);
        // Recreated from trace
        COSObjectKey key6 = new COSObjectKey(156L, 0, 5);
        receiver.setKey(key6);
        // Recreated from trace
        COSName key7 = COSName.getPDFName("AP");
        // Recreated from trace
        COSDictionary dictionary = new COSDictionary();
        // Recreated from trace
        COSName key8 = COSName.getPDFName("N");
        // Recreated from trace
        COSDictionary value9 = new COSDictionary();
        dictionary.setItem(key8, value9);
        COSObjectable value10 = new PDAppearanceDictionary(dictionary);
        receiver.setItem(key7, value10);
        return receiver;
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test856GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary11();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 32;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName)")
    void test831GetDictionaryObject$COSName() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream();
        COSName key = COSName.getPDFName("DecodeParms");
        // Act
        COSBase actual = receiver.getDictionaryObject(key);
        // Assert
        COSBase expected = this.createCOSBase2();
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName)")
    void test846GetDictionaryObject$COSName_COSName() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary1();
        COSName firstKey = COSName.getPDFName("Colors");
        COSName secondKey = null;
        // Act
        COSBase actual = receiver.getDictionaryObject(firstKey, secondKey);
        // Assert
        COSBase expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName)")
    void test845GetDictionaryObject$COSName_COSName() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName firstKey = COSName.getPDFName("Columns");
        COSName secondKey = null;
        // Act
        COSBase actual = receiver.getDictionaryObject(firstKey, secondKey);
        // Recreated from trace
        COSBase expected = COSInteger.get("5");
        expected.setDirect(true);
        expected.setDirect(true);
        // Assert
        COSBase expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName)")
    void test836GetDictionaryObject$COSName() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream();
        COSName key = COSName.getPDFName("F");
        // Act
        COSBase actual = receiver.getDictionaryObject(key);
        // Assert
        COSBase expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getInt(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName,int)")
    void test864GetInt$COSName_COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName firstKey = COSName.getPDFName("BitsPerComponent");
        COSName secondKey = null;
        int defaultValue = 8;
        // Act
        int actual = receiver.getInt(firstKey, secondKey, defaultValue);
        // Assert
        int expected = 8;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getInt(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName,int)")
    void test860GetInt$COSName_COSName_int() {
        // Arrange
        COSDictionary receiver = new COSDictionary();
        COSName firstKey = COSName.getPDFName("Predictor");
        COSName secondKey = null;
        int defaultValue = -1;
        // Act
        int actual = receiver.getInt(firstKey, secondKey, defaultValue);
        // Assert
        int expected = -1;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getNameAsString(org.apache.pdfbox.cos.COSName)")
    void test883GetNameAsString$COSName() {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary26();
        COSName key = COSName.getPDFName("Ordering");
        // Act
        String actual = receiver.getNameAsString(key);
        // Assert
        String expected = "Identity";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLong(org.apache.pdfbox.cos.COSName,long)")
    void test876GetLong$COSName_long() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary23();
        COSName key = COSName.getPDFName("Prev");
        long defaultValue = -1L;
        // Act
        long actual = receiver.getLong(key, defaultValue);
        // Assert
        long expected = -1L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName)")
    void test849GetDictionaryObject$COSName_COSName() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName firstKey = COSName.getPDFName("Predictor");
        COSName secondKey = null;
        // Act
        COSBase actual = receiver.getDictionaryObject(firstKey, secondKey);
        // Recreated from trace
        COSBase expected = COSInteger.get("12");
        expected.setDirect(true);
        expected.setDirect(true);
        // Assert
        COSBase expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName)")
    void test830GetDictionaryObject$COSName() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream();
        COSName key = COSName.getPDFName("Length");
        // Act
        COSBase actual = receiver.getDictionaryObject(key);
        // Recreated from trace
        COSBase expected = COSInteger.get("78");
        expected.setDirect(true);
        expected.setDirect(true);
        // Assert
        COSBase expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("getInt(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName,int)")
    void test865GetInt$COSName_COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary1();
        COSName firstKey = COSName.getPDFName("Columns");
        COSName secondKey = null;
        int defaultValue = 1;
        // Act
        int actual = receiver.getInt(firstKey, secondKey, defaultValue);
        // Assert
        int expected = 5;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName)")
    void test839GetDictionaryObject$COSName() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName key = COSName.getPDFName("Colors");
        // Act
        COSBase actual = receiver.getDictionaryObject(key);
        // Assert
        COSBase expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSDictionary createCOSDictionary29() throws IOException {
        // Recreated from trace
        COSDictionary receiver = new COSDictionary();
        receiver.setDirect(false);
        // Recreated from trace
        COSName key = COSName.getPDFName("Type");
        // Recreated from trace
        COSName value = COSName.getPDFName("XRef");
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        receiver.setItem(key, value);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("Length");
        // Recreated from trace
        COSInteger value0 = (COSInteger) COSInteger.get("205");
        value0.setDirect(true);
        receiver.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("Filter");
        // Recreated from trace
        COSName value1 = COSName.getPDFName("FlateDecode");
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        receiver.setItem(key1, value1);
        // Recreated from trace
        COSName key2 = COSName.getPDFName("DecodeParms");
        // Recreated from trace
        COSDictionary value2 = new COSDictionary();
        value2.setDirect(true);
        // Recreated from trace
        COSName key3 = COSName.getPDFName("Columns");
        // Recreated from trace
        COSInteger value3 = (COSInteger) COSInteger.get("5");
        value3.setDirect(true);
        value3.setDirect(true);
        value3.setDirect(true);
        value2.setItem(key3, value3);
        // Recreated from trace
        COSName key4 = COSName.getPDFName("Predictor");
        // Recreated from trace
        COSInteger value4 = (COSInteger) COSInteger.get("12");
        value4.setDirect(true);
        value4.setDirect(true);
        value4.setDirect(true);
        value2.setItem(key4, value4);
        value2.setDirect(true);
        receiver.setItem(key2, value2);
        // Recreated from trace
        COSName key5 = COSName.getPDFName("W");
        // Recreated from trace
        COSArray value5 = new COSArray();
        // Recreated from trace
        COSInteger object = COSInteger.get(1L);
        value5.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(3L);
        value5.add(object0);
        value5.add(object);
        value5.setDirect(true);
        receiver.setItem(key5, value5);
        // Recreated from trace
        COSName key6 = COSName.getPDFName("Size");
        // Recreated from trace
        COSInteger value6 = (COSInteger) COSInteger.get("136");
        value6.setDirect(true);
        receiver.setItem(key6, value6);
        // Recreated from trace
        COSName key7 = COSName.getPDFName("ID");
        // Recreated from trace
        COSArray value7 = new COSArray();
        byte bytes = (byte) 64;
        byte bytes0 = (byte) (-30);
        COSBase object1 = new COSString(new byte[]{ 105, bytes0, -75, -124, -89, 112, -65, -9, 0, 21, -80, bytes0, -54, 82, 58, 86 }, false);
        value7.add(object1);
        COSBase object2 = new COSString(new byte[]{ 105, 64, -75, -124, -89, 112, -65, -9, 0, 21, -80, -30, -54, 82, 58, 86 }, false);
        value7.add(object2);
        value7.setDirect(true);
        receiver.setItem(key7, value7);
        return receiver;
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test858GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary8();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 32;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    COSDictionary createCOSDictionary23() throws IOException {
        // Recreated from trace
        COSDictionary receiver = new COSDictionary();
        receiver.setDirect(false);
        // Recreated from trace
        COSName key = COSName.getPDFName("Type");
        // Recreated from trace
        COSName value = COSName.getPDFName("XRef");
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        receiver.setItem(key, value);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("Length");
        // Recreated from trace
        COSInteger value0 = (COSInteger) COSInteger.get("205");
        value0.setDirect(true);
        value0.setDirect(true);
        receiver.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("Filter");
        // Recreated from trace
        COSName value1 = COSName.getPDFName("FlateDecode");
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        receiver.setItem(key1, value1);
        // Recreated from trace
        COSName key2 = COSName.getPDFName("DecodeParms");
        // Recreated from trace
        COSDictionary value2 = new COSDictionary();
        value2.setDirect(true);
        // Recreated from trace
        COSName key3 = COSName.getPDFName("Columns");
        // Recreated from trace
        COSInteger value3 = (COSInteger) COSInteger.get("5");
        value3.setDirect(true);
        value3.setDirect(true);
        value3.setDirect(true);
        value3.setDirect(true);
        value2.setItem(key3, value3);
        // Recreated from trace
        COSName key4 = COSName.getPDFName("Predictor");
        // Recreated from trace
        COSInteger value4 = (COSInteger) COSInteger.get("12");
        value4.setDirect(true);
        value4.setDirect(true);
        value4.setDirect(true);
        value4.setDirect(true);
        value2.setItem(key4, value4);
        value2.setDirect(true);
        receiver.setItem(key2, value2);
        // Recreated from trace
        COSName key5 = COSName.getPDFName("W");
        // Recreated from trace
        COSArray value5 = new COSArray();
        // Recreated from trace
        COSInteger object = COSInteger.get(1L);
        value5.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(3L);
        value5.add(object0);
        value5.add(object);
        value5.setDirect(true);
        receiver.setItem(key5, value5);
        // Recreated from trace
        COSName key6 = COSName.getPDFName("Size");
        // Recreated from trace
        COSInteger value6 = (COSInteger) COSInteger.get("136");
        value6.setDirect(true);
        value6.setDirect(true);
        receiver.setItem(key6, value6);
        // Recreated from trace
        COSName key7 = COSName.getPDFName("ID");
        // Recreated from trace
        COSArray value7 = new COSArray();
        byte bytes = (byte) 64;
        byte bytes0 = (byte) (-30);
        COSBase object1 = new COSString(new byte[]{ 105, bytes0, -75, -124, -89, 112, -65, -9, 0, 21, -80, bytes0, -54, 82, 58, 86 }, false);
        value7.add(object1);
        COSBase object2 = new COSString(new byte[]{ 105, 64, -75, -124, -89, 112, -65, -9, 0, 21, -80, -30, -54, 82, 58, 86 }, false);
        value7.add(object2);
        value7.setDirect(true);
        receiver.setItem(key7, value7);
        return receiver;
    }

    COSDictionary createCOSDictionary5() throws IOException {
        // Recreated from trace
        COSDictionary receiver = new COSDictionary();
        receiver.setDirect(true);
        // Recreated from trace
        COSName key = COSName.getPDFName("A");
        // Recreated from trace
        COSDictionary value = new COSDictionary();
        value.setDirect(true);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("S");
        // Recreated from trace
        COSName value0 = COSName.getPDFName("URI");
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("Type");
        byte[] value1 = new byte[]{ 65, 99, 116, 105, 111, 110 };
        // Recreated from trace
        COSName value2 = COSName.getPDFName(value1);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value.setItem(key1, value2);
        byte bytes = (byte) 116;
        byte bytes0 = (byte) 114;
        COSBase value3 = new COSString(new byte[]{ 104, bytes0, 116, 112, 58, 47, 47, 119, 119, 119, 46, 116, 119, 105, 116, 116, 101, bytes0, 46, 99, 111, 109, 47, 99, 111 }, false);
        value3.setDirect(true);
        value.setItem(value0, value3);
        value.setDirect(true);
        receiver.setItem(key, value);
        // Recreated from trace
        COSName key2 = COSName.getPDFName("Border");
        // Recreated from trace
        COSArray value4 = new COSArray();
        // Recreated from trace
        COSInteger object = COSInteger.get(0L);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        value4.add(object);
        value4.add(object);
        value4.add(object);
        value4.setDirect(true);
        receiver.setItem(key2, value4);
        // Recreated from trace
        COSName key3 = COSName.getPDFName("F");
        // Recreated from trace
        COSInteger value5 = (COSInteger) COSInteger.get("4");
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        receiver.setItem(key3, value5);
        // Recreated from trace
        COSName key4 = COSName.getPDFName("Rect");
        // Recreated from trace
        COSArray value6 = new COSArray();
        // Recreated from trace
        COSFloat object0 = (COSFloat) COSFloat.get("164.25");
        value6.add(object0);
        // Recreated from trace
        COSFloat object1 = (COSFloat) COSFloat.get("438.75");
        value6.add(object1);
        // Recreated from trace
        COSInteger object2 = (COSInteger) COSInteger.get("207");
        value6.add(object2);
        // Recreated from trace
        COSInteger object3 = (COSInteger) COSInteger.get("453");
        value6.add(object3);
        value6.setDirect(true);
        receiver.setItem(key4, value6);
        // Recreated from trace
        COSName key5 = COSName.getPDFName("Subtype");
        // Recreated from trace
        COSName value7 = COSName.getPDFName("Link");
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        receiver.setItem(key5, value7);
        // Recreated from trace
        COSName value8 = COSName.getPDFName("Annot");
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        receiver.setItem(key1, value8);
        receiver.setDirect(false);
        receiver.setDirect(false);
        // Recreated from trace
        COSObjectKey key6 = new COSObjectKey(157L, 0, 6);
        receiver.setKey(key6);
        // Recreated from trace
        COSName key7 = COSName.getPDFName("AP");
        // Recreated from trace
        COSDictionary dictionary = new COSDictionary();
        // Recreated from trace
        COSName key8 = COSName.getPDFName("N");
        // Recreated from trace
        COSDictionary value9 = new COSDictionary();
        dictionary.setItem(key8, value9);
        COSObjectable value10 = new PDAppearanceDictionary(dictionary);
        receiver.setItem(key7, value10);
        return receiver;
    }

    @Test
    @DisplayName("getNameAsString(org.apache.pdfbox.cos.COSName)")
    void test887GetNameAsString$COSName() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary29();
        COSName key = COSName.getPDFName("Type");
        // Act
        String actual = receiver.getNameAsString(key);
        // Assert
        String expected = "XRef";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    COSDictionary createCOSDictionary8() throws IOException {
        // Recreated from trace
        COSDictionary receiver = new COSDictionary();
        receiver.setDirect(true);
        // Recreated from trace
        COSName key = COSName.getPDFName("A");
        // Recreated from trace
        COSDictionary value = new COSDictionary();
        value.setDirect(true);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("S");
        // Recreated from trace
        COSName value0 = COSName.getPDFName("URI");
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("Type");
        byte[] value1 = new byte[]{ 65, 99, 116, 105, 111, 110 };
        // Recreated from trace
        COSName value2 = COSName.getPDFName(value1);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value.setItem(key1, value2);
        byte bytes = (byte) 116;
        byte bytes0 = (byte) 110;
        COSBase value3 = new COSString(new byte[]{ 104, bytes0, 116, 112, 58, 47, 47, 119, 119, 119, 46, 99, 111, 100, 101, 109, 111, bytes0, 107, 101, 121, 46, 99, 111, 109 }, false);
        value3.setDirect(true);
        value.setItem(value0, value3);
        value.setDirect(true);
        receiver.setItem(key, value);
        // Recreated from trace
        COSName key2 = COSName.getPDFName("Border");
        // Recreated from trace
        COSArray value4 = new COSArray();
        // Recreated from trace
        COSInteger object = COSInteger.get(0L);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        value4.add(object);
        value4.add(object);
        value4.add(object);
        value4.setDirect(true);
        receiver.setItem(key2, value4);
        // Recreated from trace
        COSName key3 = COSName.getPDFName("F");
        // Recreated from trace
        COSInteger value5 = (COSInteger) COSInteger.get("4");
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        receiver.setItem(key3, value5);
        // Recreated from trace
        COSName key4 = COSName.getPDFName("Rect");
        // Recreated from trace
        COSArray value6 = new COSArray();
        // Recreated from trace
        COSFloat object0 = (COSFloat) COSFloat.get("443.25");
        value6.add(object0);
        // Recreated from trace
        COSFloat object1 = (COSFloat) COSFloat.get("454.5");
        value6.add(object1);
        // Recreated from trace
        COSFloat object2 = (COSFloat) COSFloat.get("470.25");
        value6.add(object2);
        // Recreated from trace
        COSFloat object3 = (COSFloat) COSFloat.get("468.75");
        value6.add(object3);
        value6.setDirect(true);
        receiver.setItem(key4, value6);
        // Recreated from trace
        COSName key5 = COSName.getPDFName("Subtype");
        // Recreated from trace
        COSName value7 = COSName.getPDFName("Link");
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        receiver.setItem(key5, value7);
        // Recreated from trace
        COSName value8 = COSName.getPDFName("Annot");
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        receiver.setItem(key1, value8);
        receiver.setDirect(false);
        receiver.setDirect(false);
        // Recreated from trace
        COSObjectKey key6 = new COSObjectKey(156L, 0, 5);
        receiver.setKey(key6);
        return receiver;
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName)")
    void test838GetDictionaryObject$COSName() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream();
        COSName key = COSName.getPDFName("DP");
        // Act
        COSBase actual = receiver.getDictionaryObject(key);
        // Assert
        COSBase expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSDictionary createCOSDictionary1() throws IOException {
        // Recreated from trace
        COSDictionary receiver = new COSDictionary();
        receiver.setDirect(true);
        // Recreated from trace
        COSName key = COSName.getPDFName("Columns");
        // Recreated from trace
        COSInteger value = (COSInteger) COSInteger.get("5");
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        value.setDirect(true);
        receiver.setItem(key, value);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("Predictor");
        // Recreated from trace
        COSInteger value0 = (COSInteger) COSInteger.get("12");
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        receiver.setItem(key0, value0);
        receiver.setDirect(true);
        return receiver;
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test857GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary17();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 16;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getLong(org.apache.pdfbox.cos.COSName,long)")
    void test877GetLong$COSName_long() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream();
        COSName key = COSName.getPDFName("Length");
        long defaultValue = 4096L;
        // Act
        long actual = receiver.getLong(key, defaultValue);
        // Assert
        long expected = 78L;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test854GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary14();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 2;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getFlag(org.apache.pdfbox.cos.COSName,int)")
    void test851GetFlag$COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary8();
        COSName field = COSName.getPDFName("F");
        int bitFlag = 1;
        // Act
        boolean actual = receiver.getFlag(field, bitFlag);
        // Assert
        boolean expected = false;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName)")
    void test835GetDictionaryObject$COSName() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName key = COSName.getPDFName("Predictor");
        // Act
        COSBase actual = receiver.getDictionaryObject(key);
        // Recreated from trace
        COSBase expected = COSInteger.get("12");
        expected.setDirect(true);
        expected.setDirect(true);
        // Assert
        COSBase expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName)")
    void test847GetDictionaryObject$COSName_COSName() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream();
        COSName firstKey = COSName.getPDFName("F");
        COSName secondKey = COSName.getPDFName("Filter");
        // Act
        COSBase actual = receiver.getDictionaryObject(firstKey, secondKey);
        // Recreated from trace
        COSBase expected = COSName.getPDFName("FlateDecode");
        expected.setDirect(true);
        expected.setDirect(true);
        // Assert
        COSBase expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("getInt(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName,int)")
    void test869GetInt$COSName_COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary1();
        COSName firstKey = COSName.getPDFName("BitsPerComponent");
        COSName secondKey = null;
        int defaultValue = 8;
        // Act
        int actual = receiver.getInt(firstKey, secondKey, defaultValue);
        // Assert
        int expected = 8;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName)")
    void test832GetDictionaryObject$COSName() throws IOException {
        // Arrange
        COSStream receiver = this.createCOSStream2();
        COSName key = COSName.getPDFName("Filter");
        // Act
        COSBase actual = receiver.getDictionaryObject(key);
        // Recreated from trace
        COSBase expected = COSName.getPDFName("FlateDecode");
        expected.setDirect(true);
        expected.setDirect(true);
        // Assert
        COSBase expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    COSBase createCOSBase13() throws IOException {
        // Recreated from trace
        COSBase expected = COSInteger.get("12");
        expected.setDirect(true);
        expected.setDirect(true);
        expected.setDirect(true);
        expected.setDirect(true);
        return expected;
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName)")
    void test840GetDictionaryObject$COSName_COSName() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary1();
        COSName firstKey = COSName.getPDFName("Predictor");
        COSName secondKey = null;
        // Act
        COSBase actual = receiver.getDictionaryObject(firstKey, secondKey);
        // Assert
        COSBase expected = this.createCOSBase13();
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getDictionaryObject(org.apache.pdfbox.cos.COSName)")
    void test833GetDictionaryObject$COSName() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName key = COSName.getPDFName("BitsPerComponent");
        // Act
        COSBase actual = receiver.getDictionaryObject(key);
        // Assert
        COSBase expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getInt(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName,int)")
    void test867GetInt$COSName_COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary1();
        COSName firstKey = COSName.getPDFName("Predictor");
        COSName secondKey = null;
        int defaultValue = -1;
        // Act
        int actual = receiver.getInt(firstKey, secondKey, defaultValue);
        // Assert
        int expected = 12;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("getInt(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.cos.COSName,int)")
    void test863GetInt$COSName_COSName_int() throws IOException {
        // Arrange
        COSDictionary receiver = (COSDictionary) this.createCOSBase2();
        COSName firstKey = COSName.getPDFName("Colors");
        COSName secondKey = null;
        int defaultValue = 1;
        // Act
        int actual = receiver.getInt(firstKey, secondKey, defaultValue);
        // Assert
        int expected = 1;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    COSDictionary createCOSDictionary11() throws IOException {
        // Recreated from trace
        COSDictionary receiver = new COSDictionary();
        receiver.setDirect(true);
        // Recreated from trace
        COSName key = COSName.getPDFName("A");
        // Recreated from trace
        COSDictionary value = new COSDictionary();
        value.setDirect(true);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("S");
        // Recreated from trace
        COSName value0 = COSName.getPDFName("URI");
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value0.setDirect(true);
        value.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("Type");
        byte[] value1 = new byte[]{ 65, 99, 116, 105, 111, 110 };
        // Recreated from trace
        COSName value2 = COSName.getPDFName(value1);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value2.setDirect(true);
        value.setItem(key1, value2);
        byte bytes = (byte) 116;
        byte bytes0 = (byte) 111;
        COSBase value3 = new COSString(new byte[]{ 104, bytes0, 116, 112, 58, 47, 47, 119, 119, 119, 119, 46, 102, 97, 99, 101, 98, bytes0, 111, 107, 46, 99, 111, 109, 47 }, false);
        value3.setDirect(true);
        value.setItem(value0, value3);
        value.setDirect(true);
        receiver.setItem(key, value);
        // Recreated from trace
        COSName key2 = COSName.getPDFName("Border");
        // Recreated from trace
        COSArray value4 = new COSArray();
        // Recreated from trace
        COSInteger object = COSInteger.get(0L);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        object.setDirect(true);
        value4.add(object);
        value4.add(object);
        value4.add(object);
        value4.setDirect(true);
        receiver.setItem(key2, value4);
        // Recreated from trace
        COSName key3 = COSName.getPDFName("F");
        // Recreated from trace
        COSInteger value5 = (COSInteger) COSInteger.get("4");
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        value5.setDirect(true);
        receiver.setItem(key3, value5);
        // Recreated from trace
        COSName key4 = COSName.getPDFName("Rect");
        // Recreated from trace
        COSArray value6 = new COSArray();
        // Recreated from trace
        COSInteger object0 = (COSInteger) COSInteger.get("213");
        value6.add(object0);
        // Recreated from trace
        COSFloat object1 = (COSFloat) COSFloat.get("438.75");
        value6.add(object1);
        // Recreated from trace
        COSFloat object2 = (COSFloat) COSFloat.get("271.5");
        value6.add(object2);
        // Recreated from trace
        COSInteger object3 = (COSInteger) COSInteger.get("453");
        value6.add(object3);
        value6.setDirect(true);
        receiver.setItem(key4, value6);
        // Recreated from trace
        COSName key5 = COSName.getPDFName("Subtype");
        // Recreated from trace
        COSName value7 = COSName.getPDFName("Link");
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        value7.setDirect(true);
        receiver.setItem(key5, value7);
        // Recreated from trace
        COSName value8 = COSName.getPDFName("Annot");
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        value8.setDirect(true);
        receiver.setItem(key1, value8);
        receiver.setDirect(false);
        receiver.setDirect(false);
        // Recreated from trace
        COSObjectKey key6 = new COSObjectKey(158L, 0, 7);
        receiver.setKey(key6);
        return receiver;
    }

    COSDictionary createCOSDictionary26() {
        // Recreated from trace
        COSDictionary receiver = new COSDictionary();
        receiver.setDirect(true);
        // Recreated from trace
        COSName key = COSName.getPDFName("Ordering");
        COSBase value = new COSString(new byte[]{ 73, 100, 101, 110, 116, 105, 116, 121 }, false);
        value.setDirect(true);
        receiver.setItem(key, value);
        // Recreated from trace
        COSName key0 = COSName.getPDFName("Registry");
        COSBase value0 = new COSString(new byte[]{ 65, 100, 111, 98, 101 }, false);
        value0.setDirect(true);
        receiver.setItem(key0, value0);
        // Recreated from trace
        COSName key1 = COSName.getPDFName("Supplement");
        // Recreated from trace
        COSInteger value1 = COSInteger.get(0L);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        value1.setDirect(true);
        receiver.setItem(key1, value1);
        receiver.setDirect(true);
        return receiver;
    }

    COSStream createCOSStream() throws IOException {
        RandomAccessStreamCache receiver = new RandomAccessStreamCacheImpl();
        Path receiver0 = Path.of("CodeMonkey.pdf");
        // Recreated from trace
        RandomAccessReadBufferedFile receiver1 = new RandomAccessReadBufferedFile(receiver0);
        receiver1.seek(499L);
        // Recreated from trace
        RandomAccessReadView receiver2 = new RandomAccessReadView(receiver1, 499L, 78L);
        receiver2.seek(0L);
        // Recreated from trace
        COSStream receiver3 = new COSStream(receiver, receiver2);
        receiver3.setKey(null);
        receiver3.createView();
        return receiver3;
    }

    @Test
    @DisplayName("getNameAsString(org.apache.pdfbox.cos.COSName)")
    void test884GetNameAsString$COSName() {
        // Arrange
        COSDictionary receiver = this.createCOSDictionary26();
        COSName key = COSName.getPDFName("Registry");
        // Act
        String actual = receiver.getNameAsString(key);
        // Assert
        String expected = "Adobe";
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }
}