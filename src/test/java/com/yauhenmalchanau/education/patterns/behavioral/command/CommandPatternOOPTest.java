package com.yauhenmalchanau.education.patterns.behavioral.command;

import org.junit.Assert;
import org.junit.Test;

public class CommandPatternOOPTest {

    @Test
    public void openTextFileCommandTest() {
        String result = new TextFileOperationExecutor().executeOperation(new OpenTextFileOperation(new TextFile("text1.txt")));

        Assert.assertEquals("Opening file text1.txt", result);
    }

    @Test
    public void saveTextFileCommandTest() {
        String result = new TextFileOperationExecutor().executeOperation(new SaveTextFileOperation(new TextFile("text2.txt")));

        Assert.assertEquals("Saving file text2.txt", result);
    }
}
