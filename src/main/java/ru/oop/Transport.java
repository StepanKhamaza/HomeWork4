package ru.oop;

/**
 * Транспорт с методом куда нужно добраться
 */
public interface Transport extends Positioned {
    void go(Position destination);
}
