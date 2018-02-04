package lyanglyang.newapp_oct26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class invite extends AppCompatActivity {
    //public Button inviteButton;
    EditText inviteName;
    EditText invitePhone;
    EditText inviteEmail;
    TextView displayUsersInvite;
   // DatabaseHelper dbHandler;

    // public DatabaseHelper dbHandler= DatabaseHelper.getInstance(getApplicationContext());
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite);

        inviteName=(EditText) findViewById(R.id.inviteName);
        invitePhone=(EditText) findViewById(R.id.invitePhone);
        inviteEmail=(EditText) findViewById(R.id.inviteEmail);
        displayUsersInvite = (TextView) findViewById(R.id.displayUsersInvite);

       // dbHandler = DatabaseHelper.getInstance(getApplicationContext());
       // printDatabase();
    }

/*
    public void inviteButtonClicked(View view){
        invitationObjectClass invited= new invitationObjectClass(inviteName.getText().toString(),invitePhone.getText().toString(),inviteEmail.getText().toString());
      // dbHandler.addInvite(invited);
        printDatabase();
    }



    public void printDatabase() {
        String dbString = dbHandler.databaseToStringInvitations();
        displayUsersInvite.setText(dbString);
        inviteName.setText("");
        invitePhone.setText("");
        inviteEmail.setText("");

    }
*/



}


