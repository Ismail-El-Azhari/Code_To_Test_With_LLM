package org.threeTesters.runtime2test;

import java.util.Comparator;
import java.util.List;
import org.assertj.core.api.recursive.comparison.ComparisonDifference;
import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration;
import org.assertj.core.api.recursive.comparison.RecursiveComparisonDifferenceCalculator;
import org.assertj.core.util.DoubleComparator;
import org.assertj.core.util.FloatComparator;

public class AssertJEqualityHelper {

  public static void collectStatistics(Object actual, Object expected) {
    List<ComparisonDifference> differences = new RecursiveComparisonDifferenceCalculator()
        .determineDifferences(actual, expected, nanAwareComparison());
    if (!differences.isEmpty()) {
      String caller = StackWalker.getInstance()
          .walk(it -> it.skip(1).limit(1).findFirst())
          .orElseThrow()
          .toString();
      System.out.println("DIFF@ " + caller + " " + differences.size());
    }
  }

  public static RecursiveComparisonConfiguration nanAwareComparison() {
    return RecursiveComparisonConfiguration.builder()
        .withComparatorForType(doubleNanAwareComparator(), Double.class)
        .withComparatorForType(floatNanAwareComparator(), Float.class)
        .build();
  }

  public static Comparator<Double> doubleNanAwareComparator() {
    return (o1, o2) -> {
      if (Double.isNaN(o1) && Double.isNaN(o2)) {
        return 0;
      }
      return new DoubleComparator(1e-15).compare(o1, o2);
    };
  }

  public static Comparator<Float> floatNanAwareComparator() {
    return (o1, o2) -> {
      if (Float.isNaN(o1) && Float.isNaN(o2)) {
        return 0;
      }
      return new FloatComparator(1e-6f).compare(o1, o2);
    };
  }
}
