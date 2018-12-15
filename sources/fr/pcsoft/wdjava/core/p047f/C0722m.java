package fr.pcsoft.wdjava.core.p047f;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.core.f.m */
public final class C0722m {
    /* renamed from: z */
    private static final String f1831z = C0722m.m3001z(C0722m.m3002z("c\u0007\u001b\u0018X\f\u000b\b\u0003T\u000f\f\u0016\u001cF\u0012\u000b\b\bK\u0005"));
    /* renamed from: a */
    private WeakReference<WDObjet> f1832a;
    /* renamed from: b */
    private LinkedList<C0710j> f1833b = null;
    /* renamed from: c */
    private EWDPropriete f1834c = EWDPropriete.PROP_VALEUR;

    C0722m(String str) {
        try {
            new C0716e(this, null).m2996a(str);
        } catch (ParseException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1831z, str));
        }
    }

    /* renamed from: z */
    private static String m3001z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 64;
                    break;
                case 1:
                    i2 = 66;
                    break;
                case 2:
                    i2 = 73;
                    break;
                case 3:
                    i2 = 74;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3002z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 7);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final WDObjet m3003a(WDObjet wDObjet) {
        if (this.f1833b != null) {
            Iterator it = this.f1833b.iterator();
            while (it.hasNext()) {
                wDObjet = ((C0710j) it.next()).mo2595a(wDObjet);
            }
        }
        return wDObjet;
    }

    /* renamed from: a */
    public final void m3004a() {
        if (this.f1832a != null) {
            this.f1832a.clear();
            this.f1832a = null;
        }
        this.f1834c = null;
        if (this.f1833b != null) {
            Iterator it = this.f1833b.iterator();
            while (it.hasNext()) {
                ((C0710j) it.next()).mo2596a();
            }
            this.f1833b.clear();
            this.f1833b = null;
        }
    }

    /* renamed from: b */
    public final WDObjet m3005b() {
        WDObjet wDObjet = this.f1832a != null ? (WDObjet) this.f1832a.get() : null;
        if (wDObjet != null && !wDObjet.isReleased()) {
            return wDObjet;
        }
        this.f1832a = null;
        return null;
    }

    /* renamed from: b */
    public void m3006b(WDObjet wDObjet) {
        WDObjet a = m3005b() != null ? m3003a(m3005b()) : null;
        if (a != null) {
            wDObjet.setProp(this.f1834c, a);
        }
    }

    /* renamed from: c */
    public void m3007c(WDObjet wDObjet) {
        WDObjet a = m3005b() != null ? m3003a(m3005b()) : null;
        if (a != null) {
            a.setValeur(wDObjet.getProp(this.f1834c));
        }
    }
}
