package edu.upc.eetac.dsa.appminimo2.Entity;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import edu.upc.eetac.dsa.appminimo2.R;

/**
 * Created by pauli on 01/06/2017.
 */

public class List_adapter extends ArrayAdapter<RowItem> {

    private Context context;

    public List_adapter(Context context,int resourceId, List<RowItem> entradas) {
        super(context, resourceId, entradas);
        this.context = context;
    }

    private  class  ViewHolder{
        ImageView imageView;
        TextView textName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder= null;
        RowItem rowItem = (RowItem) getItem(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.activity_entry, null);
            holder = new ViewHolder();
            holder.textName = (TextView) convertView.findViewById(R.id.textView4);
            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView2);
            convertView.setTag(holder);
        }else
            holder=(ViewHolder)convertView.getTag();
        holder.textName.setText(rowItem.getTitle());
        holder.imageView.setImageResource(rowItem.getImageId());
        return convertView;
    }
}
