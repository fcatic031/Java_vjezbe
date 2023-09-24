package monastery.model;

public class Priest extends Person {

    private Priest superior;

    public Priest() {
    }



    public Priest getSuperior() {
        return superior;
    }

    public void setSuperior(Priest superior) {
        this.superior = superior;
    }
}
