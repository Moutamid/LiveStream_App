package com.moutamid.livestream_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private String[] channel_name = {
            "GEO NEW",
            "HUM NEWS",
            "ARY NEWS",
            "PTV SPORTS",
            "DISNEY",
            "EXPRESS NEWS",

            "GEO NEW",
            "HUM NEWS",
            "ARY NEWS",
            "PTV SPORTS",
            "DISNEY",
            "EXPRESS NEWS",

            "GEO NEW",
            "HUM NEWS",
            "ARY NEWS",
            "PTV SPORTS",
            "DISNEY",
            "EXPRESS NEWS",

            "GEO NEW",
            "HUM NEWS",
            "ARY NEWS",
            "PTV SPORTS",
            "DISNEY",
            "EXPRESS NEWS",

            "GEO NEW",
            "HUM NEWS",
            "ARY NEWS",
            "PTV SPORTS",
            "DISNEY",
            "EXPRESS NEWS",

            "GEO NEW",
            "HUM NEWS",
            "ARY NEWS",
            "PTV SPORTS",
            "DISNEY",
            "EXPRESS NEWS",

            "GEO NEW",
            "HUM NEWS",
            "ARY NEWS",
            "PTV SPORTS",
            "DISNEY",
            "EXPRESS NEWS",

            "GEO NEW",
            "HUM NEWS",
            "ARY NEWS",
            "PTV SPORTS",
            "DISNEY",
            "EXPRESS NEWS",

            "DISNEY",
            "EXPRESS NEWS",
    };

    private String[] channel_des = {
            "Get in touch with all siyuations of All countries with GEO news." ,
            "Get in touch with all siyuations of All countries with HUM news." ,
            "Get in touch with all siyuations of All countries with ARY news." ,
            "Get in touch with all siyuations of All countries with PTV sports." ,
            "Get in touch with all siyuations of All countries with Disney Cartoon Channel." ,
            "Get in touch with all siyuations of All countries with Express news." ,

            "Get in touch with all siyuations of All countries with GEO news." ,
            "Get in touch with all siyuations of All countries with HUM news." ,
            "Get in touch with all siyuations of All countries with ARY news." ,
            "Get in touch with all siyuations of All countries with PTV sports." ,
            "Get in touch with all siyuations of All countries with Disney Cartoon Channel." ,
            "Get in touch with all siyuations of All countries with Express news." ,

            "Get in touch with all siyuations of All countries with GEO news." ,
            "Get in touch with all siyuations of All countries with HUM news." ,
            "Get in touch with all siyuations of All countries with ARY news." ,
            "Get in touch with all siyuations of All countries with PTV sports." ,
            "Get in touch with all siyuations of All countries with Disney Cartoon Channel." ,
            "Get in touch with all siyuations of All countries with Express news." ,

            "Get in touch with all siyuations of All countries with GEO news." ,
            "Get in touch with all siyuations of All countries with HUM news." ,
            "Get in touch with all siyuations of All countries with ARY news." ,
            "Get in touch with all siyuations of All countries with PTV sports." ,
            "Get in touch with all siyuations of All countries with Disney Cartoon Channel." ,
            "Get in touch with all siyuations of All countries with Express news." ,

            "Get in touch with all siyuations of All countries with GEO news." ,
            "Get in touch with all siyuations of All countries with HUM news." ,
            "Get in touch with all siyuations of All countries with ARY news." ,
            "Get in touch with all siyuations of All countries with PTV sports." ,
            "Get in touch with all siyuations of All countries with Disney Cartoon Channel." ,
            "Get in touch with all siyuations of All countries with Express news." ,

            "Get in touch with all siyuations of All countries with GEO news." ,
            "Get in touch with all siyuations of All countries with HUM news." ,
            "Get in touch with all siyuations of All countries with ARY news." ,
            "Get in touch with all siyuations of All countries with PTV sports." ,
            "Get in touch with all siyuations of All countries with Disney Cartoon Channel." ,
            "Get in touch with all siyuations of All countries with Express news." ,

            "Get in touch with all siyuations of All countries with GEO news." ,
            "Get in touch with all siyuations of All countries with HUM news." ,
            "Get in touch with all siyuations of All countries with ARY news." ,
            "Get in touch with all siyuations of All countries with PTV sports." ,
            "Get in touch with all siyuations of All countries with Disney Cartoon Channel." ,
            "Get in touch with all siyuations of All countries with Express news." ,

            "Get in touch with all siyuations of All countries with GEO news." ,
            "Get in touch with all siyuations of All countries with HUM news." ,
            "Get in touch with all siyuations of All countries with ARY news." ,
            "Get in touch with all siyuations of All countries with PTV sports." ,
            "Get in touch with all siyuations of All countries with Disney Cartoon Channel." ,
            "Get in touch with all siyuations of All countries with Express news." ,

            "Get in touch with all siyuations of All countries with Disney Cartoon Channel." ,
            "Get in touch with all siyuations of All countries with Express news." ,
    };

    private String[] channel_cast = {
            "Headlines:",
            "Kasoti:" ,
            "Startup Pak:",
            "Live Match:",
            "Doraemon:",
            "Khabarhaar:",

            "Headlines:",
            "Kasoti:" ,
            "Startup Pak:",
            "Live Match:",
            "Doraemon:",
            "Khabarhaar:",

            "Headlines:",
            "Kasoti:" ,
            "Startup Pak:",
            "Live Match:",
            "Doraemon:",
            "Khabarhaar:",

            "Headlines:",
            "Kasoti:" ,
            "Startup Pak:",
            "Live Match:",
            "Doraemon:",
            "Khabarhaar:",

            "Headlines:",
            "Kasoti:" ,
            "Startup Pak:",
            "Live Match:",
            "Doraemon:",
            "Khabarhaar:",

            "Headlines:",
            "Kasoti:" ,
            "Startup Pak:",
            "Live Match:",
            "Doraemon:",
            "Khabarhaar:",

            "Headlines:",
            "Kasoti:" ,
            "Startup Pak:",
            "Live Match:",
            "Doraemon:",
            "Khabarhaar:",

            "Headlines:",
            "Kasoti:" ,
            "Startup Pak:",
            "Live Match:",
            "Doraemon:",
            "Khabarhaar:",

            "Doraemon:",
            "Khabarhaar:",
    };

    private String[] channel_time = {
            "03:13",
            "04:55",
            "08:12",
            "12:30",
            "07:51",
            "11:55",

            "03:13",
            "04:55",
            "08:12",
            "12:30",
            "07:51",
            "11:55",

            "03:13",
            "04:55",
            "08:12",
            "12:30",
            "07:51",
            "11:55",

            "03:13",
            "04:55",
            "08:12",
            "12:30",
            "07:51",
            "11:55",

            "03:13",
            "04:55",
            "08:12",
            "12:30",
            "07:51",
            "11:55",

            "03:13",
            "04:55",
            "08:12",
            "12:30",
            "07:51",
            "11:55",

            "03:13",
            "04:55",
            "08:12",
            "12:30",
            "07:51",
            "11:55",

            "03:13",
            "04:55",
            "08:12",
            "12:30",
            "07:51",
            "11:55",

            "07:51",
            "11:55",
    };

    private String[] channel_link = {
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",

            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",

            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",

            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",

            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",

            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",

            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",

            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",

            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
            "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1",
    };

    private int[] images1_channel = {
            R.drawable.geo,
            R.drawable.hum,
            R.drawable.ary,
            R.drawable.ptv,
            R.drawable.disney,
            R.drawable.express,

            R.drawable.geo,
            R.drawable.hum,
            R.drawable.ary,
            R.drawable.ptv,
            R.drawable.disney,
            R.drawable.express,

            R.drawable.geo,
            R.drawable.hum,
            R.drawable.ary,
            R.drawable.ptv,
            R.drawable.disney,
            R.drawable.express,

            R.drawable.geo,
            R.drawable.hum,
            R.drawable.ary,
            R.drawable.ptv,
            R.drawable.disney,
            R.drawable.express,

            R.drawable.geo,
            R.drawable.hum,
            R.drawable.ary,
            R.drawable.ptv,
            R.drawable.disney,
            R.drawable.express,

            R.drawable.geo,
            R.drawable.hum,
            R.drawable.ary,
            R.drawable.ptv,
            R.drawable.disney,
            R.drawable.express,

            R.drawable.geo,
            R.drawable.hum,
            R.drawable.ary,
            R.drawable.ptv,
            R.drawable.disney,
            R.drawable.express,

            R.drawable.geo,
            R.drawable.hum,
            R.drawable.ary,
            R.drawable.ptv,
            R.drawable.disney,
            R.drawable.express,

            R.drawable.geo,
            R.drawable.hum,
    };

    private RecyclerView channel_recycler;
    private ArrayList<Model_Channel> modelChannelArrayList;
    private Adapter_Channel adapter_channel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar); // Setting/replace toolbar as the ActionBar

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this , drawer , toolbar , R.string.navigation_drawer_open , R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        channel_recycler = findViewById(R.id.recyclerView_channel);
        loadchannel();
    }

    private void loadchannel() {
        modelChannelArrayList = new ArrayList<>();

        for (int i = 0; i < channel_name.length; i++) {
            Model_Channel modelAndroid = new Model_Channel(
                    channel_name[i],
                    channel_des[i],
                    channel_cast[i],
                    channel_time[i],
                    channel_link[i],
                    images1_channel[i]
            );
            modelChannelArrayList.add(modelAndroid);
        }
        adapter_channel = new Adapter_Channel(this, modelChannelArrayList);
        channel_recycler.setAdapter(adapter_channel);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.item1){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
            startActivity(browserIntent);
        }
        else
        /*if(id==R.id.item2){
            Intent intent = new Intent(MainActivity.this , Profile_Activity.class);
            startActivity(intent);
        }
        else*/
        if(id==R.id.item3){
            Intent intent = new Intent(MainActivity.this , Settings_Activity.class);
            startActivity(intent);
        }
        else
        if(id==R.id.item4){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
            startActivity(browserIntent);
        }
        else
        if(id==R.id.item5){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
            startActivity(browserIntent);
        }
        else
        if(id==R.id.item6){
            startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:to@gmail.com")));
        }
        else
        if(id==R.id.item7){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=$packageName")));
        }
        return false;
    }
}