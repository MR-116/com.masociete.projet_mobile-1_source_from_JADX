package fr.pcsoft.wdjava.ui.actionbar;

import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.lang.reflect.Field;

/* renamed from: fr.pcsoft.wdjava.ui.actionbar.l */
class C1045l implements Runnable {
    /* renamed from: z */
    private static final String[] f3002z = new String[]{C1045l.m7534z(C1045l.m7535z("n;\u000e\u0007<v\u0001\u001b\u001e\u0010U\u001c\n\u0006")), C1045l.m7534z(C1045l.m7535z("J\u0018\u001f\u001e\rp\u001c\r\u001d\u001b#\u0011\nQ\fê\u0016\u001a\u0001q\u0010\u001dQ\u0012$\u001c\u0001\u0002\nb\u001b\f\u0014^g\u0010O0\u001dw\u001c\u0000\u001f<b\u00079\u0018\u001btU\u000e\u0002\rl\u0016\u0006\u001b#O\u001dYB\u0016\u001b\u0018\u0011m7\u000e\u0003^s\u0014\u001dQ\u0017m\u0001\u001d\u001e\rs\u0010\f\u0005\u0017l\u001bA"))};
    final WDActionBar this$0;

    C1045l(WDActionBar wDActionBar) {
        this.this$0 = wDActionBar;
    }

    /* renamed from: z */
    private static String m7534z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 3;
                    break;
                case 1:
                    i2 = 117;
                    break;
                case 2:
                    i2 = 111;
                    break;
                case 3:
                    i2 = 113;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7535z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 126);
        }
        return toCharArray;
    }

    public void run() {
        try {
            Field declaredField = this.this$0.f849p.getClass().getDeclaredField(f3002z[0]);
            declaredField.setAccessible(true);
            Drawable drawable = ((ImageButton) declaredField.get(this.this$0.f849p)).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                this.this$0.transformDrawable(drawable);
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2857a(f3002z[1], e2);
        }
    }
}
