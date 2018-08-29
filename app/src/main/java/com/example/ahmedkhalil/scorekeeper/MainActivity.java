package com.example.ahmedkhalil.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_a, score_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score_4_A(View view) {
        score_a += 4 ;
        display_a(score_a);
    }

    public void score_3_A(View view) {
        score_a += 3 ;
        display_a(score_a);
    }

    public void score_2_A(View view) {
        score_a += 2 ;
        display_a(score_a);
    }

    public void score_1_A(View view) {
        score_a += 1 ;
        display_a(score_a);
    }

    public void score_4_B(View view) {
        score_b += 4 ;
        display_b(score_b);
    }

    public void score_3_B(View view) {
        score_b += 3 ;
        display_b(score_b);
    }

    public void score_2_B(View view) {
        score_b += 2 ;
        display_b(score_b);
    }

    public void score_1_B(View view) {
        score_b += 1 ;
        display_b(score_b);
    }

    public void display_a(int scoreA){
        TextView textA = findViewById(R.id.team_a_txtView);
        textA.setText(String.valueOf(scoreA));
    }

    public void display_b(int scoreB){
        TextView textB = findViewById(R.id.team_b_textView);
        textB.setText(String.valueOf(scoreB));
    }


    public void reset(View view) {
        score_a = 0 ;
        score_b = 0 ;
        display_a(score_a);
        display_b(score_b);
    }


}
