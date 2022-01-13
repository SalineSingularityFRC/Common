package org.frcteam5066.common.util;

public interface Interpolable<T> {
    T interpolate(T other, double t);
}
