package fr.pcsoft.wdjava.ui.p079e;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import android.widget.RemoteViews;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.e.b */
public class C1399b implements C1397c {
    /* renamed from: j */
    private static C1399b f4135j = null;
    /* renamed from: z */
    private static final String[] f4136z = new String[]{C1399b.m9945z(C1399b.m9946z("4h\u000b\u001ag)f\u0006\u0010")), C1399b.m9945z(C1399b.m9946z("*f\u000b\u00069*b\u0017\u001crts\r\u001cz")), C1399b.m9945z(C1399b.m9946z("*f\u000b\u00069*b\u0017\u001cr")), C1399b.m9945z(C1399b.m9946z("+h\u0007\u001a`6'\u0011\u001d}7")), C1399b.m9945z(C1399b.m9946z("+h\u0007\u001a`6'\t\u001cs1s")), C1399b.m9945z(C1399b.m9946z("=u\n\u001cpyt\u0000\u0007}?")), C1399b.m9945z(C1399b.m9946z("+h\u0007\u001a`6'\u0006\u001az=b\u000b\u0006q=")), C1399b.m9945z(C1399b.m9946z("*f\u000b\u00069*b\u0017\u001crtd\n\u001bp<i\u0016\u0010p")), C1399b.m9945z(C1399b.m9946z("*f\u000b\u00069*b\u0017\u001crtk\f\u0012|-")), C1399b.m9945z(C1399b.m9946z("=u\n\u001cp")), C1399b.m9945z(C1399b.m9946z("+h\u0007\u001a`6")), C1399b.m9945z(C1399b.m9946z("*b\u0017\u001cr")), C1399b.m9945z(C1399b.m9946z("=u\n\u001cpyt\u0004\u001bgyj\n\u001b{")), C1399b.m9945z(C1399b.m9946z("*b\u0011%u0i\u00113x8`\u0016")), C1399b.m9945z(C1399b.m9946z("*b\u0011!q!s6\u001cn<"))};
    /* renamed from: f */
    private int f4137f;
    /* renamed from: g */
    private String f4138g;
    /* renamed from: h */
    public Typeface f4139h;
    /* renamed from: i */
    private int f4140i;

    public C1399b(String str, int i, int i2) {
        this.f4138g = str;
        this.f4137f = i;
        this.f4140i = i2;
        int i3 = 0;
        if (mo3762c()) {
            i3 = 1;
        }
        if (mo3761b()) {
            i3 |= 2;
        }
        if (!C0808l.m4053k(this.f4138g)) {
            this.f4139h = C1399b.m9943a(this.f4138g, i3);
        }
        if (this.f4139h == null) {
            this.f4139h = Typeface.defaultFromStyle(i3);
        }
    }

    /* renamed from: a */
    public static final Typeface m9943a(String str, int i) {
        String str2 = null;
        String toLowerCase = str.toLowerCase();
        if (toLowerCase.startsWith(f4136z[9])) {
            str2 = toLowerCase.startsWith(f4136z[12]) ? f4136z[0] : toLowerCase.startsWith(f4136z[5]) ? f4136z[11] : f4136z[2];
        }
        if (toLowerCase.startsWith(f4136z[10])) {
            int p = kb.m3986p();
            if (p >= C0657a.ICE_CREAM_SANDWICH.getNumero()) {
                if (toLowerCase.startsWith(f4136z[6])) {
                    if (p >= C0657a.JELLY_BEAN.getNumero()) {
                        str2 = f4136z[7];
                    }
                } else if (toLowerCase.startsWith(f4136z[4])) {
                    if (p >= C0657a.JELLY_BEAN.getNumero()) {
                        str2 = f4136z[8];
                    }
                } else if (!toLowerCase.startsWith(f4136z[3])) {
                    str2 = f4136z[2];
                } else if (p >= C0657a.JELLY_BEAN_MR1.getNumero()) {
                    str2 = f4136z[1];
                }
            }
        }
        if (!C0808l.m4053k(str2)) {
            Typeface create = Typeface.create(str2, i);
            if (create != null) {
                return create;
            }
        }
        return C0743a.m3197a(str, i);
    }

    /* renamed from: i */
    public static C1399b m9944i() {
        if (f4135j == null) {
            f4135j = new C1399b("", 0, 10);
        }
        return f4135j;
    }

    /* renamed from: z */
    private static String m9945z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 89;
                    break;
                case 1:
                    i2 = 7;
                    break;
                case 2:
                    i2 = 101;
                    break;
                case 3:
                    i2 = 117;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9946z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 20);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final int mo3760a() {
        return this.f4140i;
    }

    /* renamed from: a */
    public final int m9948a(String str, Paint paint) {
        if (paint == null) {
            paint = new Paint();
        }
        m9952a(paint);
        return (int) Math.ceil((double) paint.measureText(str));
    }

    /* renamed from: a */
    public final int m9949a(String str, View view) {
        Paint paint = null;
        if (view instanceof TextView) {
            paint = ((TextView) view).getPaint();
        }
        return m9948a(str, paint);
    }

    /* renamed from: a */
    public C1399b m9950a(float f) {
        return f == ((float) this.f4140i) ? this : C1400d.m9965a(this.f4138g, f, this.f4137f);
    }

    /* renamed from: a */
    public C1399b m9951a(int i) {
        return i == this.f4137f ? this : C1400d.m9965a(this.f4138g, (float) this.f4140i, i);
    }

    /* renamed from: a */
    public final void m9952a(Paint paint) {
        boolean z = true;
        paint.setTypeface(this.f4139h);
        int style = ((mo3762c() ? 1 : 0) + (mo3761b() ? 2 : 0)) & (this.f4139h.getStyle() ^ -1);
        if ((style & 1) == 0) {
            z = false;
        }
        paint.setFakeBoldText(z);
        paint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        paint.setUnderlineText(mo3766g());
        paint.setStrikeThruText(mo3767h());
        paint.setTextSize((float) C1511l.m10532d((float) mo3760a(), 2));
    }

    /* renamed from: a */
    public final void m9953a(RemoteViews remoteViews, int i) {
        remoteViews.setFloat(i, f4136z[14], (float) mo3760a());
        int i2 = 0;
        if (mo3767h()) {
            i2 = 16;
        }
        if (mo3766g()) {
            i2 |= 8;
        }
        remoteViews.setInt(i, f4136z[13], i2);
    }

    /* renamed from: a */
    public final void m9954a(TextView textView) {
        int i = 0;
        Typeface j = m9962j();
        int i2 = mo3762c() ? 1 : 0;
        if (mo3761b()) {
            i = 2;
        }
        textView.setTypeface(j, i2 + i);
        textView.setTextSize(1, (float) mo3760a());
        int paintFlags = textView.getPaintFlags();
        i2 = mo3767h() ? paintFlags | 16 : paintFlags & -17;
        i2 = mo3766g() ? i2 | 8 : i2 & -9;
        if (paintFlags != i2) {
            textView.setPaintFlags(i2);
        }
    }

    /* renamed from: b */
    public final boolean mo3761b() {
        return (this.f4137f & 2) == 2;
    }

    /* renamed from: c */
    public final boolean mo3762c() {
        return (this.f4137f & 1) == 1;
    }

    /* renamed from: d */
    public final String mo3763d() {
        return this.f4138g;
    }

    /* renamed from: e */
    public final int mo3764e() {
        return this.f4137f;
    }

    /* renamed from: f */
    public final boolean mo3765f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo3766g() {
        return (this.f4137f & 4) == 4;
    }

    /* renamed from: h */
    public final boolean mo3767h() {
        return (this.f4137f & 8) == 8;
    }

    /* renamed from: j */
    public final Typeface m9962j() {
        return this.f4139h;
    }
}
