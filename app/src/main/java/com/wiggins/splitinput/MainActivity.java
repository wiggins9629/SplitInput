package com.wiggins.splitinput;

import android.os.Bundle;
import android.view.View;

import com.wiggins.splitinput.base.BaseActivity;
import com.wiggins.splitinput.utils.UIUtils;
import com.wiggins.splitinput.widget.TitleView;

/**
 * @Description 分割输入框
 * @Author 一花一世界
 */
public class MainActivity extends BaseActivity {

    private TitleView titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        titleView = (TitleView) findViewById(R.id.titleView);
        titleView.setAppTitle(UIUtils.getString(R.string.title));
        titleView.setLeftImageVisibility(View.GONE);
    }
}
