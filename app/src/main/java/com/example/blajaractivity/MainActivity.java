package com.example.blajaractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnDetailActivity, btnContact;
    private EditText edt_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDetailActivity = findViewById(R.id.btnDetailActivity);
        btnContact = findViewById(R.id.btnContact);
        edt_nama = findViewById(R.id.edt_nama);


        btnDetailActivity.setOnClickListener(this);
        btnContact.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnDetailActivity) {
            Log.d("DEBUG", "Btn detai; Acvity sudah di klik");
            Intent DetailAcitivity = new Intent(MainActivity.this, DetailActivity.class);
            DetailAcitivity.putExtra("EXTRA_NAMA", edt_nama.getText().toString());
            startActivity(DetailAcitivity);

        }

        if (v.getId() == R.id.btnContact) {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(intent, 1);
            }
        }
    }
}