package lyanglyang.newapp_oct26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About_me extends AppCompatActivity {
    public Button ButtonupdateMe1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }
    public void initHome_button(){
        ButtonupdateMe1= (Button)findViewById(R.id.ButtonupdateMe);
        ButtonupdateMe1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                Intent goto_done_me=new Intent(About_me.this,done.class);

                startActivity(goto_done_me);
            }
        });
    }


}
