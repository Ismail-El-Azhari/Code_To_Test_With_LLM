package org.apache.pdfbox.util;
import java.awt.geom.Point2D;
import org.apache.pdfbox.cos.COSArray;
import org.apache.pdfbox.cos.COSFloat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class MatrixRockyTest {
    @Test
    @DisplayName("transformPoint(float,float)")
    void test735TransformPoint$float_float() {
        // Arrange
        Matrix receiver = this.createMatrix8();
        float x = 443.25F;
        float y = 454.5F;
        // Act
        Point2D.Float actual = receiver.transformPoint(x, y);
        Point2D.Float expected = new Point2D.Float();
        expected.x = 443.25F;
        expected.y = 454.5F;
        // Assert
        Point2D.Float expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("transformPoint(float,float)")
    void test740TransformPoint$float_float() {
        // Arrange
        Matrix receiver = this.createMatrix2();
        float x = 470.25F;
        float y = 454.5F;
        // Act
        Point2D.Float actual = receiver.transformPoint(x, y);
        Point2D.Float expected = new Point2D.Float();
        expected.x = 27.0F;
        // Assert
        Point2D.Float expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    Matrix createMatrix8() {
        // Recreated from trace
        Matrix receiver = Matrix.getTranslateInstance(443.25F, 454.5F);
        // Recreated from trace
        COSArray receiver0 = new COSArray();
        // Recreated from trace
        COSFloat object = new COSFloat(1.0F);
        receiver0.add(object);
        // Recreated from trace
        COSFloat object0 = new COSFloat(0.0F);
        receiver0.add(object0);
        // Recreated from trace
        COSFloat object1 = new COSFloat(0.0F);
        receiver0.add(object1);
        // Recreated from trace
        COSFloat object2 = new COSFloat(1.0F);
        receiver0.add(object2);
        // Recreated from trace
        COSFloat object3 = new COSFloat(-443.25F);
        receiver0.add(object3);
        // Recreated from trace
        COSFloat object4 = new COSFloat(-454.5F);
        receiver0.add(object4);
        // Recreated from trace
        Matrix receiver1 = Matrix.createMatrix(receiver0);
        // Recreated from trace
        return Matrix.concatenate(receiver, receiver1);
    }

    @Test
    @DisplayName("transformPoint(float,float)")
    void test738TransformPoint$float_float() {
        // Arrange
        Matrix receiver = this.createMatrix8();
        float x = 470.25F;
        float y = 454.5F;
        // Act
        Point2D.Float actual = receiver.transformPoint(x, y);
        Point2D.Float expected = new Point2D.Float();
        expected.x = 470.25F;
        expected.y = 454.5F;
        // Assert
        Point2D.Float expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("transformPoint(float,float)")
    void test732TransformPoint$float_float() {
        // Arrange
        Matrix receiver = this.createMatrix2();
        float x = 443.25F;
        float y = 468.75F;
        // Act
        Point2D.Float actual = receiver.transformPoint(x, y);
        Point2D.Float expected = new Point2D.Float();
        expected.y = 14.25F;
        // Assert
        Point2D.Float expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }

    @Test
    @DisplayName("transformPoint(float,float)")
    void test739TransformPoint$float_float() {
        // Arrange
        Matrix receiver = this.createMatrix2();
        float x = 443.25F;
        float y = 454.5F;
        // Act
        Point2D.Float actual = receiver.transformPoint(x, y);
        // Assert
        Point2D.Float expected = new Point2D.Float();
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    Matrix createMatrix2() {
        // Recreated from trace
        COSArray receiver = new COSArray();
        // Recreated from trace
        COSFloat object = new COSFloat(1.0F);
        receiver.add(object);
        // Recreated from trace
        COSFloat object0 = new COSFloat(0.0F);
        receiver.add(object0);
        // Recreated from trace
        COSFloat object1 = new COSFloat(0.0F);
        receiver.add(object1);
        // Recreated from trace
        COSFloat object2 = new COSFloat(1.0F);
        receiver.add(object2);
        // Recreated from trace
        COSFloat object3 = new COSFloat(-443.25F);
        receiver.add(object3);
        // Recreated from trace
        COSFloat object4 = new COSFloat(-454.5F);
        receiver.add(object4);
        // Recreated from trace
        return Matrix.createMatrix(receiver);
    }

    @Test
    @DisplayName("transformPoint(float,float)")
    void test733TransformPoint$float_float() {
        // Arrange
        Matrix receiver = this.createMatrix2();
        float x = 470.25F;
        float y = 468.75F;
        // Act
        Point2D.Float actual = receiver.transformPoint(x, y);
        Point2D.Float expected = new Point2D.Float();
        expected.x = 27.0F;
        expected.y = 14.25F;
        // Assert
        Point2D.Float expected0 = expected;
        AssertJEqualityHelper.collectStatistics(actual, expected0);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected0);
    }
}