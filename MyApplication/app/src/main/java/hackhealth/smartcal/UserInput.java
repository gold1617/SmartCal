package hackhealth.smartcal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.api.services.calendar.model.CalendarListEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishab on 9/10/16.
 */
public class UserInput extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_input);
        TextView text =(TextView) findViewById(R.id.textView);
        Button bt=(Button)findViewById(R.id.button);
        final EditText t=(EditText)findViewById(R.id.editText);
        List<String> calendars = getIntent().getStringArrayListExtra("Calendars");
        calendars.add(0,"Pick your calendar:");

        text.setText(TextUtils.join("\n",calendars));
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("num",t.getText());
                setResult(RESULT_OK,intent);
                finish();
            }

    });
    }
}
