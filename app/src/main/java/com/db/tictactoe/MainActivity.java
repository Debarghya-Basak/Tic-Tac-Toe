package com.db.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int diceGrid[][] = {{0,0,0},
                               {0,0,0},
                               {0,0,0}};
    int playerNo = 1;
    int gameRunFlag = 1;

    public void dice1(View view){

        if(diceGrid[0][0]==0 && playerNo == 1 && gameRunFlag == 1){
            diceGrid[0][0] = 1;
            checkWin();
            ImageView ivDice = findViewById(R.id.dice_1);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.green_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 2;
        }
        else if(diceGrid[0][0]==0 && playerNo == 2 && gameRunFlag == 1){
            diceGrid[0][0] = 2;
            checkWin();
            ImageView ivDice = findViewById(R.id.dice_1);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.red_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 1;
        }
        else
            if(gameRunFlag == 1)
                Toast.makeText(this, "Not a valid move", Toast.LENGTH_SHORT).show();
            else if(gameRunFlag == 0)
                Toast.makeText(this, "Game Finished!", Toast.LENGTH_SHORT).show();
    }
    public void dice2(View view){
        if(diceGrid[0][1]==0 && playerNo == 1 && gameRunFlag == 1){
            diceGrid[0][1] = 1;checkWin();
            ImageView ivDice = findViewById(R.id.dice_2);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.green_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 2;
        }
        else if(diceGrid[0][1]==0 && playerNo == 2 && gameRunFlag == 1){
            diceGrid[0][1] = 2;checkWin();
            ImageView ivDice = findViewById(R.id.dice_2);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.red_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 1;
        }
        else
            if(gameRunFlag == 1)
                Toast.makeText(this, "Not a valid move", Toast.LENGTH_SHORT).show();
            else if(gameRunFlag == 0)
                Toast.makeText(this, "Game Finished!", Toast.LENGTH_SHORT).show();
    }
    public void dice3(View view){
        if(diceGrid[0][2]==0 && playerNo == 1 && gameRunFlag == 1){
            diceGrid[0][2] = 1;checkWin();
            ImageView ivDice = findViewById(R.id.dice_3);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.green_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 2;
        }
        else if(diceGrid[0][2]==0 && playerNo == 2 && gameRunFlag == 1){
            diceGrid[0][2] = 2;checkWin();
            ImageView ivDice = findViewById(R.id.dice_3);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.red_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 1;
        }
        else
            if(gameRunFlag == 1)
                Toast.makeText(this, "Not a valid move", Toast.LENGTH_SHORT).show();
            else if(gameRunFlag == 0)
                Toast.makeText(this, "Game Finished!", Toast.LENGTH_SHORT).show();
    }
    public void dice4(View view){
        if(diceGrid[1][0]==0 && playerNo == 1 && gameRunFlag == 1){
            diceGrid[1][0] = 1;checkWin();
            ImageView ivDice = findViewById(R.id.dice_4);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.green_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 2;
        }
        else if(diceGrid[1][0]==0 && playerNo == 2 && gameRunFlag == 1){
            diceGrid[1][0] = 2;checkWin();
            ImageView ivDice = findViewById(R.id.dice_4);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.red_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 1;
        }
        else
            if(gameRunFlag == 1)
                Toast.makeText(this, "Not a valid move", Toast.LENGTH_SHORT).show();
            else if(gameRunFlag == 0)
                Toast.makeText(this, "Game Finished!", Toast.LENGTH_SHORT).show();
    }
    public void dice5(View view){
        if(diceGrid[1][1]==0 && playerNo == 1 && gameRunFlag == 1){
            diceGrid[1][1] = 1;checkWin();
            ImageView ivDice = findViewById(R.id.dice_5);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.green_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 2;
        }
        else if(diceGrid[1][1]==0 && playerNo == 2 && gameRunFlag == 1){
            diceGrid[1][1] = 2;checkWin();
            ImageView ivDice = findViewById(R.id.dice_5);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.red_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 1;
        }
        else
            if(gameRunFlag == 1)
                Toast.makeText(this, "Not a valid move", Toast.LENGTH_SHORT).show();
            else if(gameRunFlag == 0)
                Toast.makeText(this, "Game Finished!", Toast.LENGTH_SHORT).show();
    }
    public void dice6(View view){
        if(diceGrid[1][2]==0 && playerNo == 1 && gameRunFlag == 1){
            diceGrid[1][2] = 1;checkWin();
            ImageView ivDice = findViewById(R.id.dice_6);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.green_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 2;
        }
        else if(diceGrid[1][2]==0 && playerNo == 2 && gameRunFlag == 1){
            diceGrid[1][2] = 2;checkWin();
            ImageView ivDice = findViewById(R.id.dice_6);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.red_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 1;
        }
        else
            if(gameRunFlag == 1)
                Toast.makeText(this, "Not a valid move", Toast.LENGTH_SHORT).show();
            else if(gameRunFlag == 0)
                Toast.makeText(this, "Game Finished!", Toast.LENGTH_SHORT).show();
    }
    public void dice7(View view){
        if(diceGrid[2][0]==0 && playerNo == 1 && gameRunFlag == 1){
            diceGrid[2][0] = 1;checkWin();
            ImageView ivDice = findViewById(R.id.dice_7);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.green_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 2;
        }
        else if(diceGrid[2][0]==0 && playerNo == 2 && gameRunFlag == 1){
            diceGrid[2][0] = 2;checkWin();
            ImageView ivDice = findViewById(R.id.dice_7);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.red_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 1;
        }
        else
            if(gameRunFlag == 1)
                Toast.makeText(this, "Not a valid move", Toast.LENGTH_SHORT).show();
            else if(gameRunFlag == 0)
                Toast.makeText(this, "Game Finished!", Toast.LENGTH_SHORT).show();
    }
    public void dice8(View view){
        if(diceGrid[2][1]==0 && playerNo == 1 && gameRunFlag == 1){
            diceGrid[2][1] = 1;checkWin();
            ImageView ivDice = findViewById(R.id.dice_8);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.green_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 2;
        }
        else if(diceGrid[2][1]==0 && playerNo == 2 && gameRunFlag == 1){
            diceGrid[2][1] = 2;checkWin();
            ImageView ivDice = findViewById(R.id.dice_8);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.red_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 1;
        }
        else
            if(gameRunFlag == 1)
                Toast.makeText(this, "Not a valid move", Toast.LENGTH_SHORT).show();
            else if(gameRunFlag == 0)
                Toast.makeText(this, "Game Finished!", Toast.LENGTH_SHORT).show();
    }
    public void dice9(View view){
        if(diceGrid[2][2]==0 && playerNo == 1 && gameRunFlag == 1){
            diceGrid[2][2] = 1;checkWin();
            ImageView ivDice = findViewById(R.id.dice_9);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.green_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 2;
        }
        else if(diceGrid[2][2]==0 && playerNo == 2 && gameRunFlag == 1){
            diceGrid[2][2] = 2;checkWin();
            ImageView ivDice = findViewById(R.id.dice_9);
            ivDice.setTranslationY(-100);
            ivDice.setImageResource(R.drawable.red_round);
            ivDice.animate().alpha(1).translationYBy(100).setDuration(500);
            playerNo = 1;
        }
        else
            if(gameRunFlag == 1)
                Toast.makeText(this, "Not a valid move", Toast.LENGTH_SHORT).show();
            else if(gameRunFlag == 0)
                Toast.makeText(this, "Game Finished!", Toast.LENGTH_SHORT).show();
    }

    public void checkWin(){

        int playerOnPosition = 0;
        int countX = 0;
        int countY = 0;

        Log.d("ButtonCheck", "X");

        int position[] = {-325,0,325};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==0 && diceGrid[i][j]!=0) {
                    countX++;
                    playerOnPosition = diceGrid[i][j];
                }
                else if(j>0 && diceGrid[i][j] == playerOnPosition)
                    countX++;
                else if(j>0 && diceGrid[i][j] == 0)
                    break;
                else
                    break;
            }
            if(countX == 3) {
                gameRunFlag = 0;
                TextView showResult = findViewById(R.id.show_result);
                if(playerOnPosition == 1) {
                    showResult.setText("Green wins the game!");
                    Toast.makeText(this, "Green wins the game!", Toast.LENGTH_SHORT).show();
                }
                else if(playerOnPosition == 2){
                    showResult.setText("Red wins the game!");
                    Toast.makeText(this, "Red wins the game!", Toast.LENGTH_SHORT).show();
                }
                ImageView winLine = findViewById(R.id.win_line);
                winLine.animate().translationYBy(position[i]).alpha(1).setDuration(500);
                return;
            }
            else
                countX=0;
        }
        countX = 0;


        Log.d("ButtonCheck", "Y");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==0 && diceGrid[j][i]!=0) {
                    countY++;
                    playerOnPosition = diceGrid[j][i];
                }
                else if(j>0 && diceGrid[j][i] == playerOnPosition)
                    countY++;
                else if(j>0 && diceGrid[j][i] == 0)
                    break;
                else
                    break;
            }
            if(countY == 3) {
                gameRunFlag = 0;
                TextView showResult = findViewById(R.id.show_result);
                if(playerOnPosition == 1) {
                    showResult.setText("Green wins the game!");
                    Toast.makeText(this, "Green wins the game!", Toast.LENGTH_SHORT).show();
                }
                else if(playerOnPosition == 2){
                    showResult.setText("Red wins the game!");
                    Toast.makeText(this, "Red wins the game!", Toast.LENGTH_SHORT).show();
                }
                ImageView winLine = findViewById(R.id.win_line);
                winLine.animate().translationXBy(position[i]).rotation(90).alpha(1).setDuration(500);
                return;
            }
            else
                countY=0;
        }
        countY = 0;

        Log.d("ButtonCheck", "DiagX");
        for(int i=0;i<3;i++) {
            if(i==0 && diceGrid[i][i]!=0) {
                countX++;
                playerOnPosition = diceGrid[i][i];
            }
            else if(i>0 && diceGrid[i][i] == playerOnPosition)
                countX++;
            else if(i>0 && diceGrid[i][i] == 0)
                break;
            else
                break;
        }
        if(countX == 3) {
            gameRunFlag = 0;
            TextView showResult = findViewById(R.id.show_result);
            if(playerOnPosition == 1) {
                showResult.setText("Green wins the game!");
                Toast.makeText(this, "Green wins the game!", Toast.LENGTH_SHORT).show();
            }
            else if(playerOnPosition == 2){
                showResult.setText("Red wins the game!");
                Toast.makeText(this, "Red wins the game!", Toast.LENGTH_SHORT).show();
            }
            ImageView winLine = findViewById(R.id.win_line);
            winLine.animate().rotationBy(45).alpha(1).setDuration(500);
            return;
        }

        Log.d("ButtonCheck", "DiagY");
        for(int i=0;i<3;i++) {
            if(i==0 && diceGrid[i][2-i]!=0) {
                countY++;
                playerOnPosition = diceGrid[i][2-i];
            }
            else if(i>0 && diceGrid[i][2-i] == playerOnPosition)
                countY++;
            else if(i>0 && diceGrid[i][2-i] == 0)
                break;
            else
                break;
        }
        if(countY == 3) {
            gameRunFlag = 0;
            TextView showResult = findViewById(R.id.show_result);
            if(playerOnPosition == 1) {
                showResult.setText("Green wins the game!");
                Toast.makeText(this, "Green wins the game!", Toast.LENGTH_SHORT).show();
            }
            else if(playerOnPosition == 2){
                showResult.setText("Red wins the game!");
                Toast.makeText(this, "Red wins the game!", Toast.LENGTH_SHORT).show();
            }
            ImageView winLine = findViewById(R.id.win_line);
            winLine.animate().rotationBy(-45).alpha(1).setDuration(500);
            return;
        }

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(diceGrid[i][j] == 0)
                    return;

        TextView showResult = findViewById(R.id.show_result);
        showResult.setText("Draw!!");
    }

    public void resetGame(View view){
        playerNo = 1;
        gameRunFlag = 1;

        String row = "";
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++)
                row += diceGrid[i][j] + " ";
            Log.d("ButtonCheck", row);
            row = "";
        }

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                diceGrid[i][j]=0;

        TextView showResult = findViewById(R.id.show_result);
        showResult.setText("Waiting...");

        ImageView winLine = findViewById(R.id.win_line);
        winLine.animate().translationX(0).translationY(0).rotation(0).alpha(0).setDuration(500);

        ImageView ivDice[] = {findViewById(R.id.dice_1),findViewById(R.id.dice_2),
                findViewById(R.id.dice_3),findViewById(R.id.dice_4),
                findViewById(R.id.dice_5),findViewById(R.id.dice_6),
                findViewById(R.id.dice_7),findViewById(R.id.dice_8),
                findViewById(R.id.dice_9)};

        for(int i=0;i<9;i++)
            ivDice[i].animate().alpha(0).setDuration(500);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Dark mode off
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        //getResources().getConfiguration().uiMode helps to get the ui configuration of an app such as dark mode on or off

        Log.d("ButtonCheck", getResources().getConfiguration().uiMode + ""); //33 means dark mode is on
        if((getResources().getConfiguration().uiMode+"").equals("33")) {
            ImageView iv = findViewById(R.id.image_grid);
            iv.setImageResource(R.drawable.tictactoe_grid_dark_mode);
        }//And 17 means dark mode is off
        else{
            ImageView iv = findViewById(R.id.image_grid);
            iv.setImageResource(R.drawable.tictactoe_grid);
        }

    }
}