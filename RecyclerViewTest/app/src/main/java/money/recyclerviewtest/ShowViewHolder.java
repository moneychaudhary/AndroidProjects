package money.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by #money on 8/23/2016.
 */
public class ShowViewHolder extends RecyclerView.ViewHolder {
    public TextView show;
    public ShowViewHolder(View itemView) {
        super(itemView);
        show=(TextView) itemView.findViewById(R.id.value);

    }
}
