package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.PoemEditor;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

public class PoemTest {

    @Test
    public void testPoemText() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        //When
        String result1 = poemBeautifier.beautify("cos", PoemEditor::addDollars);
        String result2 = poemBeautifier.beautify("cos", PoemEditor::addLetters);
        String result3 = poemBeautifier.beautify("cos", PoemEditor::bigger);


        //Then
        Assert.assertEquals("$$$cos$$$",result1);
        Assert.assertEquals("AAAcosAAA",result2);
        Assert.assertEquals("COS",result3);
    }
}
