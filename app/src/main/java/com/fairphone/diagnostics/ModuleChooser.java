package com.fairphone.diagnostics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.fairphone.diagnostics.Module.CameraModule;
import com.fairphone.diagnostics.Module.DisplayModule;
import com.fairphone.diagnostics.Module.Module;
import com.fairphone.diagnostics.Module.ModuleListAdapter;
import com.fairphone.diagnostics.Module.ReceiverModule;
import com.fairphone.diagnostics.Module.SpeakerModule;
import com.fairphone.diagnostics.Module.TransceiverModule;

import java.util.ArrayList;

public class ModuleChooser extends Activity implements ModuleListAdapter.OnClickListener {
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_chooser);
        super.onCreate(savedInstanceState);
        mListView = (ListView) findViewById(R.id.listView);
        ArrayList<Module> tests = new ArrayList<>();
        tests.add(new DisplayModule());
        tests.add(new TransceiverModule());
        tests.add(new CameraModule());
        tests.add(new ReceiverModule());
        tests.add(new SpeakerModule());
        mListView.setAdapter(new ModuleListAdapter(this, tests, this));
    }

    @Override
    public void onClick(Module test) {
        Intent intent = new Intent(this, TestChooser.class);
        intent.putExtra("Module", test);
        startActivity(intent);
    }
}