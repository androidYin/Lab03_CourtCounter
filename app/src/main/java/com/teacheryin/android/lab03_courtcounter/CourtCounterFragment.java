package com.teacheryin.android.lab03_courtcounter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment extends Fragment implements View.OnClickListener {

    private ImageView m_img_team_logo;
    private TextView m_tv_team_name;
    private TextView m_tv_team_score;
    private Button m_btn_two_points;
    private Button m_btn_three_points;
    private Button m_btn_free_throw;

    private int score;

    public CourtCounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment (產生 Fragment 回傳給 Activity)
        return inflater.inflate(R.layout.fragment_court_counter, container, false);
    }

    @Override
    public void onStart() { // Fragment 畫面建立後執行
        super.onStart();

        m_img_team_logo = (ImageView)getView().findViewById(R.id.img_team_logo);
        m_tv_team_name = (TextView)getView().findViewById(R.id.tv_team_name);
        m_tv_team_score = (TextView)getView().findViewById(R.id.tv_team_score);

        m_btn_three_points = (Button)getView().findViewById(R.id.btn_three_points);
        m_btn_two_points = (Button)getView().findViewById(R.id.btn_two_points);
        m_btn_free_throw = (Button)getView().findViewById(R.id.btn_free_throw);


        m_btn_three_points.setOnClickListener(this);
        m_btn_two_points.setOnClickListener(this);
        m_btn_free_throw.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // 判斷是哪個按鈕
        if (v.getId() == R.id.btn_three_points) {
            score += 3;
        } else if (v.getId() == R.id.btn_two_points) {
            score += 2;
        } else if (v.getId() == R.id.btn_free_throw) {
            score += 2;
        }
        m_tv_team_score.setText(String.valueOf(score));
    }

    // 將分數歸零
    public void resetScore() {
        m_tv_team_score.setText("0");
    }

    // 設定隊伍名字
    public void setTeamName(CharSequence teamName) {
        m_tv_team_name.setText(teamName);
    }

    // 設定隊伍圖片
    public void setTeamLogo(int res_id) {
        if(m_img_team_logo != null) {
            m_img_team_logo.setImageResource(res_id);
        }
    }
}
