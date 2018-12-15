package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.util.AbstractList;

/* renamed from: fr.pcsoft.wdjava.core.types.e */
class C0780e extends AbstractList<C0797z> {
    /* renamed from: z */
    private static final String f2022z = C0780e.m3777z(C0780e.m3778z("\u001a3%\u001bht3:\u000be|)!\bep79\u001dhj79\u001ahw9:"));
    final ab this$0;

    C0780e(ab abVar) {
        this.this$0 = abVar;
    }

    /* renamed from: z */
    private static String m3777z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 57;
                    break;
                case 1:
                    i2 = 118;
                    break;
                case 2:
                    i2 = 119;
                    break;
                case 3:
                    i2 = 73;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3778z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 55);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0797z m3779a(int i) {
        C0797z c0797z = (C0797z) ab.access$500(this.this$0).remove(i);
        if (c0797z != null) {
            bb.access$400(ab.access$600(this.this$0)).remove(C0797z.access$200(c0797z));
        }
        return c0797z;
    }

    /* renamed from: a */
    public void m3780a(int i, C0797z c0797z) {
        if (C0808l.m4053k(C0797z.access$200(c0797z))) {
            WDErreurManager.m2883a(C0745b.m3222b(f2022z, new String[0]));
        }
        ab.access$500(this.this$0).add(i, c0797z);
        if (i < ab.access$500(this.this$0).size() - 1) {
            bb.access$400(ab.access$600(this.this$0)).clear();
            for (C0797z c0797z2 : ab.access$500(this.this$0)) {
                bb.access$400(ab.access$600(this.this$0)).put(C0797z.access$200(c0797z2), c0797z2);
            }
            return;
        }
        bb.access$400(ab.access$600(this.this$0)).put(C0797z.access$200(c0797z), c0797z);
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m3780a(i, (C0797z) obj);
    }

    /* renamed from: b */
    public C0797z m3781b(int i) {
        return (C0797z) ab.access$500(this.this$0).get(i);
    }

    public void clear() {
        ab.access$500(this.this$0).clear();
        bb.access$400(ab.access$600(this.this$0)).clear();
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return m3781b(i);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        return m3779a(i);
    }

    public int size() {
        return ab.access$500(this.this$0).size();
    }
}
