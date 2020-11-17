package com.qa.inversion;

public class BackendDeveloper implements Developer
{
    @Override
    public void develop()
    {
        // Call to Developer type specific implementation
        writeJava();
    }

    public void writeJava()
    {
        System.out.println("C# is just Microsoft Java anyway.");
    }
}
