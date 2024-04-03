package it.unicam.cs.jlogo.api;

public interface DrawingArea {

    double getWidth();
    double getHeight();
    void setBackground(Color c);
    void addSegment(Segment s);
}
