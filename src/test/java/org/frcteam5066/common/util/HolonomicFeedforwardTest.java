package org.frcteam5066.common.util;

import org.frcteam5066.common.math.Vector2;
import org.frcteam5066.common.util.DrivetrainFeedforwardConstants;
import org.frcteam5066.common.util.HolonomicFeedforward;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HolonomicFeedforwardTest {
    @Test
    public void calculateFeedforwardTest() {
        HolonomicFeedforward feedforward = new HolonomicFeedforward(
                new DrivetrainFeedforwardConstants(2.0, 0.0, 0.0));
        assertEquals(new Vector2(1.0, 1.0), feedforward.calculateFeedforward(new Vector2(0.5, 0.5),
                Vector2.ZERO));

        feedforward = new HolonomicFeedforward(
                new DrivetrainFeedforwardConstants(0.0, 2.0, 0.0));
        assertEquals(new Vector2(1.0, 1.0), feedforward.calculateFeedforward(new Vector2(0.5, 0.5),
                new Vector2(0.5, 0.5)));
    }
}
