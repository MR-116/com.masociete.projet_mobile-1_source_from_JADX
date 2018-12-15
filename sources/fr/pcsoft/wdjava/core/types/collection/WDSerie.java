package fr.pcsoft.wdjava.core.types.collection;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0664f;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0487y;
import fr.pcsoft.wdjava.core.types.WDEntier4;

public class WDSerie extends C0487y implements C0582d {
    /* renamed from: z */
    private static final String[] f1963z = new String[]{m3349z(m3350z("\u0004\"~sos-~ssi+bhn7ar")), m3349z(m3350z("\u0004!cosd+kiu7xrbx7toeb;tsse1w{iu")), m3349z(m3350z("\u00040p`b%d")), m3349z(m3350z("\u00040hmix-~cj4piee(tbma\"t~xf0xrb")), m3349z(m3350z("\u00042poef&}xst+dnsb(tpii0")), m3349z(m3350z("\u0004!cosj%ibhn)tsn+"))};
    /* renamed from: a */
    private WDObjet[] f1964a = null;

    public WDSerie(WDObjet[] wDObjetArr) {
        this.f1964a = wDObjetArr;
    }

    /* renamed from: z */
    private static String m3349z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 39;
                    break;
                case 1:
                    i2 = 100;
                    break;
                case 2:
                    i2 = 49;
                    break;
                case 3:
                    i2 = 61;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3350z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 44);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2467a(int i, WDObjet[] wDObjetArr) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
        return 0;
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
        return 0;
    }

    /* renamed from: a */
    public int mo2464a(WDObjet... wDObjetArr) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
        return -1;
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return null;
    }

    /* renamed from: a */
    public WDObjet mo2469a(long j) {
        return (j < 0 || j >= mo2483h()) ? null : this.f1964a[(int) j];
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        return getElement(str, z);
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
        return null;
    }

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
    }

    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
    }

    /* renamed from: a */
    public void mo2465a(WDObjet wDObjet) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
    }

    /* renamed from: a */
    public void mo2466a(WDObjet wDObjet, WDObjet... wDObjetArr) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
    }

    /* renamed from: a */
    public void m3363a(int[] iArr, int i, boolean z) throws C0664f {
        try {
            if (i >= iArr.length) {
                WDErreurManager.m2883a(C0745b.m3222b(f1963z[5], new String[0]));
            }
            WDObjet[] i2 = m3374i();
            int length = i2.length;
            int i3 = 0;
            Object obj = null;
            Object obj2 = null;
            while (i3 < length) {
                WDObjet wDObjet = i2[i3];
                try {
                    Object obj3;
                    if (wDObjet.isSerie()) {
                        if (obj == null || z) {
                            ((WDSerie) wDObjet).m3363a(iArr, i + 1, z);
                            obj3 = obj;
                            obj = 1;
                        } else {
                            try {
                                throw new C0664f();
                            } catch (C0664f e) {
                                throw e;
                            }
                        }
                    } else if (obj2 == null || z) {
                        int i4 = 1;
                        obj = obj2;
                    } else {
                        try {
                            throw new C0664f();
                        } catch (C0664f e2) {
                            throw e2;
                        }
                    }
                    i3++;
                    obj2 = obj;
                    obj = obj3;
                } catch (C0664f e22) {
                    throw e22;
                } catch (C0664f e222) {
                    throw e222;
                }
            }
            iArr[i] = Math.max(length, iArr[i]);
        } catch (C0664f e2222) {
            throw e2222;
        }
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
        return -1;
    }

    /* renamed from: b */
    public void mo2476b() {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
        return 0;
    }

    /* renamed from: c */
    public void mo2479c() {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
    }

    /* renamed from: d */
    public int mo2487d() {
        return (this.f1964a == null || this.f1964a.length <= 0) ? 0 : this.f1964a[0].getTypeVar();
    }

    /* renamed from: e */
    public void mo2480e() {
        WDErreurManager.m2886a(C0745b.m3222b(f1963z[0], new String[0]), getNomType());
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return true;
    }

    /* renamed from: g */
    public Class mo2482g() {
        return (this.f1964a == null || this.f1964a.length <= 0) ? null : this.f1964a[0].getClass();
    }

    public byte[] getDonneeBinaire() {
        int length = this.f1964a.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            WDEntier4 wDEntier4 = (WDEntier4) this.f1964a[i].checkType(WDEntier4.class);
            if (wDEntier4 == null || wDEntier4.getInt() < 0 || wDEntier4.getInt() > 255) {
                WDErreurManager.m2883a(C0745b.m3222b(f1963z[1], new String[0]));
            }
            bArr[i] = (byte) wDEntier4.getInt();
        }
        return bArr;
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        if (z) {
            WDErreurManager.m2883a(C0745b.m3222b(f1963z[4], new String[0]));
        }
        return null;
    }

    public String getNomType() {
        return C0745b.m3220a(f1963z[2], new String[0]);
    }

    public WDEntier4 getOccurrence() {
        return new WDEntier4(mo2483h());
    }

    public int getTypeVar() {
        return 34;
    }

    public WDObjet getValeur() {
        return this;
    }

    /* renamed from: h */
    public long mo2483h() {
        return this.f1964a != null ? (long) this.f1964a.length : 0;
    }

    /* renamed from: i */
    public WDObjet[] m3374i() {
        return this.f1964a;
    }

    public boolean isEvaluable() {
        return false;
    }

    public boolean isSerie() {
        return true;
    }

    public void razVariable() {
    }

    public void release() {
        this.f1964a = null;
    }

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1963z[3], new String[0]));
    }
}
