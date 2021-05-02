package org.thoughtcrime.securesms.groups.ui.notes;

import androidx.appcompat.app.AppCompatActivity;
import org.thoughtcrime.securesms.R;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GroupNotesActivity extends AppCompatActivity {
    ArrayList<String> notesList = new ArrayList<String>();
    ListView notesListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_notes);
        notesList = getIntent().getStringArrayListExtra("NOTES_LIST");
        notesListView = (ListView)  findViewById(R.id.notesListView);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, notesList);
        notesListView.setAdapter(arrayAdapter);
    }
}