package it.unicam.cs.jlogo.api;

public interface Program {
    Action next();
    boolean completed();
    void restart();
}
