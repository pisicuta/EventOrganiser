package com.example.paul.eventorganiser.activities;

//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.paul.eventorganiser.R;
import com.example.paul.eventorganiser.models.DrawerItem;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    //
    public String HEADER_NAME = "Curley Wurley";
    public String HEADER_EMAIL = "curleywurley@live.com";
    public int HEADER_IMAGE = 1; //(we will change this later to point to a resource file)
    //
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private DrawerLayout Drawer;
    private ActionBarDrawerToggle mDrawerToggle;
    private List<DrawerItem> dataList;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
    }
}
