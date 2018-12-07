package week5reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TvTableBuilderTest {

    @Test
    void build() {

        TvTableBuilder tvTableBuilder = new TvTableBuilder();

        TvTable buildATvTable = tvTableBuilder.build();

        List<String> expectedParts = Arrays.asList("leg", "leg", "leg", "leg", "shelf", "top");

        Assertions.assertEquals(expectedParts, buildATvTable.parts);
    }

}