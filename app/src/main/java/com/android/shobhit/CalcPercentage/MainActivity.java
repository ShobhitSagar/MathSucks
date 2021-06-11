package com.android.shobhit.CalcPercentage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView totalTextView;
    TextView messageTxt;
    EditText percentageTxt;
    EditText numberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalTextView = (TextView) findViewById(R.id.totalTextView);
        percentageTxt = (EditText) findViewById(R.id.percentageTxt);
        numberTxt = (EditText) findViewById(R.id.numberTxt);
        messageTxt = (TextView) findViewById(R.id.messageTxt);

        Button calcbtn = (Button) findViewById(R.id.calcbtn);
        calcbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Float percentage = Float.parseFloat(percentageTxt.getText().toString());
                if (percentage == 7577)
                {
                    messageTxt.setText("Hello, Sir!");
                }
                else if (percentage == 27844)
                {
                    messageTxt.setText("Hi, Divya!");
                }
                else if (percentage == 123789)
                {
                    messageTxt.setText("Love You ❣️");
                }
                else
                {
                    Float dec = percentage / 100;
                    Float total = dec * Float.parseFloat(numberTxt.getText().toString());
                    totalTextView.setText(Float.toString(total));
                }
            }
        });
    }
}
