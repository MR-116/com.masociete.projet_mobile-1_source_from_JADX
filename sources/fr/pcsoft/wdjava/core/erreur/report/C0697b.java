package fr.pcsoft.wdjava.core.erreur.report;

import fr.pcsoft.wdjava.core.utils.C0808l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fr.pcsoft.wdjava.core.erreur.report.b */
public class C0697b extends C0696a {
    /* renamed from: a */
    private String f1796a;

    private C0697b() {
        super(C0706k.class);
        this.f1796a = null;
    }

    /* renamed from: b */
    public final String m2922b() throws JSONException {
        if (this.f1796a == null) {
            JSONObject jSONObject = new JSONObject();
            for (C0706k c0706k : C0706k.values()) {
                String a = m2921a(c0706k);
                if (!C0808l.m4053k(a)) {
                    String name = c0706k.getCategory().getName();
                    JSONObject optJSONObject = jSONObject.optJSONObject(name);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        jSONObject.put(name, optJSONObject);
                    }
                    optJSONObject.put(c0706k.getName(), a);
                }
            }
            this.f1796a = jSONObject.toString(5);
        }
        return this.f1796a;
    }
}
