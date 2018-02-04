package lyanglyang.newapp_oct26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Update_info extends AppCompatActivity {
    public Button updateButtonme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_info);
        initHome_button();
    }

    public void initHome_button(){
        updateButtonme= (Button)findViewById(R.id.updateButtonme);
        updateButtonme.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                Intent goto_done_me=new Intent(Update_info.this,done.class);

                startActivity(goto_done_me);
            }
        });
    }
}
