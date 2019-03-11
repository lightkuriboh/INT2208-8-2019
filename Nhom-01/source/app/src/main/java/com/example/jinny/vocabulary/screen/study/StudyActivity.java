package com.example.jinny.vocabulary.screen.study;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;

import com.example.jinny.vocabulary.R;
import com.example.jinny.vocabulary.base.BaseActivity;
import com.example.jinny.vocabulary.database.DatabaseManager;
import com.example.jinny.vocabulary.model.Topic;
import com.example.jinny.vocabulary.model.Word;


public class StudyActivity extends BaseActivity {

    private Word word;
    Space topicSpace;
    TextView origin1, origin2, pronunciation1, pronunciation2, newWord1, newWord2, explaination, type, example, exampleTrans, collapseSpace, extendSpace, topic;
    Button button3, button4, button5;
    ImageView image;
    ImageButton imageButton2;
    Button nextButton;
    FragmentManager fragmentManager = getFragmentManager();
    final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    final FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
    @Override
    protected int getLayoutId() {
        return R.layout.activity_study;
    }

    @Override
    protected void setupUI() {
        nextButton = findViewById(R.id.next_button);
        Intent intent = this.getIntent();
        final Topic topic = (Topic) intent.getSerializableExtra("topic");
        word = DatabaseManager.getInstance(this).getRandomWord(topic.getId(),0);
        getWindow().getDecorView().setBackgroundColor(Color.parseColor(topic.getColor()));
        Bundle bundle = new Bundle();
        bundle.putSerializable("word",word);

        CardFragment fragment = new CardFragment();
        fragment.setArguments(bundle);

        final CardBackFragment fragmentBack = new CardBackFragment();
        fragmentBack.setArguments(bundle);

        fragmentTransaction.add(R.id.fragment, fragment);
        fragmentTransaction.commit();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word = DatabaseManager.getInstance(getApplication()).getRandomWord(topic.getId(),word.getId());
                CardFragment nextCardFragment = new CardFragment();
                Bundle bundle1 = new Bundle();
                bundle1.putSerializable("word",word);
                nextCardFragment.setArguments(bundle1);
                fragmentTransaction1.add(R.id.fragment,nextCardFragment);
                fragmentTransaction1.commit();
            }
        });

        /*image = (ImageView) findViewById(R.id.image);
        Picasso.with(this).load(word.getImageUrl()).into(image);*/


        /*FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CardFragment fragment = new CardFragment();
        fragmentTransaction.add()*/

        /*topicSpace = (Space) findViewById(R.id.topicSpace);
        collapseSpace = (TextView) findViewById(R.id.collapseSpace);
        extendSpace = (TextView) findViewById(R.id.extendSpace);

        topic = (TextView) findViewById(R.id.topic);
        topic.setText(topicName);

        origin1 = (TextView) findViewById(R.id.origin1);
        origin2 = (TextView) findViewById(R.id.origin2);
        origin2.setText(word.getOrigin());
        origin1.setText(word.getOrigin());

        pronunciation1 = (TextView) findViewById(R.id.pronunciation1);
        pronunciation2 = (TextView) findViewById(R.id.pronunciation2);
        pronunciation1.setText(word.getPronounciation());
        pronunciation2.setText(word.getPronounciation());


        newWord1 = (TextView) findViewById(R.id.newWord1);
        newWord2 = (TextView) findViewById(R.id.newWord2);

        explaination = (TextView) findViewById(R.id.explaination);
        explaination.setText(word.getExplaination());

        type = (TextView) findViewById(R.id.type);
        type.setText(word.getType());

        example = (TextView) findViewById(R.id.example);
        example.setText(word.getExample());

        exampleTrans = (TextView) findViewById(R.id.exampleTrans);
        exampleTrans.setText(word.getExample_trans());

        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        image = (ImageView) findViewById(R.id.image);

        extendSpace.setVisibility(View.GONE);
        origin2.setVisibility(View.GONE);
        pronunciation2.setVisibility(View.GONE);
        newWord2.setVisibility(View.GONE);
        explaination.setVisibility(View.GONE);
        type.setVisibility(View.GONE);
        example.setVisibility(View.GONE);
        exampleTrans.setVisibility(View.GONE);
        button4.setVisibility(View.GONE);
        button5.setVisibility(View.GONE);
        image.setVisibility(View.GONE);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collapseSpace.setVisibility(View.GONE);
                origin1.setVisibility(View.GONE);
                pronunciation1.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);
                newWord1.setVisibility(View.GONE);

                extendSpace.setVisibility(View.VISIBLE);
                origin2.setVisibility(View.VISIBLE);
                pronunciation2.setVisibility(View.VISIBLE);
                newWord2.setVisibility(View.VISIBLE);
                explaination.setVisibility(View.VISIBLE);
                type.setVisibility(View.VISIBLE);
                example.setVisibility(View.VISIBLE);
                exampleTrans.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {}
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {}
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {}
        });

        extendSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                collapseSpace.setVisibility(View.VISIBLE);
                origin1.setVisibility(View.VISIBLE);
                pronunciation1.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                newWord1.setVisibility(View.VISIBLE);

                extendSpace.setVisibility(View.GONE);
                origin2.setVisibility(View.GONE);
                pronunciation2.setVisibility(View.GONE);
                newWord2.setVisibility(View.GONE);
                explaination.setVisibility(View.GONE);
                type.setVisibility(View.GONE);
                example.setVisibility(View.GONE);
                exampleTrans.setVisibility(View.GONE);
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                image.setVisibility(View.GONE);
            }
        });*/
    }
}
