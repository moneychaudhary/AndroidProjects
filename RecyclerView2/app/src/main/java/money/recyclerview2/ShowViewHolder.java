package money.recyclerview2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by #money on 8/25/2016.
 */
public class ShowViewHolder extends RecyclerView.ViewHolder {
    public ImageView setImage;
    public int imageID;


    public ShowViewHolder(View itemView, final Context context) {
        super(itemView);

        setImage=(ImageView)itemView.findViewById(R.id.image_frame);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = Main2Activity.getNewIntent(context,imageID);
                context.startActivity(intent);

            }
        });



    }
}
