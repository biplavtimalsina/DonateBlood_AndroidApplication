package lyanglyang.newapp_oct26;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SeeRequests extends AppCompatActivity {
    TextView showText;
    DatabaseHelper dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_requests);

        showText=(TextView) findViewById(R.id.showlistRequests);
        //dbHandler=new DatabaseHelper(this,null,null,1);
        dbHandler=DatabaseHelper.getInstance(getApplicationContext());
        printDatabase();
    }

    public void printDatabase(){
        String dbString =dbHandler.databaseToStringRequests();
        showText.setText(dbString);


    }
}
