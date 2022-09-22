package com.moutamid.livestream_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Accounts_Activity extends AppCompatActivity {

    TextView inti_signIn , init_signUp , init_revover;
    TextView back_1 , btn_signIn , signInRecover;
    TextView back_2 , btn_signUp , signUpRecover;
    TextView back_3 , btn_recover;
    CardView card1 , cardSignup , cardSignIn , cardRecover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);

        inti_signIn = findViewById(R.id.init_signIn);
        init_signUp = findViewById(R.id.init_signUp);
        init_revover = findViewById(R.id.init_recover);

        back_1 = findViewById(R.id.back_1);
        btn_signIn = findViewById(R.id.btn_signIn);
        signInRecover = findViewById(R.id.signInRecover);

        back_2 = findViewById(R.id.back_2);
        btn_signUp = findViewById(R.id.btn_signUp);
        signUpRecover = findViewById(R.id.signUpRecover);

        back_3 = findViewById(R.id.back_3);
        btn_recover = findViewById(R.id.btn_recover);

        card1 = findViewById(R.id.card1);
        card1.setVisibility(View.VISIBLE);

        cardSignIn = findViewById(R.id.card_signIn);
        cardSignup = findViewById(R.id.card_signUp);
        cardRecover = findViewById(R.id.card_recover);

        inti_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1.setVisibility(View.GONE);
                cardSignIn.setVisibility(View.VISIBLE);
                cardSignup.setVisibility(View.GONE);
                cardRecover.setVisibility(View.GONE);
            }
        });
        init_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1.setVisibility(View.GONE);
                cardSignIn.setVisibility(View.GONE);
                cardSignup.setVisibility(View.VISIBLE);
                cardRecover.setVisibility(View.GONE);
            }
        });
        init_revover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1.setVisibility(View.GONE);
                cardSignIn.setVisibility(View.GONE);
                cardSignup.setVisibility(View.GONE);
                cardRecover.setVisibility(View.VISIBLE);
            }
        });

        back_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1.setVisibility(View.VISIBLE);
                cardSignIn.setVisibility(View.GONE);
                cardSignup.setVisibility(View.GONE);
                cardRecover.setVisibility(View.GONE);
            }
        });
        btn_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accounts_Activity.this , MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        signInRecover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1.setVisibility(View.GONE);
                cardSignIn.setVisibility(View.GONE);
                cardSignup.setVisibility(View.GONE);
                cardRecover.setVisibility(View.VISIBLE);
            }
        });

        back_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1.setVisibility(View.VISIBLE);
                cardSignIn.setVisibility(View.GONE);
                cardSignup.setVisibility(View.GONE);
                cardRecover.setVisibility(View.GONE);
            }
        });
        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accounts_Activity.this , MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        signUpRecover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1.setVisibility(View.GONE);
                cardSignIn.setVisibility(View.GONE);
                cardSignup.setVisibility(View.GONE);
                cardRecover.setVisibility(View.VISIBLE);
            }
        });

        back_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1.setVisibility(View.VISIBLE);
                cardSignIn.setVisibility(View.GONE);
                cardSignup.setVisibility(View.GONE);
                cardRecover.setVisibility(View.GONE);
            }
        });
        btn_recover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1.setVisibility(View.GONE);
                cardSignIn.setVisibility(View.VISIBLE);
                cardSignup.setVisibility(View.GONE);
                cardRecover.setVisibility(View.GONE);
            }
        });
    }
}