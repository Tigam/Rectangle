package at.wifi.swdev.web.rechteck.model;

import java.io.Serializable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Rechteck implements Serializable {

    @NotNull
    @Min(value = 0, message = "Bitte geben Sie Seite a in mm ein.")
    private int seitea;

    @NotNull
    @Min(value = 0, message = "Bitte geben Sie Seite a in mm ein.")
    private int seiteb;

    private int umfang = (seitea * 2) + (seiteb * 2);

    private int flaeche = seitea * seiteb;

    public Rechteck() {
    }

    public Rechteck(int seitea, int seiteb) {
        this.seitea = seitea;
        this.seiteb = seiteb;
    }

    public int getSeitea() {
        return seitea;
    }

    public void setSeitea(int seitea) {
        this.seitea = seitea;
    }

    public int getSeiteb() {
        return seiteb;
    }

    public void setSeiteb(int seiteb) {
        this.seiteb = seiteb;
    }

    public int getUmfang() {
        return umfang;
    }

    public void setUmfang(int umfang) {
        this.umfang = umfang;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.seitea;
        hash = 47 * hash + this.seiteb;
        hash = 47 * hash + this.umfang;
        hash = 47 * hash + this.flaeche;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rechteck other = (Rechteck) obj;
        if (this.seitea != other.seitea) {
            return false;
        }
        if (this.seiteb != other.seiteb) {
            return false;
        }
        if (this.umfang != other.umfang) {
            return false;
        }
        if (this.flaeche != other.flaeche) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rechteck{seitea=").append(seitea);
        sb.append(", seiteb=").append(seiteb);
        sb.append(", umfang=").append(umfang);
        sb.append(", flaeche=").append(flaeche);
        sb.append('}');
        return sb.toString();
    }

}