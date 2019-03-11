//package com.example.jinny.vocabulary.screen.study;
//
//import android.app.Fragment;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.jinny.vocabulary.R;
//import com.example.jinny.vocabulary.database.DatabaseManager;
//import com.example.jinny.vocabulary.model.Topic;
//import com.example.jinny.vocabulary.model.Word;
//import com.squareup.picasso.Picasso;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//
//public class CardBackFragment extends Fragment {
//    private Word word;
//    private TextView origin, origin2, pronunciation, explaination, example, example_trans;
//    private ImageView imageView;
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.card_back_fragment,container,false);
//        origin = v.findViewById(R.id.origin);
//        origin2 = v.findViewById(R.id.origin2);
//        pronunciation = v.findViewById(R.id.pronunciation);
//        explaination = v.findViewById(R.id.explaination);
//        example = v.findViewById(R.id.example);
//        example_trans = v.findViewById(R.id.example_trans);
//        imageView = v.findViewById(R.id.image);
//
//        origin.setText(word.getOrigin());
//        origin2.setText(word.getOrigin());
//        pronunciation.setText(word.getPronounciation());
//        explaination.setText(word.getExplaination());
//        example.setText(word.getExample());
//        example_trans.setText(word.getExample_trans());
//        Picasso.with(getContext()).load(word.getImageUrl()).into(imageView);
//        return v;
//    }
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        word = (Word) getArguments().getSerializable("word");
//    }
//
//    public int getCurrentWordID(){
//        return word.getId();
//    }
//}
