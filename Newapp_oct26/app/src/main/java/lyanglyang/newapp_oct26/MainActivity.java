package lyanglyang.newapp_oct26;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //DatabaseHelper myDb;


    public Button but_login;
    public Button but_register;
    public void init_button(){
        but_login=(Button)findViewById(R.id.but_login);
        but_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goto_home=new Intent(MainActivity.this,Home.class);

                startActivity(goto_home);
            }
        });

        but_register=(Button)findViewById(R.id.but_register);
        but_register.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Intent goto_register=new Intent(MainActivity.this,Register.class);

                startActivity(goto_register);
            }
        });


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_button();

       // myDb=new DatabaseHelper(this);
    }
}
