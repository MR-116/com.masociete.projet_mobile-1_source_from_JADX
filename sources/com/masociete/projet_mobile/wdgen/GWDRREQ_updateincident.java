package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Requete;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;

public class GWDRREQ_updateincident extends WDDescRequeteWDR {
    public String getNomLogique() {
        return "REQ_updateincident";
    }

    public String getCodeSQLOriginal() {
        return " UPDATE  EXPRESS_Incident SET consulte = 1";
    }

    public Requete initArbre() throws WDInvalidSQLException {
        Fichier fic_EXPRESS_Incident = new Fichier();
        fic_EXPRESS_Incident.setNom("EXPRESS_Incident");
        fic_EXPRESS_Incident.setAlias("EXPRESS_Incident");
        Requete varReqUpdate = new Requete(3);
        varReqUpdate.ajouterClause(fic_EXPRESS_Incident);
        Set varSet = new Set();
        Rubrique rub_consulte = new Rubrique();
        rub_consulte.setNom("EXPRESS_Incident.consulte");
        rub_consulte.setAlias("consulte");
        rub_consulte.setNomFichier("EXPRESS_Incident");
        rub_consulte.setAliasFichier("EXPRESS_Incident");
        Literal varLiteral = new Literal();
        varLiteral.setValeur("1");
        varLiteral.setTypeWL(1);
        varSet.ajouterElement(rub_consulte);
        varSet.ajouterElement(varLiteral);
        varReqUpdate.ajouterClause(varSet);
        return varReqUpdate;
    }

    public String getNomFichier(int nIndex) {
        switch (nIndex) {
            case 0:
                return "EXPRESS_Incident";
            default:
                return null;
        }
    }

    public String getAliasFichier(int nIndex) {
        switch (nIndex) {
            case 0:
                return "EXPRESS_Incident";
            default:
                return null;
        }
    }
}
