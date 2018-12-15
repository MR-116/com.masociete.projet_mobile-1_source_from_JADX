package p000a.p001a.p002a.p022f.p025c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import p000a.p001a.p002a.p022f.C0170d;

/* renamed from: a.a.a.f.c.l */
final class C0168l {
    /* renamed from: a */
    private final Map<Integer, Integer> f645a = new HashMap();

    C0168l() {
    }

    /* renamed from: a */
    public Integer m1042a(int i) {
        return (Integer) this.f645a.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    int[] m1043a() {
        Collection arrayList = new ArrayList();
        int i = -1;
        for (Entry entry : this.f645a.entrySet()) {
            int i2;
            if (((Integer) entry.getValue()).intValue() > i) {
                i = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
                i2 = i;
            } else {
                if (((Integer) entry.getValue()).intValue() == i) {
                    arrayList.add(entry.getKey());
                }
                i2 = i;
            }
            i = i2;
        }
        return C0170d.m1052a(arrayList);
    }

    /* renamed from: b */
    void m1044b(int i) {
        Integer num = (Integer) this.f645a.get(Integer.valueOf(i));
        if (num == null) {
            num = Integer.valueOf(0);
        }
        this.f645a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
