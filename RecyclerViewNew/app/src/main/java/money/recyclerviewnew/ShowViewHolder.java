package money.recyclerviewnew;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * Created by #money on 8/24/2016.
 */
public class ShowViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public ImageView moiveImage;
    public TextView movieTitle;
    public int movieId;
    private Context context;
    public ShowViewHolder(View itemView,  Context context) {
        super(itemView);
        this.context= context;
        moiveImage =(ImageView)itemView.findViewById(R.id.movie_image);
        movieTitle =(TextView) itemView.findViewById(R.id.movie_title);
        itemView.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        Intent intent = Main2Activity.getNewIntent(context,movieId);
        context.startActivity(intent);


    }
}
