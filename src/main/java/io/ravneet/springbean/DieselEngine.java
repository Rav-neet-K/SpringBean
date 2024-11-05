package io.ravneet.springbean;

import lombok.Data;

@Data
public class DieselEngine implements IEngine{

    private Integer horsePower;
    private String engineType;

    public DieselEngine(Integer horsePower) {
        this.engineType = "Diesel Engine";
        this.horsePower = horsePower;
    }

    @Override
    public void display(){
        System.out.println("Diesel Engine with "+horsePower+ "HP.");
    }
}
