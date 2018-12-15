package fr.pcsoft.wdjava.ui.utils;

import android.database.DataSetObserver;
import android.util.SparseIntArray;
import android.widget.SectionIndexer;
import fr.pcsoft.wdjava.core.C0607n;
import java.text.Collator;
import java.util.Arrays;

/* renamed from: fr.pcsoft.wdjava.ui.utils.f */
public abstract class C1244f extends DataSetObserver implements SectionIndexer {
    /* renamed from: a */
    private Collator f3675a = Collator.getInstance();
    /* renamed from: b */
    private String[] f3676b = new String[]{"#", C0607n.Zq, C0607n.Eu, C0607n.Yk, C0607n.cf, C0607n.qu, C0607n.Mn, C0607n.Lg, C0607n.Bq, "I", C0607n.xl, "K", "L", "M", "N", "O", C0607n.rq, "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    /* renamed from: c */
    private SparseIntArray f3677c = new SparseIntArray(this.f3676b.length);

    public C1244f() {
        this.f3675a.setStrength(0);
    }

    /* renamed from: a */
    private final int m8685a(String str, String str2) {
        return this.f3675a.compare(str.length() > 0 ? String.valueOf(str.charAt(0)) : " ", str2);
    }

    /* renamed from: a */
    public abstract int mo3503a();

    /* renamed from: a */
    public abstract String mo3504a(int i);

    /* renamed from: b */
    public void mo3505b() {
        this.f3676b = null;
        if (this.f3677c != null) {
            this.f3677c.clear();
            this.f3677c = null;
        }
        this.f3675a = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getPositionForSection(int r9) {
        /*
        r8 = this;
        r3 = -1;
        r0 = 0;
        if (r9 >= 0) goto L_0x001a;
    L_0x0004:
        r9 = r0;
    L_0x0005:
        r4 = r8.mo3503a();
        r1 = r8.f3676b;
        r5 = r1[r9];
        r1 = r8.f3677c;
        r2 = r5.charAt(r0);
        r2 = r1.get(r2, r3);
        if (r2 < 0) goto L_0x0025;
    L_0x0019:
        return r2;
    L_0x001a:
        r1 = r8.f3676b;
        r1 = r1.length;
        if (r9 < r1) goto L_0x0005;
    L_0x001f:
        r1 = r8.f3676b;
        r1 = r1.length;
        r9 = r1 + -1;
        goto L_0x0005;
    L_0x0025:
        if (r9 <= 0) goto L_0x006b;
    L_0x0027:
        r1 = r8.f3676b;
        r2 = r9 + -1;
        r1 = r1[r2];
        r2 = r8.f3677c;
        r1 = r1.charAt(r0);
        r1 = r2.get(r1, r3);
        if (r1 < 0) goto L_0x006b;
    L_0x0039:
        r2 = r4 + r1;
        r2 = r2 / 2;
        r3 = r1;
        r1 = r4;
    L_0x003f:
        if (r3 >= r1) goto L_0x0052;
    L_0x0041:
        r6 = r8.mo3504a(r2);
        r6 = r8.m8685a(r6, r5);
        if (r6 == 0) goto L_0x0066;
    L_0x004b:
        if (r6 >= 0) goto L_0x005c;
    L_0x004d:
        r2 = r2 + 1;
        if (r2 < r4) goto L_0x005e;
    L_0x0051:
        r2 = r4;
    L_0x0052:
        r1 = r8.f3677c;
        r0 = r5.charAt(r0);
        r1.put(r0, r2);
        goto L_0x0019;
    L_0x005c:
        r1 = r2;
        r2 = r3;
    L_0x005e:
        r3 = r1 + r2;
        r3 = r3 / 2;
        r7 = r3;
        r3 = r2;
        r2 = r7;
        goto L_0x003f;
    L_0x0066:
        if (r3 == r2) goto L_0x0052;
    L_0x0068:
        r1 = r2;
        r2 = r3;
        goto L_0x005e;
    L_0x006b:
        r1 = r0;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.utils.f.getPositionForSection(int):int");
    }

    public int getSectionForPosition(int i) {
        String a = mo3504a(i);
        Object obj = "";
        if (a.length() > 0) {
            obj = a.substring(0, 1);
        }
        int binarySearch = Arrays.binarySearch(this.f3676b, obj);
        return binarySearch >= 0 ? binarySearch : 0;
    }

    public Object[] getSections() {
        return this.f3676b;
    }

    public void onChanged() {
        this.f3677c.clear();
    }

    public void onInvalidated() {
        this.f3677c.clear();
    }
}
