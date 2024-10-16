package dsi.pms.grog.refonte.env_test;

public class Class_medicament {
    private String libelle;
    private int codeCIS;
    private String EEN;
    private String AMM;
    private String groupegene;
    private String titulaire;
    private String voieinal;

    public Class_medicament(String libelle, int codeCIS, String EEN, String AMM, String groupegene, String titulaire, String voieinal) {
        this.libelle = libelle;
        this.codeCIS = codeCIS;
        this.EEN = EEN;
        this.AMM = AMM;
        this.titulaire = titulaire;
        this.voieinal = voieinal;
    }

    // Getters
    public String getLibelle() {
        return libelle;
    }

    public int getCodeCIS() {
        return codeCIS;
    }

    public String getEEN() {
        return EEN;
    }

    public String getAMM() {
        return AMM;
    }
    
    public String getGroupegene() {
    	return groupegene;
    }
    
    public String gettitulaire() {
    	return titulaire;
    }
    
    public String getvoieinal() {
    	return voieinal;
    }

    public class Class_Hybride extends Class_medicament {
        private String situationMedicale;

        public Class_Hybride(String libelle, int codeCIS, String EEN, String AMM, String situationMedicale, String groupegene, String titulaire, String voieinal) {
            super(libelle, codeCIS, EEN, AMM, groupegene, titulaire, voieinal);
            this.situationMedicale = situationMedicale;
        }

        // Getters
        public String getSituationMedicale() {
            return situationMedicale;
        }
    }
    public class Class_Generique extends Class_medicament {
        private String SpeRef;

        public Class_Generique(String libelle, int codeCIS, String EEN, String AMM, String situationMedicale, String groupegene, String titulaire, String voieinal) {
            super(libelle, codeCIS, EEN, AMM, groupegene, titulaire, voieinal);
        }

        // Getters
        public String getSpeRef() {
            return SpeRef;
        }
    }
    
}
