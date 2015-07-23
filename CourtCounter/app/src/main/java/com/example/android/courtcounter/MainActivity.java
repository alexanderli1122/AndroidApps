package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    //tracks score for TeamA
    private int scoreA = 0;

    //tracks score for teamB
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * Add 3 to Team A Score
     * @param view
     */
    public void add3A(View view){
        this.scoreA=scoreA+3;
        displayForTeamA(this.scoreA);
    }

    /**
     * Add 2 to Team A Score
     * @param view
     */
    public void add2A(View view){
        this.scoreA=scoreA+2;
        displayForTeamA(this.scoreA);
    }

    /**
     * Add 1 to Team A Score
     * @param view
     */
    public void add1A(View view){
        this.scoreA=scoreA+1;
        displayForTeamA(this.scoreA);
    }

    /**
     * Reset Team A Score
     * @param view
     */
    public void resetA(View view){
        this.scoreA=0;
        displayForTeamA(this.scoreA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * Add 3 to Team B Score
     * @param view
     */
    public void add3B(View view){
        this.scoreB=scoreB+3;
        displayForTeamB(this.scoreB);
    }

    /**
     * Add 2 to Team B Score
     * @param view
     */
    public void add2B(View view){
        this.scoreB=scoreB+2;
        displayForTeamB(this.scoreB);
    }

    /**
     * Add 1 to Team B Score
     * @param view
     */
    public void add1B(View view){
        this.scoreB=scoreB+1;
        displayForTeamB(this.scoreB);
    }

    /**
     * Reset Team A Score
     * @param view
     */
    public void resetB(View view){
        this.scoreB=0;
        displayForTeamB(this.scoreB);
    }

    /**
     * Reset all Scores
     * @param view
     */
    public void resetScores(View view){
        this.scoreA=0;
        this.scoreB=0;
        displayForTeamA(this.scoreA);
        displayForTeamB(this.scoreB);
    }
}
