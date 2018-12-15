package fr.pcsoft.wdjava.contact;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import android.provider.ContactsContract.Data;
import fr.pcsoft.wdjava.database.p048a.C0830a;

/* renamed from: fr.pcsoft.wdjava.contact.m */
class C0602m implements Cloneable {
    /* renamed from: z */
    private static final String[] f1406z = new String[]{C0602m.m2200z(C0602m.m2201z("\u0004\u0007yHg")), C0602m.m2200z(C0602m.m2201z("?\u000fi\u0014k")), C0602m.m2200z(C0602m.m2201z("\u0004\u0007yHf")), C0602m.m2200z(C0602m.m2201z("\u0012\u0007zv7\u000f\byH7\u00149dM")), C0602m.m2200z(C0602m.m2201z("\u0016\bi\u00075\u000e\u0002F=\u0004Hn\\&\u0013\t\u0007=\u0014\u0003`\u0006:\u0001\u000bh")), C0602m.m2200z(C0602m.m2201z("\r\u000f`L \u0019\u0016h")), C0602m.m2200z(C0602m.m2201z("?\u000fi"))};
    /* renamed from: a */
    private String f1407a;
    /* renamed from: b */
    private String f1408b;
    /* renamed from: c */
    protected long f1409c;
    final WDContact this$0;

    private C0602m(WDContact wDContact, Cursor cursor) {
        this.this$0 = wDContact;
        this.f1409c = -1;
        this.f1408b = "";
        this.f1407a = "";
        this.f1409c = C0830a.m4261c(cursor, f1406z[6]);
        this.f1408b = C0830a.m4260b(cursor, f1406z[0]);
        this.f1407a = C0830a.m4260b(cursor, f1406z[2]);
    }

    C0602m(WDContact wDContact, Cursor cursor, C0594e c0594e) {
        this(wDContact, cursor);
    }

    private C0602m(WDContact wDContact, String str, String str2) {
        this.this$0 = wDContact;
        this.f1409c = -1;
        this.f1408b = "";
        this.f1407a = "";
        this.f1409c = -1;
        this.f1408b = str;
        this.f1407a = str2;
    }

    C0602m(WDContact wDContact, String str, String str2, C0594e c0594e) {
        this(wDContact, str, str2);
    }

    /* renamed from: a */
    private final String m2196a() {
        return this.f1407a != null ? this.f1407a : "";
    }

    /* renamed from: a */
    private final void m2197a(String str) {
        if (this.f1408b == null || !this.f1408b.equals(str)) {
            this.f1408b = str;
            if (this.this$0.f1277g >= 0) {
                this.this$0.m1805b().add(ContentProviderOperation.newUpdate(Data.CONTENT_URI).withSelection(f1406z[1], new String[]{String.valueOf(this.f1409c)}).withValue(f1406z[0], this.f1408b).build());
            }
        }
    }

    static void access$000(C0602m c0602m, String str) {
        c0602m.m2197a(str);
    }

    static String access$100(C0602m c0602m) {
        return c0602m.m2199c();
    }

    static void access$200(C0602m c0602m, String str) {
        c0602m.m2198b(str);
    }

    static String access$300(C0602m c0602m) {
        return c0602m.m2196a();
    }

    /* renamed from: b */
    private final void m2198b(String str) {
        if (this.f1407a == null || !this.f1407a.equals(str)) {
            this.f1407a = str;
            if (this.this$0.f1277g >= 0) {
                this.this$0.m1805b().add(ContentProviderOperation.newUpdate(Data.CONTENT_URI).withSelection(f1406z[1], new String[]{String.valueOf(this.f1409c)}).withValue(f1406z[2], this.f1407a).build());
            }
        }
    }

    /* renamed from: c */
    private final String m2199c() {
        return this.f1408b != null ? this.f1408b : "";
    }

    /* renamed from: z */
    private static String m2200z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 96;
                    break;
                case 1:
                    i2 = 102;
                    break;
                case 2:
                    i2 = 13;
                    break;
                case 3:
                    i2 = 41;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2201z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 84);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Builder m2202a(long j) {
        return ContentProviderOperation.newInsert(Data.CONTENT_URI).withValue(f1406z[3], Long.valueOf(j)).withValue(f1406z[5], f1406z[4]).withValue(f1406z[0], this.f1408b).withValue(f1406z[2], this.f1407a);
    }

    /* renamed from: b */
    public C0602m m2203b() {
        try {
            return (C0602m) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
