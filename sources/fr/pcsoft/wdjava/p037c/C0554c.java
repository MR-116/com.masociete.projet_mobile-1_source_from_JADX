package fr.pcsoft.wdjava.p037c;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Media;
import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.media.ib;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.utils.C1508i;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.c.c */
public class C0554c {
    /* renamed from: a */
    public static final int f1253a = 2;
    /* renamed from: b */
    public static final int f1254b = Integer.MIN_VALUE;
    /* renamed from: c */
    public static final int f1255c = 1;
    /* renamed from: z */
    private static final String[] f1256z = new String[]{C0554c.m1775z(C0554c.m1776z("\u0015`2\"\u0006Y<}`Q")), C0554c.m1775z(C0554c.m1776z("\u001dc77\f\u0015i}5\u0006\u000e`:6\u0010\u0015b=k19L\u0017\u001a&$Y\u0016\u0017-=A\f\u001673_\u0012\u0002&")), C0554c.m1775z(C0554c.m1776z("_H\u0001\u0017</H\u001f\u0000 (R\u0012\t!)@")), C0554c.m1775z(C0554c.m1776z("\u001dc77\f\u0015i}5\u0006\u000e`:6\u0010\u0015b=k4.D\u0007\u0000<9U\u0007\u000012L\u001f\u001a0(B\u0001\u0004$9")), C0554c.m1775z(C0554c.m1776z("+@\f\u0006,8H\f\u0017&(B\u0006\u0017<=N\u0007\f55Y\n")), C0554c.m1775z(C0554c.m1776z("9U\u0007\u0017\"#X\u0001\f<=A\u0011\u0010.")), C0554c.m1775z(C0554c.m1776z("_H\u0001\u0017<:D\u0010\r*9_\f\u000b,2R\u001a\b\";H")), C0554c.m1775z(C0554c.m1776z("_^\u0016\t&?Y\f\u0013*8H\u001c")), C0554c.m1775z(C0554c.m1776z("_C\u001c\u001a\",]\u001f\f =Y\u001a\n-#L\u001f\u000761")), C0554c.m1775z(C0554c.m1776z("\u001dc77\f\u0015i},\r\bh=1M\u001dn',\f\u0012#\u0014\u00007#N\u001c\u000b79C\u0007")), C0554c.m1775z(C0554c.m1776z("\u0015`2\"\u0006S'")), C0554c.m1775z(C0554c.m1776z("_^\u0016\t&?Y\f\f.=J\u0016")), C0554c.m1775z(C0554c.m1776z("\u001a}5\u0000\u000fb51M\u000bi2+\u0007\u000eb:!M=N\u0007\f,2R\u0012\t!)@")), C0554c.m1775z(C0554c.m1776z("\nd7 \fS'")), C0554c.m1775z(C0554c.m1776z("\nd7 \fY<")), C0554c.m1775z(C0554c.m1776z("#i21\u0002")), C0554c.m1775z(C0554c.m1776z("#d7e^\\2s"))};

    /* renamed from: a */
    protected static final String m1766a() {
        return C0808l.m4021a(f1256z[14], String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public static final String m1767a(int i) throws ib {
        try {
            if (kb.m3965a(C0657a.MARSHMALLOW)) {
                try {
                    WDAppManager.m2565a(f1256z[1], f1256z[3]);
                } catch (C0653m e) {
                    throw new ib(e.getMessage(), (int) C0607n.sf);
                }
            }
            ic c0557f = new C0557f(i);
            try {
                c0557f.m1785a(0, "", 0);
                return c0557f.m1792d().toString();
            } catch (Exception e2) {
                throw new ib(C0745b.m3222b(f1256z[2], new String[0]), e2.getMessage());
            }
        } catch (ib e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    private static final String m1768a(Intent intent, int i) throws C0901s, IOException {
        if (intent.getIntExtra(f1256z[4], 0) != -1) {
            return "";
        }
        Uri uri = (Uri) intent.getParcelableExtra(f1256z[5]);
        if ((i & 2) == 0) {
            return C0554c.m1771a(uri, C0554c.m1770a(uri, 1));
        }
        String a = C0554c.m1770a(uri, 2);
        try {
            return C0808l.m4053k(a) ? C0554c.m1769a(uri) : a;
        } catch (C0901s e) {
            throw e;
        }
    }

    /* renamed from: a */
    private static final String m1769a(Uri uri) throws IOException, C0901s {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(WDAppManager.m2553L().openInputStream(uri), 8192);
            try {
                File d = C0897o.m6271d(C0554c.m1766a(), "");
                bb.m3845a((InputStream) bufferedInputStream, d);
                String path = d.getPath();
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                    } catch (C0901s e2) {
                        throw e2;
                    }
                }
                return path;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e3) {
                    } catch (C0901s e22) {
                        throw e22;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static final String m1770a(Uri uri, int i) {
        Cursor query;
        Throwable th;
        String str = null;
        String[] strArr = new String[1];
        strArr[0] = i == 2 ? f1256z[15] : f1256z[15];
        try {
            Cursor query2 = WDAppManager.m2553L().query(uri, null, null, null, null);
            try {
                String substring;
                String string;
                if (query2.moveToFirst()) {
                    String string2 = query2.getString(0);
                    int lastIndexOf = string2 != null ? string2.lastIndexOf(":") : -1;
                    if (lastIndexOf >= 0) {
                        substring = string2.substring(lastIndexOf + 1);
                        if (!(query2 == null || query2.isClosed())) {
                            query2.close();
                        }
                        if (!C0808l.m4053k(substring)) {
                            query2 = WDAppManager.m2553L().query(i != 2 ? Media.EXTERNAL_CONTENT_URI : Images.Media.EXTERNAL_CONTENT_URI, strArr, f1256z[16], new String[]{substring}, null);
                            if (query2.moveToFirst()) {
                                str = query2.getString(query2.getColumnIndex(strArr[0]));
                            }
                            if (!(query2 == null || query2.isClosed())) {
                                query2.close();
                            }
                            if (str == null) {
                                query = WDAppManager.m2553L().query(i != 2 ? Media.INTERNAL_CONTENT_URI : Images.Media.INTERNAL_CONTENT_URI, strArr, f1256z[16], new String[]{substring}, null);
                                try {
                                    if (query.moveToFirst()) {
                                        str = query.getString(query.getColumnIndex(strArr[0]));
                                    }
                                    if (!(query == null || query.isClosed())) {
                                        query.close();
                                    }
                                    query2 = query;
                                } catch (Throwable th2) {
                                    th = th2;
                                    query.close();
                                    throw th;
                                }
                            }
                        }
                        if (str != null) {
                            query = WDAppManager.m2553L().query(uri, strArr, null, null, null);
                            if (query != null) {
                                if (query.moveToFirst()) {
                                    string = query.getString(query.getColumnIndex(f1256z[15]));
                                    if (!(query == null || query.isClosed())) {
                                        query.close();
                                    }
                                }
                            }
                            string = str;
                            query.close();
                        } else {
                            query = query2;
                            string = str;
                        }
                        if (!(query == null || query.isClosed())) {
                            query.close();
                        }
                        return string;
                    }
                }
                substring = null;
                query2.close();
                if (C0808l.m4053k(substring)) {
                    if (i != 2) {
                    }
                    query2 = WDAppManager.m2553L().query(i != 2 ? Media.EXTERNAL_CONTENT_URI : Images.Media.EXTERNAL_CONTENT_URI, strArr, f1256z[16], new String[]{substring}, null);
                    if (query2.moveToFirst()) {
                        str = query2.getString(query2.getColumnIndex(strArr[0]));
                    }
                    query2.close();
                    if (str == null) {
                        if (i != 2) {
                        }
                        query = WDAppManager.m2553L().query(i != 2 ? Media.INTERNAL_CONTENT_URI : Images.Media.INTERNAL_CONTENT_URI, strArr, f1256z[16], new String[]{substring}, null);
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndex(strArr[0]));
                        }
                        query.close();
                        query2 = query;
                    }
                }
                if (str != null) {
                    query = query2;
                    string = str;
                } else {
                    query = WDAppManager.m2553L().query(uri, strArr, null, null, null);
                    if (query != null) {
                        if (query.moveToFirst()) {
                            string = query.getString(query.getColumnIndex(f1256z[15]));
                            query.close();
                        }
                    }
                    string = str;
                    query.close();
                }
                query.close();
                return string;
            } catch (Throwable th3) {
                th = th3;
                query = query2;
                if (!(query == null || query.isClosed())) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            query = null;
            query.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static final String m1771a(Uri uri, String str) throws IOException, C0901s {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(WDAppManager.m2553L().openInputStream(uri), 8192);
            try {
                String a;
                File a2;
                if (C0808l.m4053k(str)) {
                    bufferedInputStream.mark(Integer.MAX_VALUE);
                    a = C1508i.m10483a((InputStream) bufferedInputStream, 1);
                    if (C0808l.m4053k(a)) {
                        throw new IOException(C0745b.m3222b(f1256z[6], new String[0]));
                    }
                    bufferedInputStream.reset();
                    a2 = C0897o.m6239a(C0554c.m1772a(a), false);
                } else {
                    a2 = C0897o.m6276e(C0897o.m6290j(C0897o.m6259b(str, 12)));
                    C0897o.m6239a(a2.getPath(), false);
                }
                bb.m3845a((InputStream) bufferedInputStream, a2);
                a = a2.getPath();
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                    } catch (C0901s e2) {
                        throw e2;
                    }
                }
                return a;
            } catch (IOException e3) {
                throw e3;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e4) {
                } catch (C0901s e22) {
                    throw e22;
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    protected static final String m1772a(String str) {
        return C0808l.m4021a(f1256z[0], String.valueOf(System.currentTimeMillis()), str.toLowerCase());
    }

    /* renamed from: a */
    private static final void m1773a(int i, BroadcastReceiver broadcastReceiver) throws ib {
        String str;
        Intent intent = new Intent(f1256z[9]);
        int i2 = (i & 2) != 0 ? 1 : 0;
        if (i2 != 0) {
            try {
                str = f1256z[13];
            } catch (ib e) {
                throw e;
            }
        }
        str = f1256z[10];
        intent.setType(str);
        List queryIntentActivities = WDAppManager.m2551J().queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null) {
            try {
                if (!queryIntentActivities.isEmpty()) {
                    CharSequence c;
                    Activity a = C1056i.m7562a();
                    a.registerReceiver(broadcastReceiver, new IntentFilter(f1256z[12]));
                    str = WDProjet.getInstance().getTitreSuivant();
                    if (str == null) {
                        String str2;
                        if (i2 != 0) {
                            try {
                                str2 = f1256z[7];
                            } catch (ib e2) {
                                throw e2;
                            }
                        }
                        str2 = f1256z[11];
                        c = C0745b.m3224c(str2, new String[0]);
                    } else {
                        Object obj = str;
                    }
                    a.startActivityForResult(Intent.createChooser(intent, c), C1056i.f3025K);
                    return;
                }
            } catch (ib e22) {
                throw e22;
            }
        }
        throw new ib(C0745b.m3222b(f1256z[8], new String[0]));
    }

    /* renamed from: a */
    public static final void m1774a(int i, C0486m c0486m) throws ib {
        WDCallback a = WDCallback.m2239a(c0486m, -1, true);
        try {
            if (kb.m3965a(C0657a.MARSHMALLOW)) {
                try {
                    WDAppManager.m2565a(f1256z[1], f1256z[3]);
                } catch (C0653m e) {
                    throw new ib(e.getMessage(), (int) C0607n.sf);
                }
            }
            try {
                C0554c.m1773a(i, new C0556e(i, a));
            } catch (ib e2) {
                throw new ib(C0745b.m3222b(f1256z[2], new String[0]), e2.getMessage());
            }
        } catch (ib e22) {
            throw e22;
        }
    }

    /* renamed from: z */
    private static String m1775z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = C0607n.Hn;
                    break;
                case 1:
                    i2 = 13;
                    break;
                case 2:
                    i2 = 83;
                    break;
                case 3:
                    i2 = 69;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1776z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 99);
        }
        return toCharArray;
    }
}
