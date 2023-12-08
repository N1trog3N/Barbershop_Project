package entities;
import models.Client;

public class Record {
    private static int nextRecordID = 1;

    private int recordID;
    private Client client;
    private String recordTime;
    private String barberName;
    private String address;

    public Record() {
        this.recordID = nextRecordID++;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    public void setBarberName(String barberName) {
        this.barberName = barberName;
    }

    public void setRecordAddress(String address) {
        this.address = address;
    }

    public String getBarberName() {
        return barberName;
    }

    public String getAddress() {
        return address;
    }
}