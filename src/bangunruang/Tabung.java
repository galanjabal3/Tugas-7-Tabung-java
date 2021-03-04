package bangunruang;

public class Tabung extends BangunRuang{
    int r;
    int t;

    public Tabung(int r,int t){
        this.r = r;
        this.t = t;
    }
    @Override
    public float luas(){
        return (float) (2 * Math.PI * r * (r + t));
    }
    @Override
    public float volume(){
        return (float) (Math.PI * r * r * t);
    }
}
