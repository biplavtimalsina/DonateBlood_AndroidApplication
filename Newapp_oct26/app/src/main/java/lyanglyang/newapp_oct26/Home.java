package lyanglyang.newapp_oct26;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    public Button butHome_postRequests;
    public Button butHome_seeRequests;
    public ImageButton butHome_me;
    public ImageButton butHome_logOut;
    public Button butHome_rewards;
    public Button butHome_invite;
    public Button butHome_update;

    public void initHome_button(){
        butHome_postRequests= (Button)findViewById(R.id.butHome_postRequests);
        butHome_postRequests.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                Intent goto_PostRequests=new Intent(Home.this,PostRequests.class);

                startActivity(goto_PostRequests);
            }
        });

        butHome_seeRequests=(Button)findViewById(R.id.butHome_seeRequests);
        butHome_seeRequests.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent goto_seeRequests = new Intent(Home.this, SeeRequests.class);
                startActivity(goto_seeRequests);
            }
        });

        butHome_me=(ImageButton)findViewById(R.id.butHome_me);
        butHome_me.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goto_me=new Intent(Home.this,About_me.class);
                startActivity(goto_me);
            }

        });

        butHome_rewards=(Button)findViewById(R.id.butHome_rewards);
        butHome_rewards.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goto_rewards=new Intent(Home.this,Rewards.class);
                startActivity(goto_rewards);
            }

        });

        butHome_logOut=(ImageButton)findViewById(R.id.butHome_logOut);
        butHome_logOut.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goto_login=new Intent(Home.this,MainActivity.class);
                startActivity(goto_login);
            }

        });

        butHome_invite=(Button)findViewById(R.id.butHome_invite);
        butHome_invite.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goto_invite=new Intent(Home.this,invite.class);
                startActivity(goto_invite);
            }

        });

        butHome_update=(Button)findViewById(R.id.butHome_update);
        butHome_update.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goto_update=new Intent(Home.this,Update_info.class);
                startActivity(goto_update);
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        initHome_button();
    }
}
