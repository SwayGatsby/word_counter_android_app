package codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterText;
    private Button submitButton;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.enterText = (EditText) findViewById(R.id.enterText);
        this.submitButton = (Button) findViewById(R.id.submit_button);
        this.answer = (TextView) findViewById(R.id.answer);
    }

    public void onButtonClicked(View button){
        Log.d("MainActivity", "OnButtonClicked");
        String enterText = this.enterText.getText().toString();
        Log.d(getClass().toString(), enterText);
        WordCounter wordCounter = new WordCounter();
        int numOfWords = wordCounter.count(enterText);
        this.answer.setText(Integer.toString(numOfWords));
        this.answer.setText(Integer.toString(numOfWords));
    }

}
