package patterns;

import entities.Record;
import models.Client;

public class RecordBuilder {
    private Record record = new Record();

    public RecordBuilder setClient(Client client) {
        record.setClient(client);
        return this;
    }

    public RecordBuilder setRecordTime(String time) {
        record.setRecordTime(time);
        return this;
    }

    public RecordBuilder setBarberName(String barberName) {
        record.setBarberName(barberName);
        return this;
    }

    public RecordBuilder setRecordAddress(String address) {
        record.setRecordAddress(address);
        return this;
    }


    public Record build() {
        return record;
    }
}