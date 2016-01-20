package cloudblocks.in.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        ItemData itemsData[] = {
                new ItemData("Image 1",R.drawable.aura256x256),
                new ItemData("Image 2",R.drawable.bookingicon2),
                new ItemData("Image 3",R.drawable.convert),
                new ItemData("Image 4",R.drawable.d5584d23d53e2c8531681183c3dc622c),
                new ItemData("Image 5",R.drawable.online),
                new ItemData("Image 6",R.drawable.onlinepublic),
                new ItemData("Image 7",R.drawable.radaronline)};


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter mAdapter = new MyAdapter(itemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
