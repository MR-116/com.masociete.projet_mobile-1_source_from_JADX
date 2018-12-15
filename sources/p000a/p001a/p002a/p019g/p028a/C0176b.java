package p000a.p001a.p002a.p019g.p028a;

import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.g.a.b */
public final class C0176b {
    /* renamed from: a */
    private static final int f668a = 10;
    /* renamed from: f */
    private static final int f669f = 1;
    /* renamed from: b */
    private final int f670b;
    /* renamed from: c */
    private final int f671c;
    /* renamed from: d */
    private final int f672d;
    /* renamed from: e */
    private final C0194n f673e;
    /* renamed from: g */
    private final int f674g;
    /* renamed from: h */
    private final int f675h;
    /* renamed from: i */
    private final int f676i;

    public C0176b(C0194n c0194n) throws C0213t {
        this(c0194n, 10, c0194n.m1208a() / 2, c0194n.m1226i() / 2);
    }

    public C0176b(C0194n c0194n, int i, int i2, int i3) throws C0213t {
        this.f673e = c0194n;
        this.f670b = c0194n.m1226i();
        this.f674g = c0194n.m1208a();
        int i4 = i / 2;
        try {
            this.f671c = i2 - i4;
            this.f676i = i2 + i4;
            this.f672d = i3 - i4;
            this.f675h = i4 + i3;
            if (this.f672d >= 0) {
                if (this.f671c >= 0) {
                    try {
                        if (this.f675h < this.f670b) {
                            try {
                                if (this.f676i < this.f674g) {
                                    return;
                                }
                            } catch (C0213t e) {
                                throw e;
                            }
                        }
                    } catch (C0213t e2) {
                        throw e2;
                    }
                }
            }
            throw C0213t.m1269a();
        } catch (C0213t e22) {
            throw e22;
        } catch (C0213t e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    private eb m1084a(float f, float f2, float f3, float f4) {
        int a = C0175a.m1082a(C0175a.m1080a(f, f2, f3, f4));
        float f5 = (f3 - f) / ((float) a);
        float f6 = (f4 - f2) / ((float) a);
        for (int i = 0; i < a; i++) {
            int a2 = C0175a.m1082a((((float) i) * f5) + f);
            int a3 = C0175a.m1082a((((float) i) * f6) + f2);
            if (this.f673e.m1221d(a2, a3)) {
                return new eb((float) a2, (float) a3);
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m1085a(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f673e.m1221d(i, i3)) {
                    return true;
                }
                i++;
            }
        } else {
            while (i <= i2) {
                if (this.f673e.m1221d(i3, i)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: a */
    private eb[] m1086a(eb ebVar, eb ebVar2, eb ebVar3, eb ebVar4) {
        float b = ebVar.m312b();
        float a = ebVar.m311a();
        float b2 = ebVar2.m312b();
        float a2 = ebVar2.m311a();
        float b3 = ebVar3.m312b();
        float a3 = ebVar3.m311a();
        float b4 = ebVar4.m312b();
        float a4 = ebVar4.m311a();
        if (b < ((float) this.f674g) / 2.0f) {
            return new eb[]{new eb(b4 - 1.0f, a4 + 1.0f), new eb(b2 + 1.0f, a2 + 1.0f), new eb(b3 - 1.0f, a3 - 1.0f), new eb(b + 1.0f, a - 1.0f)};
        }
        return new eb[]{new eb(b4 + 1.0f, a4 + 1.0f), new eb(b2 + 1.0f, a2 - 1.0f), new eb(b3 - 1.0f, a3 + 1.0f), new eb(b - 1.0f, a - 1.0f)};
    }

    /* renamed from: a */
    public eb[] m1087a() throws C0213t {
        int i;
        int i2;
        boolean z = false;
        int i3 = 1;
        int i4 = this.f671c;
        int i5 = this.f676i;
        int i6 = this.f672d;
        int i7 = this.f675h;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 1;
        while (i8 != 0) {
            boolean z7 = true;
            boolean z8 = z5;
            z5 = false;
            while (true) {
                if (!z7 && z8) {
                    break;
                }
                try {
                    if (i5 >= this.f674g) {
                        break;
                    }
                    z7 = m1085a(i6, i7, i5, false);
                    if (z7) {
                        i5++;
                        z8 = true;
                        z5 = true;
                    } else if (!z8) {
                        i5++;
                    }
                } catch (C0213t e) {
                    throw e;
                }
            }
            if (i5 >= this.f674g) {
                z = true;
                i = i5;
                i2 = i4;
                i5 = i7;
                i4 = i6;
                break;
            }
            z7 = z4;
            z4 = z5;
            z5 = true;
            while (true) {
                if (!z5 && z7) {
                    break;
                }
                try {
                    if (i7 >= this.f670b) {
                        break;
                    }
                    z5 = m1085a(i4, i5, i7, true);
                    if (z5) {
                        i7++;
                        z7 = true;
                        z4 = true;
                    } else if (!z7) {
                        i7++;
                    }
                } catch (C0213t e2) {
                    throw e2;
                }
            }
            if (i7 >= this.f670b) {
                z = true;
                i = i5;
                i2 = i4;
                i5 = i7;
                i4 = i6;
                break;
            }
            z5 = z3;
            z3 = z4;
            z4 = true;
            while (true) {
                if ((z4 || !z5) && i4 >= 0) {
                    z4 = m1085a(i6, i7, i4, false);
                    if (z4) {
                        i4--;
                        z5 = true;
                        z3 = true;
                    } else if (!z5) {
                        i4--;
                    }
                }
            }
            if (i4 < 0) {
                z = true;
                i = i5;
                i2 = i4;
                i5 = i7;
                i4 = i6;
                break;
            }
            z4 = z3;
            z3 = z2;
            z2 = true;
            while (true) {
                if ((z2 || !z3) && i6 >= 0) {
                    z2 = m1085a(i4, i5, i6, true);
                    if (z2) {
                        i6--;
                        z3 = true;
                        z4 = true;
                    } else if (!z3) {
                        i6--;
                    }
                }
            }
            if (i6 < 0) {
                z = true;
                i = i5;
                i2 = i4;
                i5 = i7;
                i4 = i6;
                break;
            }
            if (z4) {
                z6 = true;
            }
            z2 = z3;
            z3 = z5;
            z5 = z8;
            boolean z9 = z7;
            z7 = z4;
            z4 = z9;
        }
        i = i5;
        i2 = i4;
        i5 = i7;
        i4 = i6;
        if (z || !r0) {
            throw C0213t.m1269a();
        }
        int i9 = i - i2;
        int i10 = 1;
        eb ebVar = null;
        while (ebVar == null && i10 < i9) {
            i10++;
            ebVar = m1084a((float) i2, (float) (i5 - i10), (float) (i2 + i10), (float) i5);
        }
        if (ebVar == null) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e22) {
                throw e22;
            }
        }
        i10 = 1;
        eb ebVar2 = null;
        while (ebVar2 == null && i10 < i9) {
            i10++;
            ebVar2 = m1084a((float) i2, (float) (i4 + i10), (float) (i2 + i10), (float) i4);
        }
        if (ebVar2 == null) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e222) {
                throw e222;
            }
        }
        i10 = 1;
        eb ebVar3 = null;
        while (ebVar3 == null && i10 < i9) {
            ebVar3 = m1084a((float) i, (float) (i4 + i10), (float) (i - i10), (float) i4);
            i10++;
        }
        if (ebVar3 == null) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e2222) {
                throw e2222;
            }
        }
        eb ebVar4 = null;
        while (ebVar4 == null && i3 < i9) {
            ebVar4 = m1084a((float) i, (float) (i5 - i3), (float) (i - i3), (float) i5);
            i3++;
        }
        if (ebVar4 != null) {
            return m1086a(ebVar4, ebVar, ebVar3, ebVar2);
        }
        try {
            throw C0213t.m1269a();
        } catch (C0213t e22222) {
            throw e22222;
        }
    }
}
