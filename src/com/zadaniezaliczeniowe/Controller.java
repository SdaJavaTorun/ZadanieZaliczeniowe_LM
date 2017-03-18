package com.zadaniezaliczeniowe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-18.
 */
public class Controller {
    public UserInput userInput = new UserInput();
    public List<Worker> workerList=new ArrayList<>();

    public void addWorker(){
        Worker w1 = userInput.populateWorker();
        workerList.add(w1);
    }

}
