package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.jb */
abstract class jb extends ab {
    /* renamed from: z */
    private static final String[] f3140z = new String[]{jb.m7705z(jb.m7706z("XV\u0005[Q{W\u0005\tVvLQZMiR\u001e[Lð\u0002K\t")), jb.m7705z(jb.m7706z("QK[YkA\u0019@]9F\u0004\t\\vA\u0004D]wVQ@VoC\u001d@\\|\f"))};
    /* renamed from: f */
    public List<C1063b> f3141f;
    /* renamed from: g */
    public List<C1063b> f3142g;
    /* renamed from: h */
    public List<C1063b> f3143h;
    /* renamed from: i */
    public List<C1063b> f3144i;

    jb() {
    }

    /* renamed from: z */
    private static String m7705z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 25;
                    break;
                case 1:
                    i2 = 34;
                    break;
                case 2:
                    i2 = 113;
                    break;
                case 3:
                    i2 = 41;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7706z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        if (this.f3144i != null) {
            for (C1063b a : this.f3144i) {
                a.m7605a();
            }
            this.f3144i.clear();
            this.f3144i = null;
        }
        if (this.f3141f != null) {
            for (C1063b a2 : this.f3141f) {
                a2.m7605a();
            }
            this.f3141f.clear();
            this.f3141f = null;
        }
        if (this.f3142g != null) {
            for (C1063b a22 : this.f3142g) {
                a22.m7605a();
            }
            this.f3142g.clear();
            this.f3142g = null;
        }
        if (this.f3143h != null) {
            for (C1063b a222 : this.f3143h) {
                a222.m7605a();
            }
            this.f3143h.clear();
            this.f3143h = null;
        }
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 1:
                    if (this.f3144i == null) {
                        this.f3144i = new LinkedList();
                    }
                    this.f3144i.add(c1063b);
                    return;
                case 2:
                    try {
                        if (this.f3141f == null) {
                            this.f3141f = new LinkedList();
                        }
                        this.f3141f.add(c1063b);
                        return;
                    } catch (C1066d e) {
                        throw e;
                    }
                case 3:
                    try {
                        if (this.f3142g == null) {
                            this.f3142g = new LinkedList();
                        }
                        this.f3142g.add(c1063b);
                        return;
                    } catch (C1066d e2) {
                        throw e2;
                    }
                case 4:
                    try {
                        if (this.f3143h == null) {
                            this.f3143h = new LinkedList();
                        }
                        this.f3143h.add(c1063b);
                        return;
                    } catch (C1066d e22) {
                        throw e22;
                    }
                default:
                    C0691a.m2856a(f3140z[0] + c1068g.name());
                    return;
            }
        } catch (C1066d e222) {
            throw e222;
        } catch (C1066d e2222) {
            throw e2222;
        }
        throw e2222;
    }

    /* renamed from: a */
    public void mo3331a(C1060y c1060y) throws C1066d {
        try {
            if (c1060y instanceof zb) {
                super.mo3331a(c1060y);
                return;
            }
            throw new C1066d(f3140z[1]);
        } catch (C1066d e) {
            throw e;
        }
    }
}
