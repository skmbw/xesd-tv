package com.xueershangda.tv;

import android.app.Activity;
import android.os.Bundle;

/**
 * Main Activity class that loads {@link MainFragment}.
 *
 * @author yinlei
 * @since 2020-10-23
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
