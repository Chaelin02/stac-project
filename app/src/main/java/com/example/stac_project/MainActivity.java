package com.example.stac_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.ViewFlipper;

public class MainActivity<toggle_Flipping> extends AppCompatActivity {
    ViewFlipper flipper;

    //자동Fliipping선택 ToggleButton참조변수
    ToggleButton toggle_Flipping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 상태바 없애기 아래 두줄
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_first);
    }

    Animation showIn= AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

    Animation showIn2 = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);




        //ToggleButton의 선택 상태가 변경되면 자동으로 호출되는 메소드
        //첫번재 파라미터 : 선택의 변화가 생긴 CompoundButton(여기서는 toggle_Flipping)
        //두번째 파라미터 : Compoundbutton(toggle_Flipping)의 ON(true),OFF(false) 상태
//        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            // TODO Auto-generated method stub
            if(isChecked){//On 으로 바뀌었으므로 ..자동 Flipping 시작..
                //1초의 간격으로 ViewFlipper의 View 자동 교체
                flipper.setFlipInterval(1000);//플리핑 간격(1000ms)
                flipper.startFlipping();//자동 Flipping 시작

            }else{//OFF로 변경되었으므로  Flipping 정지

                flipper.stopFlipping();;//Flipping 정지

            }

        }

}




