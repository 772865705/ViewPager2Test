package zy.com.vp2test;

import android.content.Context;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

public class VP2Adapter extends CommonAdapter<String> {
    public VP2Adapter(Context context,  List<String> datas) {
        super(context, R.layout.item_vpstring, datas);
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position) {
        holder.setText(R.id.tv_item,getDatas().get(position));
    }
}
