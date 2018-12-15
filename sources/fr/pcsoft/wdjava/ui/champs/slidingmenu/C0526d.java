package fr.pcsoft.wdjava.ui.champs.slidingmenu;

import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.C0524x;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.d */
public interface C0526d extends C0524x {
    /* renamed from: a */
    public static final int f959a = 1;
    /* renamed from: b */
    public static final int f960b = 2;
    /* renamed from: c */
    public static final int f961c = 1;
    /* renamed from: d */
    public static final int f962d = 0;
    /* renamed from: e */
    public static final int f963e = 0;

    C1269c createLayout(int i, WDFenetre wDFenetre);

    int getPosition();

    int getWidthRatio();

    boolean isDisplayedWithGesture();

    int onLayout(int i, int i2);

    void setMenuSize(int i, int i2);
}
