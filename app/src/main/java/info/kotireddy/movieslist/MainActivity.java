package info.kotireddy.movieslist;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ListModelClass> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new Adapter(movieList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        MovieData();
    }

    private void MovieData() {
        ListModelClass movie = new ListModelClass("Captain America: Civil War", "Disney", "$1,153,304,495");
        movieList.add(movie);

        movie = new ListModelClass("Rogue One: A Star Wars Story", "Disney", "$1,052,352,131");
        movieList.add(movie);

        movie = new ListModelClass("Finding Dory", "Disney", "$1,028,213,633");
        movieList.add(movie);

        movie = new ListModelClass("Zootopia", "Disney", "1,023,784,195");
        movieList.add(movie);

        movie = new ListModelClass("The Jungle Book", "Disney", "$966,550,600");
        movieList.add(movie);

        movie = new ListModelClass("The Secret Life Of Pets", "Universal", "$875,457,937");
        movieList.add(movie);

        movie = new ListModelClass("Batman Vs Superman: Down Of Justice", "Warner Bros", "$873,260,194");
        movieList.add(movie);

        movie = new ListModelClass("Fantastic Beasts and Where To Find Them", "Warner Bros", "$812,012,652");
        movieList.add(movie);

        movie = new ListModelClass("Deadpool", "20th Century Fox", "$783,112,979");
        movieList.add(movie);

        movie = new ListModelClass("Suecide Squad", "Warner Bros", "$745,600,054");
        movieList.add(movie);


        mAdapter.notifyDataSetChanged();
    }

}
