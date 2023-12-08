package patterns;

import entities.Record;
import models.Client;
import models.User;

public class BookingFacade {
    public static Record makeReservation(Client client, String recordTime, String barberName, String address) {
        RecordBuilder builder = new RecordBuilder();
        Record record = builder.setClient(client)
                .setRecordTime(recordTime).setBarberName(barberName).setRecordAddress(address)
                .build();
        // Дополнительные операции по бронированию

        return record;
    }

    public static void payOnline(Record record, String promoCode) {
        // Оплата билета онлайн с применением промокода
        System.out.println("Payment successful with promo code: " + promoCode);
    }

    public static void cancelReservation(User user, Record record) {
        // Отмена бронирования
    }
}