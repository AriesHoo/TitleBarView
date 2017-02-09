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
public class MainActivity extends Activity implements View.OnClickListener {


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
        titleBar.addRightAction(new TitleBarView.Action<Integer>() {
            @Override
            public Integer getContent() {
                return R.mipmap.ic_launcher;
            }

            @Override
            public void onClink(View view) {
                Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "OnClick", Toast.LENGTH_SHORT).show();
    }

}
