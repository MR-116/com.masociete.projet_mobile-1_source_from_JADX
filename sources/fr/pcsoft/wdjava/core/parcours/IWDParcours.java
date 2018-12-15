package fr.pcsoft.wdjava.core.parcours;

import fr.pcsoft.wdjava.core.WDObjet;

public interface IWDParcours {
    /* renamed from: a */
    public static final int f1294a = 2;
    /* renamed from: b */
    public static final int f1295b = 0;
    /* renamed from: c */
    public static final int f1296c = 1;
    /* renamed from: d */
    public static final int f1297d = 4;

    void finParcours();

    Object getElementCourant();

    int getIndex();

    WDObjet getSource();

    WDObjet getVariableParcours();

    void release();

    void reset();

    boolean testParcours();
}
