package fr.pcsoft.wdjava.core.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class nb<K, V> implements Iterable<Entry<K, List<V>>> {
    /* renamed from: a */
    private final Map<K, List<V>> f2138a;

    public nb() {
        this.f2138a = new LinkedHashMap();
    }

    public nb(int i) {
        this.f2138a = new LinkedHashMap(i);
    }

    /* renamed from: a */
    private List<V> m4091a(K k, boolean z) {
        List<V> list = (List) this.f2138a.get(k);
        if (list != null || !z) {
            return list;
        }
        List arrayList = new ArrayList();
        this.f2138a.put(k, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public List<V> m4092a(K k) {
        return (List) this.f2138a.remove(k);
    }

    /* renamed from: a */
    public List<V> m4093a(K k, Collection<V> collection) {
        List<V> a = m4092a(k);
        if (!(collection == null || collection.isEmpty())) {
            m4099b((Object) k, (Collection) collection);
        }
        return a;
    }

    /* renamed from: a */
    public void m4094a() {
        this.f2138a.clear();
    }

    /* renamed from: a */
    public void m4095a(K k, V v) {
        m4091a((Object) k, true).add(v);
    }

    /* renamed from: b */
    public int m4096b() {
        int i = 0;
        for (List size : this.f2138a.values()) {
            i = size.size() + i;
        }
        return i;
    }

    /* renamed from: b */
    public V m4097b(K k) {
        List d = m4103d(k);
        return (d == null || d.isEmpty()) ? null : d.get(0);
    }

    /* renamed from: b */
    public List<V> m4098b(K k, V v) {
        List<V> a = m4092a(k);
        if (v != null) {
            m4095a((Object) k, (Object) v);
        }
        return a;
    }

    /* renamed from: b */
    public void m4099b(K k, Collection<V> collection) {
        m4091a((Object) k, true).addAll(collection);
    }

    /* renamed from: c */
    public boolean m4100c() {
        return m4096b() == 0;
    }

    /* renamed from: c */
    public boolean m4101c(K k) {
        return this.f2138a.containsKey(k);
    }

    /* renamed from: c */
    public boolean m4102c(K k, V v) {
        List list = (List) this.f2138a.get(k);
        if (list == null) {
            return false;
        }
        boolean remove = list.remove(v);
        if (remove && list.isEmpty()) {
            this.f2138a.remove(k);
        }
        return remove;
    }

    /* renamed from: d */
    public List<V> m4103d(K k) {
        return m4091a((Object) k, false);
    }

    /* renamed from: d */
    public Set<K> m4104d() {
        return this.f2138a.keySet();
    }

    /* renamed from: e */
    public List<V> m4105e() {
        List<V> arrayList = new ArrayList();
        for (List addAll : this.f2138a.values()) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2138a.equals(((nb) obj).f2138a);
    }

    public int hashCode() {
        return this.f2138a.hashCode();
    }

    public Iterator<Entry<K, List<V>>> iterator() {
        return this.f2138a.entrySet().iterator();
    }

    public String toString() {
        return this.f2138a.toString();
    }
}
