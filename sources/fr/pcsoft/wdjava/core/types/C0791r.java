package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.utils.C0808l;
import java.util.LinkedHashMap;

/* renamed from: fr.pcsoft.wdjava.core.types.r */
class C0791r extends LinkedHashMap<String, C0797z> {
    final bb this$0;

    C0791r(bb bbVar) {
        this.this$0 = bbVar;
    }

    /* renamed from: a */
    private final String m3804a(String str) {
        return C0808l.m4016a(str, 20, 0);
    }

    /* renamed from: a */
    public C0797z m3805a(Object obj) {
        return (C0797z) super.remove(m3804a(obj.toString()));
    }

    /* renamed from: a */
    public C0797z m3806a(String str, C0797z c0797z) {
        return (C0797z) super.put(m3804a(str), c0797z);
    }

    /* renamed from: b */
    public C0797z m3807b(Object obj) {
        return (C0797z) super.get(m3804a(obj.toString()));
    }

    public boolean containsKey(Object obj) {
        return super.containsKey(m3804a(obj.toString()));
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return m3807b(obj);
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return m3806a((String) obj, (C0797z) obj2);
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return m3805a(obj);
    }
}
