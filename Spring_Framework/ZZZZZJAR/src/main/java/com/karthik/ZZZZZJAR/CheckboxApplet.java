package com.karthik.ZZZZZJAR;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CheckboxApplet extends Applet {
    Checkbox checkbox;

    public void init() {
        checkbox = new Checkbox("Check me");
        add(checkbox);
    }

    public static void main(String[] args) {
    	System.out.println("hello");
        CheckboxApplet applet = new CheckboxApplet();
        applet.init();
        applet.start();
        
        
        
    }
}