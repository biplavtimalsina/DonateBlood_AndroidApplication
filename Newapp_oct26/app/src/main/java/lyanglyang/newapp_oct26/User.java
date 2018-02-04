package lyanglyang.newapp_oct26;

/**
 * Created by titan on 12/12/2017.
 */

public class User {
    private int _id;
    private String _name;
    private String _bloodgroup;
    private int _age;

    public User(String _name, String _bloodgroup, int _age) {
        this._name = _name;
        this._bloodgroup = _bloodgroup;
        this._age = _age;
    }

    public User(int _id, String _name, String _bloodgroup, int _age) {
        this._id = _id;
        this._name = _name;
        this._bloodgroup = _bloodgroup;
        this._age = _age;

    }

    public User() {

    }

    public User(String _name) {
        this._name = _name;
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

    public String get_bloodgroup() {
        return _bloodgroup;
    }

    public void set_bloodgroup(String _bloodgroup) {
        this._bloodgroup = _bloodgroup;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }
}

/*

    public static final String COL_ID="_id";
    public static final String COL_NAME="_name";
    public static final String COL_BLOODGROUP="_bloodgroup";
    public static final String COL_AGE="_age";

*/