package com.aries.title;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.aries.ui.view.title.TitleBarView;

/**
 * Created: AriesHoo on 2017-02-09 10:24
 * Function:
 * Desc:
 */
public class MainActivity extends Activity {


    private TitleBarView titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        titleBar = (TitleBarView) findViewById(R.id.titleBar);
        titleBar.setImmersible(this, true);
        titleBar.addRightAction(titleBar.new ImageAction(R.drawable.ic_arrow_right, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击", Toast.LENGTH_SHORT).show();
            }
        }));

    }

}
