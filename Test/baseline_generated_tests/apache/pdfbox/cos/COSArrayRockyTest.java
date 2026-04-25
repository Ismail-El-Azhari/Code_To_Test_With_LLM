package org.apache.pdfbox.cos;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class COSArrayRockyTest {
    COSArray createCOSArray() {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = COSInteger.get(1L);
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(3L);
        receiver.add(object0);
        receiver.add(object);
        receiver.setDirect(true);
        return receiver;
    }

    COSArray createCOSArray20() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("226");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        receiver.remove(1);
        return receiver;
    }

    @Test
    @DisplayName("remove(int)")
    void test684Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray17();
        int i = 0;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get("218");
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSArray createCOSArray2() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("220");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        receiver.remove(1);
        return receiver;
    }

    COSArray createCOSArray8() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("220");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        return receiver;
    }

    @Test
    @DisplayName("toFloatArray()")
    void test695ToFloatArray$() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray41();
        // Act
        float[] actual = receiver.toFloatArray();
        // Assert
        float[] expected = new float[]{ 0.0F, 0.0F, 612.0F, 792.0F };
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("remove(int)")
    void test687Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray26();
        int i = 1;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get(0L);
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("toFloatArray()")
    void test690ToFloatArray$() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray35();
        // Act
        float[] actual = receiver.toFloatArray();
        // Assert
        float[] expected = new float[]{ 164.25F, 438.75F, 207.0F, 453.0F };
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    COSArray createCOSArray23() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("222");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        return receiver;
    }

    COSArray createCOSArray17() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("218");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        receiver.remove(1);
        return receiver;
    }

    @Test
    @DisplayName("remove(int)")
    void test682Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray11();
        int i = 0;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get("222");
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSArray createCOSArray41() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
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
        receiver.add(object);
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = (COSInteger) COSInteger.get("612");
        receiver.add(object0);
        // Recreated from trace
        COSInteger object1 = (COSInteger) COSInteger.get("792");
        receiver.add(object1);
        receiver.setDirect(true);
        return receiver;
    }

    @Test
    @DisplayName("toFloatArray()")
    void test689ToFloatArray$() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray32();
        // Act
        float[] actual = receiver.toFloatArray();
        // Assert
        float[] expected = new float[]{ 443.25F, 454.5F, 470.25F, 468.75F };
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    COSArray createCOSArray26() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("226");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        return receiver;
    }

    @Test
    @DisplayName("getInt(int,int)")
    void test664GetInt$int_int() {
        // Arrange
        COSArray receiver = this.createCOSArray();
        int index = 0;
        int defaultValue = 0;
        // Act
        int actual = receiver.getInt(index, defaultValue);
        // Assert
        int expected = 1;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("remove(int)")
    void test688Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray29();
        int i = 1;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get(0L);
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSArray createCOSArray5() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("224");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        receiver.remove(1);
        return receiver;
    }

    @Test
    @DisplayName("remove(int)")
    void test686Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray23();
        int i = 1;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get(0L);
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("remove(int)")
    void test685Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray20();
        int i = 0;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get("226");
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSArray createCOSArray14() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("218");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        return receiver;
    }

    @Test
    @DisplayName("remove(int)")
    void test680Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray5();
        int i = 0;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get("224");
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("remove(int)")
    void test679Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray2();
        int i = 0;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get("220");
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getInt(int,int)")
    void test665GetInt$int_int() {
        // Arrange
        COSArray receiver = this.createCOSArray();
        int index = 2;
        int defaultValue = 0;
        // Act
        int actual = receiver.getInt(index, defaultValue);
        // Assert
        int expected = 1;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("remove(int)")
    void test683Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray14();
        int i = 1;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get(0L);
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSArray createCOSArray29() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("224");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        return receiver;
    }

    @Test
    @DisplayName("remove(int)")
    void test681Remove$int() throws IOException {
        // Arrange
        COSArray receiver = this.createCOSArray8();
        int i = 1;
        // Act
        COSBase actual = receiver.remove(i);
        // Assert
        COSBase expected = COSInteger.get(0L);
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    COSArray createCOSArray11() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSInteger object = (COSInteger) COSInteger.get("222");
        receiver.add(object);
        // Recreated from trace
        COSInteger object0 = COSInteger.get(0L);
        receiver.add(object0);
        receiver.remove(1);
        return receiver;
    }

    COSArray createCOSArray32() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSFloat object = (COSFloat) COSFloat.get("443.25");
        receiver.add(object);
        // Recreated from trace
        COSFloat object0 = (COSFloat) COSFloat.get("454.5");
        receiver.add(object0);
        // Recreated from trace
        COSFloat object1 = (COSFloat) COSFloat.get("470.25");
        receiver.add(object1);
        // Recreated from trace
        COSFloat object2 = (COSFloat) COSFloat.get("468.75");
        receiver.add(object2);
        receiver.setDirect(true);
        return receiver;
    }

    @Test
    @DisplayName("getInt(int,int)")
    void test663GetInt$int_int() {
        // Arrange
        COSArray receiver = this.createCOSArray();
        int index = 1;
        int defaultValue = 0;
        // Act
        int actual = receiver.getInt(index, defaultValue);
        // Assert
        int expected = 3;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    COSArray createCOSArray35() throws IOException {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSFloat object = (COSFloat) COSFloat.get("164.25");
        receiver.add(object);
        // Recreated from trace
        COSFloat object0 = (COSFloat) COSFloat.get("438.75");
        receiver.add(object0);
        // Recreated from trace
        COSInteger object1 = (COSInteger) COSInteger.get("207");
        receiver.add(object1);
        // Recreated from trace
        COSInteger object2 = (COSInteger) COSInteger.get("453");
        receiver.add(object2);
        receiver.setDirect(true);
        return receiver;
    }
}