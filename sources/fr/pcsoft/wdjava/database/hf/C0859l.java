package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: fr.pcsoft.wdjava.database.hf.l */
public class C0859l implements C0542t, Cloneable {
    public static final float ee = 0.9f;
    private static final String[] ke = new String[]{C0859l.m6026z(C0859l.m6027z("IT5/*")), C0859l.m6026z(C0859l.m6027z("lZ4, \\T7(*\u000f[62o[G6)9ÆPy8.AFy0*\u000fS0?'FP+r")), C0859l.m6026z(C0859l.m6027z("[G,9")), C0859l.m6026z(C0859l.m6027z("jG+9:]\u0015=9oLY62.HPy8hZ[y>:IS<.oKPy,.]V6)=\\\u001b"))};
    private int[] Rd;
    private eb Sd;
    private boolean Td;
    private boolean Ud;
    private boolean Vd;
    private boolean Wd;
    private int Xd;
    private boolean Yd;
    private int Zd;
    private int ae;
    private int be;
    private String ce;
    private boolean de;
    private boolean fe;
    private HashMap ge;
    private Object[] he;
    private int ie;
    private Object[] je;

    public C0859l(eb ebVar, int i) {
        this.je = new Object[0];
        this.ae = 0;
        this.Vd = false;
        this.Sd = null;
        this.ce = null;
        this.Wd = false;
        this.de = true;
        this.fe = false;
        this.Td = false;
        this.ge = null;
        this.he = null;
        this.Zd = 0;
        this.Rd = null;
        this.ie = -1;
        this.Ud = true;
        this.Yd = false;
        this.Xd = 50;
        this.be = -1;
        this.Sd = ebVar;
        this.Zd = i;
    }

    public C0859l(eb ebVar, int i, String str, boolean z, boolean z2) {
        this.je = new Object[0];
        this.ae = 0;
        this.Vd = false;
        this.Sd = null;
        this.ce = null;
        this.Wd = false;
        this.de = true;
        this.fe = false;
        this.Td = false;
        this.ge = null;
        this.he = null;
        this.Zd = 0;
        this.Rd = null;
        this.ie = -1;
        this.Ud = true;
        this.Yd = false;
        this.Xd = 50;
        this.be = -1;
        this.Sd = ebVar;
        this.Zd = i;
        this.ce = str;
        this.Wd = z;
        this.Td = z2;
    }

    /* renamed from: z */
    private static String m6026z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 47;
                    break;
                case 1:
                    i2 = 53;
                    break;
                case 2:
                    i2 = 89;
                    break;
                case 3:
                    i2 = 92;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6027z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 79);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0859l m6028a(eb ebVar) {
        try {
            C0859l c0859l = (C0859l) super.clone();
            this.Sd = ebVar;
            if (this.je != null) {
                c0859l.je = (Object[]) this.je.clone();
            }
            if (this.ge != null) {
                c0859l.ge = (HashMap) this.ge.clone();
            }
            if (this.he != null) {
                c0859l.he = (Object[]) this.he.clone();
            }
            if (this.Rd == null) {
                return c0859l;
            }
            c0859l.Rd = (int[]) this.Rd.clone();
            return c0859l;
        } catch (CloneNotSupportedException e) {
            throw e;
        } catch (CloneNotSupportedException e2) {
            throw e2;
        } catch (CloneNotSupportedException e22) {
            throw e22;
        } catch (CloneNotSupportedException e222) {
            throw e222;
        } catch (Exception e3) {
            C0691a.m2863b(ke[3], e3);
            return this;
        }
    }

    /* renamed from: a */
    public void m6029a(int i) {
        if (this.je != null) {
            int length = this.je.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.je[i2] = null;
            }
            this.je = new Object[0];
        }
        this.Rd = null;
        this.be = -1;
        this.ae = 0;
        this.Zd = i;
        this.fe = false;
        this.Vd = false;
        this.Yd = false;
        this.de = true;
    }

    /* renamed from: a */
    public void m6030a(Integer num) {
        if (this.ge != null) {
            this.ge.remove(num);
        }
    }

    /* renamed from: a */
    public void m6031a(Integer num, int i, boolean z) {
        if (this.ge == null) {
            m6029a(i);
            this.he = null;
            return;
        }
        C0864q c0864q = (C0864q) this.ge.get(num);
        if (this.be == -1 || num.intValue() < this.be || c0864q == null) {
            m6029a(i);
            m6043b(true);
            if (c0864q == null || c0864q.m6087b() == null) {
                this.he = null;
            } else {
                this.he = c0864q.m6087b();
            }
            if (!z) {
                m6030a(num);
                return;
            }
            return;
        }
        this.ae = c0864q.m6086a();
        this.he = c0864q.m6087b();
        if (!z) {
            m6030a(num);
        }
    }

    /* renamed from: a */
    public void m6032a(String str) {
        this.ce = str;
    }

    /* renamed from: a */
    public void m6033a(boolean z) {
        this.Vd = z;
    }

    /* renamed from: a */
    public void m6034a(Object[] objArr) {
        this.he = objArr;
    }

    /* renamed from: a */
    public void m6035a(Object[] objArr, int i) {
        if (i == 0) {
            this.je = new Object[this.Xd];
        }
        if (i >= this.Xd) {
            this.Xd *= 2;
            Object obj = new Object[this.Xd];
            System.arraycopy(this.je, 0, obj, 0, this.je.length);
            this.je = obj;
        }
        this.je[i] = objArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m6036a(java.lang.Object r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        if (r8 != 0) goto L_0x000d;
    L_0x0004:
        r0 = r7.ce;
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        r0 = r1;
    L_0x0009:
        r2 = r0;
    L_0x000a:
        return r2;
    L_0x000b:
        r0 = r2;
        goto L_0x0009;
    L_0x000d:
        r0 = r8.toString();
        r3 = r7.Sd;
        r3 = r3.m5848f();
        switch(r3) {
            case 11: goto L_0x0081;
            case 14: goto L_0x006c;
            case 37: goto L_0x0096;
            default: goto L_0x001a;
        };
    L_0x001a:
        r3 = r0;
    L_0x001b:
        r0 = r7.Sd;
        r0 = r0.m5811M();
        if (r0 != 0) goto L_0x002b;
    L_0x0023:
        r0 = r7.Sd;
        r0 = r0.m5856m();
        if (r0 == 0) goto L_0x00af;
    L_0x002b:
        r0 = r1;
    L_0x002c:
        r4 = r7.Sd;
        r4 = r4.m5853j();
        if (r4 == 0) goto L_0x00b5;
    L_0x0034:
        r4 = r7.Sd;
        r5 = r4.m5812N();
    L_0x003a:
        r4 = r5.hasNext();
        if (r4 == 0) goto L_0x00b5;
    L_0x0040:
        r0 = r5.next();
        r0 = r0.toString();
        r4 = r7.Sd;
        r4 = r4.m5799A();
        r0 = r4.mo2721b(r0);
        r0 = (fr.pcsoft.wdjava.database.hf.eb) r0;
        if (r0 == 0) goto L_0x00b2;
    L_0x0056:
        r4 = r1;
    L_0x0057:
        r6 = ke;
        r6 = r6[r1];
        fr.pcsoft.wdjava.core.debug.C0691a.m2860a(r4, r6);
        r4 = r0.m5811M();
        if (r4 != 0) goto L_0x006a;
    L_0x0064:
        r0 = r0.m5856m();
        if (r0 == 0) goto L_0x00b4;
    L_0x006a:
        r0 = r1;
        goto L_0x003a;
    L_0x006c:
        r3 = r8 instanceof java.sql.Timestamp;
        if (r3 == 0) goto L_0x001a;
    L_0x0070:
        r0 = new java.sql.Date;
        r8 = (java.sql.Timestamp) r8;
        r4 = r8.getTime();
        r0.<init>(r4);
        r0 = r0.toString();
        r3 = r0;
        goto L_0x001b;
    L_0x0081:
        r3 = r8 instanceof java.sql.Timestamp;
        if (r3 == 0) goto L_0x001a;
    L_0x0085:
        r0 = new java.sql.Time;
        r8 = (java.sql.Timestamp) r8;
        r4 = r8.getTime();
        r0.<init>(r4);
        r0 = r0.toString();
        r3 = r0;
        goto L_0x001b;
    L_0x0096:
        r3 = r8 instanceof java.lang.Number;
        if (r3 == 0) goto L_0x001a;
    L_0x009a:
        r8 = (java.lang.Number) r8;
        r0 = r8.intValue();
        if (r0 != 0) goto L_0x00a9;
    L_0x00a2:
        r0 = ke;
        r0 = r0[r2];
    L_0x00a6:
        r3 = r0;
        goto L_0x001b;
    L_0x00a9:
        r0 = ke;
        r3 = 2;
        r0 = r0[r3];
        goto L_0x00a6;
    L_0x00af:
        r0 = r2;
        goto L_0x002c;
    L_0x00b2:
        r4 = r2;
        goto L_0x0057;
    L_0x00b4:
        r0 = r2;
    L_0x00b5:
        if (r0 == 0) goto L_0x00de;
    L_0x00b7:
        r0 = r7.ce;
        if (r0 == 0) goto L_0x00db;
    L_0x00bb:
        r0 = r7.Wd;
        if (r0 == 0) goto L_0x00c7;
    L_0x00bf:
        r0 = r7.ce;
        r0 = r3.compareToIgnoreCase(r0);
        if (r0 == 0) goto L_0x00db;
    L_0x00c7:
        r0 = r7.Wd;
        if (r0 != 0) goto L_0x000a;
    L_0x00cb:
        r0 = r3.toLowerCase();
        r3 = r7.ce;
        r3 = r3.toLowerCase();
        r0 = r0.startsWith(r3);
        if (r0 == 0) goto L_0x000a;
    L_0x00db:
        r2 = r1;
        goto L_0x000a;
    L_0x00de:
        r0 = r7.ce;
        if (r0 == 0) goto L_0x00ea;
    L_0x00e2:
        r0 = r7.ce;
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x000a;
    L_0x00ea:
        r2 = r1;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.l.a(java.lang.Object):boolean");
    }

    /* renamed from: a */
    public Object[] m6037a() {
        return this.je;
    }

    /* renamed from: a */
    public Object[] m6038a(int i, db dbVar) {
        int i2;
        int i3 = this.ae - i;
        if (this.Rd != null) {
            for (i2 = this.ie; i2 >= 0; i2--) {
                int i4 = this.Rd[i2];
                if (i4 <= this.ae && i4 >= i3) {
                    i3--;
                }
            }
        }
        i2 = i3;
        if (i2 >= 0 && i2 < this.je.length) {
            Object[] objArr = (Object[]) this.je[i2];
            if (objArr != null) {
                dbVar.m3708g(false);
                dbVar.m3684c(true);
                this.ae = i2;
                this.he = objArr;
                return objArr;
            }
        }
        dbVar.m3708g(true);
        dbVar.m3684c(false);
        return null;
    }

    /* renamed from: a */
    public Object[] m6039a(db dbVar) {
        int length = this.je.length - 1;
        while (m6048c(length)) {
            length--;
        }
        if (length >= 0 && length < this.je.length) {
            Object[] objArr = (Object[]) this.je[length];
            if (objArr != null) {
                dbVar.m3708g(false);
                this.ae = length;
                if (this.Sd.m5853j()) {
                    dbVar.m3684c(m6036a(WDHF_Manager.m5128b(this.Sd.m5799A(), this.Sd, this.Sd.m5831a(objArr))));
                } else {
                    dbVar.m3684c(m6036a(objArr[this.Sd.m5854k()]));
                }
                if (!this.Td || dbVar.m3724o()) {
                    this.he = objArr;
                    return this.he;
                }
                dbVar.m3708g(true);
                return null;
            }
        }
        dbVar.m3708g(true);
        dbVar.m3684c(false);
        return null;
    }

    /* renamed from: b */
    public void m6040b() {
        if (this.je != null) {
            int length = this.je.length;
            for (int i = 0; i < length; i++) {
                this.je[i] = null;
            }
            this.je = null;
        }
        this.Sd = null;
        this.ce = null;
        if (this.ge != null) {
            this.ge.clear();
            this.ge = null;
        }
        this.he = null;
        this.Rd = null;
    }

    /* renamed from: b */
    public void m6041b(int i) {
        this.Xd = i;
    }

    /* renamed from: b */
    public void m6042b(Integer num) {
        if (this.ge == null) {
            this.ge = new HashMap();
        }
        Object[] objArr = null;
        if (this.he != null) {
            objArr = this.he;
        }
        C0864q c0864q = new C0864q(this, objArr, this.ae);
        if (this.be == -1) {
            this.be = num.intValue();
        }
        this.ge.put(num, c0864q);
    }

    /* renamed from: b */
    public void m6043b(boolean z) {
        this.Yd = z;
    }

    /* renamed from: b */
    public Object[] m6044b(int i, db dbVar) {
        int i2;
        int i3 = this.ae + i;
        if (this.Rd != null) {
            i2 = i3;
            for (i3 = 0; i3 <= this.ie; i3++) {
                int i4 = this.Rd[i3];
                if (i4 >= this.ae && i4 <= i2) {
                    i2++;
                }
            }
        } else {
            i2 = i3;
        }
        if (i2 >= 0 && i2 < this.je.length) {
            Object[] objArr = (Object[]) this.je[i2];
            if (objArr != null) {
                dbVar.m3708g(false);
                dbVar.m3684c(true);
                this.ae = i2;
                this.he = objArr;
                return objArr;
            }
        }
        dbVar.m3708g(true);
        dbVar.m3684c(false);
        return null;
    }

    /* renamed from: b */
    public Object[] m6045b(db dbVar) {
        int i = this.ae - 1;
        while (m6048c(i)) {
            i--;
            this.ae--;
        }
        if (i >= 0 && i < this.je.length) {
            Object[] objArr = (Object[]) this.je[i];
            if (objArr != null) {
                dbVar.m3708g(false);
                this.ae--;
                if (this.Sd.m5853j()) {
                    dbVar.m3684c(m6036a(WDHF_Manager.m5128b(this.Sd.m5799A(), this.Sd, this.Sd.m5831a(objArr))));
                } else {
                    dbVar.m3684c(m6036a(objArr[this.Sd.m5854k()]));
                }
                if (!this.Td || dbVar.m3724o()) {
                    this.he = objArr;
                    return objArr;
                }
                dbVar.m3708g(true);
                return null;
            }
        }
        dbVar.m3708g(true);
        dbVar.m3684c(false);
        return null;
    }

    /* renamed from: c */
    public void m6046c(boolean z) {
        this.de = z;
    }

    /* renamed from: c */
    public boolean m6047c() {
        return this.fe;
    }

    /* renamed from: c */
    public boolean m6048c(int i) {
        return this.Rd != null && Arrays.binarySearch(this.Rd, i) >= 0;
    }

    /* renamed from: c */
    public Object[] m6049c(db dbVar) {
        int i = 0;
        while (m6048c(i)) {
            i++;
        }
        if (i >= 0 && i < this.je.length) {
            Object[] objArr = (Object[]) this.je[i];
            if (objArr != null) {
                dbVar.m3708g(false);
                this.ae = i;
                if (this.Sd.m5853j()) {
                    dbVar.m3684c(m6036a(WDHF_Manager.m5128b(this.Sd.m5799A(), this.Sd, this.Sd.m5831a(objArr))));
                } else {
                    dbVar.m3684c(m6036a(objArr[this.Sd.m5854k()]));
                }
                if (!this.Td || dbVar.m3724o()) {
                    this.he = objArr;
                    return this.he;
                }
                dbVar.m3708g(true);
                return null;
            }
        }
        dbVar.m3708g(true);
        dbVar.m3684c(false);
        return null;
    }

    /* renamed from: d */
    public void m6050d(int i) {
        this.Zd = i;
    }

    /* renamed from: d */
    public void m6051d(boolean z) {
        this.Ud = z;
    }

    /* renamed from: d */
    public boolean m6052d() {
        return this.de;
    }

    /* renamed from: d */
    public Object[] m6053d(db dbVar) {
        int i = this.ae + 1;
        while (m6048c(i)) {
            i++;
            this.ae++;
        }
        if (i >= 0 && i < this.je.length) {
            Object[] objArr = (Object[]) this.je[i];
            if (objArr != null) {
                dbVar.m3708g(false);
                this.ae++;
                if (this.Sd.m5853j()) {
                    dbVar.m3684c(m6036a(WDHF_Manager.m5128b(this.Sd.m5799A(), this.Sd, this.Sd.m5831a(objArr))));
                } else {
                    dbVar.m3684c(m6036a(objArr[this.Sd.m5854k()]));
                }
                if (!this.Td || dbVar.m3724o()) {
                    this.he = objArr;
                    return objArr;
                }
                dbVar.m3708g(true);
                return null;
            }
        }
        dbVar.m3708g(true);
        dbVar.m3684c(false);
        return null;
    }

    /* renamed from: e */
    public void m6054e(int i) {
        this.ae = i;
    }

    /* renamed from: e */
    public boolean m6055e() {
        return this.Yd;
    }

    /* renamed from: f */
    public void m6056f() {
        if (this.Rd == null) {
            this.Rd = new int[this.Xd];
            Arrays.fill(this.Rd, Integer.MAX_VALUE);
            this.ie = -1;
        }
        this.ie++;
        this.Rd[this.ie] = this.ae;
        Arrays.sort(this.Rd);
    }

    /* renamed from: g */
    public int m6057g() {
        return this.ae;
    }

    /* renamed from: h */
    public boolean m6058h() {
        return this.je == null || this.je.length == 0;
    }

    /* renamed from: i */
    public String m6059i() {
        return this.ce;
    }

    /* renamed from: j */
    public boolean m6060j() {
        return this.Wd;
    }

    /* renamed from: k */
    public int m6061k() {
        return this.Zd;
    }

    /* renamed from: l */
    public boolean m6062l() {
        return this.Td;
    }

    /* renamed from: m */
    public boolean m6063m() {
        return this.Vd;
    }

    /* renamed from: n */
    public Object[] m6064n() {
        return this.he;
    }

    /* renamed from: o */
    public boolean m6065o() {
        return this.Ud;
    }

    /* renamed from: p */
    public int m6066p() {
        return this.Xd;
    }
}
