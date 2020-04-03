package com.example.pertama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edNama, edPass, edTelp;
    Button bKirim;
    String user, pass;
    Integer telp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.editUN);
        edPass = findViewById(R.id.editPass);
        bKirim = findViewById(R.id.btnok);

        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //membaca input dari editText
                user = edNama.getText().toString();
                pass = edPass.getText().toString();
                telp = edTelp.getInputType();

                //menampilkan popup
                if (pass.equals("123")){
                    Toast.makeText(MainActivity.this, "Login sukses", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "password salah", Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1: {
                Toast.makeText(getApplicationContext(), "Ini adalah menu 1", Toast.LENGTH_LONG).show();
            }break;
            case R.id.item2:
            {
                Toast.makeText(getApplicationContext(), "Ini adalah menu 2", Toast.LENGTH_LONG).show();
            }break;
            case R.id.item3:
            {
                Toast.makeText(MainActivity.this, "Ini adalah menu 3", Toast.LENGTH_LONG).show();
            }break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }
}

