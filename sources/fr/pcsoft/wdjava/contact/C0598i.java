package fr.pcsoft.wdjava.contact;

import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.contact.i */
final class C0598i implements Comparator<WDContact> {
    C0598i() {
    }

    /* renamed from: a */
    public int m2195a(WDContact wDContact, WDContact wDContact2) {
        return wDContact.f1275d.compareTo(wDContact2.f1275d);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m2195a((WDContact) obj, (WDContact) obj2);
    }
}
