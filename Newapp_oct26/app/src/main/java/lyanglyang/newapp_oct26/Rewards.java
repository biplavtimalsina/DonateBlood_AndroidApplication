package lyanglyang.newapp_oct26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rewards extends AppCompatActivity {
    public Button collectRewards;
    public void init_button() {
        collectRewards = (Button)findViewById(R.id.collectRewards);
        collectRewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto_done= new Intent(Rewards.this,done.class);
                startActivity(goto_done);
            }
        });


    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);
        init_button();
    }

}
