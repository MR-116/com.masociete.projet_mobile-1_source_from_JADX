package fr.pcsoft.wdjava.contact;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.util.SparseArray;
import fr.pcsoft.wdjava.contact.data.C0570j;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.p038a.C0561b;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.database.p048a.C0830a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import java.util.ArrayList;
import java.util.Iterator;

public class WDContact extends C0561b {
    /* renamed from: e */
    public static final EWDPropriete[] f1272e = new EWDPropriete[]{EWDPropriete.PROP_NOMAFFICHE, EWDPropriete.PROP_FAVORI, EWDPropriete.PROP_TELEPHONE, EWDPropriete.PROP_EMAIL, EWDPropriete.PROP_SIP, EWDPropriete.PROP_SITEWEB, EWDPropriete.PROP_MESSAGERIEINSTANTANEE, EWDPropriete.PROP_NOTE, EWDPropriete.PROP_NOM, EWDPropriete.PROP_PRENOM, EWDPropriete.PROP_EVENEMENT, EWDPropriete.PROP_SOURCE, EWDPropriete.PROP_ADRESSE, EWDPropriete.PROP_ID};
    /* renamed from: z */
    private static final String[] f1273z = new String[]{m1826z(m1827z("n1\u001c\t\u0018h<\u001d\u0019\u001dj1\u000b\u001f\u001es,\u0000\u0013\u000eu-\u001a\r\u000en<|")), m1826z(m1827z("\u001dV\u0016=%(O\u0011=l.U\r:-.N\u0010n##NC§8¤\u001a\u0010;<=H\n#¥>\u0014")), m1826z(m1827z("!U\f%9=")), m1826z(m1827z("\u0012S\u0007ss")), m1826z(m1827z(")S\u0010> ,C< - _")), m1826z(m1827z(".U\r:-.N<'(")), m1826z(m1827z(">N\u0002<>(^")), m1826z(m1827z("\u0012S\u0007")), m1826z(m1827z("nj1\u0001\u001c\u001fs&\u001a\t\u0012v&\r\u0018\u0018h&\u0011\u001f\bo/\u000b")), m1826z(m1827z("nt,\u0011\u001a\fv&\u001b\u001e")), m1826z(m1827z("\u0004W\u0013!?>S\u0001\")m^D'\"$N\n/ $I\u0006<l!_C-##N\u0002-8mÚC>-?N\n<l)_\u0010n%#\\\f<!,N\n!\">\u001a\u0007;l.O\u0011=)8HM")), m1826z(m1827z("\u0019C\u0013+l)_C*##T+?mT\f l*Ó\u0011§b")), m1826z(m1827z(".U\r:-.N<'(p\u0005")), m1826z(m1827z("n1\u001c\t\u0018h<\u0003\u0003\ts%\u0011\u000f\u0002t7\u000f\u000f\u0019")), m1826z(m1827z("n1\u001c\t\u0018h<\u0003\u0003\ts%\u0011\u000f\u0002t7\u000f\u000f\u0019eQ")), m1826z(m1827z(".U\u000e`-#^\u0011!%)\u0014\u0000!\"9[\u0000:?")), m1826z(m1827z("ny,\u0000\u0018\fy7")), m1826z(m1827z(")[\u0017/")), m1826z(m1827z(")[\u0017/~")), m1826z(m1827z(";T\u0007`-#^\u0011!%)\u0014\u0000;>>U\u0011`%9_\u000ea\",W\u0006")), m1826z(m1827z(")[\u0017/}")), m1826z(m1827z("?[\u0014\u0011/\"T\u0017//9e\n*")), m1826z(m1827z(" S\u000e+84J\u0006")), m1826z(m1827z("p\u0005")), m1826z(m1827z("m{-\nl")), m1826z(m1827z(",Y\u0000!9#N< - _")), m1826z(m1827z("n1\u001c\t\u0018h<\u000f\u0006\u0002o7\u0011\u000f\u0002t7\u000f\u000f\u0019")), m1826z(m1827z(",Y\u0000!9#N<:5=_")), m1826z(m1827z("n{)\u0001\u0019\u0019e \u0001\u0002\u0019{ \u001a\u0013\bb*\u001d\u0018\ft7")), m1826z(m1827z(",]\u0004<)*[\u0017'##e\u000e!(("))};
    /* renamed from: c */
    private SparseArray<C0584d<C0561b, C0570j>> f1274c = null;
    /* renamed from: d */
    String f1275d = "";
    /* renamed from: f */
    private C0602m f1276f = null;
    /* renamed from: g */
    private long f1277g = -1;
    /* renamed from: h */
    private boolean f1278h = false;
    /* renamed from: i */
    private C0603n f1279i = null;
    /* renamed from: j */
    private long f1280j = -1;

    /* renamed from: a */
    public static final Cursor m1807a(WDContact wDContact, String str, String... strArr) {
        if (wDContact.m1831h() < 0) {
            return null;
        }
        return m1817f().query(Data.CONTENT_URI, strArr, (wDContact.m1836p() ? f1273z[21] : f1273z[5]) + f1273z[23] + f1273z[24] + f1273z[22] + f1273z[23], new String[]{String.valueOf(wDContact.m1831h()), str}, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final fr.pcsoft.wdjava.core.poo.p038a.C0584d m1808a(int r3) {
        /*
        r2 = this;
        r0 = r2.f1274c;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r2.f1274c;
        r0 = r0.get(r3);
        r0 = (fr.pcsoft.wdjava.core.poo.p038a.C0584d) r0;
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        return r0;
    L_0x000f:
        switch(r3) {
            case 2010: goto L_0x0055;
            case 2011: goto L_0x0012;
            case 2012: goto L_0x0012;
            case 2013: goto L_0x0012;
            case 2014: goto L_0x001b;
            case 2015: goto L_0x0031;
            case 2016: goto L_0x0037;
            case 2017: goto L_0x003d;
            case 2018: goto L_0x0043;
            case 2019: goto L_0x0049;
            case 2020: goto L_0x0012;
            case 2021: goto L_0x004f;
            default: goto L_0x0012;
        };
    L_0x0012:
        r0 = f1273z;
        r1 = 11;
        r0 = r0[r1];
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r0);
    L_0x001b:
        r0 = new fr.pcsoft.wdjava.contact.data.t;
        r0.<init>(r2);
    L_0x0020:
        r1 = r2.f1274c;
        if (r1 != 0) goto L_0x002b;
    L_0x0024:
        r1 = new android.util.SparseArray;
        r1.<init>();
        r2.f1274c = r1;
    L_0x002b:
        r1 = r2.f1274c;
        r1.put(r3, r0);
        goto L_0x000e;
    L_0x0031:
        r0 = new fr.pcsoft.wdjava.contact.data.l;
        r0.<init>(r2);
        goto L_0x0020;
    L_0x0037:
        r0 = new fr.pcsoft.wdjava.contact.data.n;
        r0.<init>(r2);
        goto L_0x0020;
    L_0x003d:
        r0 = new fr.pcsoft.wdjava.contact.data.o;
        r0.<init>(r2);
        goto L_0x0020;
    L_0x0043:
        r0 = new fr.pcsoft.wdjava.contact.data.r;
        r0.<init>(r2);
        goto L_0x0020;
    L_0x0049:
        r0 = new fr.pcsoft.wdjava.contact.data.q;
        r0.<init>(r2);
        goto L_0x0020;
    L_0x004f:
        r0 = new fr.pcsoft.wdjava.contact.data.s;
        r0.<init>(r2);
        goto L_0x0020;
    L_0x0055:
        r0 = new fr.pcsoft.wdjava.contact.data.m;
        r0.<init>(r2);
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.contact.WDContact.a(int):fr.pcsoft.wdjava.core.poo.a.d");
    }

    /* renamed from: a */
    private void m1809a(Cursor cursor) {
        this.f1277g = C0830a.m4261c(cursor, f1273z[7]);
        this.f1275d = C0830a.m4260b(cursor, f1273z[4]);
        this.f1278h = C0830a.m4259a(cursor, f1273z[6]);
    }

    /* renamed from: a */
    private final void m1810a(String str) {
        if (this.f1276f == null) {
            m1820m();
        }
        C0602m.access$200(this.f1276f, str);
    }

    /* renamed from: b */
    private final void m1811b(Cursor cursor) {
        Cursor query;
        Throwable th;
        this.f1277g = C0830a.m4261c(cursor, f1273z[7]);
        this.f1280j = C0830a.m4261c(cursor, f1273z[5]);
        this.f1278h = C0830a.m4259a(cursor, f1273z[6]);
        try {
            query = m1817f().query(Contacts.CONTENT_URI, new String[]{f1273z[4]}, f1273z[3], new String[]{String.valueOf(this.f1280j)}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        this.f1275d = C0830a.m4260b(query, f1273z[4]);
                        if (this.f1275d == null) {
                            this.f1275d = "";
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C0830a.m4258a(query);
                    throw th;
                }
            }
            C0830a.m4258a(query);
        } catch (Throwable th3) {
            th = th3;
            query = null;
            C0830a.m4258a(query);
            throw th;
        }
    }

    /* renamed from: b */
    private final void m1812b(boolean z) {
        if (z != this.f1278h) {
            this.f1278h = z;
            if (this.f1277g >= 0) {
                m1805b().add(ContentProviderOperation.newUpdate(m1836p() ? RawContacts.CONTENT_URI : Contacts.CONTENT_URI).withSelection(f1273z[3], new String[]{String.valueOf(this.f1277g)}).withValue(f1273z[6], Integer.valueOf(this.f1278h ? 1 : 0)).build());
            }
        }
    }

    /* renamed from: c */
    public static final WDContact m1813c(Cursor cursor) {
        WDContact wDContact = new WDContact();
        if (cursor.isClosed() || cursor.isAfterLast()) {
            C0691a.m2856a(f1273z[10]);
        } else {
            wDContact.m1811b(cursor);
        }
        return wDContact;
    }

    /* renamed from: d */
    public static final WDContact m1814d(Cursor cursor) {
        WDContact wDContact = new WDContact();
        if (cursor.isClosed() || cursor.isAfterLast()) {
            C0691a.m2856a(f1273z[10]);
        } else {
            wDContact.m1809a(cursor);
        }
        return wDContact;
    }

    /* renamed from: d */
    private final String m1815d() {
        if (this.f1276f == null) {
            m1820m();
        }
        return C0602m.access$300(this.f1276f);
    }

    /* renamed from: e */
    private final WDObjet m1816e() {
        return m1808a((int) C0607n.yo);
    }

    /* renamed from: f */
    public static final ContentResolver m1817f() {
        return C1056i.m7562a().getContentResolver();
    }

    /* renamed from: g */
    private final WDObjet m1818g() {
        return m1808a((int) C0607n.Mw);
    }

    /* renamed from: i */
    private final WDObjet m1819i() {
        return m1808a((int) C0607n.bn);
    }

    /* renamed from: m */
    private final void m1820m() {
        Cursor cursor = null;
        try {
            cursor = m1807a(this, f1273z[19], f1273z[7], f1273z[17], f1273z[18], f1273z[20]);
            if (cursor == null || !cursor.moveToFirst()) {
                this.f1276f = new C0602m(this, "", "", null);
            } else {
                this.f1276f = new C0602m(this, cursor, null);
            }
            C0830a.m4258a(cursor);
        } catch (Throwable th) {
            C0830a.m4258a(cursor);
        }
    }

    /* renamed from: o */
    private final WDObjet m1821o() {
        return m1808a((int) C0607n.Jx);
    }

    /* renamed from: q */
    private final void m1822q() {
        this.f1276f = null;
        if (this.f1274c != null) {
            int size = this.f1274c.size();
            for (int i = 0; i < size; i++) {
                ((C0584d) this.f1274c.valueAt(i)).release();
            }
        }
        if (this.f1279i != null) {
            this.f1279i = null;
        }
    }

    /* renamed from: s */
    private final WDObjet m1823s() {
        return m1808a((int) C0607n.sc);
    }

    /* renamed from: t */
    private final WDObjet m1824t() {
        return m1808a((int) C0607n.Nc);
    }

    /* renamed from: u */
    private final WDObjet m1825u() {
        return m1808a((int) C0607n.So);
    }

    /* renamed from: z */
    private static String m1826z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 77;
                    break;
                case 1:
                    i2 = 58;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 78;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1827z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 76);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected final void mo2437a() {
        int i = 0;
        this.f1277g = -1;
        this.f1280j = -1;
        if (this.f1276f != null) {
            this.f1276f.f1409c = -1;
        }
        int size = this.f1274c != null ? this.f1274c.size() : 0;
        while (i < size) {
            Iterator j = ((C0584d) this.f1274c.valueAt(i)).m2064j();
            if (j != null) {
                while (j.hasNext()) {
                    ((C0570j) j.next()).m1882e();
                }
            }
            i++;
        }
        m1806c();
    }

    /* renamed from: a */
    final void m1829a(long j, boolean z) {
        Cursor query;
        razVariable();
        if (z) {
            try {
                query = m1817f().query(Contacts.CONTENT_URI, new String[]{f1273z[7], f1273z[4], f1273z[6]}, f1273z[3], new String[]{String.valueOf(j)}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            m1809a(query);
                        }
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        r1 = query;
                        r0 = th2;
                        C0830a.m4258a(r1);
                        throw r0;
                    }
                }
            } catch (Throwable th3) {
                Cursor cursor;
                Throwable th4;
                th4 = th3;
                cursor = null;
                C0830a.m4258a(cursor);
                throw th4;
            }
        }
        query = m1817f().query(RawContacts.CONTENT_URI, new String[]{f1273z[7], f1273z[5], f1273z[6]}, f1273z[3], new String[]{String.valueOf(j)}, null);
        if (query != null) {
            if (query.moveToFirst()) {
                m1811b(query);
            }
        }
        C0830a.m4258a(query);
    }

    /* renamed from: a */
    public final void m1830a(String str, String str2) throws C0606q {
        try {
            if (this.f1277g >= 0) {
                throw new C0606q(C0745b.m3222b(f1273z[28], new String[0]));
            }
            long j = -1;
            ContentValues contentValues = new ContentValues();
            try {
                contentValues.put(f1273z[29], Integer.valueOf(0));
                contentValues.put(f1273z[27], str);
                contentValues.put(f1273z[25], str2);
                contentValues.put(f1273z[6], this.f1278h ? "1" : "0");
                j = ContentUris.parseId(m1817f().insert(RawContacts.CONTENT_URI, contentValues));
                ArrayList arrayList = new ArrayList();
                if (this.f1276f != null) {
                    arrayList.add(this.f1276f.m2202a(j).build());
                }
                int size = this.f1274c != null ? this.f1274c.size() : 0;
                for (int i = 0; i < size; i++) {
                    Iterator j2 = ((C0584d) this.f1274c.valueAt(i)).m2064j();
                    if (j2 != null) {
                        while (j2.hasNext()) {
                            arrayList.add(((C0570j) j2.next()).mo2460a(j).build());
                        }
                        continue;
                    }
                }
                m1817f().applyBatch(f1273z[15], arrayList);
                m1829a(j, false);
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e22) {
                throw e22;
            } catch (Exception e222) {
                throw e222;
            } catch (Exception e2222) {
                throw e2222;
            } catch (Exception e22222) {
                if (j >= 0) {
                    try {
                        m1817f().delete(RawContacts.CONTENT_URI, f1273z[3], new String[]{String.valueOf(j)});
                    } catch (Exception e222222) {
                        throw e222222;
                    }
                }
                throw new C0606q(C0745b.m3222b(f1273z[26], new String[0]), e222222.getMessage());
            }
        } catch (Exception e2222222) {
            throw e2222222;
        }
    }

    public WDObjet getClone() {
        WDContact wDContact = (WDContact) super.getClone();
        if (this.f1276f != null) {
            wDContact.f1276f = this.f1276f.m2203b();
        }
        return wDContact;
    }

    public WDChaine getNom() {
        if (this.f1276f == null) {
            m1820m();
        }
        return new WDChaine(C0602m.access$100(this.f1276f));
    }

    public String getNomType() {
        return C0745b.m3220a(f1273z[16], new String[0]);
    }

    public WDObjet getNote() {
        return m1808a((int) C0607n.Jj);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0594e.f1377a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDBooleen(this.f1278h);
            case 2:
                return getNom();
            case 3:
                return new WDChaine(m1815d());
            case 4:
                return new WDChaine(this.f1275d);
            case 5:
                return m1824t();
            case 6:
                return m1821o();
            case 7:
                return m1816e();
            case 8:
                return m1818g();
            case 9:
                return m1819i();
            case 10:
                return m1825u();
            case 11:
                return getNote();
            case 12:
                return getSource();
            case 13:
                return m1823s();
            case 14:
                return new WDEntier8(m1831h());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getSource() {
        if (this.f1279i == null) {
            this.f1279i = new C0603n(this);
        }
        return this.f1279i;
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f1273z[9], getNomType()));
        return null;
    }

    /* renamed from: h */
    public final long m1831h() {
        return this.f1277g;
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: j */
    public final void m1832j() throws C0606q {
        Throwable th;
        boolean z = false;
        try {
            int i;
            if (this.f1277g < 0) {
                i = 0;
            } else if (m1836p()) {
                i = m1817f().delete(RawContacts.CONTENT_URI, f1273z[3], new String[]{String.valueOf(this.f1277g)});
            } else {
                Cursor query;
                try {
                    query = m1817f().query(Contacts.CONTENT_URI, new String[]{f1273z[2]}, f1273z[3], new String[]{String.valueOf(this.f1277g)}, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                i = m1817f().delete(Uri.withAppendedPath(Contacts.CONTENT_LOOKUP_URI, C0830a.m4260b(query, f1273z[2])), null, null);
                                C0830a.m4258a(query);
                            }
                        } catch (C0606q e) {
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    i = 0;
                    C0830a.m4258a(query);
                } catch (Throwable th3) {
                    th = th3;
                    query = null;
                    C0830a.m4258a(query);
                    throw th;
                }
            }
            if (i <= 1) {
                z = true;
            }
            try {
                C0691a.m2860a(z, f1273z[1]);
                if (i == 0) {
                    throw new C0606q(C0745b.m3222b(f1273z[0], new String[0]));
                }
                mo2437a();
            } catch (C0606q e2) {
                throw e2;
            }
        } catch (C0606q e22) {
            throw e22;
        }
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1272e;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Tr;
    }

    /* renamed from: n */
    public final long m1835n() {
        return m1836p() ? this.f1280j : this.f1277g;
    }

    /* renamed from: p */
    public final boolean m1836p() {
        return this.f1280j >= 0;
    }

    /* renamed from: r */
    public final void m1837r() throws C0606q {
        try {
            if (this.f1277g < 0) {
                throw new C0606q(C0745b.m3222b(f1273z[14], new String[0]));
            }
            ArrayList b = m1805b();
            try {
                int size = this.f1274c != null ? this.f1274c.size() : 0;
                for (int i = 0; i < size; i++) {
                    Iterator j = ((C0584d) this.f1274c.valueAt(i)).m2064j();
                    if (j != null) {
                        while (j.hasNext()) {
                            try {
                                C0570j c0570j = (C0570j) j.next();
                                try {
                                    if (c0570j.m1879b() >= 0) {
                                        try {
                                            if (c0570j.m1881d()) {
                                                b.add(c0570j.mo2459a().build());
                                            }
                                        } catch (Exception e) {
                                            throw e;
                                        }
                                    } else if (m1836p()) {
                                        b.add(c0570j.mo2460a(this.f1277g).build());
                                    } else {
                                        Cursor query = m1817f().query(RawContacts.CONTENT_URI, new String[]{f1273z[7]}, f1273z[12], new String[]{String.valueOf(this.f1277g)}, null);
                                        try {
                                            query.moveToFirst();
                                            while (!query.isAfterLast()) {
                                                b.add(c0570j.mo2460a(C0830a.m4261c(query, f1273z[7])).build());
                                                query.moveToNext();
                                            }
                                            C0830a.m4258a(query);
                                        } catch (Exception e2) {
                                            throw e2;
                                        } catch (Throwable th) {
                                            C0830a.m4258a(query);
                                        }
                                    }
                                } catch (Exception e22) {
                                    throw e22;
                                } catch (Exception e222) {
                                    throw e222;
                                }
                            } catch (Exception e2222) {
                                throw e2222;
                            }
                        }
                        continue;
                    }
                }
                try {
                    m1817f().applyBatch(f1273z[15], b);
                    m1829a(this.f1277g, m1836p());
                } catch (Exception e22222) {
                    throw new C0606q(C0745b.m3222b(f1273z[13], new String[0]), e22222.getMessage());
                }
            } catch (Exception e222222) {
                throw e222222;
            }
        } catch (Exception e2222222) {
            throw e2222222;
        }
    }

    public void razVariable() {
        super.razVariable();
        this.f1275d = "";
        this.f1277g = -1;
        this.f1280j = -1;
        this.f1278h = false;
        m1822q();
    }

    public void release() {
        super.release();
        this.f1275d = null;
        if (this.f1274c != null) {
            int size = this.f1274c.size();
            for (int i = 0; i < size; i++) {
                ((C0584d) this.f1274c.valueAt(i)).release();
            }
        }
        this.f1276f = null;
    }

    public void setNom(String str) {
        if (this.f1276f == null) {
            m1820m();
        }
        C0602m.access$000(this.f1276f, str);
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0594e.f1377a[eWDPropriete.ordinal()]) {
            case 1:
                m1812b(wDObjet.getBoolean());
                return;
            case 2:
                setNom(wDObjet.getString());
                return;
            case 3:
                m1810a(wDObjet.getString());
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                WDErreurManager.m2883a(C0745b.m3222b(f1273z[8], eWDPropriete.getNom()));
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C0594e.f1377a[eWDPropriete.ordinal()]) {
            case 2:
                setNom(str);
                return;
            case 3:
                m1810a(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, boolean z) {
        switch (C0594e.f1377a[eWDPropriete.ordinal()]) {
            case 1:
                m1812b(z);
                return;
            default:
                super.setProp(eWDPropriete, z);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
    }
}
