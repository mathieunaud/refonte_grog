package dsi.pms.grog.refonte.env_test;

public class Class_medicament {
    private String libelle;
    private int codeCIS;


    public Class_medicament(String libelle, int codeCIS) {
        this.libelle = libelle;
        this.codeCIS = codeCIS;
    }

    // Getters
    public String getLibelle() {
        return libelle;
    }

    public int getCodeCIS() {
        return codeCIS;
    }


    public class Class_Hybride extends Class_medicament {
        private String situationMedicale;

 
        public Class_Hybride(String libelle, int codeCIS, String situationMedicale) {
            super(libelle, codeCIS);
            this.situationMedicale = situationMedicale;
        }

        // Getters
        public String getSituationMedicale() {
            return situationMedicale;
        }
    }
}
