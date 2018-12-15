package fr.pcsoft.wdjava.ui.champs;

import java.util.Comparator;

public class oc implements Comparator {
    final ic this$0;

    public oc(ic icVar) {
        this.this$0 = icVar;
    }

    public int compare(Object obj, Object obj2) {
        return ((bc) obj).toString().compareToIgnoreCase(((bc) obj2).toString());
    }
}
