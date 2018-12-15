package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.types.WDChaineA;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fr.pcsoft.wdjava.core.utils.p */
public class C0812p {
    /* renamed from: a */
    public static final Object f2142a = JSONObject.NULL;
    /* renamed from: z */
    private static final String[] f2143z = new String[]{C0812p.m4118z(C0812p.m4119z("z`@F$")), C0812p.m4118z(C0812p.m4119z("z`@S"))};

    /* renamed from: a */
    public static final WDObjet m4115a(Object obj) throws JSONException {
        try {
            if (obj == JSONObject.NULL) {
                return WDObjet.NULL;
            }
            try {
                if (obj == Boolean.TRUE) {
                    return C0611a.m2298a(true);
                }
                try {
                    if (obj == Boolean.FALSE) {
                        return C0611a.m2298a(false);
                    }
                    try {
                        if (!(obj instanceof Number)) {
                            return new WDChaineA(obj.toString(), f2143z[1]);
                        }
                        if (obj instanceof Integer) {
                            return C0611a.m2308b(((Integer) obj).intValue());
                        }
                        try {
                            return obj instanceof Long ? C0611a.m2303a(((Long) obj).longValue()) : C0611a.m2304a(((Number) obj).doubleValue());
                        } catch (JSONException e) {
                            throw e;
                        }
                    } catch (JSONException e2) {
                        throw e2;
                    } catch (JSONException e22) {
                        throw e22;
                    }
                } catch (JSONException e222) {
                    throw e222;
                }
            } catch (JSONException e2222) {
                throw e2222;
            }
        } catch (JSONException e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    public static final String m4116a(WDObjet wDObjet) {
        return wDObjet.isMemoBinaire() ? C0725i.m3035a(wDObjet.getDonneeBinaire(), f2143z[0]) : wDObjet.getString();
    }

    /* renamed from: a */
    public static final String m4117a(String str) {
        return C0808l.m4037b(str, false);
    }

    /* renamed from: z */
    private static String m4118z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 47;
                    break;
                case 1:
                    i2 = 52;
                    break;
                case 2:
                    i2 = 6;
                    break;
                case 3:
                    i2 = 107;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4119z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 28);
        }
        return toCharArray;
    }
}
