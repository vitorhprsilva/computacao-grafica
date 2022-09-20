public class Linha2D {

    Ponto2D p1;
    Ponto2D p2;

    Linha2D(Ponto2D p1, Ponto2D p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    Linha2D(float x1, float y1, float x2, float y2){
        setP1(new Ponto2D(x1,y1));
        setP2(new Ponto2D(x2,y2));
    }

    private void setP1(Ponto2D p1) {
        this.p1 = p1;
    }

    private void setP2(Ponto2D p2) {
        this.p2 = p2;
    }

    public void getLinha() {

    }

}
