package generalassembly.yuliyakaleda.startercode;

import android.animation.LayoutTransition;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  EditText mEditText;
  Button mButton;
  TextView mTextView;
  ListView mListView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mEditText = (EditText)findViewById(R.id.editText);
    mButton = (Button)findViewById(R.id.button);
    mTextView = (TextView)findViewById(R.id.textView);

    mTextView.setText("");
//    mButton.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View v) {
//
//      }
//    });
    //TODO: set up all the view and event listeners.
  }

  public void onClick(View v) {
    String input = mEditText.getText().toString();
    mTextView.setText(input);
    Animation ourAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation);
    mTextView.startAnimation(ourAnimation);
    mEditText.setText("");

    TextView listText = new TextView(MainActivity.this);
    LayoutTransition layout = new LayoutTransition();
    layout.enableTransitionType(LayoutTransition.CHANGING);
    LinearLayout view = (LinearLayout)findViewById(R.id.container);
    view.setLayoutTransition(layout);
    listText.setText(input);
    view.addView(listText);



    // TODO: 1. get the text from the input field
    //       2. animate it in the center of the screen
    //       3. add it to the list wish
    //       4. clear the input field
  }
}
