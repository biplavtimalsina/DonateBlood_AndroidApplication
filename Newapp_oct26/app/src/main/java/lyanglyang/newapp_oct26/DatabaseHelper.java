package lyanglyang.newapp_oct26;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by titan on 11/9/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {


    private static DatabaseHelper sInstance;
    public static synchronized DatabaseHelper getInstance(Context context) {

        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = new DatabaseHelper(context.getApplicationContext());
        }
        return sInstance;
    }
    private DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public static final String DATABASE_NAME="blooddatabase.db";
    public static final int DATABASE_VERSION=1;

    //for User Registration
    public static final String TABLEUSERS_NAME="usersinfo";
    public static final String COL1_ID="_id";
    public static final String COL1_NAME="_name";
    public static final String COL1_BLOODGROUP="_bloodgroup";
    public static final String COL1_AGE="_age";

    //for Blood Requests information
    public static final String TABLEREQUEST_NAME="bloodrequests";
    public static final String COL2_ID="_id";
    public static final String COL2_NAME="_name";
    public static final String COL2_BLOODGROUP="_bloodgroup";
    public static final String COL2_PINTS="_pints";

    //for Invitation Requests information
    public static final String TABLEINVITATION_NAME="invitation";
    public static final String COL3_ID="_id";
    public static final String COL3_NAME="_name";
    public static final String COL3_EMAIL="_email";
    public static final String COL3_PHONE="_phone";






    /*
    public static final String COL1_LOCATION="_location";
    public static final String COL1_NUMBEROFBLOODDONATIONS="_numberofBloodDonations";
    public static final String COL1_LASTDONATION="_lastdonation";
    public static final String COL1_PHONENUMBER="_phonenumber";
    public static final String COL1_EMAIL="_email";
    public static final String COL1_REWARDS="_rewardpoints";

  public static final String COL11="Donation_Images";
    public static final String COL12="Pro_Pic";
    public static final String COL13="Current_GPS";*/

/* Creates a database when this constructor is called */

    private DatabaseHelper(Context context,String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context,DATABASE_NAME , null, DATABASE_VERSION);
       // SQLiteDatabase db=this.getWritableDatabase();   //creates database and table
        Log.d("Database Operations","Database Created");
    }

    @Override
    //create a table for Users Blood Request
    public void onCreate(SQLiteDatabase db) {
        //for Blood Requests table
            db.execSQL( "CREATE TABLE " + TABLEREQUEST_NAME + "(" +
                    COL2_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL2_NAME + " TEXT, " +
                    COL2_BLOODGROUP + " TEXT, " +
                    COL2_PINTS + " INT " +
                   ");"
            );





        // for User Info table
            db.execSQL("CREATE TABLE " + TABLEUSERS_NAME + "(" +

                COL1_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL1_NAME + " TEXT, " +
                COL1_BLOODGROUP + " TEXT, " +
                COL1_AGE + " SHORT " +
            /*
                COL1_LOCATION + "TEXT, " +
                COL1_NUMBEROFBLOODDONATIONS + "SHORT, " +
                COL1_LASTDONATION + " DATE, " +
                COL1_PHONENUMBER + " DOUBLE, "+
                COL1_EMAIL + " TEXT, " +
                COL1_REWARDS+ " INT " +*/
                ");"
        );


        //for user invite table
        db.execSQL("CREATE TABLE " + TABLEINVITATION_NAME + "(" +

                COL3_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL3_NAME + " TEXT, " +
                COL3_EMAIL + " TEXT, " +
                COL3_PHONE + " TEXT " +
                ");"
        );


        Log.d("Database Operations","Table created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLEREQUEST_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLEUSERS_NAME);
        onCreate(db);
    }

    public void addUser(User user){
        ContentValues values = new ContentValues();
        values.put(COL1_NAME, user.get_name());
        values.put(COL1_BLOODGROUP, user.get_bloodgroup());
        values.put(COL1_AGE, user.get_age());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLEUSERS_NAME, null, values);
        db.close();
    }

    public void deleteUser(String userName){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLEUSERS_NAME + " WHERE " + COL2_NAME + "=\"" + userName + "\";");
    }
    public String databaseToStringUsers(){
        String dbString="";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLEUSERS_NAME + " WHERE 1";// why not leave out the WHERE  clause?

        //Cursor points to a location in your results
        Cursor recordSet = db.rawQuery(query, null);
        //Move to the first row in your results
        recordSet.moveToFirst();

        //Position after the last row means the end of the results
        while (!recordSet.isAfterLast()) {
            // null could happen if we used our empty constructor
            if (recordSet.getString(recordSet.getColumnIndex("_name")) != null) {
                dbString += recordSet.getString(recordSet.getColumnIndex("_name"));
                dbString+= "  ";
                dbString += recordSet.getString(recordSet.getColumnIndex("_bloodgroup"));
                dbString+= "  ";
                dbString += recordSet.getString(recordSet.getColumnIndex("_age"));
                dbString += "\n";
            }
            recordSet.moveToNext();
        }
        db.close();
        return dbString;


    }

    //Add new request to the database
    public void addRequest(Requests request){
        ContentValues values = new ContentValues();
        values.put(COL2_NAME, request.get_name());
        values.put(COL2_BLOODGROUP, request.get_bloodgroup());
        values.put(COL2_PINTS, request.get_pints());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLEREQUEST_NAME, null, values);
        db.close();
    }

    public void deleteRequest(String requestername){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLEREQUEST_NAME + " WHERE " + COL2_NAME + "=\"" + requestername + "\";");
    }

    public String databaseToStringRequests(){
        String dbString="";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLEREQUEST_NAME + " WHERE 1";// why not leave out the WHERE  clause?

        //Cursor points to a location in your results
        Cursor recordSet = db.rawQuery(query, null);
        //Move to the first row in your results
        recordSet.moveToFirst();

        //Position after the last row means the end of the results
        while (!recordSet.isAfterLast()) {
            // null could happen if we used our empty constructor
            if (recordSet.getString(recordSet.getColumnIndex("_name")) != null) {
                dbString += recordSet.getString(recordSet.getColumnIndex("_name"));
                dbString+= "  ";
                dbString += recordSet.getString(recordSet.getColumnIndex("_bloodgroup"));
                dbString+= "  ";
                dbString += recordSet.getString(recordSet.getColumnIndex("_pints"));
                dbString += "\n";
            }
            recordSet.moveToNext();
        }
        db.close();
        return dbString;


    }

    public void addInvite(invitationObjectClass invitation){
        ContentValues values = new ContentValues();
        values.put(COL3_NAME, invitation.get_name());
        values.put(COL3_EMAIL, invitation.get_email());
        values.put(COL3_PHONE, invitation.get_phoneNumber());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLEINVITATION_NAME, null, values);
        db.close();

    }

    public String databaseToStringInvitations() {
        String dbString="";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLEINVITATION_NAME + " WHERE 1";// why not leave out the WHERE  clause?

        //Cursor points to a location in your results
        Cursor recordSet = db.rawQuery(query, null);
        //Move to the first row in your results
        recordSet.moveToFirst();

        //Position after the last row means the end of the results
        while (!recordSet.isAfterLast()) {
            // null could happen if we used our empty constructor
            if (recordSet.getString(recordSet.getColumnIndex("_name")) != null) {
                dbString += recordSet.getString(recordSet.getColumnIndex("_name"));
                dbString+= "  ";
                dbString += recordSet.getString(recordSet.getColumnIndex("_email"));
                dbString+= "  ";
                dbString += recordSet.getString(recordSet.getColumnIndex("_phone"));
                dbString += "\n";
            }
            recordSet.moveToNext();
        }
        db.close();
        return dbString;

    }



}
