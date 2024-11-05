package io.ravneet.springbean;

import lombok.Data;

@Data
public class BMW {

    private String model;
    private IEngine engine;

    private String engineYear;

    public BMW(String model, String engineYear,IEngine engine) {
        this.model = model;
        this.engineYear = engineYear;
        this.engine=engine;
    }
}
