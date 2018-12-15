package fr.pcsoft.wdjava.database.hf.p051b;

import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.ab;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;

/* renamed from: fr.pcsoft.wdjava.database.hf.b.b */
public class C0837b implements C0836a {
    /* renamed from: z */
    private static final String f2236z = C0837b.m5389z(C0837b.m5390z("\u00165lt)"));
    /* renamed from: b */
    protected String f2237b = null;
    /* renamed from: c */
    private boolean f2238c = true;
    /* renamed from: d */
    protected String f2239d;
    /* renamed from: e */
    protected String f2240e = null;

    public C0837b(String str) {
        if (str != null) {
            String[] split = str.split(f2236z);
            if (split.length > 1) {
                this.f2240e = C0808l.m4057o(split[0].toLowerCase());
                this.f2237b = C0808l.m4057o(split[1].toLowerCase());
                return;
            }
            eb ebVar = (eb) WDIndirection.get2(str, 6);
            if (ebVar != null) {
                this.f2240e = C0808l.m4057o(ebVar.m5799A().mo2719a().toLowerCase());
                this.f2237b = C0808l.m4057o(ebVar.mo3137b().toLowerCase());
            }
        }
    }

    public C0837b(String str, String str2) {
        this.f2240e = str;
        this.f2237b = str2;
    }

    /* renamed from: z */
    private static String m5389z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 77;
                    break;
                case 1:
                    i2 = 105;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 78;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5390z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 116);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet mo2597a() {
        C0849z g = mo3128g();
        return g == null ? a : ((WDObjet) g).getValeur();
    }

    /* renamed from: a */
    public void mo2598a(WDObjet wDObjet) {
        wDObjet.setValeur(mo2597a());
    }

    /* renamed from: a */
    public void mo2599a(boolean z) {
        this.f2238c = z;
    }

    /* renamed from: a */
    public boolean mo2600a(String str) {
        return mo3125d(str);
    }

    /* renamed from: b */
    public void mo2601b() {
        this.f2240e = null;
        this.f2237b = null;
        this.f2239d = null;
    }

    /* renamed from: b */
    public void mo2602b(WDObjet wDObjet) {
        if (!mo3126e()) {
            C0849z g = mo3128g();
            if (g != null) {
                ((WDObjet) g).setValeur(wDObjet);
            }
        }
    }

    /* renamed from: b */
    public void mo3123b(String str) {
        this.f2240e = C0808l.m4057o(str.toLowerCase());
        mo2599a(mo3129h() != null);
        this.f2239d = null;
    }

    /* renamed from: c */
    public void mo3124c(String str) {
        this.f2237b = C0808l.m4057o(str.toLowerCase());
        mo2599a(((eb) ((db) mo3133l()).mo2718a(str)) != null);
        this.f2239d = null;
    }

    /* renamed from: c */
    public boolean mo2603c() {
        return this.f2238c;
    }

    /* renamed from: c */
    protected final boolean m5400c(WDObjet wDObjet) {
        return (wDObjet == null || wDObjet.isValeurNull()) ? true : (wDObjet.isNumerique() && wDObjet.getInt() == 0) || wDObjet.getString().equals("");
    }

    /* renamed from: d */
    public String mo2604d() {
        return this.f2239d != null ? this.f2239d : mo3132k();
    }

    /* renamed from: d */
    public boolean mo3125d(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        db a = WDHF_Contexte.getInstance().m4991a(str, false);
        return a != null && C0808l.m4042c(a.mo2719a(), mo3131j(), 20) == 0;
    }

    /* renamed from: e */
    public void m5403e(String str) {
        this.f2239d = str;
    }

    /* renamed from: e */
    public boolean mo3126e() {
        return false;
    }

    /* renamed from: f */
    public String mo3127f() {
        return this.f2237b;
    }

    /* renamed from: g */
    public C0849z mo3128g() {
        db dbVar = (db) mo3129h();
        return dbVar != null ? dbVar.mo2718a(this.f2237b) : null;
    }

    /* renamed from: h */
    public final ab mo3129h() {
        ab b = WDHF_Contexte.getInstance().m5004b(this.f2240e);
        if (b != null) {
            return b;
        }
        b = WDHF_Contexte.getInstance().m5021h(this.f2240e);
        return b == null ? null : b;
    }

    /* renamed from: i */
    public C0849z mo3130i() {
        return mo3128g();
    }

    /* renamed from: j */
    public final String mo3131j() {
        return this.f2240e;
    }

    /* renamed from: k */
    protected String mo3132k() {
        return new StringBuffer(this.f2240e).append(".").append(this.f2237b).toString();
    }

    /* renamed from: l */
    public ab mo3133l() {
        return mo3129h();
    }
}
