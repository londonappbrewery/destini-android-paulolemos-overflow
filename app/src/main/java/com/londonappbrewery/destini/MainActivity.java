package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button topButton;
    Button bottomButton;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);
        
        
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (mStoryIndex) {
                    case 1:
                        mTextView.setText(R.string.T3_Story);
                        topButton.setText(R.string.T3_Ans1);
                        bottomButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 2;
                        Log.d("Destini", "String " + mStoryIndex);
                        break;

                    case 2:
                        Log.d("Destini", "CASE 2");
                        mTextView.setText(R.string.T6_End);
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        break;
                }

            }
        });
        
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (mStoryIndex) {
                    case 1:
                        mTextView.setText(R.string.T2_Story);
                        topButton.setText(R.string.T2_Ans1);
                        bottomButton.setText(R.string.T2_Ans2);
                        mStoryIndex = 3;
                        break;
                    case 3:
                        mTextView.setText(R.string.T3_Story);
                        topButton.setText(R.string.T3_Ans1);
                        bottomButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 4;
                        break;
                    case 4:
                        mTextView.setText(R.string.T4_End);
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);

}
                
            }
        });
        
    }
}
