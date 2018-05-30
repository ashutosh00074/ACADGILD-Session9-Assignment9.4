package com.tech.gigabyte.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get a reference to the view for pressing
        TextView pressView = (TextView) findViewById(R.id.tv);

        //register it for context
        registerForContextMenu(pressView);
    }

    //Context Menu
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    //Selecting Context Menu
    public boolean onContextItemSelected(MenuItem item) {
        //Logic for which menu item was pressed
        switch (item.getItemId()) {
            case R.id.act1:
                doOptionOne();
                return true;
            case R.id.act2:
                doOptionTwo();
                return true;
            case R.id.act3:
                doOptionThree();
                return true;
            default:
                return false;
        }
    }

    //A Toast Notification When Menu pressed
    private void doOptionOne() {
        Toast.makeText(this, "Action 1 Chosen...", Toast.LENGTH_LONG).show();
    }

    private void doOptionTwo() {
        Toast.makeText(this, "Action 2 Chosen...", Toast.LENGTH_LONG).show();
    }

    private void doOptionThree() {
        Toast.makeText(this, "Action 3 Chosen...", Toast.LENGTH_LONG).show();
    }
}