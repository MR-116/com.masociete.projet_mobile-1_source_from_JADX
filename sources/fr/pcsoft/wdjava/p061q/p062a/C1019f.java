package fr.pcsoft.wdjava.p061q.p062a;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.activite.C1056i;

/* renamed from: fr.pcsoft.wdjava.q.a.f */
public class C1019f extends C1018e {
    /* renamed from: z */
    private static final String[] f2917z = new String[]{C1019f.m7376z(C1019f.m7377z("~qD>}nCY\bhq")), C1019f.m7376z(C1019f.m7377z("\\fB\tik4T\u0019nxzDLpx4BldÙ\u001e}m}_\u0002<}q\u0010\u0000}9fÙ\u001fsuaD\u0005sw4TKõzfQ\u0002<iuBLuw`B\u0003oiqS\u0018uvz\u001e")), C1019f.m7376z(C1019f.m7377z("~qD>}n\\U\u0005{q`"))};

    /* renamed from: z */
    private static String m7376z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 25;
                    break;
                case 1:
                    i2 = 20;
                    break;
                case 2:
                    i2 = 48;
                    break;
                case 3:
                    i2 = 108;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7377z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 28);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public Point mo3295a(boolean z) {
        Point point = new Point();
        Activity a = C1056i.m7562a();
        if (a != null) {
            Display defaultDisplay = a.getWindowManager().getDefaultDisplay();
            if (z) {
                try {
                    point.x = ((Integer) Display.class.getMethod(f2917z[0], new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    point.y = ((Integer) Display.class.getMethod(f2917z[2], new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                } catch (Exception e) {
                    C0691a.m2857a(f2917z[1], e);
                    return super.mo3295a(z);
                }
            }
            defaultDisplay.getSize(point);
        }
        return point;
    }

    /* renamed from: a */
    public final boolean mo3296a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    /* renamed from: b */
    public void mo3297b(Activity activity, boolean z) {
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(z);
        }
    }

    /* renamed from: b */
    public final boolean mo3298b(View view, int i) {
        return view.canScrollVertically(i);
    }
}
