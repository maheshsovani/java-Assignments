package com.step.assignments.Exercise1;

public class IdentityCard implements Duplicable<DuplicateIdentityCard> {
    private String name;
    private Integer empId;

    public IdentityCard(String name, Integer empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public DuplicateIdentityCard duplicate() {
        return new DuplicateIdentityCard(this.name,this.empId);
    }

    public void printDetails(){
        System.out.println("Name :"+this.name);
        System.out.println("Number :"+this.empId);
    }
}
