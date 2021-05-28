public class Main {
    

        public static void main(String[] args) {

            Persona[] arr={ new Persona("Manu",21),
                    new Persona("Juan Pablo", 10),
                    new Persona("Felipe", 29)};

            SortUtil.ordenar(arr);

            for(Persona x: arr)
            {
                System.out.println(x.getiDni());
            }


            Celular[] arr2= { new Celular(4567, "Maria Becerra"),
                    new Celular(1234, "Duki"),
                    new Celular(7777, "Trueno")
            };

            System.out.println("-----------------");

            SortUtil.ordenar(arr2);

            for(Celular x: arr2)
            {
                System.out.println(x.getiNumero());
            }


        }


}
