package fr.pcsoft.wdjava.ui.p080h;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p079e.C1400d;
import java.lang.ref.WeakReference;

/* renamed from: fr.pcsoft.wdjava.ui.h.m */
final class C1430m extends SpannableStringBuilder implements C1418f {
    /* renamed from: z */
    private static final String f4240z = C1430m.m10046z(C1430m.m10047z(">{\u000ek7\u00154\u0007le\u0000u\u0011h(`\u0011l6P}\r$\u001c}\u0007lk"));
    /* renamed from: a */
    WeakReference<TextView> f4241a = null;

    public C1430m(TextView textView) {
        if (textView != null) {
            this.f4241a = new WeakReference(textView);
        }
    }

    /* renamed from: z */
    private static String m10046z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 20;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 9;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10047z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 69);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3773a(C1425h c1425h, double d) {
        int length = length();
        switch (C1429l.f4239a[c1425h.ordinal()]) {
            case 6:
                setSpan(new AbsoluteSizeSpan((int) C1400d.m9963a((int) d, (gc) WDAppelContexte.getContexte().m2722h()), true), length, length, 18);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo3774a(C1425h c1425h, int i) {
        int length = length();
        switch (C1429l.f4239a[c1425h.ordinal()]) {
            case 1:
                setSpan(new BackgroundColorSpan(i), length, length, 18);
                return;
            case 2:
                setSpan(new ForegroundColorSpan(i), length, length, 18);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo3775a(C1425h c1425h, String str) {
        int length = length();
        switch (C1429l.f4239a[c1425h.ordinal()]) {
            case 7:
                Typeface a = C1399b.m9943a(str, 0);
                if (a != null) {
                    setSpan(new C1422d(a), length, length, 18);
                    return;
                }
                return;
            case 8:
                Drawable a2 = !C0808l.m4053k(str) ? C1093d.m7924a(str) : null;
                if (a2 != null) {
                    a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
                    append("ￌ");
                    setSpan(new C1427j(a2), length, length(), 33);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo3776a(C1425h c1425h, boolean z) {
        int i = 0;
        int length = length();
        switch (C1429l.f4239a[c1425h.ordinal()]) {
            case 3:
            case 4:
                if (z) {
                    setSpan(c1425h == C1425h.BOLD ? new StyleSpan(1) : new StyleSpan(2), length, length, 18);
                    return;
                }
                StyleSpan[] styleSpanArr = (StyleSpan[]) getSpans(0, length, StyleSpan.class);
                if (styleSpanArr != null) {
                    i = styleSpanArr.length;
                }
                if (i > 0) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        StyleSpan styleSpan = styleSpanArr[i2];
                        if (styleSpan.getStyle() == (c1425h == C1425h.BOLD ? 1 : 2)) {
                            int spanStart = getSpanStart(styleSpan);
                            removeSpan(styleSpan);
                            setSpan(styleSpan, spanStart, length, 33);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                if (z) {
                    setSpan(new UnderlineSpan(), length, length, 18);
                    return;
                }
                UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) getSpans(0, length, UnderlineSpan.class);
                if (underlineSpanArr != null) {
                    i = underlineSpanArr.length;
                }
                if (i > 0) {
                    Object obj = underlineSpanArr[i - 1];
                    i = getSpanStart(obj);
                    removeSpan(obj);
                    setSpan(obj, i, length, 33);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo3777a(C1425h c1425h, String... strArr) {
        boolean z = true;
        int length = length();
        switch (C1429l.f4239a[c1425h.ordinal()]) {
            case 9:
                C0691a.m2860a(strArr.length == 4, f4240z);
                WDCallback a = WDCallback.m2240a(strArr[1], -1);
                append(strArr[0]);
                String str = strArr[2];
                if (C0725i.m3064d(strArr[3]) != 0) {
                    z = false;
                }
                setSpan(new C1421c(a, str, z), length, length(), 33);
                TextView textView = this.f4241a != null ? (TextView) this.f4241a.get() : null;
                if (textView != null && textView.getMovementMethod() != LinkMovementMethod.getInstance()) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setHighlightColor(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo3778a(String str) {
        append(str);
    }
}
