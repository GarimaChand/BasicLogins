package co.example.basiclogins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {
    private EditText editTextname;
    private EditText editTextusername;
    private EditText editTextpassword;
    private EditText editTextconfirmpassword;
    private EditText editTextemail;
    private Button   buttoncreateanaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        wireWidgets();

    }

    private void wireWidgets() {
        editTextname = findViewById(R.id.editText_createaccountactivity_name);
        editTextusername = findViewById(R.id.editText_createaccountactivity_username);
        editTextpassword = findViewById(R.id.editText_createaccountactivity_password);
        editTextconfirmpassword = findViewById(R.id.editText_createaccountactivity_confirmpassword);
        editTextemail = findViewById(R.id.editText_createaccountactivity_email);
        buttoncreateanaccount = findViewById(R.id.button_createaccountactivity_createanaccount);
    }
}
