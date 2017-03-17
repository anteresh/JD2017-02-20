package by.it.loktev.Calculator;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    static private HashMap<String,Var> vars=new HashMap<String,Var>();

    /*
    public Storage() {
        this.vars = new HashMap<String,Var>();
    }
    */

    static public void store(String name, Var var){
        vars.put(name,var);
    }

    static public Var restore(String name){
        return vars.get(name);
    }

    static public void print(){
        System.out.println("Переменные в хранилище:");
        for (Map.Entry<String,Var> ME : vars.entrySet()){
            System.out.println(ME.getKey()+": "+ME.getValue());
        }
    }
}
