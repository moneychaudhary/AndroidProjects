package money.recyclerviewtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

/**
 * Created by #money on 8/23/2016.
 */
public class TableAdapter extends RecyclerView.Adapter<ShowViewHolder> {
    private int number;
    private int upto;
    private Context context;

    public TableAdapter(Context context,int value1 , int value2)
    {
        this.context =context;
        number=value1;
        upto=value2;

    }

    @Override
    public ShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view  =inflater.inflate(R.layout.layout,parent,false);

        return new ShowViewHolder(view);


    }

    @Override
    public void onBindViewHolder(ShowViewHolder holder, int position) {
        position=position+1;
        int result=number*position;
        holder.show.setText(""+number+"*"+position+":"+result );

    }

    @Override
    public int getItemCount() {

        return upto;
    }
}
