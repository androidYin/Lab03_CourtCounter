package com.teacheryin.android.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CourtCounterFragment teamA;
    private CourtCounterFragment teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        teamA = (CourtCounterFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment_team_a);
        teamB = (CourtCounterFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment_team_b);

        // 從 strings.xml 資源取得隊名字串
        String team_a_name = getString(R.string.team_a_name);
        String team_b_name = getString(R.string.team_b_name);

        // 設定隊名
        teamA.setTeamName(team_a_name);
        teamB.setTeamName(team_b_name);

        // 設定隊伍 logo
        teamA.setTeamLogo(R.drawable.team_a_logo);
        teamB.setTeamLogo(R.drawable.team_b_logo);
    }

    public void resetScoreView(View view) {
        teamA.resetScore();
        teamB.resetScore();
    }
}
