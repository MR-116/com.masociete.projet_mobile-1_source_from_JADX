package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

public class WDTuple<T extends WDObjet> extends C0550t {
    /* renamed from: z */
    private static final String f1485z = m2269z(m2270z("t\u0003qsL\u0016\u0000edP\u0003\u0007wh\\\u0019\u0019u`_\u0012\u0013q~A\u0012\u0012ltA\b\u000bvmG\u001e\u0016od"));
    /* renamed from: a */
    private T[] f1486a;

    public WDTuple(T... tArr) {
        this.f1486a = tArr;
    }

    /* renamed from: z */
    private static String m2269z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 87;
                    break;
                case 1:
                    i2 = 70;
                    break;
                case 2:
                    i2 = 35;
                    break;
                case 3:
                    i2 = 33;
                    break;
                default:
                    i2 = 19;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2270z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 19);
        }
        return toCharArray;
    }

    public WDObjet getClone() {
        int i = 0;
        WDObjet[] wDObjetArr = new WDObjet[this.f1486a.length];
        WDObjet[] wDObjetArr2 = this.f1486a;
        int length = wDObjetArr2.length;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            wDObjetArr[i2] = wDObjetArr2[i].getClone();
            i++;
            i2 = i3;
        }
        return new WDTuple(wDObjetArr);
    }

    public final WDObjet getElementAt(int i) {
        int elementCount = getElementCount();
        if (i < 0 || i >= elementCount) {
            WDErreurManager.m2883a(C0745b.m3222b(f1485z, String.valueOf(C0725i.m3069e(i)), String.valueOf(elementCount)));
        }
        return this.f1486a[i];
    }

    public int getElementCount() {
        return this.f1486a != null ? this.f1486a.length : 0;
    }

    public WDObjet getRefProxy() {
        return this.f1486a[0];
    }

    public void release() {
        this.f1486a = null;
    }

    public void setValeur(double d) {
        setValeur(new WDReel(d));
    }

    public void setValeur(int i) {
        setValeur(new WDEntier4(i));
    }

    public void setValeur(long j) {
        setValeur(new WDEntier8(j));
    }

    public void setValeur(WDObjet wDObjet) {
        int i = 0;
        WDTuple wDTuple = (WDTuple) wDObjet.checkType(WDTuple.class);
        int elementCount;
        WDObjet wDObjet2;
        if (wDTuple != null) {
            elementCount = getElementCount();
            while (i < elementCount) {
                wDObjet2 = this.f1486a[i];
                if (wDObjet2 != null) {
                    wDObjet2.setValeur(wDTuple.getElementAt(i));
                }
                i++;
            }
            return;
        }
        C0582d c0582d = (C0582d) wDObjet.checkType(C0582d.class);
        if (c0582d != null) {
            elementCount = getElementCount();
            while (i < elementCount) {
                wDObjet2 = this.f1486a[i];
                if (wDObjet2 != null) {
                    wDObjet2.setValeur(c0582d.mo2469a((long) i));
                }
                i++;
            }
            return;
        }
        elementCount = getElementCount();
        for (int i2 = 0; i2 < elementCount; i2++) {
            WDObjet wDObjet3 = this.f1486a[i2];
            if (wDObjet3 != null) {
                wDObjet3.setValeur(wDObjet);
            }
        }
    }

    public void setValeur(String str) {
        setValeur(new WDChaine(str));
    }

    public void setValeur(boolean z) {
        setValeur(new WDBooleen(z));
    }
}
