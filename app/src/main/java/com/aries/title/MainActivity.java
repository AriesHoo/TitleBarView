package com.aries.title;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

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
        titleBar = (TitleBarView) findViewById(R.id.titleBar);
        initView();
    }

    private void initView() {
        titleBar.setOnLeftTextClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titleBar.setImmersible(MainActivity.this, true);
            }
        });
        titleBar.setOnRightTextClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titleBar.setImmersible(MainActivity.this, false);
            }
        });


    }

}
