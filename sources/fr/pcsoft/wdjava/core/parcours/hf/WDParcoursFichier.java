package fr.pcsoft.wdjava.core.parcours.hf;

import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.WDHF_Manager;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;

public class WDParcoursFichier implements IWDParcours {
    /* renamed from: z */
    private static final String f1848z = m3096z(m3097z("+\u001ceN-]\u000bhT.W\tvN+G\feO7A\u0017cY/Z\u001c"));
    /* renamed from: e */
    private final boolean f1849e;
    /* renamed from: f */
    private boolean f1850f = false;
    /* renamed from: g */
    private db f1851g;
    /* renamed from: h */
    private eb f1852h;
    /* renamed from: i */
    private int f1853i = -1;

    private WDParcoursFichier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, int i, boolean z) {
        this.f1849e = z;
        try {
            String[] strArr;
            WDHF_Contexte instance = WDHF_Contexte.getInstance();
            this.f1851g = WDHF_Manager.m5183d(instance, wDObjet, true);
            this.f1852h = WDHF_Manager.m5059a(instance, wDObjet2, false);
            m3095a();
            C0582d c0582d = (C0582d) wDObjet3.checkType(C0582d.class);
            if (c0582d != null) {
                String[] strArr2 = new String[((int) c0582d.mo2483h())];
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    strArr2[i2] = c0582d.mo2469a((long) i2).getString();
                }
                strArr = strArr2;
            } else {
                if (!wDObjet3.getString().equals("") || i != 2) {
                    strArr = new String[]{r1};
                } else {
                    return;
                }
            }
            this.f1851g.m3634a(this.f1852h, i, strArr);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            WDException wDException = e22;
            String str = "";
            String str2 = "";
            if (wDObjet != null) {
                str = wDObjet.getNom().getString();
            }
            if (wDObjet2 != null) {
                str2 = wDObjet2.getNom().getString();
            }
            String[] strArr3 = new String[2];
            strArr3[0] = C0745b.m3222b(f1848z, str, str2);
            strArr3[1] = wDException.getMessage();
            WDErreurManager.m2886a(strArr3);
        }
    }

    private WDParcoursFichier(WDObjet wDObjet, WDObjet wDObjet2, String str, boolean z) {
        eb ebVar = null;
        this.f1849e = z;
        String a;
        try {
            WDHF_Contexte instance = WDHF_Contexte.getInstance();
            this.f1851g = WDHF_Manager.m5183d(instance, wDObjet, true);
            if (wDObjet2 != null) {
                ebVar = WDHF_Manager.m5059a(instance, wDObjet2, false);
            }
            this.f1852h = ebVar;
            m3095a();
            a = this.f1851g.m3635a(null, null, null, str);
            if (this.f1852h == null) {
                this.f1852h = (eb) this.f1851g.mo2721b(a);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            WDException wDException = e22;
            String str2 = "";
            a = "";
            if (wDObjet != null) {
                str2 = wDObjet.getNom().getString();
            }
            if (wDObjet2 != null) {
                a = wDObjet2.getNom().getString();
            }
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1848z, str2, a);
            strArr[1] = wDException.getMessage();
            WDErreurManager.m2886a(strArr);
        }
    }

    private WDParcoursFichier(WDObjet wDObjet, WDObjet wDObjet2, boolean z) {
        this.f1849e = z;
        try {
            WDHF_Contexte instance = WDHF_Contexte.getInstance();
            this.f1851g = WDHF_Manager.m5183d(instance, wDObjet, true);
            this.f1852h = WDHF_Manager.m5059a(instance, wDObjet2, false);
            m3095a();
        } catch (WDException e) {
            WDException wDException = e;
            String str = "";
            String str2 = "";
            if (wDObjet != null) {
                try {
                    str = wDObjet.isSourceDonnees() ? wDObjet.getNom().getString() : wDObjet.getString();
                } catch (WDException e2) {
                    throw e2;
                }
            }
            if (wDObjet2 != null) {
                try {
                    str2 = wDObjet2.isRubrique() ? wDObjet2.getNom().getString() : wDObjet2.getString();
                } catch (WDException e22) {
                    throw e22;
                }
            }
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1848z, str, str2);
            strArr[1] = wDException.getMessage();
            WDErreurManager.m2886a(strArr);
        }
    }

    private WDParcoursFichier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet[] wDObjetArr, int i, boolean z) {
        this.f1849e = z;
        try {
            WDHF_Contexte instance = WDHF_Contexte.getInstance();
            this.f1851g = WDHF_Manager.m5183d(instance, wDObjet, true);
            this.f1852h = WDHF_Manager.m5059a(instance, wDObjet2, false);
            m3095a();
            String[] strArr = new String[wDObjetArr.length];
            for (int i2 = 0; i2 < wDObjetArr.length; i2++) {
                strArr[i2] = wDObjetArr[i2].getString();
            }
            this.f1851g.m3634a(this.f1852h, i, strArr);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            WDException wDException = e2;
            String str = "";
            String str2 = "";
            if (wDObjet != null) {
                str = wDObjet.getNom().getString();
            }
            if (wDObjet2 != null) {
                str2 = wDObjet2.getNom().getString();
            }
            String[] strArr2 = new String[2];
            strArr2[0] = C0745b.m3222b(f1848z, str, str2);
            strArr2[1] = wDException.getMessage();
            WDErreurManager.m2886a(strArr2);
        }
    }

    /* renamed from: a */
    private void m3095a() {
        try {
            this.f1853i = this.f1851g.m3669b(this.f1852h);
        } catch (WDException e) {
        }
    }

    public static IWDParcours pourTout(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, int i, boolean z) {
        return new WDParcoursFichier(wDObjet, wDObjet2, wDObjet3, i, z);
    }

    public static IWDParcours pourTout(WDObjet wDObjet, WDObjet wDObjet2, String str, boolean z) {
        return new WDParcoursFichier(wDObjet, wDObjet2, str, z);
    }

    public static IWDParcours pourTout(WDObjet wDObjet, WDObjet wDObjet2, boolean z) {
        return new WDParcoursFichier(wDObjet, wDObjet2, z);
    }

    public static IWDParcours pourTout(WDObjet wDObjet, WDObjet wDObjet2, WDObjet[] wDObjetArr, int i, boolean z) {
        return new WDParcoursFichier(wDObjet, wDObjet2, wDObjetArr, i, z);
    }

    /* renamed from: z */
    private static String m3096z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 8;
                    break;
                case 1:
                    i2 = 89;
                    break;
                case 2:
                    i2 = 55;
                    break;
                case 3:
                    i2 = 28;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3097z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 104);
        }
        return toCharArray;
    }

    public void finParcours() {
        try {
            if (this.f1853i != -1) {
                try {
                    if (this.f1850f) {
                        if (!this.f1851g.m3724o()) {
                            WDHF_Manager.m5078a(this.f1853i, 8);
                            return;
                        }
                    }
                    WDHF_Manager.m5138b(this.f1853i);
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e3) {
        }
    }

    public Object getElementCourant() {
        return this.f1852h.getValeur();
    }

    public int getIndex() {
        throw new UnsupportedOperationException();
    }

    public WDObjet getSource() {
        return this.f1851g;
    }

    public WDObjet getVariableParcours() {
        return WDObjet.NULL;
    }

    public void release() {
        this.f1851g = null;
        this.f1852h = null;
    }

    public void reset() {
        this.f1850f = false;
        m3095a();
    }

    public boolean testParcours() {
        try {
            if (this.f1850f) {
                this.f1851g.m3662a(this.f1852h, this.f1849e, true, 1, 0);
            } else {
                this.f1850f = true;
                this.f1851g.m3661a(this.f1852h, this.f1849e, true, (long) PlaybackStateCompat.ACTION_PREPARE);
            }
            return this.f1851g.m3724o();
        } catch (WDException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1848z, this.f1851g.mo2719a(), this.f1852h.mo3137b()) + "\n" + e.getMessage());
            return false;
        }
    }
}
