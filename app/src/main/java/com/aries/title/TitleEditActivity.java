package com.aries.title;

import android.os.Bundle;

import com.aries.title.base.BaseActivity;

/**
 * Created: AriesHoo on 2017/7/14 15:57
 * Function: titleBar与底部状态栏使用
 * Desc:
 */
public class TitleEditActivity extends BaseActivity {

    @Override
    protected void setTitleBar() {
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_title_edit;
    }

    @Override
    protected void initView(Bundle var1) {
        getSupportFragmentManager().beginTransaction().add(R.id.lLayout_content, TitleFragment.newInstance()).commit();
    }
}
