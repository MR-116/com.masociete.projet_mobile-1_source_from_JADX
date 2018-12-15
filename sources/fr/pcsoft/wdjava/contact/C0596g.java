package fr.pcsoft.wdjava.contact;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.Contacts.ContactMethods;
import android.provider.Contacts.Groups;
import android.provider.Contacts.Organizations;
import android.provider.Contacts.People;
import android.provider.Contacts.Phones;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0770p;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;

/* renamed from: fr.pcsoft.wdjava.contact.g */
public class C0596g extends C0595f {
    /* renamed from: a */
    private static final String[] f1379a;
    /* renamed from: b */
    protected static final String f1380b = C0596g.m2182z(C0596g.m2183z("-J\u000eGG-Q?ZB"));
    /* renamed from: c */
    private static boolean f1381c = false;
    /* renamed from: d */
    private static final String f1382d = C0596g.m2182z(C0596g.m2183z("*L\u0013CJ/\\?]G#@@ru\r"));
    /* renamed from: e */
    private static final String[] f1383e;
    /* renamed from: f */
    public static final int f1384f = 2;
    /* renamed from: g */
    private static boolean f1385g = false;
    /* renamed from: h */
    public static final int f1386h = 4;
    /* renamed from: i */
    protected static final String f1387i = C0596g.m2182z(C0596g.m2183z("-J\u000eGC QZ\u001c\t-J\r\u001dG A\u0012\\O*\u000b\u0003\\H:D\u0003GUaW\u0001Dy-J\u000eGG-Q\u0013"));
    /* renamed from: j */
    private static final String[] f1388j;
    /* renamed from: k */
    private static Cursor f1389k = null;
    /* renamed from: l */
    private static final String[] f1390l;
    /* renamed from: m */
    public static final int f1391m = 3;
    /* renamed from: n */
    private static long f1392n = -1;
    /* renamed from: o */
    private static final String[] f1393o;
    /* renamed from: p */
    protected static final String f1394p = C0596g.m2182z(C0596g.m2183z("-J\u000eGC QZ\u001c\t-J\r\u001dG A\u0012\\O*\u000b\u0003\\H:D\u0003GUaF\u000f]R/F\u0014@"));
    /* renamed from: q */
    public static final int f1395q = 1;
    /* renamed from: r */
    private static final String f1396r = (C0596g.m2168c() ? f1397z[5] : C0596g.m2182z(C0596g.m2183z("\u001e@\u000fCJ+\u000b?ZB")));
    /* renamed from: z */
    private static final String[] f1397z;

    static {
        r0 = new String[46];
        r0[0] = C0596g.m2182z(C0596g.m2183z(">@\u0012@I "));
        r0[1] = C0596g.m2182z(C0596g.m2183z(":\\\u0010V"));
        r0[2] = C0596g.m2182z(C0596g.m2183z("%L\u000eW"));
        r0[3] = C0596g.m2182z(C0596g.m2183z("*D\u0014R"));
        r0[4] = C0596g.m2182z(C0596g.m2183z(">@\u0012@I \u0005]\u0013\u0019nd.w\u0006%L\u000eW\u0006s\u0005_"));
        r0[5] = C0596g.m2182z(C0596g.m2183z("\u0011L\u0004"));
        r0[6] = C0596g.m2182z(C0596g.m2183z("-J\u000eGG-Q?ZBs\u001a"));
        r0[7] = C0596g.m2182z(C0596g.m2183z("m`2ay\u0007a?pi\u0000q!pr"));
        r0[8] = C0596g.m2182z(C0596g.m2183z(" P\rQC<"));
        r0[9] = C0596g.m2182z(C0596g.m2183z("nl.\u0013\u000e"));
        r0[10] = C0596g.m2182z(C0596g.m2183z("=Q\u0001AT+A"));
        r0[11] = C0596g.m2182z(C0596g.m2183z("m`2ac\u001bw?~i\nl&le\u0001k4re\u001a"));
        r0[12] = C0596g.m2182z(C0596g.m2183z(">@\u0012@I \u0018@\f\u0006\u000fk$\u0013M'K\u0004\u000e\u0014nd.w\u0006:\\\u0010V\u0006\u0007k@\u001b\u0017b\u0017I"));
        r0[13] = C0596g.m2182z(C0596g.m2183z(":L\rVU\u0011F\u000f]R/F\u0014VB"));
        r0[14] = C0596g.m2182z(C0596g.m2183z(" J\u0014VU"));
        r0[15] = C0596g.m2182z(C0596g.m2183z("=@\u000eWy:J?EI'F\u0005^G'I"));
        r0[16] = C0596g.m2182z(C0596g.m2183z("-P\u0013GI#z\u0012ZH)Q\u000f]C"));
        r0[17] = C0596g.m2182z(C0596g.m2183z(">M\u000fGI\u0011S\u0005AU'J\u000e"));
        r0[18] = C0596g.m2182z(C0596g.m2183z("/K\u0004AI'ANCC<H\t@U'J\u000e\u001dq\u001cl4vy\rj.gg\rq3"));
        r0[19] = C0596g.m2182z(C0596g.m2183z(" D\rV"));
        r0[20] = C0596g.m2182z(C0596g.m2183z("*L\u0013CJ/\\?]G#@"));
        r0[21] = C0596g.m2182z(C0596g.m2183z(">@\u0012@I \u0018@\f\u0006\u000fk$\u0013M'K\u0004\u000e\u0017"));
        r0[22] = C0596g.m2182z(C0596g.m2183z(">@\u0012@I \u0018@\f\u0006\u000fk$\u0013R7U\u0005\u0013o\u0000\u0005H\u0006\nz\tQ\u001f\u0014b\u0012L\u0005\n}\f"));
        r0[23] = C0596g.m2182z(C0596g.m2183z("/K\u0004AI'ANCC<H\t@U'J\u000e\u001dt\u000bd$le\u0001k4re\u001av"));
        r0[24] = C0596g.m2182z(C0596g.m2183z(">@\u0012@I \u0018@\f\u0006\u000fk$\u0013R7U\u0005\u000e\u0017"));
        r0[25] = C0596g.m2182z(C0596g.m2183z("\"D\u0013Gy:L\rVy-J\u000eGG-Q\u0005W"));
        r0[26] = C0596g.m2182z(C0596g.m2183z(">M\u000f]C:L\u0003lH/H\u0005"));
        r0[27] = C0596g.m2182z(C0596g.m2183z(":L\u0014_C"));
        r0[28] = C0596g.m2182z(C0596g.m2183z("-J\rCG \\"));
        r0[29] = C0596g.m2182z(C0596g.m2183z("!W\u0007RH'_\u0001GO!K\u0013"));
        r0[30] = C0596g.m2182z(C0596g.m2183z("m`2ay\u0002`#gs\u001c`?zh\bj?pi\u0000q!pr"));
        r0[31] = C0596g.m2182z(C0596g.m2183z("s\u001a"));
        r0[32] = C0596g.m2182z(C0596g.m2183z(">M\u000f]C="));
        r0[33] = C0596g.m2182z(C0596g.m2183z("-J\rCG \\@o\u0005`@\f"));
        r0[34] = C0596g.m2182z(C0596g.m2183z("*D\u0014R\u0006\u0002l+v\u0006q"));
        r0[35] = C0596g.m2182z(C0596g.m2183z(" D\rV\u0006\u0002l+v\u0006q"));
        r0[36] = C0596g.m2182z(C0596g.m2183z("nd.w\u0006"));
        r0[37] = C0596g.m2182z(C0596g.m2183z("md5ps\u0000z#|h\u001ad#gy\u0002p"));
        r0[38] = C0596g.m2182z(C0596g.m2183z("\u001eJ\u0013ZR'J\u000e\u0013O S\u0001_O*@"));
        r0[39] = C0596g.m2182z(C0596g.m2183z("md5ps\u0000z0rt\rj5au\u0011f/}r\u000ff4lg\u0003j2pc"));
        r0[40] = C0596g.m2182z(C0596g.m2183z("m`2ac\u001bw?`s\u001eu2vu\u001dl/}y\rj.gg\rq"));
        r0[41] = C0596g.m2182z(C0596g.m2183z("m`2ay\u0000j?pi\u0000q!pr\u0011f/ft\u000fk4"));
        r0[42] = C0596g.m2182z(C0596g.m2183z("\u0011L\u0004\u000e\u0019"));
        r0[43] = C0596g.m2182z(C0596g.m2183z(">@\u0012@I \u0005]\u0013\u0019"));
        r0[44] = C0596g.m2182z(C0596g.m2183z("=\\\u0013GC#z\tW\u001bif\u000f]R/F\u0014@\u0001"));
        r0[45] = C0596g.m2182z(C0596g.m2183z("m`2ac\u001bw?rl\u0001p4le\u0001k4re\u001a"));
        f1397z = r0;
        try {
            f1390l = new String[]{f1397z[5], f1397z[20], f1397z[14]};
            f1393o = new String[]{f1397z[8], f1397z[1]};
            f1388j = new String[]{f1397z[3], f1397z[1]};
            f1383e = new String[]{f1397z[3]};
            f1379a = new String[]{f1397z[27], f1397z[28]};
            WDProjet.getInstance().ajouterEcouteurProjet(new C0562a());
        } catch (SQLiteException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private static final Cursor m2154a(boolean z, String[] strArr) {
        if (z) {
            try {
                if (f1389k != null) {
                    if (!f1385g && strArr == null) {
                        f1389k.requery();
                    }
                }
                try {
                    if (f1389k != null) {
                        f1389k.close();
                    }
                    try {
                        f1385g = strArr != null;
                        if (f1385g) {
                            f1389k = WDAppManager.m2553L().query(People.CONTENT_URI, f1390l, f1396r + f1397z[9] + C0808l.m4024a(strArr, ",") + ")", null, f1382d);
                        } else {
                            f1389k = WDAppManager.m2553L().query(People.CONTENT_URI, f1390l, null, null, f1382d);
                        }
                    } catch (SQLiteException e) {
                        throw e;
                    }
                } catch (SQLiteException e2) {
                    throw e2;
                }
            } catch (SQLiteException e22) {
                throw e22;
            } catch (SQLiteException e222) {
                try {
                    throw e222;
                } catch (SQLiteException e2222) {
                    throw e2222;
                }
            }
        }
        return f1389k;
    }

    /* renamed from: a */
    private static void m2155a() {
        try {
            if (f1389k != null) {
                if (!f1389k.isClosed()) {
                    f1389k.close();
                }
                f1389k = null;
            }
        } catch (SQLiteException e) {
            throw e;
        } catch (SQLiteException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static final void m2156a(int i, String[] strArr, int i2) throws C0606q {
        try {
            WDAppManager.m2565a(f1397z[23]);
            try {
                WDStructContact.m1843a();
                boolean z = i == 1 || i == 4;
                Cursor a = C0596g.m2154a(z, strArr);
                if (a == null) {
                    try {
                        throw new C0606q(C0745b.m3222b(f1397z[39], new String[0]));
                    } catch (C0653m e) {
                        throw e;
                    }
                }
                switch (i) {
                    case 1:
                        z = a.moveToFirst();
                        break;
                    case 2:
                        z = a.moveToNext();
                        break;
                    case 3:
                        z = a.moveToPrevious();
                        break;
                    case 4:
                        z = a.moveToLast();
                        break;
                    default:
                        C0691a.m2856a(f1397z[38]);
                        z = false;
                        break;
                }
                try {
                    if (f1381c && r0 && i != 1 && i != 4) {
                        int position = a.getPosition();
                        a.requery();
                        z = a.moveToPosition(position);
                    }
                    f1381c = false;
                    try {
                        try {
                            WDStructContact.EnDehors.setValeur(!z);
                            if (z) {
                                try {
                                    C0596g.m2160a(a, i2);
                                } catch (SQLiteException e2) {
                                    throw new C0606q(C0745b.m3222b(f1397z[30], new String[0]), e2.getMessage());
                                }
                            } else if (i == 1 || i == 4) {
                                try {
                                    throw new C0606q(C0745b.m3222b(f1397z[37], new String[0]));
                                } catch (C0653m e3) {
                                    throw e3;
                                }
                            } else {
                                throw new C0606q("");
                            }
                        } catch (C0606q e4) {
                            throw e4;
                        }
                    } catch (C0653m e32) {
                        throw e32;
                    }
                } catch (Throwable th) {
                    f1381c = false;
                }
            } catch (C0653m e322) {
                throw e322;
            } catch (C0653m e3222) {
                throw e3222;
            }
        } catch (C0653m e32222) {
            throw new C0606q((int) C0607n.Le, e32222.getMessage());
        }
    }

    /* renamed from: a */
    private static final void m2157a(long j) throws SQLiteException {
        if (j > 0) {
            Cursor query = WDAppManager.m2553L().query(ContactMethods.CONTENT_URI, f1388j, f1397z[4], new String[]{String.valueOf(j), String.valueOf(2)}, null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex(f1397z[3]);
                    if (columnIndex >= 0) {
                        while (query.moveToNext()) {
                            String string = query.getString(columnIndex);
                            int columnIndex2 = query.getColumnIndex(f1397z[1]);
                            switch (columnIndex2 >= 0 ? query.getInt(columnIndex2) : -1) {
                                case 1:
                                    WDStructContact.AdresseDomicile.setValeur(string);
                                    break;
                                case 2:
                                    WDStructContact.AdresseBureau.setValeur(string);
                                    break;
                                default:
                                    break;
                            }
                            columnIndex = columnIndex2;
                        }
                    }
                    query.close();
                } catch (SQLiteException e) {
                    throw e;
                } catch (SQLiteException e2) {
                    throw e2;
                } catch (SQLiteException e22) {
                    throw e22;
                } catch (Throwable th) {
                    query.close();
                }
            }
        }
    }

    /* renamed from: a */
    private static final void m2158a(long j, ContentResolver contentResolver) {
        ContentValues contentValues = new ContentValues(4);
        try {
            contentValues.put(f1397z[0], Long.valueOf(j));
            if (WDStructContact.Societe.getString().equals("")) {
                if (WDStructContact.Service.getString().equals("")) {
                    return;
                }
            }
            contentValues.put(f1397z[28], WDStructContact.Societe.getString());
            contentValues.put(f1397z[27], WDStructContact.Service.getString());
            contentValues.put(f1397z[1], Integer.valueOf(1));
            contentResolver.insert(Organizations.CONTENT_URI, contentValues);
        } catch (SQLiteException e) {
            throw e;
        } catch (SQLiteException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private static final void m2159a(long j, Uri uri, ContentResolver contentResolver) {
        ContentValues contentValues = new ContentValues(4);
        String d = C0596g.m2169d();
        try {
            if (!d.equals("")) {
                contentValues.put(f1397z[0], Long.valueOf(j));
                contentValues.put(f1397z[2], Integer.valueOf(2));
                contentValues.put(f1397z[1], Integer.valueOf(1));
                contentValues.put(f1397z[3], d);
                contentResolver.insert(Uri.withAppendedPath(uri, ContactMethods.CONTENT_URI.getPath()), contentValues);
            }
            d = C0596g.m2175g();
            try {
                if (!d.equals("")) {
                    contentValues.put(f1397z[0], Long.valueOf(j));
                    contentValues.put(f1397z[2], Integer.valueOf(2));
                    contentValues.put(f1397z[1], Integer.valueOf(2));
                    contentValues.put(f1397z[3], d);
                    contentResolver.insert(Uri.withAppendedPath(uri, ContactMethods.CONTENT_URI.getPath()), contentValues);
                }
            } catch (SQLiteException e) {
                throw e;
            }
        } catch (SQLiteException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private static final void m2160a(Cursor cursor, int i) throws SQLiteException {
        int columnIndex = cursor.getColumnIndex(f1397z[5]);
        if (columnIndex >= 0) {
            try {
                long j = cursor.getLong(columnIndex);
            } catch (SQLiteException e) {
                throw e;
            }
        }
        j = 0;
        try {
            WDStructContact.ID.setValeur(j);
            if (i == 0 || (i & 1) == 1) {
                int columnIndex2 = cursor.getColumnIndex(f1397z[20]);
                try {
                    WDStructContact.Nom.setValeur(columnIndex2 >= 0 ? cursor.getString(columnIndex2) : "");
                    columnIndex2 = cursor.getColumnIndex(f1397z[14]);
                    try {
                        WDStructContact.Notes.setValeur(columnIndex2 >= 0 ? cursor.getString(columnIndex2) : "");
                    } catch (SQLiteException e2) {
                        throw e2;
                    }
                } catch (SQLiteException e22) {
                    throw e22;
                }
            }
            if (i == 0 || (i & 2) == 2) {
                try {
                    C0596g.m2167c(j);
                } catch (SQLiteException e222) {
                    throw e222;
                }
            }
            if (i == 0 || (i & 8) == 8) {
                try {
                    C0596g.m2157a(j);
                } catch (SQLiteException e2222) {
                    throw e2222;
                }
            }
            if (i == 0 || (i & 4) == 4) {
                try {
                    C0596g.m2178h(j);
                } catch (SQLiteException e22222) {
                    throw e22222;
                }
            }
            if (i == 0 || (i & 16) == 16) {
                try {
                    C0596g.m2164b(j);
                } catch (SQLiteException e222222) {
                    throw e222222;
                }
            }
        } catch (SQLiteException e2222222) {
            throw e2222222;
        }
    }

    /* renamed from: a */
    public static final void m2161a(WDObjet[] wDObjetArr, boolean z) throws C0606q {
        try {
            Cursor query;
            Throwable th;
            WDAppManager.m2565a(f1397z[23]);
            int length = wDObjetArr.length / 2;
            int i = 0;
            String[] strArr = null;
            while (i < length) {
                String[] strArr2;
                String string = wDObjetArr[i * 2].getString();
                String str = z ? "%" + string + "%" : string;
                int i2 = wDObjetArr[(i * 2) + 1].getInt();
                ContentResolver L = WDAppManager.m2553L();
                String str2 = "";
                String str3 = "";
                String str4;
                switch (i2) {
                    case 1:
                    case 4:
                        try {
                            str4 = f1396r;
                            query = L.query(People.CONTENT_URI, new String[]{f1397z[5]}, f1397z[35] + (strArr != null ? f1397z[36] + str4 + f1397z[9] + C0808l.m4024a(strArr, ",") + ")" : str3), new String[]{str}, null);
                            string = str4;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            query = null;
                            break;
                        }
                    case 2:
                        str4 = f1397z[0];
                        query = L.query(ContactMethods.CONTENT_EMAIL_URI, new String[]{str4}, f1397z[34] + (strArr != null ? f1397z[36] + str4 + f1397z[9] + C0808l.m4024a(strArr, ",") + ")" : str3), new String[]{str}, null);
                        string = str4;
                        break;
                    case 3:
                        str4 = f1397z[0];
                        query = L.query(Organizations.CONTENT_URI, new String[]{str4}, f1397z[33] + (strArr != null ? f1397z[36] + str4 + f1397z[9] + C0808l.m4024a(strArr, ",") + ")" : str3), new String[]{str}, null);
                        string = str4;
                        break;
                    default:
                        string = str2;
                        query = null;
                        break;
                }
                if (query != null) {
                    try {
                        strArr2 = new String[query.getCount()];
                        int columnIndex = query.getColumnIndex(string);
                        int i3 = 0;
                        while (query.moveToNext()) {
                            i2 = i3 + 1;
                            strArr2[i3] = query.getString(columnIndex);
                            i3 = i2;
                        }
                    } catch (C0653m e) {
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    strArr2 = strArr;
                }
                if (query != null) {
                    try {
                        query.close();
                    } catch (C0653m e2) {
                        throw e2;
                    }
                }
                i++;
                strArr = strArr2;
            }
            C0596g.m2156a(1, strArr, 0);
            return;
            if (query != null) {
                try {
                    query.close();
                } catch (C0653m e22) {
                    throw e22;
                }
            }
            throw th;
        } catch (C0653m e222) {
            throw new C0606q((int) C0607n.Le, e222.getMessage());
        }
    }

    /* renamed from: a */
    public static final boolean m2162a(boolean z) throws C0606q {
        try {
            WDAppManager.m2565a(f1397z[23]);
            try {
                long a = C0595f.m2149a(C0596g.m2168c() ? Uri.parse(f1394p) : People.CONTENT_URI, z);
                if (a >= 0) {
                    try {
                        if (C0596g.m2168c()) {
                            a = C0596g.m2180i(a);
                        }
                        C0596g.m2170d(a);
                    } catch (C0653m e) {
                        throw e;
                    }
                }
                return a >= 0;
            } catch (C0653m e2) {
                throw e2;
            }
        } catch (C0653m e22) {
            throw new C0606q((int) C0607n.Le, e22.getMessage());
        }
    }

    /* renamed from: b */
    public static final void m2163b() throws C0606q {
        Cursor query;
        Exception e;
        Cursor cursor;
        Throwable th;
        try {
            WDAppManager.m2565a(f1397z[23], f1397z[18]);
            long i = C0596g.m2179i();
            try {
                ContentResolver L = WDAppManager.m2553L();
                String e2 = C0596g.m2171e();
                Uri withAppendedId = ContentUris.withAppendedId(People.CONTENT_URI, i);
                query = L.query(withAppendedId, null, null, null, null);
                try {
                    if (query.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(f1397z[14], WDStructContact.Notes.getString());
                        contentValues.put(f1397z[19], e2);
                        contentValues.put(f1397z[20], e2);
                        int columnIndex = query.getColumnIndex(f1397z[16]);
                        if (columnIndex >= 0) {
                            contentValues.put(f1397z[16], query.getString(columnIndex));
                        }
                        columnIndex = query.getColumnIndex(f1397z[25]);
                        if (columnIndex >= 0) {
                            contentValues.put(f1397z[25], Integer.valueOf(query.getInt(columnIndex)));
                        }
                        columnIndex = query.getColumnIndex(f1397z[26]);
                        if (columnIndex >= 0) {
                            contentValues.put(f1397z[26], query.getString(columnIndex));
                        }
                        columnIndex = query.getColumnIndex(f1397z[17]);
                        if (columnIndex >= 0) {
                            contentValues.put(f1397z[17], query.getString(columnIndex));
                        }
                        columnIndex = query.getColumnIndex(f1397z[15]);
                        if (columnIndex >= 0) {
                            contentValues.put(f1397z[15], Integer.valueOf(query.getInt(columnIndex)));
                        }
                        columnIndex = query.getColumnIndex(f1397z[10]);
                        if (columnIndex >= 0) {
                            contentValues.put(f1397z[10], Integer.valueOf(query.getInt(columnIndex)));
                        }
                        columnIndex = query.getColumnIndex(f1397z[13]);
                        if (columnIndex >= 0) {
                            contentValues.put(f1397z[13], Integer.valueOf(query.getInt(columnIndex)));
                        }
                        if (L.update(withAppendedId, contentValues, null, null) > 0) {
                            L.delete(Phones.CONTENT_URI, f1397z[22], new String[]{String.valueOf(i)});
                            C0596g.m2165b(i, L);
                            L.delete(ContactMethods.CONTENT_URI, f1397z[12], new String[]{String.valueOf(i)});
                            C0596g.m2159a(i, withAppendedId, L);
                            L.delete(ContactMethods.CONTENT_URI, f1397z[21], new String[]{String.valueOf(i)});
                            C0596g.m2166b(i, withAppendedId, L);
                            L.delete(Organizations.CONTENT_URI, f1397z[24], new String[]{String.valueOf(i)});
                            C0596g.m2158a(i, L);
                        }
                    }
                    if (query != null) {
                        try {
                            query.close();
                        } catch (C0653m e3) {
                            throw e3;
                        }
                    }
                } catch (C0653m e32) {
                    throw e32;
                } catch (C0653m e322) {
                    throw e322;
                } catch (C0653m e3222) {
                    throw e3222;
                } catch (C0653m e32222) {
                    throw e32222;
                } catch (C0653m e322222) {
                    throw e322222;
                } catch (C0653m e3222222) {
                    throw e3222222;
                } catch (C0653m e32222222) {
                    throw e32222222;
                } catch (C0653m e322222222) {
                    throw e322222222;
                } catch (Exception e4) {
                    e = e4;
                    cursor = query;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        try {
                            query.close();
                        } catch (C0653m e3222222222) {
                            throw e3222222222;
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                cursor = null;
                try {
                    throw new C0606q(C0745b.m3222b(f1397z[11], new String[0]), e.getMessage());
                } catch (Throwable th3) {
                    th = th3;
                    query = cursor;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (C0653m e32222222222) {
            throw new C0606q((int) C0607n.Le, e32222222222.getMessage());
        }
    }

    /* renamed from: b */
    private static final void m2164b(long j) throws SQLiteException {
        if (j > 0) {
            Cursor query = WDAppManager.m2553L().query(Uri.withAppendedPath(ContentUris.withAppendedId(People.CONTENT_URI, j), f1397z[29]), f1379a, null, null, null);
            if (query != null) {
                int columnIndex = query.getColumnIndex(f1397z[27]);
                int columnIndex2 = query.getColumnIndex(f1397z[28]);
                if (columnIndex >= 0 || columnIndex2 >= 0) {
                    while (query.moveToNext()) {
                        try {
                            int columnIndex3 = query.getColumnIndex(f1397z[1]);
                            switch (columnIndex3 >= 0 ? query.getInt(columnIndex3) : -1) {
                                case 1:
                                    String string;
                                    WDChaine wDChaine;
                                    if (columnIndex >= 0) {
                                        string = query.getString(columnIndex);
                                        wDChaine = WDStructContact.Service;
                                        if (string == null) {
                                            string = "";
                                        }
                                        wDChaine.setValeur(string);
                                    }
                                    if (columnIndex2 >= 0) {
                                        string = query.getString(columnIndex2);
                                        wDChaine = WDStructContact.Societe;
                                        if (string == null) {
                                            string = "";
                                        }
                                        wDChaine.setValeur(string);
                                        break;
                                    }
                                    continue;
                                default:
                                    break;
                            }
                        } catch (SQLiteException e) {
                            throw e;
                        } catch (SQLiteException e2) {
                            throw e2;
                        } catch (SQLiteException e22) {
                            throw e22;
                        } catch (SQLiteException e222) {
                            throw e222;
                        } catch (Throwable th) {
                            query.close();
                        }
                    }
                }
                query.close();
            }
        }
    }

    /* renamed from: b */
    private static final void m2165b(long j, ContentResolver contentResolver) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(f1397z[0], Long.valueOf(j));
        String string = WDStructContact.TelephoneDomicile.getString();
        try {
            if (!string.equals("")) {
                contentValues.put(f1397z[8], string);
                contentValues.put(f1397z[1], Integer.valueOf(1));
                contentResolver.insert(Phones.CONTENT_URI, contentValues);
            }
            string = WDStructContact.TelephoneBureau.getString();
            try {
                if (!string.equals("")) {
                    contentValues.put(f1397z[8], string);
                    contentValues.put(f1397z[1], Integer.valueOf(3));
                    contentResolver.insert(Phones.CONTENT_URI, contentValues);
                }
                string = WDStructContact.TelephoneMobile.getString();
                try {
                    if (!string.equals("")) {
                        contentValues.put(f1397z[8], string);
                        contentValues.put(f1397z[1], Integer.valueOf(2));
                        contentResolver.insert(Phones.CONTENT_URI, contentValues);
                    }
                    string = WDStructContact.TelephoneMobileBureau.getString();
                    try {
                        if (!string.equals("")) {
                            contentValues.put(f1397z[8], string);
                            contentValues.put(f1397z[1], Integer.valueOf(7));
                            contentResolver.insert(Phones.CONTENT_URI, contentValues);
                        }
                        string = WDStructContact.FaxDomicile.getString();
                        try {
                            if (!string.equals("")) {
                                contentValues.put(f1397z[8], string);
                                contentValues.put(f1397z[1], Integer.valueOf(5));
                                contentResolver.insert(Phones.CONTENT_URI, contentValues);
                            }
                            string = WDStructContact.FaxBureau.getString();
                            try {
                                if (!string.equals("")) {
                                    contentValues.put(f1397z[8], string);
                                    contentValues.put(f1397z[1], Integer.valueOf(4));
                                    contentResolver.insert(Phones.CONTENT_URI, contentValues);
                                }
                                string = WDStructContact.TelephonePager.getString();
                                try {
                                    if (!string.equals("")) {
                                        contentValues.put(f1397z[8], string);
                                        contentValues.put(f1397z[1], Integer.valueOf(6));
                                        contentResolver.insert(Phones.CONTENT_URI, contentValues);
                                    }
                                } catch (SQLiteException e) {
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                throw e2;
                            }
                        } catch (SQLiteException e22) {
                            throw e22;
                        }
                    } catch (SQLiteException e222) {
                        throw e222;
                    }
                } catch (SQLiteException e2222) {
                    throw e2222;
                }
            } catch (SQLiteException e22222) {
                throw e22222;
            }
        } catch (SQLiteException e222222) {
            throw e222222;
        }
    }

    /* renamed from: b */
    private static final void m2166b(long j, Uri uri, ContentResolver contentResolver) {
        int i = 1;
        ContentValues contentValues = new ContentValues(4);
        contentValues.put(f1397z[0], Long.valueOf(j));
        contentValues.put(f1397z[2], Integer.valueOf(1));
        contentValues.put(f1397z[1], Integer.valueOf(3));
        while (((long) i) <= WDStructContact.Email.mo2644p()) {
            WDObjet wDObjet = WDStructContact.Email.get(i);
            if (wDObjet != null) {
                try {
                    if (!wDObjet.getString().equals("")) {
                        contentValues.put(f1397z[3], wDObjet.getString());
                        contentResolver.insert(Uri.withAppendedPath(uri, ContactMethods.CONTENT_URI.getPath()), contentValues);
                    }
                } catch (SQLiteException e) {
                    throw e;
                }
            }
            i++;
        }
    }

    /* renamed from: c */
    private static final void m2167c(long j) throws SQLiteException {
        if (j > 0) {
            Cursor query = WDAppManager.m2553L().query(Uri.withAppendedPath(ContentUris.withAppendedId(People.CONTENT_URI, j), f1397z[32]), f1393o, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        int columnIndex = query.getColumnIndex(f1397z[8]);
                        if (columnIndex >= 0) {
                            String string = query.getString(columnIndex);
                            columnIndex = query.getColumnIndex(f1397z[1]);
                            switch (columnIndex >= 0 ? query.getInt(columnIndex) : -1) {
                                case 2:
                                    WDStructContact.TelephoneMobile.setValeur(string);
                                    break;
                                case 3:
                                    WDStructContact.TelephoneBureau.setValeur(string);
                                    break;
                                case 4:
                                    WDStructContact.FaxBureau.setValeur(string);
                                    break;
                                case 5:
                                    WDStructContact.FaxDomicile.setValeur(string);
                                    break;
                                case 6:
                                    WDStructContact.TelephonePager.setValeur(string);
                                    break;
                                case 7:
                                    WDStructContact.TelephoneMobileBureau.setValeur(string);
                                    break;
                                default:
                                    WDStructContact.TelephoneDomicile.setValeur(string);
                                    break;
                            }
                        }
                    } catch (SQLiteException e) {
                        throw e;
                    } catch (SQLiteException e2) {
                        throw e2;
                    } catch (Throwable th) {
                        query.close();
                    }
                }
                query.close();
            }
        }
    }

    /* renamed from: c */
    private static final boolean m2168c() {
        try {
            return kb.m3986p() >= 5;
        } catch (SQLiteException e) {
            throw e;
        }
    }

    /* renamed from: d */
    private static final String m2169d() {
        int i = 0;
        String[] strArr = new String[4];
        try {
            int i2;
            if (WDStructContact.AdresseDomicile.getString().equals("")) {
                i2 = 0;
            } else {
                strArr[0] = WDStructContact.AdresseDomicile.getString();
                i2 = 1;
            }
            try {
                if (!WDStructContact.EtatDomicile.getString().equals("")) {
                    strArr[i2] = WDStructContact.EtatDomicile.getString();
                    i2++;
                }
                try {
                    if (!WDStructContact.VilleDomicile.getString().equals("")) {
                        strArr[i2] = WDStructContact.VilleDomicile.getString();
                        i2++;
                    }
                    try {
                        if (!WDStructContact.PaysDomicile.getString().equals("")) {
                            strArr[i2] = WDStructContact.PaysDomicile.getString();
                            i2++;
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        while (i < i2) {
                            String str = strArr[i];
                            if (str != null) {
                                if (i > 0) {
                                    try {
                                        stringBuffer.append(" ");
                                    } catch (SQLiteException e) {
                                        throw e;
                                    }
                                }
                                stringBuffer.append(str);
                            }
                            i++;
                        }
                        return stringBuffer.toString();
                    } catch (SQLiteException e2) {
                        throw e2;
                    }
                } catch (SQLiteException e22) {
                    throw e22;
                }
            } catch (SQLiteException e222) {
                throw e222;
            }
        } catch (SQLiteException e2222) {
            throw e2222;
        }
    }

    /* renamed from: d */
    public static final void m2170d(long j) throws C0606q {
        try {
            WDAppManager.m2565a(f1397z[23]);
            Cursor query = WDAppManager.m2553L().query(ContentUris.withAppendedId(People.CONTENT_URI, j), null, null, null, null);
            try {
                boolean moveToFirst = query.moveToFirst();
                WDStructContact.EnDehors.setValeur(moveToFirst);
                if (moveToFirst) {
                    C0596g.m2160a(query, 0);
                    if (query != null) {
                        try {
                            query.close();
                            return;
                        } catch (C0653m e) {
                            throw e;
                        }
                    }
                    return;
                }
                throw new C0606q(C0745b.m3222b(f1397z[7], String.valueOf(j)));
            } catch (SQLiteException e2) {
                throw new C0606q(C0745b.m3222b(f1397z[30], new String[0]), e2.getMessage());
            } catch (C0606q e3) {
                throw e3;
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (C0653m e4) {
                        throw e4;
                    }
                }
            }
        } catch (C0653m e42) {
            throw new C0606q((int) C0607n.Le, e42.getMessage());
        }
    }

    /* renamed from: e */
    private static final String m2171e() {
        try {
            return (WDStructContact.Nom.getString().equals("") || WDStructContact.Prenom.getString().equals("")) ? !WDStructContact.Prenom.getString().equals("") ? WDStructContact.Prenom.getString() : !WDStructContact.Nom.getString().equals("") ? WDStructContact.Nom.getString() : "" : WDStructContact.Prenom.getString() + " " + WDStructContact.Nom.getString();
        } catch (SQLiteException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public static final boolean m2172e(long j) throws C0606q {
        try {
            WDAppManager.m2565a(f1397z[18]);
            if (j <= 0) {
                j = C0596g.m2179i();
            }
            if (C0596g.m2168c()) {
                j = C0596g.m2173f(j);
            } else {
                Cursor query = WDAppManager.m2553L().query(People.CONTENT_URI, new String[]{f1397z[5]}, f1396r + f1397z[31], new String[]{String.valueOf(j)}, null);
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            throw new C0606q(C0745b.m3222b(f1397z[7], String.valueOf(j)));
                        }
                    } finally {
                        query.close();
                    }
                }
            }
            try {
                return C0595f.m2150a(ContentUris.withAppendedId(C0596g.m2168c() ? Uri.parse(f1394p) : People.CONTENT_URI, j));
            } catch (C0653m e) {
                throw e;
            }
        } catch (C0653m e2) {
            throw new C0606q((int) C0607n.Le, e2.getMessage());
        }
    }

    /* renamed from: f */
    private static final long m2173f(long j) throws C0606q {
        Cursor query = WDAppManager.m2553L().query(Uri.parse(f1387i), new String[]{f1380b}, f1397z[42], new String[]{String.valueOf(j)}, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    j = query.getLong(query.getColumnIndex(f1380b));
                } else {
                    throw new C0606q(C0745b.m3222b(f1397z[7], String.valueOf(j)));
                }
            } finally {
                query.close();
            }
        }
        return j;
    }

    /* renamed from: f */
    public static final void m2174f() throws C0606q {
        try {
            WDAppManager.m2565a(f1397z[23], f1397z[18]);
            long i = C0596g.m2179i();
            try {
                WDAppManager.m2553L().delete(People.CONTENT_URI, f1396r + f1397z[31], new String[]{String.valueOf(i)});
            } catch (SQLiteException e) {
                throw new C0606q(C0745b.m3222b(f1397z[40], new String[0]), e.getMessage());
            }
        } catch (C0653m e2) {
            throw new C0606q((int) C0607n.Le, e2.getMessage());
        }
    }

    /* renamed from: g */
    private static final String m2175g() {
        int i = 0;
        String[] strArr = new String[4];
        try {
            int i2;
            if (WDStructContact.AdresseBureau.getString().equals("")) {
                i2 = 0;
            } else {
                strArr[0] = WDStructContact.AdresseBureau.getString();
                i2 = 1;
            }
            try {
                if (!WDStructContact.EtatBureau.getString().equals("")) {
                    strArr[i2] = WDStructContact.EtatBureau.getString();
                    i2++;
                }
                try {
                    if (!WDStructContact.VilleBureau.getString().equals("")) {
                        strArr[i2] = WDStructContact.VilleBureau.getString();
                        i2++;
                    }
                    try {
                        if (!WDStructContact.PaysBureau.getString().equals("")) {
                            strArr[i2] = WDStructContact.PaysBureau.getString();
                            i2++;
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        while (i < i2) {
                            String str = strArr[i];
                            if (str != null) {
                                if (i > 0) {
                                    try {
                                        stringBuffer.append(" ");
                                    } catch (SQLiteException e) {
                                        throw e;
                                    }
                                }
                                stringBuffer.append(str);
                            }
                            i++;
                        }
                        return stringBuffer.toString();
                    } catch (SQLiteException e2) {
                        throw e2;
                    }
                } catch (SQLiteException e22) {
                    throw e22;
                }
            } catch (SQLiteException e222) {
                throw e222;
            }
        } catch (SQLiteException e2222) {
            throw e2222;
        }
    }

    /* renamed from: g */
    public static final void m2176g(long j) throws C0606q {
        try {
            WDAppManager.m2565a(f1397z[23]);
            if (j <= 0) {
                j = C0596g.m2179i();
            }
            if (C0596g.m2168c()) {
                j = C0596g.m2173f(j);
            } else {
                Cursor query = WDAppManager.m2553L().query(People.CONTENT_URI, new String[]{f1397z[5]}, f1396r + f1397z[31], new String[]{String.valueOf(j)}, null);
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            throw new C0606q(C0745b.m3222b(f1397z[7], String.valueOf(j)));
                        }
                    } finally {
                        query.close();
                    }
                }
            }
            try {
                C0595f.m2151b(ContentUris.withAppendedId(C0596g.m2168c() ? Uri.parse(f1394p) : People.CONTENT_URI, j));
            } catch (C0653m e) {
                throw e;
            }
        } catch (C0653m e2) {
            throw new C0606q((int) C0607n.Le, e2.getMessage());
        }
    }

    /* renamed from: h */
    public static final void m2177h() throws C0606q {
        try {
            WDAppManager.m2565a(f1397z[23], f1397z[18]);
            ContentValues contentValues = new ContentValues(2);
            contentValues.put(f1397z[19], C0596g.m2171e());
            contentValues.put(f1397z[14], WDStructContact.Notes.getString());
            ContentResolver L = WDAppManager.m2553L();
            try {
                Uri insert = L.insert(People.CONTENT_URI, contentValues);
                if (insert != null) {
                    long c = C0725i.m3055c(insert.getLastPathSegment());
                    long j = C0596g.m2181j();
                    if (j > 0) {
                        People.addToGroup(L, c, j);
                    }
                    C0596g.m2165b(c, L);
                    C0596g.m2159a(c, insert, L);
                    C0596g.m2166b(c, insert, L);
                    C0596g.m2158a(c, L);
                    WDStructContact.ID.setValeur(c);
                }
            } catch (C0653m e) {
                throw e;
            } catch (Exception e2) {
                throw new C0606q(C0745b.m3222b(f1397z[45], new String[0]), e2.getMessage());
            }
        } catch (C0653m e3) {
            throw new C0606q((int) C0607n.Le, e3.getMessage());
        }
    }

    /* renamed from: h */
    private static final void m2178h(long j) throws SQLiteException {
        if (j > 0) {
            Cursor query = WDAppManager.m2553L().query(ContactMethods.CONTENT_EMAIL_URI, f1383e, f1397z[43], new String[]{String.valueOf(j)}, null);
            if (query != null) {
                try {
                    int count = query.getCount();
                    WDStructContact.Email.release();
                    WDStructContact.Email = new C0770p(1, new int[]{count}, 0, WDChaine.m2421c());
                    WDStructContact.NbEmail.setValeur(count);
                    count = query.getColumnIndex(f1397z[3]);
                    if (count >= 0) {
                        while (query.moveToNext()) {
                            WDStructContact.Email.get(1).setValeur(query.getString(count));
                        }
                    }
                    query.close();
                } catch (SQLiteException e) {
                    throw e;
                } catch (SQLiteException e2) {
                    throw e2;
                } catch (Throwable th) {
                    query.close();
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: i */
    private static final long m2179i() {
        /*
        r4 = 0;
        r0 = fr.pcsoft.wdjava.contact.WDStructContact.ID;
        r0 = r0.getLong();
        r2 = 0;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x003d;
    L_0x000d:
        r0 = 0;
        r0 = fr.pcsoft.wdjava.contact.C0596g.m2154a(r4, r0);
        if (r0 == 0) goto L_0x0020;
    L_0x0014:
        r1 = r0.isBeforeFirst();	 Catch:{ SQLiteException -> 0x003e }
        if (r1 != 0) goto L_0x0020;
    L_0x001a:
        r1 = r0.isAfterLast();	 Catch:{ SQLiteException -> 0x0040 }
        if (r1 == 0) goto L_0x0030;
    L_0x0020:
        r1 = f1397z;	 Catch:{ SQLiteException -> 0x0040 }
        r2 = 41;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0040 }
        r2 = 0;
        r2 = new java.lang.String[r2];	 Catch:{ SQLiteException -> 0x0040 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ SQLiteException -> 0x0040 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ SQLiteException -> 0x0040 }
    L_0x0030:
        r1 = f1397z;
        r2 = 5;
        r1 = r1[r2];
        r1 = r0.getColumnIndex(r1);
        r0 = r0.getLong(r1);
    L_0x003d:
        return r0;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.contact.g.i():long");
    }

    /* renamed from: i */
    private static final long m2180i(long j) throws C0606q {
        Cursor query = WDAppManager.m2553L().query(Uri.parse(f1387i), new String[]{f1397z[5]}, f1397z[6], new String[]{String.valueOf(j)}, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    j = query.getLong(query.getColumnIndex(f1397z[5]));
                } else {
                    throw new C0606q(C0745b.m3222b(f1397z[7], String.valueOf(j)));
                }
            } finally {
                query.close();
            }
        }
        return j;
    }

    /* renamed from: j */
    private static final long m2181j() {
        if (f1392n < 0) {
            Cursor query = WDAppManager.m2553L().query(Groups.CONTENT_URI, new String[]{f1397z[5]}, f1397z[44], null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        f1392n = query.getLong(0);
                    } else {
                        f1392n = 0;
                    }
                    query.close();
                } catch (Throwable th) {
                    query.close();
                }
            }
        }
        return f1392n;
    }

    /* renamed from: z */
    private static String m2182z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 78;
                    break;
                case 1:
                    i2 = 37;
                    break;
                case 2:
                    i2 = 96;
                    break;
                case 3:
                    i2 = 51;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2183z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 38);
        }
        return toCharArray;
    }
}
