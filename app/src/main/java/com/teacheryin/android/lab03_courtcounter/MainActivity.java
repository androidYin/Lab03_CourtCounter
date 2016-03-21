package com.teacheryin.android.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void resetScoreView(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        // 重設 Fragment Score 為 0
        // ...
    }

}
