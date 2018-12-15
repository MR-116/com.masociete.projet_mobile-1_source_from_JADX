package fr.pcsoft.wdjava.ui.champs;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class lb implements OnScrollListener {
    final C1144d this$1;
    final kc val$this$0;

    lb(C1144d c1144d, kc kcVar) {
        this.this$1 = c1144d;
        this.val$this$0 = kcVar;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        Throwable th;
        boolean z = false;
        if (i != C1144d.access$000(this.this$1)) {
            this.this$1.setNotifyOnChange(false);
            try {
                if (this.this$1.this$0.Zc.mo3635w()) {
                    this.this$1.this$0.Zc.mo3618b(i / this.this$1.this$0.getMaxItemCountPerRow(), C1144d.access$000(this.this$1) / this.this$1.this$0.getMaxItemCountPerRow());
                }
                try {
                    C1144d.access$002(this.this$1, i);
                    this.this$1.setNotifyOnChange(true);
                    this.this$1.notifyDataSetChanged();
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                    this.this$1.setNotifyOnChange(true);
                    if (z) {
                        this.this$1.notifyDataSetChanged();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                this.this$1.setNotifyOnChange(true);
                if (z) {
                    this.this$1.notifyDataSetChanged();
                }
                throw th;
            }
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
