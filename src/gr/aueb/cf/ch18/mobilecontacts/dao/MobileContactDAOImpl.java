package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.ArrayList;
import java.util.List;

public class MobileContactDAOImpl implements IMobileContactDAO {
    private static final List<MobileContact> contacts = new ArrayList<>();

    @Override
    public MobileContact insert(MobileContact mobileContact) {
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

    }

    @Override
    public MobileContact getById(Long id) {
        return null;
    }

    @Override
    public List<MobileContact> getAll() {
        return List.of();
    }

    @Override
    public void deleteByPhoneNumber(String phoneNumber) {

    }

    @Override
    public MobileContact getByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public boolean userIdExists(Long id) {
        return false;
    }

    @Override
    public boolean phoneNumberExists(String phoneNumber) {
        return false;
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
}
