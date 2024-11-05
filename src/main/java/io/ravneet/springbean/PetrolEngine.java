package io.ravneet.springbean;

public class PetrolEngine implements IEngine{

    private Integer horsePower;
    private String engineType;

    public PetrolEngine(Integer horsePower) {
        this.engineType = "Petrol Engine";
        this.horsePower = horsePower;
    }

    @Override
    public void display(){
        System.out.println("Petrol Engine with "+horsePower+ "HP.");
    }



}