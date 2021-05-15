package com.example.clickcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView countText;
    private Button plus1Button;
    private Button resetButton;
    int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countText = (TextView)findViewById(R.id.text);
        plus1Button = (Button)findViewById(R.id.plus1);
        resetButton = (Button)findViewById(R.id.reset);
        number = 0;
        countText.setText(number + "");

        plus1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                number = number + 1;
                countText.setText(number + "");
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                number = 0;
                countText.setText(number + "");
            }
        });
    }
}
