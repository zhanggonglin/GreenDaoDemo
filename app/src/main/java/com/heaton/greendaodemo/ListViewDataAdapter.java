package com.heaton.greendaodemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by zhanggonglin on 2018/11/2.
 */

public class ListViewDataAdapter extends BaseAdapter {
    private Context context;

    public ListViewDataAdapter(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
