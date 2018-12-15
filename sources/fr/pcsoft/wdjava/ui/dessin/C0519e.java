package fr.pcsoft.wdjava.ui.dessin;

import fr.pcsoft.wdjava.ui.C1489s;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1336b;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.e */
public interface C0519e {
    boolean appliquerRedimensionnement(int i, int i2, int i3);

    boolean appliquerRotation(double d, int i, int i2, int i3);

    boolean appliquerSymetrieHorizontale();

    boolean appliquerSymetrieVerticale();

    String getCheminImage();

    int getCouleurPixel(int i, int i2) throws C1489s;

    C0544g getImageMemoire(int i);

    C1336b getImagePeintre(int i, boolean z);

    int getOpacitePixel(int i, int i2) throws C1489s;

    boolean isAvecImageMemoire();

    void majAffichage();

    void majAffichage(int i, int i2, int i3, int i4);

    void setImagePeintre(C1336b c1336b);
}
