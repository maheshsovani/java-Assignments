package com.step.assignments.Exercise1;

public class UnoCard implements Duplicable<DuplicateUnoCard>{
    private String name;
    private Integer number;

    public UnoCard(String name,int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public DuplicateUnoCard duplicate() {
        return new DuplicateUnoCard(this.name,this.number);
    }

    public void printDetails(){
        System.out.println("Name :"+this.name);
        System.out.println("Number :"+this.number);
    }
}
