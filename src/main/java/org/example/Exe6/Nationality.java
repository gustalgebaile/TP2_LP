package org.example.Exe6;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public enum Nationality {
    DUTCH(Arrays.asList(Color.RED, Color.WHITE, Color.BLUE)),
    GERMAN(Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW)),
    BELGIAN(Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED)),
    FRENCH(Arrays.asList(Color.BLUE, Color.WHITE, Color.RED)),
    ITALIAN(Arrays.asList(Color.GREEN, Color.WHITE, Color.RED)),
    UNCLASSIFIED(Arrays.asList(Color.GRAY));

    private final java.util.List<Color> flagColors;

    Nationality(java.util.List<Color> flagColors) {
        this.flagColors = flagColors;
    }

    public List<Color> getFlagColors() {
        return flagColors;
    }
}
