package fr.pcsoft.wdjava.net.http;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

class eb implements Iterable<C1000y> {
    /* renamed from: a */
    private final List<C1000y> f2793a = new LinkedList();
    /* renamed from: b */
    private final Map<String, List<C1000y>> f2794b = new HashMap();

    /* renamed from: a */
    public C1000y m7132a(String str) {
        if (str == null) {
            return null;
        }
        List list = (List) this.f2794b.get(str.toLowerCase(Locale.US));
        return (list == null || list.isEmpty()) ? null : (C1000y) list.get(0);
    }

    /* renamed from: a */
    public void m7133a(C1000y c1000y) {
        if (c1000y != null) {
            String toLowerCase = c1000y.m7246b().toLowerCase(Locale.US);
            List list = (List) this.f2794b.get(toLowerCase);
            if (list == null) {
                list = new LinkedList();
                this.f2794b.put(toLowerCase, list);
            }
            list.add(c1000y);
            this.f2793a.add(c1000y);
        }
    }

    public Iterator<C1000y> iterator() {
        return Collections.unmodifiableList(this.f2793a).iterator();
    }

    public String toString() {
        return this.f2793a.toString();
    }
}
