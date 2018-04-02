package com.example.nguyenthanhxuan.thigiuakinguyenthanhxuann14dcpt205;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Nguyen Thanh Xuan on 4/2/2018.
 */

public class MainActivity2 extends AppCompatActivity {

    private EditText edtnd;
    private EditText edtsotien;
    private RadioButton rbchi;
    private RadioButton rbthu;
    private Button btnthem;
    private Button btnnhaplai;
    private Button btnhienthi;
    MoneyData moneyData;
    int ht = 0;
    String in="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        moneyData = new MoneyData(MainActivity2.this);

        edtnd = (EditText) findViewById(R.id.edtnd);
        edtsotien = (EditText) findViewById(R.id.edtsotien);
        rbchi = (RadioButton) findViewById(R.id.rbchi);
        rbthu = (RadioButton) findViewById(R.id.rbthu);
        btnhienthi = (Button) findViewById(R.id.btnhienthi);
        btnthem = (Button) findViewById(R.id.btnthem);
        btnnhaplai = (Button) findViewById(R.id.btnnhaplai);
        btnnhaplai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtnd.setText("");
                edtsotien.setText("");
                edtnd.requestFocus();
            }
        });
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rbchi.isChecked()==true&&rbthu.isChecked()==false){
                    ht = 1;
                }else if (rbchi.isChecked()==false&&rbthu.isChecked()==true){
                    ht = 0;
                }
                moneyData.ThemHocVien(new Money(edtnd.getText().toString(),edtsotien.getText().toString(),ht));
                Toast.makeText(MainActivity2.this,"Thêm thành công",Toast.LENGTH_LONG).show();
            }
        });
        btnhienthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
