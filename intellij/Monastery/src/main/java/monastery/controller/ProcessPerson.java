package monastery.controller;

import monastery.model.Person;
import monastery.util.MonasteryException;

public abstract class ProcessPerson <T extends Person> extends Process<T>{

    @Override
    protected void controlCreate() throws MonasteryException{

    }

    @Override
    protected void controlUpdate() throws MonasteryException {

    }


}
