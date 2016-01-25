package com.hankkin.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hankkin on 16/1/25.
 */
public class PopWindowAdapter extends BaseAdapter {
    private Context context;
    private List<PopBean> dataList;
    private LayoutInflater inflater;
    private boolean isShowImg = false;

    public PopWindowAdapter(Context context, List<PopBean> dataList,boolean isShowImg) {
        this.context = context;
        this.dataList = dataList;
        this.inflater = LayoutInflater.from(context);
        this.isShowImg = isShowImg;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int i) {
        return dataList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = inflater.inflate(R.layout.listview_popwindow_item, null);
            holder = new ViewHolder();
            holder.tv_name = (TextView) view.findViewById(R.id.tv_title);
            holder.v_line = (View) view.findViewById(R.id.v_line);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.tv_name.setText(dataList.get(i).getTitle());
        

        if (dataList.size() - 1 == i) {
            holder.v_line.setVisibility(View.INVISIBLE);
            holder.tv_name.setBackground(context.getResources().getDrawable(R.drawable.selector_bottom_half));
        } else {
            holder.v_line.setVisibility(View.VISIBLE);
            holder.tv_name.setBackground(context.getResources().getDrawable(R.drawable.list_gray_item));
        }


        return view;
    }

    private class ViewHolder {
        TextView tv_name;
        View v_line;
    }
}
