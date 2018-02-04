package lyanglyang.newapp_oct26;

/**
 * Created by titan on 12/12/2017.
 */

public class Requests {
    private int _id;
    private String _name;
    private String _bloodgroup;
    private int _pints;

    public Requests(int _id, String _name, String _bloodgroup, int _pints) {
        this._id = _id;
        this._name = _name;
        this._bloodgroup = _bloodgroup;
        this._pints = _pints;
    }
    public Requests(String _name, String _bloodgroup, int _pints) {

        this._name = _name;
        this._bloodgroup = _bloodgroup;
        this._pints = _pints;
    }


    public Requests() {

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

    public int get_pints() {
        return _pints;
    }

    public void set_pints(int _pints) {
        this._pints = _pints;
    }
}


