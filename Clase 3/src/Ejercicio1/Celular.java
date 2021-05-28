public class Celular implements Precedable<Celular>{
    public int getiNumero() {
        return iNumero;
    }

    public void setiNumero(int iNumero) {
        this.iNumero = iNumero;
    }

    public String getsTitular() {
        return sTitular;
    }

    public void setsTitular(String sTitular) {
        this.sTitular = sTitular;
    }

    private int iNumero;
    private String sTitular;


    public Celular (int nro, String titu)
    {
        setiNumero(nro);
        setsTitular(titu);
    }


    @Override
    public int precedeA(Celular celular) {
        if (this.getiNumero()-celular.getiNumero()>0)
        {
            return 1;
        }

        else
        {
            if(this.getiNumero()-celular.getiNumero()==0)
            {
                return 0;
            }

            else
            {
                return -1;
            }
        }

    }
}

