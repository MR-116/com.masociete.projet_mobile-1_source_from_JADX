package fr.pcsoft.wdjava.ui.champs.jauge;

import fr.pcsoft.wdjava.ui.C0488r;

/* renamed from: fr.pcsoft.wdjava.ui.champs.jauge.d */
public interface C1225d extends C0488r {
    int getMaxProgress();

    int getMinProgress();

    int getProgressValue();

    void setMaxProgress(int i);

    void setMinProgress(int i);

    void setProgressValue(int i);

    void setProgressValue(int i, int i2, int i3);
}
