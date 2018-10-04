package co.example.basiclogins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextusername;
    private EditText editTextpassword;
    private TextView textViewcreateanaccount;
    private Button buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        wireWidgets();
        textViewcreateanaccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            String createanaccount = textViewcreateanaccount.getText().toString();
                Intent intentcreateanaccount = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intentcreateanaccount);
            }
        });
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String login = buttonlogin.getText().toString();
                Intent intentlogin = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intentlogin);
            }
        });
    }

    private void wireWidgets() {
        editTextusername = findViewById(R.id.editText_loginactivity_username);
        editTextpassword = findViewById(R.id.editText_loginactivity_password);
        textViewcreateanaccount = findViewById(R.id.textView_loginactivity_createanaccount);
        buttonlogin = findViewById(R.id.button_loginactivity_login);

    }
}
