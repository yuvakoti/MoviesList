package info.kotireddy.movieslist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<ListModelClass> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, gross, distributor;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.title);
            distributor = (TextView) view.findViewById(R.id.genre);
            gross = (TextView) view.findViewById(R.id.year);
        }
    }


    public Adapter(List<ListModelClass> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ListModelClass list = moviesList.get(position);
        holder.name.setText(list.getMoviename());
        holder.distributor.setText(list.getMoviedistributor());
        holder.gross.setText(list.getMoviegross());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}

