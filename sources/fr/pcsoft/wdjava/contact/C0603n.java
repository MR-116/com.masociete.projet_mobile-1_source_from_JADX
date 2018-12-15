package fr.pcsoft.wdjava.contact;

import android.accounts.Account;
import android.database.Cursor;
import android.provider.ContactsContract.RawContacts;
import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0583e;
import fr.pcsoft.wdjava.core.utils.C0817u;
import fr.pcsoft.wdjava.database.p048a.C0830a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: fr.pcsoft.wdjava.contact.n */
public class C0603n extends C0583e {
    /* renamed from: z */
    private static final String[] f1410z = new String[]{C0603n.m2204z(C0603n.m2205z("&!f-ZQ.f-FK(g<]L4y,")), C0603n.m2204z(C0603n.m2205z("d\u0004J\flk\u0013v\u0017`u\u0002")), C0603n.m2204z(C0603n.m2205z("d\u0004J\flk\u0013v\rxh\u0002")), C0603n.m2204z(C0603n.m2205z("f\bG\u0017xf\u0013v\n}8X")), C0603n.m2204z(C0603n.m2205z("Z\u000eM"))};
    /* renamed from: a */
    private ArrayList<Account> f1411a = null;

    protected C0603n(WDContact wDContact) {
        Cursor query;
        Throwable th;
        try {
            query = WDContact.m1817f().query(RawContacts.CONTENT_URI, new String[]{f1410z[2], f1410z[1]}, wDContact.m1836p() ? f1410z[4] : f1410z[3], new String[]{String.valueOf(wDContact.m1831h())}, null);
            try {
                this.f1411a = new ArrayList(query.getCount());
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    this.f1411a.add(new Account(C0830a.m4260b(query, f1410z[2]), C0830a.m4260b(query, f1410z[1])));
                    query.moveToNext();
                }
                C0830a.m4258a(query);
            } catch (Throwable th2) {
                th = th2;
                C0830a.m4258a(query);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            C0830a.m4258a(query);
            throw th;
        }
    }

    /* renamed from: z */
    private static String m2204z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 5;
                    break;
                case 1:
                    i2 = 103;
                    break;
                case 2:
                    i2 = 41;
                    break;
                case 3:
                    i2 = 99;
                    break;
                default:
                    i2 = 25;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2205z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 25);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2467a(int i, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1410z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1410z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactSource();
    }

    /* renamed from: a */
    public WDObjet mo2469a(long j) {
        return (j < 0 || j >= mo2483h()) ? null : new WDContactSource((Account) this.f1411a.get((int) j));
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        return get(C0725i.m3064d(str));
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        return new C0568d(this, this, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1410z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        WDErreurManager.m2883a(C0745b.m3222b(f1410z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1410z[0], getNomType()));
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1410z[0], getNomType()));
        return 0;
    }

    /* renamed from: b */
    public void mo2476b() {
        Collections.reverse(this.f1411a);
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1410z[0], getNomType()));
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1410z[0], getNomType()));
        return 0;
    }

    /* renamed from: c */
    public void mo2479c() {
        Collections.shuffle(this.f1411a, C0817u.f2167a);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.Zu;
    }

    /* renamed from: e */
    public void mo2480e() {
        WDErreurManager.m2883a(C0745b.m3222b(f1410z[0], getNomType()));
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return true;
    }

    /* renamed from: g */
    public Class mo2482g() {
        return WDContactSource.class;
    }

    /* renamed from: h */
    public long mo2483h() {
        return this.f1411a != null ? (long) this.f1411a.size() : 0;
    }

    public void razVariable() {
    }

    public void release() {
        if (this.f1411a != null) {
            this.f1411a.clear();
            this.f1411a = null;
        }
    }
}
