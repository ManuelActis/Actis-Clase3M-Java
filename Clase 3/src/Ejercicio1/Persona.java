

public class Persona implements Precedable<Persona>{
    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getiDni() {
        return iDni;
    }

    public void setiDni(int iDni) {
        this.iDni = iDni;
    }


    public Persona(String nombre, int Dni)
    {
        //se crea la persona con su dni y nombre correspondiente
        setiDni(Dni);
        setsNombre(nombre);

    }

    private String sNombre;
    private int iDni;


    //Se implementa el metodo de la interfaz Precedable
    @Override
    public int precedeA(Persona persona) {

        if (this.getiDni()-persona.iDni>0)
        {
            return 1;
        }

        else
        {
            if(this.getiDni()-persona.iDni==0)
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



