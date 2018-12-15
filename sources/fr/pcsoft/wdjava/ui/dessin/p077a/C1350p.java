package fr.pcsoft.wdjava.ui.dessin.p077a;

import android.graphics.Bitmap;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.p */
public class C1350p extends C1349o {
    /* renamed from: a */
    private int[] f4017a = new int[]{0, 0, 0};
    /* renamed from: b */
    private int[] f4018b = new int[]{0, 0, 0};
    /* renamed from: c */
    private int f4019c = 0;
    /* renamed from: d */
    private Queue<C1354t> f4020d;
    /* renamed from: e */
    private int f4021e = 0;
    /* renamed from: f */
    private boolean[] f4022f;
    /* renamed from: g */
    private int[] f4023g = null;
    /* renamed from: h */
    private int f4024h = -1;
    /* renamed from: i */
    private int f4025i = 0;

    /* renamed from: a */
    private final boolean m9711a(int i) {
        int i2 = (this.f4023g[i] >>> 16) & 255;
        int i3 = (this.f4023g[i] >>> 8) & 255;
        int i4 = this.f4023g[i] & 255;
        return (i2 < this.f4017a[0] - this.f4018b[0] || i2 > this.f4017a[0] + this.f4018b[0] || i3 < this.f4017a[1] - this.f4018b[1] || i3 > this.f4017a[1] + this.f4018b[1] || i4 < this.f4017a[2] - this.f4018b[2] || i4 > this.f4017a[2] + this.f4018b[2]) ? false : this.f4024h == -1 || this.f4023g[i] != this.f4024h;
    }

    /* renamed from: a */
    protected void m9712a(int i, int i2) {
        int i3 = (this.f4025i * i2) + i;
        int i4 = i;
        do {
            this.f4023g[i3] = this.f4021e;
            this.f4022f[i3] = true;
            i4--;
            i3--;
            if (i4 < 0 || this.f4022f[i3]) {
                i4++;
                i3 = (this.f4025i * i2) + i;
            }
        } while (m9711a(i3));
        i4++;
        i3 = (this.f4025i * i2) + i;
        do {
            this.f4023g[i3] = this.f4021e;
            this.f4022f[i3] = true;
            i++;
            i3++;
            if (i >= this.f4025i || this.f4022f[i3]) {
                this.f4020d.offer(new C1354t(i4, i - 1, i2));
            }
        } while (m9711a(i3));
        this.f4020d.offer(new C1354t(i4, i - 1, i2));
    }

    /* renamed from: a */
    public final void mo3729a(Bitmap bitmap, int i, int i2, int i3, int i4) {
        this.f4025i = bitmap.getWidth();
        this.f4019c = bitmap.getHeight();
        this.f4021e = i3;
        this.f4024h = i4;
        this.f4023g = new int[(this.f4025i * this.f4019c)];
        bitmap.getPixels(this.f4023g, 0, this.f4025i, 1, 1, this.f4025i - 1, this.f4019c - 1);
        this.f4022f = new boolean[this.f4023g.length];
        this.f4020d = new LinkedList();
        int i5 = this.f4023g[(this.f4025i * i2) + i];
        this.f4017a[0] = (i5 >> 16) & 255;
        this.f4017a[1] = (i5 >> 8) & 255;
        this.f4017a[2] = i5 & 255;
        m9712a(i, i2);
        while (this.f4020d.size() > 0) {
            C1354t c1354t = (C1354t) this.f4020d.remove();
            int i6 = (this.f4025i * (c1354t.f4029b + 1)) + c1354t.f4030c;
            int i7 = c1354t.f4030c + (this.f4025i * (c1354t.f4029b - 1));
            int i8 = c1354t.f4029b - 1;
            int i9 = c1354t.f4029b + 1;
            for (int i10 = c1354t.f4030c; i10 <= c1354t.f4028a; i10++) {
                if (c1354t.f4029b > 0 && !this.f4022f[i7] && m9711a(i7)) {
                    m9712a(i10, i8);
                }
                if (c1354t.f4029b < this.f4019c - 1 && !this.f4022f[i6] && m9711a(i6)) {
                    m9712a(i10, i9);
                }
                i6++;
                i7++;
            }
        }
        bitmap.setPixels(this.f4023g, 0, this.f4025i, 1, 1, this.f4025i - 1, this.f4019c - 1);
    }
}
