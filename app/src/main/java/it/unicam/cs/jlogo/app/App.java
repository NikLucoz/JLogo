/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.unicam.cs.jlogo.app;

import it.unicam.cs.jlogo.list.LinkedList;

import static it.unicam.cs.jlogo.utilities.StringUtils.join;
import static it.unicam.cs.jlogo.utilities.StringUtils.split;
import static it.unicam.cs.jlogo.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
