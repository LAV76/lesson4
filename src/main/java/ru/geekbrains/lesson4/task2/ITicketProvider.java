package ru.geekbrains.lesson4.task2;

import java.util.Collection;
import java.util.Date;

public interface ITicketProvider {

    Collection<Ticket> searchTicket(int clientId, Date date);

    boolean buyTicket(int clientId, String cardNo);

    boolean checkTicket(String qrcode);
}
