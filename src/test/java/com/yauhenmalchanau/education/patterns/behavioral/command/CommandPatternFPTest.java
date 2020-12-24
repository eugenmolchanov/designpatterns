package com.yauhenmalchanau.education.patterns.behavioral.command;

import org.junit.Assert;
import org.junit.Test;

public class CommandPatternFPTest {

    @Test
    public void openTextFileCommandTest() {
        TextFile textFile = new TextFile("text1.txt");
        String result = new TextFileOperationExecutor().executeOperation(textFile::open);

        Assert.assertEquals("Opening file text1.txt", result);
    }

    @Test
    public void saveTextFileCommandTest() {
        TextFile textFile = new TextFile("text2.txt");
        String result = new TextFileOperationExecutor().executeOperation(textFile::save);

        Assert.assertEquals("Saving file text2.txt", result);
    }
}
