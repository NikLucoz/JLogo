package it.unicam.cs.jlogo.api;
/*
* This interface
* */
public interface Cursor {

    void up();

    void down();

    void setColor(Color c);

    void setFillColor(Color c);

    void setSize(int px);

    void setDirection(double angle);

    Segment move(double lenght);

    void home();

}
