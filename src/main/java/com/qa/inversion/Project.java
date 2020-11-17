package com.qa.inversion;

import java.util.List;

public class Project
{
    private List<Developer> developers;

    public Project(List<Developer> devs)
    {
        this.developers = devs;
    }

    public void implement()
    {
        // It doesn't matter what type of developers we have as they all implement their version of develop.
        developers.forEach(Developer::develop);
    }
}
