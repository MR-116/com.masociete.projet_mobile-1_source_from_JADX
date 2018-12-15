package fr.pcsoft.wdjava.ui.utils;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.ListView;
import android.widget.SectionIndexer;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.p064a.C1034d;

/* renamed from: fr.pcsoft.wdjava.ui.utils.e */
class C1505e {
    /* renamed from: a */
    private static final int f4558a = C1511l.f4646t;
    /* renamed from: b */
    private static final int f4559b = 2000;
    /* renamed from: c */
    private static final byte f4560c = (byte) 2;
    /* renamed from: d */
    private static final int f4561d = 1;
    /* renamed from: g */
    private static final byte f4562g = (byte) 0;
    /* renamed from: i */
    private static final byte f4563i = (byte) 1;
    /* renamed from: m */
    private static final byte f4564m = (byte) -1;
    /* renamed from: p */
    private static final int f4565p = C1511l.f4645s;
    /* renamed from: r */
    private static final byte f4566r = (byte) 3;
    /* renamed from: s */
    private static final int f4567s = C1511l.f4629c;
    /* renamed from: z */
    private static final String f4568z = C1505e.m10462z(C1505e.m10463z("8k!)O\u0014q6<\u0003\u0014{%s"));
    /* renamed from: e */
    private int f4569e = -1;
    /* renamed from: f */
    private ListView f4570f;
    /* renamed from: h */
    private Paint f4571h;
    /* renamed from: j */
    private byte f4572j = (byte) 0;
    /* renamed from: k */
    private RectF f4573k;
    /* renamed from: l */
    private float f4574l = 1.0f;
    /* renamed from: n */
    private RectF f4575n;
    /* renamed from: o */
    private SectionIndexer f4576o = null;
    /* renamed from: q */
    private Handler f4577q;

    public C1505e(ListView listView, SectionIndexer sectionIndexer) {
        this.f4570f = listView;
        this.f4571h = new Paint();
        this.f4575n = new RectF();
        this.f4573k = new RectF();
        this.f4577q = new C1517r(this);
        if (sectionIndexer != null) {
            this.f4576o = sectionIndexer;
        } else {
            this.f4572j = (byte) -1;
        }
    }

    /* renamed from: a */
    private int m10459a(float f, float f2) {
        Object[] sections = this.f4576o.getSections();
        return (sections == null || sections.length == 0 || f2 < this.f4575n.top + ((float) f4567s)) ? 0 : f2 >= (this.f4575n.top + this.f4575n.height()) - ((float) f4567s) ? sections.length - 1 : (int) (((f2 - this.f4575n.top) - ((float) f4567s)) / ((this.f4575n.height() - ((float) (f4567s * 2))) / ((float) sections.length)));
    }

    /* renamed from: a */
    private void m10460a(byte b) {
        if (b < (byte) -1 || b > (byte) 3) {
            C0691a.m2856a(f4568z);
            return;
        }
        this.f4572j = b;
        this.f4577q.removeMessages(1);
        switch (this.f4572j) {
            case (byte) 1:
                this.f4574l = 0.0f;
                this.f4577q.sendEmptyMessage(1);
                return;
            case (byte) 3:
                this.f4574l = 1.0f;
                this.f4577q.sendEmptyMessageAtTime(1, SystemClock.uptimeMillis() + 2000);
                return;
            default:
                return;
        }
    }

    static void access$000(C1505e c1505e, byte b) {
        c1505e.m10460a(b);
    }

    static boolean access$100(C1505e c1505e, MotionEvent motionEvent) {
        return c1505e.m10461b(motionEvent);
    }

    static byte access$200(C1505e c1505e) {
        return c1505e.f4572j;
    }

    static float access$300(C1505e c1505e) {
        return c1505e.f4574l;
    }

    static float access$302(C1505e c1505e, float f) {
        c1505e.f4574l = f;
        return f;
    }

    static float access$318(C1505e c1505e, double d) {
        float f = (float) (((double) c1505e.f4574l) + d);
        c1505e.f4574l = f;
        return f;
    }

    static float access$326(C1505e c1505e, double d) {
        float f = (float) (((double) c1505e.f4574l) - d);
        c1505e.f4574l = f;
        return f;
    }

    static RectF access$400(C1505e c1505e) {
        return c1505e.f4575n;
    }

    static ListView access$500(C1505e c1505e) {
        return c1505e.f4570f;
    }

    /* renamed from: b */
    private final boolean m10461b(MotionEvent motionEvent) {
        return this.f4572j > (byte) 0 && motionEvent.getX() >= this.f4575n.left && motionEvent.getY() >= this.f4575n.top && motionEvent.getY() <= this.f4575n.top + this.f4575n.height();
    }

    /* renamed from: z */
    private static String m10462z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 125;
                    break;
                case 1:
                    i2 = 31;
                    break;
                case 2:
                    i2 = 64;
                    break;
                case 3:
                    i2 = 93;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10463z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 111);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m10464a() {
        if (this.f4572j == (byte) 0) {
            m10460a((byte) 1);
        } else if (this.f4572j == (byte) 3) {
            m10460a((byte) 3);
        }
    }

    /* renamed from: a */
    public void m10465a(int i, int i2, int i3, int i4) {
        this.f4575n = new RectF((float) ((i - f4567s) - f4558a), (float) f4567s, (float) (i - f4567s), (float) (i2 - f4567s));
    }

    /* renamed from: a */
    public void m10466a(Canvas canvas) {
        int i = 0;
        if (this.f4572j > (byte) 0) {
            this.f4571h.reset();
            this.f4571h.setAntiAlias(true);
            float f = (float) C1511l.f4645s;
            this.f4571h.setColor(C1034d.f2969b);
            this.f4571h.setAlpha((int) (255.0f * this.f4574l));
            this.f4571h.setStyle(Style.STROKE);
            canvas.drawRoundRect(this.f4575n, f, f, this.f4571h);
            this.f4571h.setStyle(Style.FILL_AND_STROKE);
            this.f4571h.setColor(-16777216);
            this.f4571h.setAlpha((int) (64.0f * this.f4574l));
            canvas.drawRoundRect(this.f4575n, f, f, this.f4571h);
            Object[] sections = this.f4576o.getSections();
            if (sections != null && sections.length > 0) {
                float measureText;
                if (this.f4569e >= 0) {
                    this.f4571h.reset();
                    this.f4571h.setAntiAlias(true);
                    this.f4571h.setTextSize((float) C1511l.m10532d(50.0f, 2));
                    measureText = this.f4571h.measureText(sections[this.f4569e].toString());
                    float descent = (((float) (f4565p * 2)) + this.f4571h.descent()) - this.f4571h.ascent();
                    int width = this.f4570f.getWidth();
                    int height = this.f4570f.getHeight();
                    this.f4573k = new RectF((((float) width) - descent) / 2.0f, (((float) height) - descent) / 2.0f, ((((float) width) - descent) / 2.0f) + descent, ((((float) height) - descent) / 2.0f) + descent);
                    this.f4571h.setColor(C1034d.f2969b);
                    this.f4571h.setAlpha(96);
                    this.f4571h.setShadowLayer(3.0f, 0.0f, 0.0f, Color.argb(64, 0, 0, 0));
                    canvas.drawRoundRect(this.f4573k, f, f, this.f4571h);
                    this.f4571h.setColor(-1);
                    this.f4571h.setAlpha(255);
                    this.f4571h.clearShadowLayer();
                    canvas.drawText(sections[this.f4569e].toString(), (((descent - measureText) / 2.0f) + this.f4573k.left) - 1.0f, ((this.f4573k.top + ((float) f4565p)) - this.f4571h.ascent()) + 1.0f, this.f4571h);
                }
                this.f4571h.reset();
                this.f4571h.setColor(-1);
                this.f4571h.setAlpha((int) (255.0f * this.f4574l));
                this.f4571h.setAntiAlias(true);
                this.f4571h.setTextSize((float) C1511l.m10532d(12.0f, 2));
                f = (this.f4575n.height() - ((float) (f4567s * 2))) / ((float) sections.length);
                measureText = (f - (this.f4571h.descent() - this.f4571h.ascent())) / 2.0f;
                int length = sections.length;
                while (i < length) {
                    String obj = sections[i].toString();
                    canvas.drawText(obj, ((((float) f4558a) - this.f4571h.measureText(obj)) / 2.0f) + this.f4575n.left, (((this.f4575n.top + ((float) f4567s)) + (((float) i) * f)) + measureText) - this.f4571h.ascent(), this.f4571h);
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m10467a(MotionEvent motionEvent) {
        switch (motionEvent.getAction() & 255) {
            case 0:
                if (m10461b(motionEvent)) {
                    m10460a((byte) 2);
                    this.f4569e = m10459a(motionEvent.getX(), motionEvent.getY());
                    this.f4570f.setSelection(this.f4576o.getPositionForSection(this.f4569e));
                    return true;
                }
                break;
            case 1:
                if (this.f4569e >= 0) {
                    this.f4569e = -1;
                }
                if (this.f4572j == (byte) 2) {
                    m10460a((byte) 3);
                    break;
                }
                break;
            case 2:
                if (this.f4569e >= 0 && m10461b(motionEvent)) {
                    this.f4569e = m10459a(motionEvent.getX(), motionEvent.getY());
                    this.f4570f.setSelection(this.f4576o.getPositionForSection(this.f4569e));
                    return true;
                }
        }
        return false;
    }

    /* renamed from: b */
    final byte m10468b() {
        return this.f4572j;
    }

    /* renamed from: c */
    public final void m10469c() {
        this.f4570f = null;
        this.f4576o = null;
        this.f4571h = null;
        this.f4575n = null;
        this.f4573k = null;
        if (this.f4577q != null) {
            this.f4577q.removeMessages(1);
            this.f4577q = null;
        }
    }
}
