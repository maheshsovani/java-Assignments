package com.step.assignments.composition;

public class JewellaryBox {
    private Jewellery jewellery;
    private JewellaryBox jewellaryBox;
    static int count = 0;

    public JewellaryBox(JewellaryBox jewellaryBox) {
        this.jewellaryBox = jewellaryBox;
    }

    public JewellaryBox(Jewellery jewellery) {
        this.jewellery = jewellery;
        increaseCount();
    }

    public JewellaryBox() {
    }

    public JewellaryBox(Jewellery jewellery, JewellaryBox jewellaryBox) {
        this.jewellery = jewellery;
        this.jewellaryBox = jewellaryBox;
    }

    public int getJewelleryCount() {
        return jewellery.getCount();
    }

    public static void increaseCount() {
        count++;
    }

}
