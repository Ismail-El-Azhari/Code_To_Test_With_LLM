package org.apache.pdfbox.cos;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.threeTesters.runtime2test.AssertJEqualityHelper;
import static org.assertj.core.api.Assertions.assertThat;
class COSObjectKeyRockyTest {
    @Test
    @DisplayName("equals(java.lang.Object)")
    void test251Equals$Object() {
        // Arrange
        COSObjectKey receiver = new COSObjectKey(138L, 0);
        Object obj = new COSObjectKey(138L, 0);
        // Act
        boolean actual = receiver.equals(obj);
        // Assert
        boolean expected = true;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("equals(java.lang.Object)")
    void test252Equals$Object() {
        // Arrange
        COSObjectKey receiver = new COSObjectKey(151L, 0);
        Object obj = new COSObjectKey(151L, 0);
        // Act
        boolean actual = receiver.equals(obj);
        // Assert
        boolean expected = true;
        AssertJEqualityHelper.collectStatistics(actual, expected);
        assertThat(actual).isEqualTo(expected);
    }
}