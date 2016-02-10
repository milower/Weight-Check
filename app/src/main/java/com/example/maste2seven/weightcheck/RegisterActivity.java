package com.example.maste2seven.weightcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText , passEditText , nameEditText;
    private String userString , passString , nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //bind widget
        bindwidget();
    }

    private void bindwidget() {
        userEditText = (EditText) findViewById(R.id.editText);
        passEditText = (EditText) findViewById(R.id.editText2);
        nameEditText = (EditText) findViewById(R.id.editText3);
    }

    public void clickRegis(View view) {
        userString = userEditText.getText().toString().trim();
        passString = passEditText.getText().toString().trim();
        nameString = nameEditText.getText().toString().trim();

        if (userString.equals("") || passString.equals("") || nameString.equals("")){
            Toast.makeText(RegisterActivity.this, getResources().getString(R.string.have_space),Toast.LENGTH_SHORT).show();
        }else {
            MyManage objMyManage = new MyManage(this);
            objMyManage.addUserTable(userString,passString,nameString);
            Toast.makeText(RegisterActivity.this, getResources().getString(R.string.success_regis),Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
