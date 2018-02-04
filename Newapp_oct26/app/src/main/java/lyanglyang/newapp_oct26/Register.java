package lyanglyang.newapp_oct26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    EditText UserName;
    EditText bloodGroup;
    EditText age;
    TextView regShowUser;

    DatabaseHelper dbHandler;
    //public Button but_regSubmit;

   /* public void init_button() {
        but_regSubmit = (Button) findViewById(R.id.but_regSubmit);
        but_regSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto_done = new Intent(Register.this, done.class);
                startActivity(goto_done);
            }
        });

    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //init_button();

        //but_regSubmit = (Button)findViewById(R.id.but_regSubmit);
        UserName=(EditText)findViewById(R.id.regName);
        bloodGroup=(EditText)findViewById(R.id.regBlood);
        age= (EditText) findViewById(R.id.regAge);
        regShowUser= (TextView) findViewById(R.id.regShowUser);
        //dbHandler=new DatabaseHelper(this,null,null,1);
        dbHandler=DatabaseHelper.getInstance(getApplicationContext());
        printUsersDatabase();

    }

    public void RegisterButtonClicked(View view){
        User user= new User(UserName.getText().toString(),bloodGroup.getText().toString(),Integer.parseInt(age.getText().toString()));
        dbHandler.addUser(user);

        printUsersDatabase();

    }
    public void printUsersDatabase(){
        String dbString =dbHandler.databaseToStringUsers();
        regShowUser.setText(dbString);
        UserName.setText("");
        bloodGroup.setText("");
        age.setText("");

    }


}
