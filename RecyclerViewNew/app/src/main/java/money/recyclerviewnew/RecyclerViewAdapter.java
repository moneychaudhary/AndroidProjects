package money.recyclerviewnew;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by #money on 8/24/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<ShowViewHolder> {
    Context context;

    public RecyclerViewAdapter(Context context)
    {
        this.context =context;
    }
    @Override
    public ShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflator.inflate(R.layout.movie_details,parent,false);
        return new ShowViewHolder(view,context);
    }



    @Override
    public void onBindViewHolder(ShowViewHolder holder, int position) {
        position = position+1;
        holder.movieTitle.setText("MOVIE NO : "+position);
        holder.movieId =position;

    }



    @Override
    public int getItemCount() {
        return 100;
    }
}
