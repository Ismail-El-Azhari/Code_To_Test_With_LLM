package org.apache.fontbox.ttf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.threeTesters.runtime2test.AssertJEqualityHelper.nanAwareComparison;
class CmapTableRockyTest {
    @Test
    @DisplayName("getSubtable(int,int)")
    void test573GetSubtable$int_int() {
        // Arrange
        CmapTable receiver = new CmapTable();
        int platformId = 0;
        int platformEncodingId = 3;
        // Act
        CmapSubtable actual = receiver.getSubtable(platformId, platformEncodingId);
        // Assert
        CmapSubtable expected = new CmapSubtable();
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getSubtable(int,int)")
    void test576GetSubtable$int_int() {
        // Arrange
        CmapTable receiver = new CmapTable();
        int platformId = 3;
        int platformEncodingId = 1;
        // Act
        CmapSubtable actual = receiver.getSubtable(platformId, platformEncodingId);
        // Assert
        CmapSubtable expected = new CmapSubtable();
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getSubtable(int,int)")
    void test578GetSubtable$int_int() {
        // Arrange
        CmapTable receiver = new CmapTable();
        int platformId = 0;
        int platformEncodingId = 3;
        // Act
        CmapSubtable actual = receiver.getSubtable(platformId, platformEncodingId);
        // Assert
        CmapSubtable expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getSubtable(int,int)")
    void test571GetSubtable$int_int() {
        // Arrange
        CmapTable receiver = new CmapTable();
        int platformId = 0;
        int platformEncodingId = 4;
        // Act
        CmapSubtable actual = receiver.getSubtable(platformId, platformEncodingId);
        // Assert
        CmapSubtable expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }

    @Test
    @DisplayName("getSubtable(int,int)")
    void test574GetSubtable$int_int() {
        // Arrange
        CmapTable receiver = new CmapTable();
        int platformId = 3;
        int platformEncodingId = 10;
        // Act
        CmapSubtable actual = receiver.getSubtable(platformId, platformEncodingId);
        // Assert
        CmapSubtable expected = null;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).usingRecursiveComparison(nanAwareComparison()).isEqualTo(expected);
    }
}