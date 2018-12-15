package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.types.WDDate;
import java.util.Calendar;

public class zb implements Comparable {
    /* renamed from: b */
    private static long f2183b = 0;
    /* renamed from: c */
    private static zb f2184c = null;
    /* renamed from: a */
    private long f2185a;

    private zb(byte b, byte b2, short s) {
        this.f2185a = 0;
        this.f2185a = (long) ((((b2 & 255) << 8) | b) | ((65535 & s) << 16));
    }

    public zb(WDDate wDDate) {
        this((byte) wDDate.m2531r(), (byte) wDDate.m2529p(), (short) wDDate.m2530q());
        byte ceil = (byte) ((int) Math.ceil(((double) wDDate.m2531r()) / 7.0d));
        this.f2185a = ((((long) (ceil & 255)) << 40) | (((long) (wDDate.m2521g() & 255)) << 32)) | this.f2185a;
    }

    public zb(Calendar calendar) {
        this.f2185a = 0;
        int i = calendar.get(5);
        this.f2185a = (((long) ((i | ((hb.m3931f(calendar.get(2)) & 255) << 8)) | ((65535 & calendar.get(1)) << 16))) | (((long) (hb.m3936i(calendar.get(7)) & 255)) << 32)) | (((long) (((byte) ((int) Math.ceil(((double) i) / 7.0d))) & 255)) << 40);
    }

    /* renamed from: j */
    public static final zb m4197j() {
        long currentTimeMillis = System.currentTimeMillis();
        if (f2184c == null || currentTimeMillis - f2183b > 60000) {
            Calendar g = C0725i.m3077g();
            g.setTimeInMillis(currentTimeMillis);
            f2184c = new zb(g);
            f2183b = currentTimeMillis;
        }
        return f2184c;
    }

    /* renamed from: a */
    public int m4198a(zb zbVar) {
        return m4203b(zbVar) ? 1 : m4205c(zbVar) ? 0 : -1;
    }

    /* renamed from: a */
    public final short m4199a() {
        return (short) ((int) (65535 & (this.f2185a >> 16)));
    }

    /* renamed from: a */
    public final void m4200a(Calendar calendar) {
        calendar.set(m4199a(), hb.m3937j(m4204c()), m4207e());
    }

    /* renamed from: a */
    public final boolean m4201a(zb zbVar, zb zbVar2) {
        return (zbVar != null && zbVar.m4203b(this)) || (zbVar2 != null && m4203b(zbVar2));
    }

    /* renamed from: b */
    public final byte m4202b() {
        return (byte) ((int) (255 & (this.f2185a >> 32)));
    }

    /* renamed from: b */
    public boolean m4203b(zb zbVar) {
        short a = m4199a();
        byte c = m4204c();
        return a > zbVar.m4199a() || (a == zbVar.m4199a() && (c > zbVar.m4204c() || (c == zbVar.m4204c() && m4207e() > zbVar.m4207e())));
    }

    /* renamed from: c */
    public final byte m4204c() {
        return (byte) ((int) (255 & (this.f2185a >> 8)));
    }

    /* renamed from: c */
    public boolean m4205c(zb zbVar) {
        return zbVar != null && m4207e() == zbVar.m4207e() && m4204c() == zbVar.m4204c() && m4199a() == zbVar.m4199a();
    }

    public int compareTo(Object obj) {
        return m4198a((zb) obj);
    }

    /* renamed from: d */
    public final boolean m4206d() {
        byte b = (byte) ((int) (255 & (this.f2185a >> 48)));
        if (b == (byte) 0) {
            b = rb.m4126a(this) ? (byte) 2 : (byte) 1;
            this.f2185a |= ((long) (b & 255)) << 48;
        }
        return b == (byte) 2;
    }

    /* renamed from: e */
    public final byte m4207e() {
        return (byte) ((int) (255 & this.f2185a));
    }

    public boolean equals(Object obj) {
        return obj instanceof zb ? m4205c((zb) obj) : super.equals(obj);
    }

    /* renamed from: f */
    public boolean m4208f() {
        return m4202b() == (byte) 7;
    }

    /* renamed from: g */
    public final byte m4209g() {
        return (byte) ((int) (255 & (this.f2185a >> 40)));
    }

    /* renamed from: h */
    public boolean m4210h() {
        return m4202b() == (byte) 6;
    }

    public int hashCode() {
        return (((m4199a() & 65535) << 16) | ((m4204c() & 255) << 8)) | (m4207e() & 255);
    }

    /* renamed from: i */
    public String m4211i() {
        return new StringBuffer(8).append(C0725i.m3024a(m4199a(), 4)).append(C0725i.m3024a(m4204c(), 2)).append(C0725i.m3024a(m4207e(), 2)).toString();
    }

    public String toString() {
        return m4207e() + "/" + m4204c() + "/" + m4199a();
    }
}
