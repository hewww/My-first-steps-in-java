package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //When
        User andrzej = new ZGeneration("Andrzej");
        User marek = new Millenials("Marek");
        User kamil = new YGeneration("Kamil");

        //Given
        String andrzejGeneration = andrzej.sharePost();
        String marekGeneration = marek.sharePost();
        String kamilGeneration = kamil.sharePost();

        //Then
        Assert.assertEquals(andrzejGeneration,"Używasz Twittera");
        Assert.assertEquals(marekGeneration,"Używasz snapchata");
        Assert.assertEquals(kamilGeneration,"Używasz Facebook");
    }

    @Test
    public void testIndividualSharingStrategy() {
        //When
        User andrzej = new ZGeneration("Andrzej");

        //Given
        String andrzejGeneration = andrzej.sharePost();
        andrzej.setGeneration(new FacebookPublisher());
        andrzejGeneration = andrzej.sharePost();

        //Then
        Assert.assertEquals("Używasz Facebook",andrzejGeneration);

    }
}
