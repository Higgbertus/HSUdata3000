package de.hsulm.mad.hsudata3000;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btn_show, btn_newS;
    Spinner sp_results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_newS = findViewById(R.id.btn_newS);
        btn_show = findViewById(R.id.btn_show);

        sp_results = findViewById(R.id.sp_results);
    }
}
