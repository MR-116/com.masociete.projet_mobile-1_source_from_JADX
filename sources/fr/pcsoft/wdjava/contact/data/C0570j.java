package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import android.provider.ContactsContract.Data;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.poo.p038a.C0569c;

/* renamed from: fr.pcsoft.wdjava.contact.data.j */
public abstract class C0570j extends C0569c<WDContact> {
    /* renamed from: z */
    private static final String[] f1314z = new String[]{C0570j.m1883z(C0570j.m1884z("HFxU\u0012")), C0570j.m1883z(C0570j.m1884z("eNk7NxAh\tNcpu\f")), C0570j.m1883z(C0570j.m1884z("zFq\rYn_y"))};

    public C0570j(Cursor cursor) {
        super(cursor);
    }

    /* renamed from: z */
    private static String m1883z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 23;
                    break;
                case 1:
                    i2 = 47;
                    break;
                case 2:
                    i2 = 28;
                    break;
                case 3:
                    i2 = 104;
                    break;
                default:
                    i2 = 45;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1884z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 45);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public Builder mo2459a() {
        if (this.b < 0) {
            return null;
        }
        return ContentProviderOperation.newUpdate(Data.CONTENT_URI).withSelection(f1314z[0], new String[]{String.valueOf(this.b)});
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return ContentProviderOperation.newInsert(Data.CONTENT_URI).withValue(f1314z[1], Long.valueOf(j)).withValue(f1314z[2], mo2463f());
    }

    /* renamed from: c */
    public Builder mo2461c() {
        if (this.b < 0) {
            return null;
        }
        return ContentProviderOperation.newDelete(Data.CONTENT_URI).withSelection(f1314z[0], new String[]{String.valueOf(this.b)});
    }

    /* renamed from: f */
    protected abstract String mo2463f();
}
