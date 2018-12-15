package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDChaineA;
import fr.pcsoft.wdjava.core.types.WDVariant;
import fr.pcsoft.wdjava.core.types.bb;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ac extends JSONTokener {
    /* renamed from: z */
    private static final String f2039z = m3838z(m3839z("\u0007\r's"));
    /* renamed from: a */
    private WDObjet f2040a;

    public ac(String str) {
        super(str);
    }

    /* renamed from: a */
    private void m3837a(Object obj) throws JSONException {
        int i = 0;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            WDObjet bbVar = new bb();
            this.f2040a.setValeur(bbVar);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                Object obj2 = jSONObject.get(str);
                this.f2040a = bbVar.m3299a(str, null);
                m3837a(obj2);
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            WDObjet ubVar = new ub(this, 0, new int[]{jSONArray.length()}, 0, 31, true);
            this.f2040a.setValeur(ubVar);
            while (i < r7) {
                try {
                    this.f2040a = ubVar.get(C0725i.m3069e(i));
                    m3837a(jSONArray.get(i));
                    i++;
                } catch (JSONException e) {
                    throw e;
                }
            }
        } else {
            try {
                if (obj instanceof String) {
                    this.f2040a.setValeur(new WDChaineA(obj.toString(), f2039z));
                } else {
                    this.f2040a.setValeur(C0812p.m4115a(obj));
                }
            } catch (JSONException e2) {
                throw e2;
            }
        }
    }

    /* renamed from: z */
    private static String m3838z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 82;
                    break;
                case 1:
                    i2 = 89;
                    break;
                case 2:
                    i2 = 97;
                    break;
                case 3:
                    i2 = 75;
                    break;
                default:
                    i2 = 103;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3839z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 103);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final WDVariant m3840a() throws JSONException {
        WDObjet wDVariant = new WDVariant();
        this.f2040a = wDVariant;
        m3837a(nextValue());
        return wDVariant;
    }
}
