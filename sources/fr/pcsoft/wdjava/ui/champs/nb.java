package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.C0488r;

public interface nb extends C0488r {
    int getDisplayUnit();

    void getLocationInWindow(int[] iArr);

    String getName();

    Object getUIComp();

    boolean isExecPCodeInit();

    void onCreateWindow();

    void screenToSource(String str);

    void sourceToScreen(String str);

    void updateLabelTextColor();

    void updateUI_WL(WDObjet... wDObjetArr);
}
