package com.swpuiot.textfive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2016/10/15.
 */
public class MyAdapter extends BaseAdapter{

    public List<Collects> myList = new ArrayList<Collects>();{
            myList.add(new Collects(R.drawable.image_interlife,
                    "网瘾与网络生活", "122232635次访问，1634345人关注"));
            myList.add(new Collects(R.drawable.image_space,
                    "空间技术揭秘", "43254人访问，1233456人关注"));
            myList.add(new Collects(R.drawable.image_old,
                    "有备无患的老年生活", "756413人54访问，1354353人关注"));
            myList.add(new Collects(R.drawable.image_baseball,
                    "聊聊美式橄榄球", "4354843人访问，434人关注"));
            myList.add(new Collects(R.drawable.image_glass,
                    "闲话葡萄酒", "12354646人浏览，353543人关注"));
            myList.add(new Collects(R.drawable.image_sports,
                    "里约奥运会", "1348676人浏览，3243345人关注"));
            myList.add(new Collects(R.drawable.image_footbaii,
                    "看球.欧洲杯", "1346879人浏览，434668人关注"));
            myList.add(new Collects(R.drawable.image_word,
                    "美国，欧盟，世界", "6423人浏览，243543人关注"));

    }

    private Context mContext;

    public MyAdapter(Context context) {
        mContext = context;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int i) {
        return myList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    LayoutInflater inflater;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View inflate;
        ViewHolder viewholder;
        if(convertView==null){
            inflate=inflater.inflate(R.layout.image_item, null);
            viewholder=new ViewHolder();
            viewholder.image= (ImageView) inflate.findViewById(R.id.image_group);
            viewholder.title= (TextView) inflate.findViewById(R.id.text_title);
            viewholder.numb= (TextView) inflate.findViewById(R.id.text_numb);
            inflate.setTag(viewholder);
        }
        else{
            inflate=convertView;
           viewholder= (ViewHolder) inflate.getTag();

        }
        Collects c = myList.get(position);
        viewholder.title.setText(c.getTitle());
        viewholder.image.setImageResource(c.getImage());
        viewholder.numb.setText(c.getCount());
        return inflate;
    }
    class ViewHolder{
        ImageView image;
        TextView title;
        TextView numb;
    }
}
