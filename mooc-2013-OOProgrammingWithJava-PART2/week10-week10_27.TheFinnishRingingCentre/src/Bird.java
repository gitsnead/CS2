
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Bird compared = (Bird) obj;
        if (!this.latinName.equals(compared.latinName)) {
            return false;
        }
        if(this.ringingYear != compared.ringingYear) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hc;
        if (this.latinName == null) {
            return 7 + this.ringingYear;
        }
        return this.latinName.hashCode() + this.ringingYear;
    }

}
