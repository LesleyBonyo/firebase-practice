package com.wit.android.fireapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("MyMessage");

    }

    public void goSubmit(View view) {
        //myRef.setValue("Hello everyone");
        EditText editText = (EditText) findViewById(R.id.message);
        String message = editText.getText().toString();
        myRef.setValue(message);
    }
}
