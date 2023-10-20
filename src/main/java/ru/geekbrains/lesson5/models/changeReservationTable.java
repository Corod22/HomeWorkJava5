package ru.geekbrains.lesson5.models;

import java.util.Date;

public class changeReservationTable {
  public int changeReservationTable(int oldReservationNumber, Date reservationDate, int tableNo, String name) {
    Reservation oldReservation = getReservationByNumber(oldReservationNumber); // Получить старую бронь по номеру
    
    if (oldReservation != null) {
        removeReservation(oldReservation); // Удалить старую бронь из списка бронирований столика
        
        Reservation newReservation = new Reservation(reservationDate, name); // Создать новую бронь
        addReservation(newReservation); // Добавить новую бронь в список бронирований столика
        
        return newReservation.getReservationNumber(); // Вернуть номер нового бронирования
    }
    
    return -1; // Если старая бронь не найдена или произошла ошибка, вернуть -1
}

  private void addReservation(Reservation newReservation) {
  }

  private Reservation getReservationByNumber(int oldReservationNumber) {
    return null;
  }

  private void removeReservation(Reservation oldReservation) {
  }  
}
