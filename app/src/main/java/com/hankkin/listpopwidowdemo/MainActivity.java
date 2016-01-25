package com.hankkin.listpopwidowdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import com.hankkin.library.ListPopWindow;
import com.hankkin.library.PopBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ListPopWindow.OnPopItemClickListener,ListPopWindow.OnBottomTextviewClickListener{

    ListPopWindow popWindow;
    private RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (RelativeLayout) findViewById(R.id.rl);


    }

    public void show(View view){
        List<PopBean> pops = new ArrayList<>();
        for (int i=0;i<5;i++){
            PopBean pop = new PopBean("item"+i,0);
            pops.add(pop);
        }
        popWindow = new ListPopWindow(MainActivity.this,this,this,rl,pops,"cancel","title");
        popWindow.showAtLocation(rl, Gravity.CENTER| Gravity.BOTTOM,0,0);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBottomClick() {
        popWindow.dismiss();
    }

    @Override
    public void onPopItemClick(View view, int position) {
        switch (position){
            case 0:
                Log.d("tag>>>>>","click index:"+position);
                break;
            case 1:
                Log.d("tag>>>>>","click index:"+position);
                break;
            case 2:
                Log.d("tag>>>>>","click index:"+position);
                break;
            case 3:
                Log.d("tag>>>>>","click index:"+position);
                break;
            case 4:
                Log.d("tag>>>>>","click index:"+position);
                break;
            default:
                break;
        }
    }
}
