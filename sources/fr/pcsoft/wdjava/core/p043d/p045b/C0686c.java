package fr.pcsoft.wdjava.core.p043d.p045b;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.p043d.C0688c;
import fr.pcsoft.wdjava.core.p043d.C0690f;
import fr.pcsoft.wdjava.core.poo.C0729v;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDNull;
import fr.pcsoft.wdjava.core.utils.C0812p;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: fr.pcsoft.wdjava.core.d.b.c */
public class C0686c implements C0685b {
    /* renamed from: z */
    private static final String[] f1743z = new String[]{C0686c.m2833z(C0686c.m2834z("{L\u0007uR\u0012Z\u001aiR\bH\u0006xB\u001aC\u0010s")), C0686c.m2833z(C0686c.m2834z("{O\u001au@\u0019]\ntH\n@\u0014kD\u000bH\u0001nB\u0016V\u001ciN\u0017[\u0007bN\f")), C0686c.m2833z(C0686c.m2834z("{L\u0007uR\u0012Z\u001aiR\bH\u0006xY\u0019K\u0019bL\r"))};
    /* renamed from: a */
    private LinkedList<Object> f1744a = new LinkedList();

    /* renamed from: a */
    private final void m2832a(Object obj, WDObjet wDObjet) throws C0690f {
        try {
            if (obj == JSONObject.NULL) {
                wDObjet.setValeur(WDNull.m3259c());
                return;
            }
            C0729v c0729v = (C0729v) wDObjet.checkType(C0729v.class);
            if (c0729v != null) {
                try {
                    if (!c0729v.isAllloue()) {
                        c0729v.m3101a();
                    }
                } catch (C0690f e) {
                    throw e;
                }
            }
            C0688c c0688c = (C0688c) wDObjet.checkType(C0688c.class);
            if (c0688c != null) {
                try {
                    if (!(obj instanceof JSONArray)) {
                        if (!(obj instanceof JSONObject)) {
                            throw new C0690f(C0745b.m3222b(f1743z[1], new String[0]));
                        }
                    }
                    this.f1744a.addFirst(obj);
                    c0688c.deserialize((C0685b) this);
                    this.f1744a.removeFirst();
                    return;
                } catch (C0690f e2) {
                    throw e2;
                } catch (C0690f e22) {
                    throw e22;
                }
            }
            wDObjet.setJSONValue(obj.toString());
        } catch (C0690f e222) {
            throw e222;
        }
    }

    /* renamed from: z */
    private static String m2833z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 88;
                    break;
                case 1:
                    i2 = 9;
                    break;
                case 2:
                    i2 = 85;
                    break;
                case 3:
                    i2 = 39;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2834z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final int mo2585a() throws C0690f {
        return m2839b().length();
    }

    /* renamed from: a */
    public final void mo2586a(int i, WDObjet wDObjet) throws C0690f {
        try {
            m2832a(m2839b().get(i), wDObjet);
        } catch (JSONException e) {
            throw new C0690f(C0745b.m3222b(f1743z[1], e.getMessage()));
        }
    }

    /* renamed from: a */
    public void mo2584a(WDObjet wDObjet, C0688c c0688c) throws C0690f {
        try {
            this.f1744a.addFirst(new JSONTokener(C0812p.m4116a(wDObjet)).nextValue());
            c0688c.deserialize((C0685b) this);
        } catch (JSONException e) {
            throw new C0690f(C0745b.m3222b(f1743z[1], new String[0]), e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo2587a(String str, WDObjet wDObjet) throws C0690f {
        try {
            JSONObject c = m2840c();
            if (c.has(str)) {
                m2832a(c.get(str), wDObjet);
                return;
            }
            Iterator keys = c.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (str2.equalsIgnoreCase(str)) {
                    m2832a(c.get(str2), wDObjet);
                    return;
                }
            }
        } catch (JSONException e) {
            throw e;
        } catch (JSONException e2) {
            throw e2;
        } catch (JSONException e22) {
            throw new C0690f(C0745b.m3222b(f1743z[1], e22.getMessage()));
        }
    }

    /* renamed from: b */
    public final JSONArray m2839b() throws C0690f {
        try {
            if (!(this.f1744a == null || this.f1744a.isEmpty())) {
                Object peek = this.f1744a.peek();
                try {
                    if (peek instanceof JSONArray) {
                        return (JSONArray) peek;
                    }
                } catch (C0690f e) {
                    throw e;
                }
            }
            throw new C0690f(C0745b.m3222b(f1743z[2], new String[0]));
        } catch (C0690f e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public final JSONObject m2840c() throws C0690f {
        try {
            if (!(this.f1744a == null || this.f1744a.isEmpty())) {
                Object peek = this.f1744a.peek();
                try {
                    if (peek instanceof JSONObject) {
                        return (JSONObject) peek;
                    }
                } catch (C0690f e) {
                    throw e;
                }
            }
            throw new C0690f(C0745b.m3222b(f1743z[0], new String[0]));
        } catch (C0690f e2) {
            throw e2;
        }
    }
}
