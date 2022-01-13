package org.frcteam5066.common.util;

public interface InverseInterpolable<T> {
    double inverseInterpolate(T upper, T query);
}
