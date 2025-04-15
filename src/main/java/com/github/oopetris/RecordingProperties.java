package com.github.oopetris;


import java.util.Objects;

public class RecordingProperties {
    public GridProperties gridProperties;

    public RecordingProperties(GridProperties gridProperties) {
        this.gridProperties = gridProperties;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof RecordingProperties that)) {
            return false;
        }

        return Objects.equals(gridProperties, that.gridProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(gridProperties);
    }

    @Override
    public String toString() {
        return "RecordingProperties{" +
                "gridProperties=" + gridProperties +
                '}';
    }
}
