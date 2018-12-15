package fr.pcsoft.wdjava.core.p043d.p045b;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.p043d.C0688c;
import fr.pcsoft.wdjava.core.p043d.C0690f;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0812p;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* renamed from: fr.pcsoft.wdjava.core.d.b.d */
public class C0687d implements C0684a {
    /* renamed from: z */
    private static final String[] f1745z = new String[]{C0687d.m2841z(C0687d.m2842z("o@\u0016v5\rR\u0006w=\u001eO\u0018h1\u001fG\rm7\u0002Y\u0010j;\u0003T\u000ba;\u0018")), C0687d.m2841z(C0687d.m2842z("\u0019R\u001f\t@"))};
    /* renamed from: a */
    private JSONStringer f1746a = new JSONStringer();

    /* renamed from: z */
    private static String m2841z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 76;
                    break;
                case 1:
                    i2 = 6;
                    break;
                case 2:
                    i2 = 89;
                    break;
                case 3:
                    i2 = 36;
                    break;
                default:
                    i2 = C0607n.co;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2842z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.co);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo2572a() {
        this.f1746a = null;
    }

    /* renamed from: a */
    public final void mo2588a(WDObjet wDObjet) throws C0690f {
        if (wDObjet != null) {
            try {
                if (wDObjet.isAllloue()) {
                    C0688c c0688c = (C0688c) wDObjet.checkType(C0688c.class);
                    if (c0688c != null) {
                        c0688c.serialize((C0684a) this);
                        return;
                    } else {
                        this.f1746a.value(wDObjet.getJSONValue());
                        return;
                    }
                }
            } catch (JSONException e) {
                throw e;
            } catch (JSONException e2) {
                throw e2;
            } catch (JSONException e22) {
                throw new C0690f(C0745b.m3222b(f1745z[0], new String[0]), e22.getMessage());
            }
        }
        this.f1746a.value(JSONObject.NULL);
    }

    /* renamed from: a */
    public void mo2573a(C0688c c0688c, WDObjet wDObjet) throws C0690f {
        c0688c.serialize((C0684a) this);
        wDObjet.setValeur(C0725i.m3039a(toString(), mo2576b()));
    }

    /* renamed from: a */
    public void mo2589a(String str, WDObjet wDObjet) throws C0690f {
        try {
            this.f1746a.key(str);
            if (wDObjet != null) {
                if (wDObjet.isAllloue()) {
                    C0688c c0688c = (C0688c) wDObjet.checkType(C0688c.class);
                    if (c0688c != null) {
                        c0688c.serialize((C0684a) this);
                        return;
                    } else {
                        this.f1746a.value(wDObjet.getJSONValue());
                        return;
                    }
                }
            }
            this.f1746a.value(JSONObject.NULL);
        } catch (JSONException e) {
            throw e;
        } catch (JSONException e2) {
            throw e2;
        } catch (JSONException e22) {
            throw new C0690f(C0745b.m3222b(f1745z[0], new String[0]), e22.getMessage());
        }
    }

    /* renamed from: b */
    public String mo2576b() {
        return f1745z[1];
    }

    /* renamed from: c */
    public void mo2590c() throws C0690f {
        try {
            this.f1746a.object();
        } catch (JSONException e) {
            throw new C0690f(C0745b.m3222b(f1745z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo2591d() throws C0690f {
        try {
            this.f1746a.endArray();
        } catch (JSONException e) {
            throw new C0690f(C0745b.m3222b(f1745z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: e */
    public void mo2592e() throws C0690f {
        try {
            this.f1746a.endObject();
        } catch (JSONException e) {
            throw new C0690f(C0745b.m3222b(f1745z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: f */
    public final void mo2593f() throws C0690f {
        try {
            this.f1746a.array();
        } catch (JSONException e) {
            throw new C0690f(C0745b.m3222b(f1745z[0], new String[0]), e.getMessage());
        }
    }

    public String toString() {
        return C0812p.m4117a(this.f1746a.toString());
    }
}
