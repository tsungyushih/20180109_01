package com.example.student.a20180109_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import static android.view.Menu.NONE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //menu.add("ADD");      寫法1，硬寫ADD要下方if去對文字，不建議此寫法
        /*  寫法2，用寫法3自製MENU的話不需要
        menu.add(1,1,1,"ADD");  //沒用的groupId可寫NONE
        menu.add(1,1,0,"EDIT");
        */
        getMenuInflater().inflate(R.menu.mymenu,menu);  //方法3，自製menu
        return  super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        /*  寫法1
        if(item.getTitle().equals("ADD"))
        {
            Toast.makeText(MainActivity.this,"clicked ADD",Toast.LENGTH_SHORT).show();
        }
        */
        /*寫法2
        switch (item.getItemId())   //也可getgroupId
        {
            case 1:
                Toast.makeText(MainActivity.this,"ADD clicked",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this,"EDIT clicked",Toast.LENGTH_SHORT).show();
                break;
        }
        */
        switch (item.getItemId())
        {
            case R.id.menu_add:
                Toast.makeText(MainActivity.this,"click ADD!!!!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_edit:
                Toast.makeText(MainActivity.this,"click Edit!!!To" ,Toast.LENGTH_SHORT).show();
                break;
        }
        return  super.onOptionsItemSelected(item);
    }
}
