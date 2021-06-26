package maazou.aziz.joullidocteur;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView cardSoin, cardEvaluer, cardAnimat, cardGuide, cardPages, cardAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);

        cardSoin = (CardView) findViewById(R.id.cardsoin);
        cardEvaluer = (CardView) findViewById(R.id.cardevaluation);
        cardAnimat = (CardView) findViewById(R.id.cardanimation);
        cardGuide = (CardView) findViewById(R.id.cardguide);
        cardPages = (CardView) findViewById(R.id.cardpages);
        cardAbout = (CardView) findViewById(R.id.cardabout);

        cardSoin.setOnClickListener(this);
        cardEvaluer.setOnClickListener(this);
        cardAnimat.setOnClickListener(this);
        cardGuide.setOnClickListener(this);
        cardPages.setOnClickListener(this);
        cardAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    Intent i;
    switch (v.getId()){
        case R.id.cardsoin:
            i = new Intent(this, SoinActivity.class);
            startActivity(i);
            break;

        case R.id.cardevaluation:
            i = new Intent(this, EvaluationActivity.class);
            startActivity(i);
            break;
        case R.id.cardanimation:
            i = new Intent(this, AnimationActivity.class);
            startActivity(i);
            break;
        case R.id.cardguide:
            i = new Intent(this, GuideActivity.class);
            startActivity(i);
            break;
        case R.id.cardpages:
            i = new Intent(this, NospagesActivity.class);
            startActivity(i);
            break;
        case R.id.cardabout:
            i = new Intent(this, ABoutActivity.class);
            startActivity(i);
            break;
    }
    }
}