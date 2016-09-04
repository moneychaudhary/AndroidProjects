package money.recyclerview2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by #money on 8/25/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<ShowViewHolder> {
    Context context;
    private int value;


    public RecyclerViewAdapter(Context context)
    {
        this.context= context;
    }
    @Override
    public ShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View view= inflator.inflate(R.layout.layout,parent,false);
        return new ShowViewHolder(view , context);
    }

    @Override
    public void onBindViewHolder(ShowViewHolder holder, int position) {

                value = returnPos(position);
                holder.imageID=Resource.imageList.get(value);


                holder.setImage.setBackgroundResource(Resource.imageList.get(value));


    }
    private static int returnPos(int position)
    {
        return  position%Resource.imageList.size();


    }




    @Override
    public int getItemCount() {
        return 300;
    }


}
