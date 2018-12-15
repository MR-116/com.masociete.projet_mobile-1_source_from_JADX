package fr.pcsoft.wdjava.ui.p080h;

import android.text.Spanned;
import android.widget.TextView;
import android.widget.TextView.BufferType;

/* renamed from: fr.pcsoft.wdjava.ui.h.g */
public class C1424g {
    /* renamed from: a */
    public static final Spanned m10030a(String str) {
        Object c1430m = new C1430m(null);
        C1426i.m10037a(str, c1430m);
        return c1430m;
    }

    /* renamed from: a */
    public static final void m10031a(TextView textView, String str) {
        if (C1426i.m10042c(str)) {
            Object c1430m = new C1430m(textView);
            C1426i.m10037a(str, c1430m);
            textView.setText(c1430m, BufferType.SPANNABLE);
            return;
        }
        textView.setText(str, BufferType.NORMAL);
    }
}
