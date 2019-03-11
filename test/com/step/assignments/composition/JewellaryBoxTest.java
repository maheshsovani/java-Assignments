package com.step.assignments.composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewellaryBoxTest {


    @Test
    void shouldReturnTotalNumberOfJewelleriesInsideAJewelleryBox() {
        Jewellery diamond_ring = new Jewellery("Diamond Ring");
        JewellaryBox jewelleryBox = new JewellaryBox(diamond_ring);
        Jewellery neckless = new Jewellery("neckless");
        JewellaryBox jewelleryBox1 = new JewellaryBox(neckless, jewelleryBox);

        assertEquals(2, jewelleryBox1.getJewelleryCount());
    }

    @Test
    void name() {
        JewellaryBox _5thLevelBox = new JewellaryBox();

        JewellaryBox _4thLevelBox = new JewellaryBox(_5thLevelBox);

        Jewellery nacklace = new Jewellery("necklace");
        JewellaryBox _3rdLevelBox = new JewellaryBox(nacklace, _4thLevelBox);

        Jewellery ring = new Jewellery("ring");
        JewellaryBox _2ndLevelBox = new JewellaryBox(ring, _3rdLevelBox);

        JewellaryBox _1stLevelBox = new JewellaryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.getJewelleryCount());
    }
}