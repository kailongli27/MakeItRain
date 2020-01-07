package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.R.color;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int MoneyCounter = 0;
    private TextView MoneyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MoneyText = findViewById(R.id.moneyText);
    }

    public void showTag(View v){
        Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG).show();
    }

    public void makeitRain(View v){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        MoneyCounter += 1000;
        MoneyText.setText(String.valueOf(numberFormat.format(MoneyCounter)));

        switch (MoneyCounter){
            case 10000:
                MoneyText.setTextColor(getResources().getColor(R.color.myColor));
                break;
            case 20000:
                MoneyText.setTextColor(Color.RED);
                break;
            case 30000:
                MoneyText.setTextColor(Color.YELLOW);
                break;
                default:
                    break;
        }
    }
}
