package fr.pcsoft.wdjava.ui.utils;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

class bb extends PagerAdapter {
    final C1510k this$0;

    bb(C1510k c1510k) {
        this.this$0 = c1510k;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.this$0.removeViewAt(i);
    }

    public int getCount() {
        return 3;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view = (View) this.this$0.f4626b.get(i);
        if (i >= this.this$0.getChildCount()) {
            i = this.this$0.getChildCount();
        }
        this.this$0.addView(view, i);
        return view;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
