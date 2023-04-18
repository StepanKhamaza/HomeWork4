package ru.oop;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Person {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * Установить текущее местоположение
     */
    void setPosition(Position position);

    /**
     * Пройти до указанного места из текущего местоположение
     */
    void walk(Position destination);
}
