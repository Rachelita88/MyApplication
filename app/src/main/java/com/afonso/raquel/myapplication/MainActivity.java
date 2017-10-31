package com.afonso.raquel.myapplication;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSend = (Button) findViewById(R.id.button);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img = (ImageView)findViewById(R.id.image_fondo);
                img.setImageResource(R.drawable.heart);

                TextView txt1 = (TextView)findViewById(R.id.text_1);
                txt1.setText("Tanks!!");

                TextView txt2 = (TextView)findViewById(R.id.text_2);
                txt2.setText("I love you too!!");
            }
        });
    }

}
