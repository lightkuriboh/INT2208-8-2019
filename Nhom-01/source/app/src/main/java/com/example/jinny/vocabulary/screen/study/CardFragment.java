//package com.example.jinny.vocabulary.screen.study;
//
//import android.app.Fragment;
//import android.app.FragmentManager;
//import android.app.FragmentTransaction;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import com.example.jinny.vocabulary.R;
//import com.example.jinny.vocabulary.database.DatabaseManager;
//import com.example.jinny.vocabulary.model.Topic;
//import com.example.jinny.vocabulary.model.Word;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//
//public class CardFragment extends Fragment {
//    private TextView wordTextView;
//    private TextView pronunTextView;
//    private Button button;
//    private Word word;
//    private Fragment cardBackFragment;
//    private Fragment cardFrontFragment;
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        Intent intent = getActivity().getIntent();
//        Topic topic = (Topic) intent.getSerializableExtra("topic");
//        word = (Word) getArguments().getSerializable("word");
//        Bundle bundle = new Bundle();
//        bundle.putSerializable("word",word);
//        cardBackFragment = new CardBackFragment();
//        cardBackFragment.setArguments(bundle);
//        cardFrontFragment =  getFragmentManager().findFragmentById(R.id.fragment);
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.card_front_fragment,container,false);
//        wordTextView = v.findViewById(R.id.wordTextView);
//        pronunTextView = v.findViewById(R.id.pronunTextView);
//        button = v.findViewById(R.id.showDetailButton);
//        wordTextView.setText(word.getOrigin());
//        pronunTextView.setText(word.getPronounciation());
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fragmentManager = getActivity().getFragmentManager();
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//
//                transaction.replace(R.id.fragment,cardBackFragment);
//                transaction.commit();
//            }
//        });
//
//        return  v;
//
//    }
//}
