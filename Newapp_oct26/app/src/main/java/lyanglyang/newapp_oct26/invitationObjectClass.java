package lyanglyang.newapp_oct26;

/**
 * Created by titan on 12/14/2017.
 */

public class invitationObjectClass {
    private int _id;
    private String _name;
    private String _phoneNumber;
    private String _email;

    public invitationObjectClass(int _id, String _name, String _phoneNumber, String _email) {
        this._id = _id;
        this._name = _name;
        this._phoneNumber = _phoneNumber;
        this._email = _email;
    }

    public invitationObjectClass(String _name, String _phoneNumber, String _email) {
        this._name = _name;
        this._phoneNumber = _phoneNumber;
        this._email = _email;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_phoneNumber() {
        return _phoneNumber;
    }

    public void set_phoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }
}
