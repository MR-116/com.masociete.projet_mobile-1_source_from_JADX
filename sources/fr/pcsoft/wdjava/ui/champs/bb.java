package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.ui.C0489p;
import java.util.Comparator;

public class bb implements Comparator {
    public int compare(Object obj, Object obj2) {
        int _getNumTab = ((C0489p) obj)._getNumTab();
        int _getNumTab2 = ((C0489p) obj2)._getNumTab();
        return _getNumTab == _getNumTab2 ? 0 : _getNumTab > _getNumTab2 ? 1 : -1;
    }
}
