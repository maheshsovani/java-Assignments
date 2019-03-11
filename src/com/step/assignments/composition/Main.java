package com.step.assignments.composition;

public class Main {
    public static void main(String[] args) {
        Jewellery jewellery = new Jewellery("Necklace");
        Jewellery jewellery1 = new Jewellery("Ring1");

        JewellaryBox box = new JewellaryBox(jewellery);

        JewellaryBox box1 = new JewellaryBox(jewellery1, box);
        JewellaryBox box2 = new JewellaryBox(jewellery1, box1);
        JewellaryBox box3 = new JewellaryBox(jewellery1, box2);
        JewellaryBox box4 = new JewellaryBox(jewellery1, box3);
        JewellaryBox box5 = new JewellaryBox(jewellery1, box4);

        System.out.println(box1.getJewelleryCount());
    }
}
