package io.ravneet.springbean;

import lombok.Data;

import java.time.Instant;

@Data
public class EmployeeDAo {

    private final String url;
    private final String username;
    private final String pass;

public void establishConnection(){
    //initialite  or hibernate session factory object / DB connection obj
    System.out.println(Instant.now()+ " Database connection established");
    //this runs while creating the object
}

    public void releaseConnection(){
        //release connection/close buffer with file
        System.out.println(Instant.now()+ " Database connection released");
        //this runs while creating the object
    }
}
