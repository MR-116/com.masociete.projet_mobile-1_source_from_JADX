package fr.pcsoft.wdjava.ui.pulltorefresh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.s */
final class C1486s extends FrameLayout implements C0533c {
    /* renamed from: z */
    private static final String[] f4480z = new String[]{C1486s.m10329z(C1486s.m10330z("A;Z=b#:Z.s-6M4a0,L9")), C1486s.m10329z(C1486s.m10330z("A9J=k==P.u'/M4t*")), C1486s.m10329z(C1486s.m10330z("A;Z7u':W8i%"))};
    /* renamed from: a */
    private int f4481a = 0;
    /* renamed from: b */
    private TextView f4482b = null;

    public C1486s(Context context) {
        super(context);
        this.f4482b = new TextView(context);
        this.f4482b.setText(C0745b.m3224c(f4480z[1], new String[0]));
        this.f4482b.setGravity(17);
        addView(this.f4482b, new LayoutParams(-1, -1));
        measure(-2, -2);
        this.f4481a = getMeasuredHeight() + 80;
    }

    /* renamed from: z */
    private static String m10329z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 98;
                    break;
                case 1:
                    i2 = 105;
                    break;
                case 2:
                    i2 = 31;
                    break;
                case 3:
                    i2 = 113;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10330z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 39);
        }
        return toCharArray;
    }

    public int getStandardViewHeight() {
        return this.f4481a;
    }

    public View getView() {
        return this;
    }

    public void onHeightChangedWhilePulling(int i, int i2) {
    }

    public void onPullToRefresh() {
        this.f4482b.setText(C0745b.m3224c(f4480z[1], new String[0]));
    }

    public void onRefreshing() {
        this.f4482b.setText(C0745b.m3224c(f4480z[2], new String[0]));
    }

    public void onReleaseToRefresh() {
        this.f4482b.setText(C0745b.m3224c(f4480z[0], new String[0]));
    }

    public void release() {
        this.f4482b = null;
    }
}
