package fr.pcsoft.wdjava.ui.searchbar;

import android.app.Activity;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import fr.pcsoft.wdjava.core.application.C0648f;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

public class WDSearchHistory extends ContentProvider {
    /* renamed from: a */
    private static final String f4488a = m10344z(m10345z("g`zP@GD]v"));
    /* renamed from: b */
    private static final int f4489b = 1;
    /* renamed from: c */
    private static final int f4490c = 1000;
    /* renamed from: e */
    private static final int f4491e = 10;
    /* renamed from: z */
    private static final String[] f4492z;
    /* renamed from: d */
    private UriMatcher f4493d = null;

    static {
        r0 = new String[22];
        r0[0] = m10344z(m10345z("uoj\u001b\u0001me|Z\tg/m@\u0012pn|\u001b\u0004js!C\u000eg/o[\u0004qngQNpdoG\u0003k/}@\u0007dd}A"));
        r0[1] = m10344z(m10345z("Vsg\u0015\tmba[\u000evd.Z\u0015#h`C\u0001ohjP"));
        r0[2] = m10344z(m10345z("th`Q\u000ft^`T\rf!3\u0015_"));
        r0[3] = m10344z(m10345z("rtkG\u0019#@]\u0015\u0013vfiP\u0013w^g[\u0014fozj\u0011vd|L"));
        r0[4] = m10344z(m10345z("\\hj"));
        r0[5] = m10344z(m10345z("3!Of@ptiR\u0005puQS\u000fqloA"));
        r0[6] = m10344z(m10345z("rtkG\u0019#@]\u0015\u0013vfiP\u0013w^zP\u0018w^?"));
        r0[7] = m10344z(m10345z("#@@q@rtkG\u0019#MG~%#>"));
        r0[8] = m10344z(m10345z("pdoG\u0003k^f\\\u0013wn|L"));
        r0[9] = m10344z(m10345z("#G\\z-#"));
        r0[10] = m10344z(m10345z("FbfP\u0003#ek\u0015\fb!|Ü\u0004vbz\\\u000fm!jP@o&f\\\u0013wn|\\\u0011vd.Q\u0005p!|P\u0003kd|V\bf/"));
        r0[11] = m10344z(m10345z("#H@\u0015HPDBp#W!"));
        r0[12] = m10344z(m10345z("#VFp2F!"));
        r0[13] = m10344z(m10345z("#MGx)W!#\u0004@LGHf%W!"));
        r0[14] = m10344z(m10345z("#N\\q%Q!Ll@"));
        r0[15] = m10344z(m10345z("th`Q\u000ft^`T\rf"));
        r0[16] = m10344z(m10345z("#<.\u0017"));
        r0[17] = m10344z(m10345z("Mn`\u0015\tnqbÜ\rfozÜ"));
        r0[18] = m10344z(m10345z(",vcj\u0006njQ\\\u000ewd|[\u0001o.}P\u0001qbfj\bjrzZ\u0012z"));
        r0[19] = m10344z(m10345z("pdoG\u0003k^}@\u0007dd}A?rtkG\u0019"));
        r0[20] = m10344z(m10345z("FbfP\u0003#ek\u0015\f$`dZ\u0015w!jP@o&f\\\u0013wn|\\\u0011vd.Q\u0005#skV\bfbfPN"));
        r0[21] = m10344z(m10345z("rtkG\u0019"));
        f4492z = r0;
    }

    /* renamed from: a */
    private final String m10339a() {
        Activity a = C1056i.m7562a();
        if (!(a instanceof WDActivite)) {
            return null;
        }
        WDFenetre b = ((WDActivite) a).mo1766b();
        if (b == null) {
            return null;
        }
        try {
            return b.getName();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private static final void m10340a(ContentResolver contentResolver, Uri uri, int i, String str) {
        String str2 = null;
        if (i > 0 || str != null) {
            try {
                StringBuilder append = new StringBuilder(f4492z[4]).append(f4492z[11]).append(f4492z[4]).append(f4492z[9]).append(f4492z[8]);
                if (!C0808l.m4053k(str)) {
                    append.append(f4492z[12]).append(f4492z[15]).append(f4492z[16]).append(str).append("\"");
                }
                if (i > 0) {
                    append.append(f4492z[14]).append(f4488a).append(f4492z[13]).append(String.valueOf(i));
                }
                append.append(")");
                str2 = append.toString();
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                C0691a.m2857a(f4492z[10], e3);
                return;
            }
        }
        contentResolver.delete(uri, str2, null);
    }

    /* renamed from: a */
    public static final void m10341a(String str) {
        m10340a(WDAppManager.m2544C().getContentResolver(), WDAppManager.m2588o().m2641a(f4492z[8]), 0, str);
    }

    /* renamed from: a */
    public static final void m10342a(String str, String str2) {
        try {
            if (!C0808l.m4053k(str2)) {
                new C1492d(str2, str).start();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: b */
    private final UriMatcher m10343b() {
        try {
            if (this.f4493d == null) {
                this.f4493d = new UriMatcher(-1);
                this.f4493d.addURI(WDAppManager.m2544C().getPackageName(), f4492z[19], 1);
            }
            return this.f4493d;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m10344z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 3;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 14;
                    break;
                case 3:
                    i2 = 53;
                    break;
                default:
                    i2 = 96;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10345z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 96);
        }
        return toCharArray;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (uri != null) {
            try {
                String path = uri.getPath();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        path = null;
        if (uri != null) {
            try {
                if (path.equals(f4492z[18])) {
                    int delete = WDAppManager.m2588o().getWritableDatabase().delete(f4492z[8], str, strArr);
                    getContext().getContentResolver().notifyChange(uri, null);
                    return delete;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        throw new IllegalArgumentException(f4492z[1]);
    }

    public String getType(Uri uri) {
        try {
            if (m10343b().match(uri) == 1) {
                return f4492z[0];
            }
            throw new IllegalArgumentException(f4492z[1]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        if (uri != null) {
            try {
                String path = uri.getPath();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        path = null;
        if (uri != null) {
            try {
                if (path.equals(f4492z[18])) {
                    C0648f o = WDAppManager.m2588o();
                    long insert = o.getWritableDatabase().insert(f4492z[8], f4492z[21], contentValues);
                    if (insert > 0) {
                        Uri withAppendedPath = Uri.withAppendedPath(o.m2641a(f4492z[8]), String.valueOf(insert));
                        getContext().getContentResolver().notifyChange(withAppendedPath, null);
                        return withAppendedPath;
                    }
                    throw new IllegalArgumentException(f4492z[20]);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        throw new IllegalArgumentException(f4492z[1]);
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (m10343b().match(uri) == 1) {
            String[] strArr3;
            Cursor query;
            SQLiteDatabase readableDatabase = WDAppManager.m2588o().getReadableDatabase();
            String str3 = f4492z[2];
            if (strArr2 != null) {
                try {
                    if (!(strArr2.length == 0 || C0808l.m4053k(strArr2[0]))) {
                        strArr3 = new String[]{m10339a(), strArr2[0] + "%"};
                        str3 = str3 + f4492z[7];
                        query = readableDatabase.query(f4492z[8], new String[]{f4492z[5], f4492z[6], f4492z[3], f4492z[4]}, str3, strArr3, null, null, f4488a, String.valueOf(10));
                        query.setNotificationUri(getContext().getContentResolver(), uri);
                        return query;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            strArr3 = new String[]{m10339a()};
            query = readableDatabase.query(f4492z[8], new String[]{f4492z[5], f4492z[6], f4492z[3], f4492z[4]}, str3, strArr3, null, null, f4488a, String.valueOf(10));
            query.setNotificationUri(getContext().getContentResolver(), uri);
            return query;
        }
        throw new IllegalArgumentException(f4492z[1]);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(f4492z[17]);
    }
}
