package lyanglyang.newapp_oct26;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PostRequests extends AppCompatActivity {

    EditText requestName;
    EditText bloodGroupRequired;
    EditText pintsRequired;
    TextView showText;
    DatabaseHelper dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_requests);

        requestName=(EditText) findViewById(R.id.PatientsName);
        bloodGroupRequired=(EditText) findViewById(R.id.bloodGroupRequired);
        pintsRequired=(EditText) findViewById(R.id.pintsRequired);
        showText=(TextView) findViewById(R.id.showRequests);

        //dbHandler=new DatabaseHelper(this,null,null,1);
        dbHandler=DatabaseHelper.getInstance(getApplicationContext());
        printDatabase();
    }

    public void BloodRequestSubmitClicked(View view){
        Requests request= new Requests(requestName.getText().toString(),bloodGroupRequired.getText().toString(),Integer.parseInt(pintsRequired.getText().toString()));
        dbHandler.addRequest(request);
        printDatabase();
    }

    public void deleteRequestButtonClicked(View view){
        String inputText=requestName.getText().toString();
        dbHandler.deleteRequest(inputText);
        printDatabase();
    }

    public void printDatabase(){
        String dbString =dbHandler.databaseToStringRequests();
        showText.setText(dbString);
        requestName.setText("");
        bloodGroupRequired.setText("");
        pintsRequired.setText("");

    }
}
