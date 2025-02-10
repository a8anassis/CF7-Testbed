package gr.aueb.cf.solutions.ch13.bankapp;

import java.util.UUID;

public class IdentifiableEntity {
    private String uuid;

    public IdentifiableEntity() {
        uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
