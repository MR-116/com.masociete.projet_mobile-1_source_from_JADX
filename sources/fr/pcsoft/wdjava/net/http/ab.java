package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.poo.C0738u;
import fr.pcsoft.wdjava.core.types.WDChaine;

class ab extends C0738u {
    final WDHTTPRequete this$0;

    ab(WDHTTPRequete wDHTTPRequete) {
        this.this$0 = wDHTTPRequete;
        super(wDHTTPRequete);
    }

    /* renamed from: d */
    public int mo2487d() {
        return WDChaine.m2421c();
    }

    /* renamed from: g */
    public Class mo2482g() {
        return WDChaine.class;
    }

    /* renamed from: k */
    protected boolean mo3260k() {
        return false;
    }

    /* renamed from: l */
    protected int mo3261l() {
        return this.this$0.mo3257a(EWDPropriete.PROP_ENTETE);
    }
}
