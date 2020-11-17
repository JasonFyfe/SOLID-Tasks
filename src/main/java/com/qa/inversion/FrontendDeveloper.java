package com.qa.inversion;

public class FrontendDeveloper implements Developer
{
    @Override
    public void develop()
    {
        // Call to Developer type specific implementation
        writeJavaScript();
    }

    public void writeJavaScript()
    {
        System.out.println("JavaScript is used everywhere anyway!");
    }
}
