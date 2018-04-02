package com.example.nguyenthanhxuan.thigiuakinguyenthanhxuann14dcpt205;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import com.example.nguyenthanhxuan.thigiuakinguyenthanhxuann14dcpt205.MoneyData;
import com.example.nguyenthanhxuan.thigiuakinguyenthanhxuann14dcpt205.Money;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        MoneyData hocVienDataSource = new MoneyData(MainActivity.this);
        ArrayList<Money> list = hocVienDataSource.LietKeHV();
        AdapterMoney adapter = new AdapterMoney(MainActivity.this,R.layout.hien_thi_ket_qua,list);
        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"Thêm mới");
        menu.add(0,1,0,"Lưu");
        menu.add(0,2,0,"Thoát");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                return true;
            case 1:
                return true;
            case 2:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
