package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    Integer so1 = 0;
    Integer so2 = 0;
    Character dau = null;
    private TextView txtvkq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvkq = (TextView)findViewById(R.id.kq);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/DS.TTF");
        txtvkq.setTypeface(typeface);
        Button So0 = (Button)findViewById(R.id.so0); So0.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "0"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});
        Button So1 = (Button)findViewById(R.id.so1); So1.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "1"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});
        Button So2 = (Button)findViewById(R.id.so2); So2.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "2"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});
        Button So3 = (Button)findViewById(R.id.so3); So3.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "3"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});
        Button So4 = (Button)findViewById(R.id.so4); So4.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "4"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});
        Button So5 = (Button)findViewById(R.id.so5); So5.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "5"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});
        Button So6 = (Button)findViewById(R.id.so6); So6.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "6"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});
        Button So7 = (Button)findViewById(R.id.so7); So7.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "7"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});
        Button So8 = (Button)findViewById(R.id.so8); So8.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "8"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});
        Button So9 = (Button)findViewById(R.id.so9); So9.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { txtvkq.setText(txtvkq.getText().toString() + "9"); if (dau == null) { so1 = Integer.parseInt(txtvkq.getText().toString()); } else { so2 = Integer.parseInt(txtvkq.getText().toString()); } }});

        Button Cong = (Button)findViewById(R.id.cong);
        Cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               dau = '+';
               txtvkq.setText("");
            }
        });

        Button Tru = (Button)findViewById(R.id.tru);
        Tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '-';
                txtvkq.setText("");
            }
        });

        Button Chia = (Button)findViewById(R.id.chia);
        Chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '/';
                txtvkq.setText("");
            }
        });

        Button Nhan = (Button)findViewById(R.id.nhan);
        Nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '*';
                txtvkq.setText("");
            }
        });

        Button Bang = (Button)findViewById(R.id.bang);
        Bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dau != null){
                    Integer kqua = 0;
                    switch (dau)
                    {
                        case '+': kqua = so1 + so2; break;
                        case '-': kqua = so1 - so2; break;
                        case '*': kqua = so1 * so2; break;
                        case '/': kqua = so1 / so2; break;
                    }
                    txtvkq.setText(kqua.toString());
                    so1 = kqua;
                    dau = null;
                }
            }
        });

        Button Xoaso = (Button)findViewById(R.id.CE);
        Xoaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so1 = 0;
                so2 = 0;
                dau = null;
                txtvkq.setText("");
            }
        });

        Button Xoadau = (Button)findViewById(R.id.C);
        Xoadau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so2 = 0;
                dau = null;
            }
        });

        Button Xoakitu =(Button)findViewById(R.id.BS);
        Xoakitu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

}
