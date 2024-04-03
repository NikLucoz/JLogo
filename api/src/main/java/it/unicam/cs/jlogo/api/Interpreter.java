package it.unicam.cs.jlogo.api;

public interface Interpreter {
    void load();
    void step();
    void reset();
    void setSize(double width, double height);
    void undo();
}
