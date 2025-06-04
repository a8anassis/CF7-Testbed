package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MobileContactDAOImpl implements IMobileContactDAO {
    private static final List<MobileContact> contacts = new ArrayList<>();

    @Override
    public MobileContact insert(MobileContact mobileContact) {
        if (mobileContact == null) return null;
        contacts.add(mobileContact);
        return mobileContact;
    }

    @Override
    public MobileContact update(Long id, MobileContact mobileContact) {
        contacts.set(getIndexById(id), mobileContact);
        return mobileContact;
    }

    @Override
    public void deleteById(Long id) {
        contacts.removeIf(c -> c.getId().equals(id));
    }

    @Override
    public MobileContact getById(Long id) {
        return contacts.get(getIndexById(id));
    }

    @Override
    public List<MobileContact> getAll() {
        return List.copyOf(contacts);
        //return new ArrayList<>(contacts);
    }

    @Override
    public void deleteByPhoneNumber(String phoneNumber) {
        contacts.removeIf(c -> c.getPhoneNumber().equals(phoneNumber));
    }

//    @Override
//    public MobileContact getByPhoneNumber(String phoneNumber) {
//        return contacts.get(getIndexByPhoneNumber(phoneNumber));
//    }

    @Override
    public Optional<MobileContact> getByPhoneNumber(String phoneNumber) {
        return contacts.stream()
                .filter(c -> c.getPhoneNumber().equals(phoneNumber))
                .findFirst();
    }

    @Override
    public boolean userIdExists(Long id) {
        return contacts.contains(getById(id));
    }

    @Override
    public boolean phoneNumberExists(String phoneNumber) {
        return contacts.stream().anyMatch(c -> c.getPhoneNumber().equals(phoneNumber));
    }

    private int getIndexById(Long id) {
        int positionToReturn = -1;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId().equals(id)) {
                //return i;
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
        //return -1;
    }

    private int getIndexByPhoneNumber(String phoneNumber) {
        int positionToReturn = -1;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                //return i;
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
        //return -1;
    }
}
