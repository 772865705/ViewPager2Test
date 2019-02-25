package zy.com.vp2test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> l = new ArrayList<>(4);
        l.add("我是一");
        l.add("我是二");
        l.add("我是三");
        l.add("我是四");

        ViewPager2 vp2 = findViewById(R.id.vp);
        vp2.setAdapter(new VP2Adapter(this,l));
        vp2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);

//        vp2.setAdapter(new FragmentStateAdapter(getSupportFragmentManager()) {
//            @NonNull
//            @Override
//            public Fragment getItem(int position) {
//                return null;
//            }
//
//            @Override
//            public int getItemCount() {
//                return 0;
//            }
//        });
    }
}
