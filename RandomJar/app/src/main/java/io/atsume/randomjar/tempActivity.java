// currently from settings button 3

package io.atsume.randomjar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;

public class tempActivity extends AppCompatActivity {

    //    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = getLayoutInflater();
            view = inflater.inflate(R.layout.listitems, null, true);
            viewHolder.editText = (EditText) view.findViewById(R.id.tempEditText);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
            //stub for loadSavedValues(); ... not implemented in example code


        }
        viewHolder.idPosition = position;

        // example code has if statement using non-implemented variable

        // listener
        viewHolder.editText
                .setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View view, boolean hasFocus) {
                        if (!hasFocus) {    // save entered strings after entered
                            int itemIndex = view.getId();
                            String enteredItem = view.toString();   // Correct?
                        }
                    }
                });
        return view;
    }


/*
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
    }
*/

}